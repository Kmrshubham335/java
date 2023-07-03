package Array;
//Second Maximum Element in the array
public class Second_Max {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int First_Max = arr[0];
        int Second_Max = arr[0];

        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > First_Max) 
            {
                Second_Max = First_Max;
                First_Max = arr[i];
            } else if (arr[i] > Second_Max) {
                Second_Max = arr[i];
            }
        }

        System.out.println("First Max: " + First_Max);
        System.out.println("Second Max: " + Second_Max);
    }
}
