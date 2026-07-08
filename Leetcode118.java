t aclass Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }

    private List<Integer>generateRow(int row){
        List<Integer>ans=new ArrayList<>();

        int val=1;
        ans.add(val);

        for(int col=1;col<row;col++){
            val=val*(row-col);
            val=val/(col);
            ans.add(val);
        }

        return ans;
    }
}