
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;

        for (int s : students) {
            if (s == 0) zero++;
            else one++;
        }

        for (int s : sandwiches) {
            if (s == 0 && zero > 0) zero--;
            else if (s == 1 && one > 0) one--;
            else break;
        }

        return zero + one;
    }
}
