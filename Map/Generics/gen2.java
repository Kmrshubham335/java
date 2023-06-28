package Map.Generics;
class Myclass<T> {
    T obj;
    static <T> void display(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
    }
}
public class gen2 {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Myclass<Integer> obj = new Myclass<>();
        System.out.println("Reading Integer object:");

        obj.display(arr1);
}
}
