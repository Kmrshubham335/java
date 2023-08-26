package String;

public class StrChar {
    public static void printletter(String fullString){ //printing the string by loop
        for(int i=0;i<fullString.length();i++){
            System.out.print(fullString.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name="Shubham";
        String name1 ="kumar";
        String fullString = name + " " + name1;
        printletter(fullString);
        // System.out.println(fullString);
        System.out.println(fullString.charAt(0)); //return the first letter from the index 0
    }
}
