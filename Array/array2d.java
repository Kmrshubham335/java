package Array;
// 2D Array
public class array2d {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        // System.out.println(arr[0][1]);
        // Accessing element by index position
        // 0 is 1st array{1,2,3} and 2nd array in 2d called 1st that is {4,5,6}
        // print all array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("------");
        }
    }
}
