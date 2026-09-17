class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        int types = 0;

        int[] count = new int[fruits.length + 1];

        for (int right = 0; right < fruits.length; right++) {
            if (count[fruits[right]] == 0) {
                types++;
            }

            count[fruits[right]]++;

            while (types > 2) {
                count[fruits[left]]--;

                if (count[fruits[left]] == 0) {
                    types--;
                }

                left++;
            }

            int length = right - left + 1;

            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}