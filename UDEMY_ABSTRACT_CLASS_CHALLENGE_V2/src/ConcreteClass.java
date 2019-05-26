public class ConcreteClass extends ListItem {

    private String name;

    public ConcreteClass(Object value, String name) {
        super(value);
        this.name = name;
    }

    @Override
    public ListItem moveToNext() {
        return super.next;
    }

    @Override
    public ListItem moveToPrevious() {
        return super.previous;
    }

    @Override
    public ListItem setNextItem(ListItem item) {
        return super.next = item;
    }

    @Override
    public ListItem setPreviousItem(ListItem item) {
        return super.previous = item;
    }

    @Override
    public int compareTo(ListItem item) {
        if(item == null){
            return -1;
        }else{
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
    }
}
