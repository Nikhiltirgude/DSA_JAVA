gclass Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1)
            return s;

        String[] ans = new String[numRows];

        for(int i = 0; i < numRows; i++)
            ans[i] = "";

        int i = 0;

        while(i < s.length()) {

            // Downward
            for(int row = 0; row < numRows && i < s.length(); row++) {
                ans[row] += s.charAt(i++);
            }

            // Diagonal Up
            for(int row = numRows - 2; row > 0 && i < s.length(); row--) {
                ans[row] += s.charAt(i++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String str : ans)
            sb.append(str);

        return sb.toString();
    }
}