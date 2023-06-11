package OOP.homeWork_3;

import java.util.Iterator;

public class LiknedListRepeter implements Iterable{
     private Element head;
     private Element tail;
     private int count = 0;

     public Element getHead(){
         return head;
     }
    public Element getTail(){
         return tail;
    }
    public int getSize(){
         return count;
    }
    public void setHead(Element head){
         this.head = head;
    }
    public void setTail(Element tail){
         this.tail = tail;
    }

    public void add(Object data){
        count++;
        Element element = new Element(data);
        if (head == null){
            head = element;
            tail = element;
            return;
        }

        tail.setNext(element);
        element.setPrev(tail);
        tail = element;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Element element0 = new Element("0");
            {
                element0.setNext(head);
            }
            Element currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }
    public void add(int index, Object data){

        if (count == index){
            add(data);
            count++;
            return;
        }

        Element currentElement = new Element(data);

        if (index == 0){
            head = currentElement;
        }

        Element nextElement = getElement(index);
        Element previousElement = nextElement.getPrev();

        currentElement.setNext(nextElement);
        currentElement.setPrev(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }

    }

    private Element getElement(int index){

        Element result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){

        Element element = getElement(index);

        return element.getData();
    }
    public void remove(int index){

        Element currentElement = getElement(index);
        Element nextElement = currentElement.getNext();
        Element previousElement = currentElement.getPrev();

        if (index == 0){
            head = nextElement;
            if (tail == currentElement){
                tail = null;
            }
        }

        if (index == count - 1){
            tail = previousElement;
            if (head == currentElement){
                head = null;
            }
        }

        count--;

        if (nextElement != null){
            nextElement.setPrev(previousElement);
        }

        if (previousElement != null){
            previousElement.setNext(nextElement);
        }

    }

}
