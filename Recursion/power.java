package Recursion;

public class power {
    public static void main(String[] args) {
        long a = 2, b = 64;
        long result = PowerFind(a, b);
        System.out.println("Power: " + result);
    }

    public static long PowerFind(long a, long b) {
        if (b == 1) {  // Base case
            return a;
        } else {
            long mid = b / 2;
            long result = PowerFind(a, mid);
            long fresult = result * result;
    
            if (b % 2 == 0) {
                return fresult;
            } else {
                return a * fresult;
            }
        }
    }
    
}
