import java.util.Stack;

public class stackDataStructure <E>{

    private int size= 0;
    private Node top =  null;

    //the push method
    public void push(E data)   {

    }
    public  E pop() {
        //remove and return the top element
        E data = (E) top.getData();
        top  = top.getChild();
        return data;
    }

    //check to see if this stack is empty
    public boolean isEmpty(){
        return top == null;
    }

    //
    public int size() {
        int counter = 1;
        if (top != null) { //if there is at least one object
            Node<E> current = top;
            while (current.getChild() != null) { //loops until the last Node in the list is found (Node w/o child)
                counter++; //updates number of nodes in list
                current = current.getChild();
            }
        } else {
            return 0; //no objects in the arraylist
        }
        return counter;
    }

    public E peek() {
        //look at the top element without removing
        if (isEmpty()){
            return null;
        } else {
            return (E) top.getData();
        }
    }
}
