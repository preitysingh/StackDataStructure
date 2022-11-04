import java.util.Stack;
//preity singh
//11-4-22
//my Stack class! 
public class stackDataStructure <E>{

    private int size= 0;
    private Node top =  null;


    public void push(E data)   {
        //the push method adds a new element on top of the stack
    }
    public  E pop() {
        //the pop method removes and return the top element
        E data = (E) top.getData();
        top  = top.getChild();
        return data;
    }


    public boolean isEmpty(){
        //check to see if this stack is empty
        return top == null;
    }

    public int size() {
        //size methods returns the size of the stack, pretty self-explanatory
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
        //the peek method looks at the top element without removing it though
        if (isEmpty()){
            return null;
        } else {
            return (E) top.getData();
        }
    }
}
