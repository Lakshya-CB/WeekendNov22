package Lec_08;

public class Binary_Sewarch {
	public static void main(String[] args) {
		int[] Arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };

	}

	public static boolean find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s<=e) {
			int mid = (s + e) / 2;
			if (ali == arr[mid]) {
				return true;
			} else if (ali > arr[mid]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}

		return true;
	}
//	https://leetcode.com/problems/first-bad-version/
	 public int firstBadVersion(int naan) {
	        int s =1;
	        int e =naan;
	        int ans = naan;
	        while(s<=e){
	            int mid = (s+e)/2;
	            boolean b = isBadVersion(mid);
	            if(b){
	                ans = mid;
	                e = mid -1;
	            }else{
	                s = mid+1;
	            }
	        }
	        return ans;
	    }
}
