class Solution {
    public List<Integer> getRow(int rowIndex) {

        int n = rowIndex + 1;

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> arr = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    arr.add(1);
                } 
                else {
                    int value = triangle.get(i - 1).get(j - 1)
                              + triangle.get(i - 1).get(j);

                    arr.add(value);
                }
            }

            triangle.add(arr);
        }

        return triangle.get(rowIndex);
    }
}