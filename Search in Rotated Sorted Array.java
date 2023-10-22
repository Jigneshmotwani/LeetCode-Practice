class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        int left = 0;
        int right = l - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[l-1]) {
                left = mid + 1;
            } else if (nums[mid] < nums[l-1]) {
                right = mid - 1;
            } else {
                break;
            }
        }
        int answer;
        answer = bsearch(nums, 0, left-1, target);
        if (answer != -1) {
            return answer;
        }
        return bsearch(nums, left, l - 1, target);
    }
    
    public int bsearch(int[] nums, int leftboundary, int rightboundary, int target) {
        int left = leftboundary;
        int right = rightboundary;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}