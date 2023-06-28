package oops;
public class construct 
{
    private int a;
    private int b;
    // private int age;
    // private int n;
    // construct(){ //default constructor
    //     age=21;

    // }
    construct(int a, int b ){ //parameterized constructor
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        construct st=new construct(23, 423);
        // System.out.println(st.age); calling the default constructor
        st.display();

    }
}

