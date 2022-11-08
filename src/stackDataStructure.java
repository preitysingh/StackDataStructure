//preity singh
//11-4-22
//my Stack class!
public class stackDataStructure <E>{

    private int size= 0; //size
    private Node<E> top =  null; //the current top node at the top of the stack

    public stackDataStructure(){
        //empty constructor
    }

    public Node<E> push(E data)   {
        //the push method adds a new element on top of the stack
        top = new Node<E>(data,top);
        //size++;
        return top;
    }
    public  E pop() {
        //the pop method removes and return the top element
        E data = null;

        if(isEmpty()){
            return null;
        } else {
            data = top.getData();
            Node<E> oldData = top;
            top  = oldData.getChild();
            oldData.setChild(null);
            //size--;
        }
        return data;
    }

    public boolean isEmpty(){
        //check to see if this stack is empty
        return top == null;
    }

    //diff
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
            return top.getData();
        }
    }
}
