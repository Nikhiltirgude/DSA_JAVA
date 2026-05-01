class Solution {
    public int numRabbits(int[] answers) {
        int n = answers.length;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int oldval = hm.getOrDefault(answers[i], 0);
            hm.put(answers[i], oldval + 1);
        }

        int ans = 0;

        for (Integer num : hm.keySet()) {
            int freq = hm.get(num);
            int group = (int) Math.ceil((freq * 1.0) / (num + 1));

            ans += group * (num + 1);
        }

        return ans;

    }
}