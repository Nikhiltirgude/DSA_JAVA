class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

      
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            hm.computeIfAbsent(indices[i], k -> new ArrayList<>()).add(i);
        }

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (hm.containsKey(i)) {
                boolean replaced = false;
                for (int idx : hm.get(i)) {
                    String src = sources[idx];
                    String tgt = targets[idx];
                    if (s.startsWith(src, i)) {
                        ans.append(tgt);
                        i += src.length();
                        replaced = true;
                        break; 
                    }
                }
                if (replaced) continue;
            }
            ans.append(s.charAt(i));
            i++;
        }

        return ans.toString();
    }
}
