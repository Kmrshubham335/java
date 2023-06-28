package Map.Generics;
class Myclass<T>{
    T obj;
    Myclass (T obj){
        this.obj=obj;
    }
    T getobj(){
        return obj;
    }
}
public class gen1 {
    public static void main(String[] args) {
        Integer i=12;
        Myclass<Integer> obj = new Myclass(i);
        System.out.println("U stored:" + obj.getobj());
        String str="Name";
        Myclass<String> obj1= new Myclass(str);
        System.out.println("U Stored: " + obj1.getobj());

    }
}
