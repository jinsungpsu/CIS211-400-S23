import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        System.out.println(stack.length());

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        // at this point, the stack is full!
        System.out.println(stack.length());

        try {
            stack.push(10); // this should result in an
            // illegal state exception
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println("I didn't crash!");


    }
}