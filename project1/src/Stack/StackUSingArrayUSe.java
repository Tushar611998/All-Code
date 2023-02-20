package Stack;

public class StackUSingArrayUSe {

    public static void main(String[] args) throws StackOverflowException, StackIsEmptyException {
        StackUsingArrays stack = new StackUsingArrays();
        for (int i = 1; i < 115; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackIsEmptyException e) {
//                //never reach here
            }
        }
    }
}
