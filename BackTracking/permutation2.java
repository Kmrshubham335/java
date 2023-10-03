package BackTracking;
//Time complexity:O(n*n)
public class permutation2 {
    public static void findPermute(String str,String ans){
        //base condition
        if(str.length()==0){
            System.out.println(ans);
        }
        //recursive call
        for(int i=0;i<str.length();i++){
            char curr =str.charAt(i);
            String cstr=str.substring(0, i)+str.substring(i+1); //removing those  char from the str which is placed in the ans
            findPermute(cstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermute(str, "");
        
    }
}
