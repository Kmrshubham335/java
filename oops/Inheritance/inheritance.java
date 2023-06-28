package oops.Inheritance;
    class marks{   //Parent class || Base class ||super class
        int number1;
        String str;
        String str1;
        void input(){
            number1=67;
            str="English";
            str1="Ram";
            System.out.println("Name: " + str1 + "  Subject: " +   str   + " number: " +  number1);
        }
    }
    class student extends marks{ // Child class ||sub class || derived class

    }
    public class inheritance {

    public static void main(String[] args) {
        student dis=new student();
        dis.input();
    }
}

