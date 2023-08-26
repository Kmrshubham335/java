package Array;

class Complete {
    int KthMissingElement(int a[], int n, int k) {
        // Complete the function
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] > 1) {
                int missingCount = a[i] - a[i - 1] - 1;
                if (missingCount >= k) {
                    return a[i - 1] + k;
                } else {
                    k -= missingCount;
                }
            }
            if (k == 0) {
                return a[i - 1] + 1;
            }
        }
        return a[n - 1] + k;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 7};
        int n = a.length;
        int k = 2;
        Complete complete = new Complete(); // Create an instance of the class
        int result = complete.KthMissingElement(a, n, k); // Call the method using the instance
        System.out.println("Kth Missing Element: " + result);
    }
}
