package Array;

// Equilibrium point of the array.
public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 2};
        int sum = 0, leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            
            if (leftSum == sum) {
                System.out.println("Equilibrium index is " + i);
            }
            
            leftSum += arr[i];
        }
    }
}
