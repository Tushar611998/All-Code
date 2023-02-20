package HackerRank_Problems;

import java.util.Date;
import java.util.Locale;

public class PrintfFormating {
    public static void main(String[] args) {
        // printf formatts for different data types
                // 1) integer
                           System.out.printf("%d%n",1000);

                           // to add blank spaces in prefix ude following format
                           System.out.printf("'%12d'%n",100);

                           // to add blank spaces in suffix use following format
                           System.out.printf("'%-12d'%n",1000);

                           // limit the integer into the min upto the given no of digits
                           System.out.printf("'%03d'%n",52);

                // 2) float
                           System.out.printf("%f%n",21.548);

                           // in every float we get precision up to 6 decimal places but we can control this
                           System.out.printf("%.3f%n",21.548);

                           // To have your output in form of scientific notation, you can use the ‘e’ conversion character:
                           System.out.printf("'%2.3e'%n", 345.1423);


               // 3) Strings
                           System.out.printf("'%s'%n","hello world");

                           // prefix spaces & argument string length is less than the minimum length.
                           System.out.printf("'%10s' %n","hello");

                           // sufix spaces
                           System.out.printf ("'%-10s' %n", "Hello");

                           // limit the number of characters in the argument string by specifying a precision
                           System.out.printf("'%11.10s'%n", "Hello World!");

        // it is used to format the integer as per the local seperator as per country
        System.out.printf(Locale.CANADA,"%,d%n",1000);
        Date time = new Date();
        System.out.printf("%tH:%tM:%tS%n",time,time,time);
        System.out.printf("%tT%n",time);

    }
}
