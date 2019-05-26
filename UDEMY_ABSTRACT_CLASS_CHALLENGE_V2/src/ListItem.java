

public abstract class ListItem {

    protected ListItem next= null;
    protected ListItem previous = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem moveToNext();
    public abstract ListItem moveToPrevious();
    public abstract ListItem setNextItem(ListItem item);
    public abstract ListItem setPreviousItem(ListItem item);

    public abstract int compareTo(ListItem item);


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
