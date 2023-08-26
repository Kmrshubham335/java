package String;

public class compare {  
   public static void main(String[] args) {  
      String str1 = "String", str2 = "Comparison";  
       int get_val = str1.compareTo(str2); 
  
      if (get_val < 0) {  
         System.out.println("str1 is greater than str2");  
      } else if (get_val == 0) {  
         System.out.println("str1 is equal to str2");  
      } else {  
         System.out.println("str1 is less than str2");  
      }  
   }  
}  