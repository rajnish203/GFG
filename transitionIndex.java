public class transitionIndex {

    int transitionPoint(int arr[], int n) {
        // code here
        int l = 0;
        int r = n - 1;
        int transitionPoint = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 1) {
                transitionPoint = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return transitionPoint;
    }

}
