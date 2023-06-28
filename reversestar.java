public class reversestar {
    public static void main(String[] args) {
        int i,j,n=4;
        for(i=n;i>1;i--){
            // space
            for(j=0;j<n-i;j++){
                System.out.print("");
            }
            // print the star
            for(j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
