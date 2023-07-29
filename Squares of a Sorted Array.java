class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squared[i] = ((nums[i]) * nums[i]);
        }
        MergeSort m = new MergeSort();
        m.sort(squared, 0, squared.length - 1);
        return squared;
    }
}

class MergeSort {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] A1 = new int[n1];
        int[] A2 = new int[n2];
        for (int i = 0; i < n1; ++i) {
            A1[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            A2[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (A1[i] <= A2[j]) {
                arr[k] = A1[i];
                i++;
            } else {
                arr[k] = A2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = A1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = A2[j];
            j++;
            k++;
        }

    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}