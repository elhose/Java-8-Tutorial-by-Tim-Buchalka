package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    public MenuItem menuItemAdd;
    @FXML
    public MenuItem menuItemEdit;
    @FXML
    public MenuItem menuItemDelete;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private TableView<Contact> contactTableView;

    private ContactData data;

    public void initialize(){
        data = new ContactData();
        data.loadContacts();
        contactTableView.setItems(data.getContact());
    }


    public void showAddDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        dialog.setTitle("Add Contact");
        fxmlLoader.setLocation(getClass().getResource("dialog.fxml"));

        try{
            dialog.getDialogPane().setContent(fxmlLoader.load());

        }catch (IOException e){
            System.out.println("nie wczytano BorderPane");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            DialogController dialogController = fxmlLoader.getController();
            Contact newContact = dialogController.getNewContact();
            data.addContact(newContact);
            data.saveContacts();
        }
    }

    public void showEditDialog(){

        Contact selectedContact = contactTableView.getSelectionModel().getSelectedItem();

       if(selectedContact == null){
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("NO Contact selected!");
           alert.setHeaderText("");
           alert.setContentText("Please select contact You want to edit.");
           alert.showAndWait();
           return;
       }


        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("dialog.fxml"));

        try{
            dialog.getDialogPane().setContent(fxmlLoader.load());

        }catch (IOException e){
            System.out.println("nie wczytano Dialog.fxml");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        DialogController dialogController = fxmlLoader.getController();
        dialogController.editContact(selectedContact);

        Optional<ButtonType> result = dialog.showAndWait();//to nam uruchamia okienko

        if(result.isPresent() && result.get() == ButtonType.OK){
            dialogController.updateContact(selectedContact);
            data.saveContacts();
        }
    }

    public void showDeleteDialog(){
        Contact selectedContact = contactTableView.getSelectionModel().getSelectedItem();

        if(selectedContact == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("NO Contact selected!");
            alert.setHeaderText(null);
            alert.setContentText("Please select contact You want to delete.");
            alert.showAndWait();
            return;
        }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Delete Contact");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to delete " + selectedContact.getFirstName() + " Contact?");


            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                data.deleteContact(selectedContact);
                data.saveContacts();
            }



    }


}
