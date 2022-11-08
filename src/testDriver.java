//preity singh
//11-4-22
//the test driver for my stack class
public class testDriver<E> {
    public static void main(String[] args) {
        stackDataStructure<Integer> stack = new stackDataStructure<>(); //creates a new Stack object
        System.out.println("(true): " + stack.isEmpty()); //checking isEmpty method

        System.out.println(stack.push(3)); //testing push method
        System.out.println("(false): " + stack.isEmpty()); //testing isEmpty method

        System.out.println(stack.pop()); //testing pop method (does it successfully remove '3')
        System.out.println("size(1): " + stack.size());  //testing size method

        for(int i = 0; i < 10; i++){ //adding 10 int to the stack (0-9)
            stack.push(i);
            System.out.println(stack.peek()); //printing the top every time a new element is added
        }
        System.out.println("size(10): " + stack.size()); //testing the size method
    }

}
