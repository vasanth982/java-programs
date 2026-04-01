import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(7);
        s.push(9);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
        }
    }
}