package com.company;

public class strings {
    public static void main(String[] args) {
        String name = new String("Tushar Deshpande");
        // above statement is one way of using string as variable
        String name2 = "Tushar";
        // this is another way to use string as variable

        System.out.println(name); // println used for introducing new line after printing
        System.out.print(name);// not introducing any space or new line
        System.out.println(name2);
        System.out.printf("%s %s\n",name, name2);  // this is main advantageous for c and c++ students
        System.out.format("%s %s\n",name, name2); //here we only replace printf with format


        // find the length of the string
        int a = name.length();
        System.out.println(a);

        // return string in lowercase
        String b= name.toLowerCase();
        System.out.println(b);

        // return string in uppercase
        String c= name.toUpperCase();
        System.out.println(c);

        //  use trim method
        String d = "          h e l l o wor l d       ";
        d =d.trim();
        System.out.println(d);

        // substring character
        System.out.println(name.substring(6));

        // substring fron given index to given index
        System.out.println(name.substring(3,8));

        // replace
        System.out.println(name.replace("Tushar", "Sushma"));

        // starts with
        System.out.println(name.startsWith("Tu"));

        // ends with
        System.out.println(name.endsWith("Deshpande"));

        // charat
        System.out.println(name.charAt(3));

        //indexof
        System.out.println(name.indexOf("shar"));

        //lastindexof()
        System.out.println(name.lastIndexOf("shar")); //  all searches of char from last letter
        System.out.println(name.lastIndexOf("e"));// and it prints the original place value
        System.out.println(name.lastIndexOf("a",6));
        System.out.println(name.lastIndexOf("a",13));

        // to check string is right or not use equals
        System.out.println(name.equals("Tushar Deshpande"));
        System.out.println(name.equals("tushar deshpadne"));

        // to avoid identifying cases like upper case and lower case
        // use equalsignorecase
        System.out.println(name.equalsIgnoreCase("tushar deshpande"));



    }
}
