package HackerRank_Problems;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    void setTitle(String s) {
        this.title =s;
    }
        }
public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        MyBook b = new MyBook();
        b.setTitle(s);
        System.out.println("The title is: " + b.getTitle());

    }
}
