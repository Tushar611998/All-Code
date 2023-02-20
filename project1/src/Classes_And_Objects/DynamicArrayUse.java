package Classes_And_Objects;
import java.util.Scanner;

public class DynamicArrayUse {
    public static void main(String[] args) {

        DynamicArray d = new DynamicArray();

        for (int i =0;i<100;i++){
            d.add(i+10);
        }
        d.print();
        d.set(4,10);
        d.set(150,10);
        System.out.println(d.get(3));
        System.out.println(d.get(4));
        System.out.println(d.get(150));
        d.print();

        while(d.size()!=0){
            System.out.println(d.removeLast());
            System.out.println("size = " +d.size());
        }
    }
}
