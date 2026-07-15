class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] arr, int x) {

        int lo = 0, hi = arr.length - 1;
        int first = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == x) {
                first = mid;
                hi = mid - 1;
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return first;
    }

    public int findLast(int[] arr, int x) {

        int lo = 0, hi = arr.length - 1;
        int last = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == x) {
                last = mid;
                lo = mid + 1;
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return last;
    }
}