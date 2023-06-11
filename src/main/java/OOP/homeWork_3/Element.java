package OOP.homeWork_3;

public class Element {
    private Object data;
    private Element next;
    private Element prev;

    public Element(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }
}
