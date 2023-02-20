import java.util.Scanner;

public class QueueUsing2Stacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        stack stack = new stack();

        int q = s.nextInt();

        while (q > 0) {
            int choice, input;
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    input = s.nextInt();
                    stack.push(input);
                    break;

                case 2:
                    int a = stack.pop();
                    System.out.println(a);
                    break;

                case 3:
                    System.out.println(stack.top());
                    break;

                case 4:
                    System.out.println(stack.getSize());
                    break;

                default:
                    System.out.println((stack.isEmpty()) ? "true" : "false");
            }

            q -= 1;
        }

    }
}


