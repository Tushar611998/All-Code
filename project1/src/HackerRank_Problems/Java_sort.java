package HackerRank_Problems;
import java.util.*;
class student{
    private int id;
    private float cgpa;
    private String name;

    public student(int id,String name,float cgpa){
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int  getid(){
        return id;
    }
    public  float getcgpa(){
        return cgpa;
    }
    public String getname(){
        return name;
    }
}
public class Java_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <student> studentList = new ArrayList<>();

        int n = sc.nextInt();
        while(n>0){
            int id = sc.nextInt();
            String name = sc.next();
            float cgpa = sc.nextFloat();

            student st = new student(id,name,cgpa);
            studentList.add(st);
            n--;

        }

        Collections.sort(studentList,Comparator.comparing(student:: getcgpa).reversed().thenComparing(student::getname));


        for(student st : studentList){
            System.out.println(st.getname());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
