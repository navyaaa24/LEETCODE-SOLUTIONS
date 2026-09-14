class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x / 2; // The square root of x (for x >= 2) is never larger than x / 2

        while (left <= right) {
            int pivot = left + (right - left) / 2;
            // Use long to prevent integer overflow during multiplication
            long num = (long) pivot * pivot;

            if (num > x) {
                right = pivot - 1;
            } else if (num < x) {
                left = pivot + 1;
            } else {
                return pivot; // Exact square root found
            }
        }

        return right; // right will hold the truncated integer square root
    }
}
