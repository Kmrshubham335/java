package String;

public class str1 {
    public static void main(String[] args) {
        char a[]={'a','b','c'};
        System.out.println(a);
        //Declaration of the string
        String str[] ={"abc","bca","mca"};
        for (int i=0;i<str.length;i++) {
            System.out.println(str[i]);}
        String str1 = new String("hello");
        System.out.println(str1);
        //String are immutable

        String str2="Hello World";

        System.out.println(str2.length()); //length of the string

        // Concatenation
        String name1="Shubham";
        String name2 ="Kumar";
        String fullname=name1+ " " +name2;
        System.out.println(fullname);

        //Substring
        String s="Hello world";
        System.out.println(s.substring(2, 7));

    }
}
