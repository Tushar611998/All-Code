package DSA_Test2;

import java.util.Scanner;

public class DequeUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        DequeueClass dq = new DequeueClass();
        int iteration = s.nextInt();
        for(int i = 0;i<iteration;i++){
            while(true){
                int choice = s.nextInt(),input;
                switch (choice) {
                    case 1:
                        input = s.nextInt();
                        dq.insertFront(input);
                        break;
                    default:
                        return ;
                }
        }


//                case 2:
//                    input = s.nextInt();
//                    dq.insertRear(input);
//                    break;
//                case 3:
//                    dq.deleteFront();
//                    break;
//                case 4:
//                    dq.deleteRear();
//                    break;
//                case 5:
//                    System.out.println(dq.getFront());
//                    break;
//                case 6:
//                    System.out.println(dq.getRear());
//                    break;

        }
    }

}
