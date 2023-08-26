package String;
//Given a word is palindrome or not
public class Str_Palindrome {
    public static void main(String[] args) {
        String str ="mom";
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if (str.charAt(i)==str.charAt(n-i-1)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
                break;
            }
        }
    }
}
