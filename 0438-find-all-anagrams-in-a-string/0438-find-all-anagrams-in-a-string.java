class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()) {
            return ans;
        }

        int[] countP = new int[26];
        int[] countS = new int[26];

        // First window
        for(int i = 0; i < p.length(); i++) {
            countP[p.charAt(i) - 'a']++;
            countS[s.charAt(i) - 'a']++;
        }

        // Check first window
        if(Arrays.equals(countP, countS)) {
            ans.add(0);
        }

        // Slide the window
        for(int i = p.length(); i < s.length(); i++) {

            // Remove leaving character
            countS[s.charAt(i - p.length()) - 'a']--;

            // Add entering character
            countS[s.charAt(i) - 'a']++;

            // Compare
            if(Arrays.equals(countP, countS)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}