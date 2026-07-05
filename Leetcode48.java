class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix[0].length;

        //matrix ko transpose kro
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }

        //reverse kr do ab 

        for(int i=0;i<n;i++){
            swap(matrix[i]);
        }

    }

    private void swap(int[]arr){
        int s=0;
        int e=arr.length-1; 
        
        while(s<e){
            int k=arr[s];
            arr[s]=arr[e];
            arr[e]=k;
            s++;
            e--;
        }
    }
}