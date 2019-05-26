public abstract class Lista implements Comparable{

    private Object value;

    private Lista left = null;
    private Lista right = null;

    public abstract void moveLeft();
    public abstract void moveRight();

    public abstract int compareTo(Lista item);

    public Lista(Object value) {
        this.value = value;
    }
}
