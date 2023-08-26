package String;

public class largest {
    public static void main(String[] args) {
        String s[] = {"apple","banana","mango"};
        System.out.println();
        findLargest(s);
    }

    private static String findLargest(String[] s) {
        String largest=s[0];
        for(int i=0;i<s.length;i++){
            if(largest.compareTo(s[i])<0){
                largest=s[i];
            }
        }
        System.out.println(largest);
        return null;
    }
}
