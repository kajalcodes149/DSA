class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        int lo=0,hi=row*cols-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            int midrow = mid/cols;
            int midcols = mid%cols;
            if(matrix[midrow][midcols] == target) return true;
            else if(matrix[midrow][midcols]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
}