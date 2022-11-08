//preity singh
//11-4-22
//the test driver for the stack class
public class testDriver<E> {
    public static void main(String[] args) {
        stackDataStructure<Integer> stack = new stackDataStructure<>();
        System.out.println("(true): " + stack.isEmpty());

        System.out.println(stack.push(3));
        System.out.println("(false): " + stack.isEmpty());
        System.out.println("size(1): " + stack.size());

        System.out.println(stack.pop());
        System.out.println("(false): " + stack.isEmpty());

        for(int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack.peek());
        }
        System.out.println("size(10): " + stack.size());
    }

}
