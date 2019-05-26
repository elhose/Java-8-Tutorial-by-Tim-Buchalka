public class MyLinkedList implements Node {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
            // nie bylo nic w liście
        }
        ListItem currentItem = this.root;

        int comparision = this.root.compareTo(newItem);
        while(currentItem!=null){
            //nowy item wiekszy, idz na prawo
            if (comparision < 0){
                //sprawdzam czy masz po co dalej isc
                if (currentItem.next != null){
                    currentItem = currentItem.next;
                }else{
                    //doszedłem na koniec listy, tu zostawiam, 3lo
                    currentItem.setNextItem(newItem);
                    newItem.setPreviousItem(currentItem);
                    return true;
                }
            }else if (comparision > 0){
                //nowy item mniejszy, ide w lewo
                if (currentItem.previous != null){
                    //sprawdzam czy jest sens sie cofac\
                    
                }

            }

        }

    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem item) {

    }
}
