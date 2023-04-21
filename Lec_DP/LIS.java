package Lec_DP;

public class LIS {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(solve(arr, 0, -1, new Integer[arr.length][arr.length + 1]));
		System.out.println(BU(arr));
	}
	
	public static int solve(int[] arr, int s, int prev_idx, Integer[][] dp) {
//		solve(s,prev) =d[s][prev+1]
		if (s == arr.length) {
			return 0;
		}
		if (dp[s][prev_idx + 1] != null) {
			return dp[s][prev_idx + 1];
		}
		int sp1 = 0;
		if (prev_idx == -1 || arr[s] > arr[prev_idx]) {
			sp1 = 1 + solve(arr, s + 1, s, dp);
		}
		int sp2 = solve(arr, s + 1, prev_idx, dp);
		dp[s][prev_idx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length + 1][arr.length + 1];
		for (int s = arr.length - 1; s >= 0; s--) {
			for (int prev_idx = arr.length - 1; prev_idx >= -1; prev_idx--) {
//				solve(s,prev_idx)!!

				int sp1 = 0;
				if (prev_idx == -1 || arr[s] > arr[prev_idx]) {
					sp1 = 1 + dp[s + 1][s + 1];
				}
				int sp2 = dp[s + 1][prev_idx+1];
				dp[s][prev_idx + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1+1];
	}
	 public int lengthOfLIS(int[] arr) {
		    ArrayList<Integer> AL = new ArrayList<>();
				for(int ali: arr){
					if(AL.isEmpty() || AL.get(AL.size()-1)<ali){
						AL.add(ali);
					}else{
						// F F F F F T T T T 
						int s =0;
						int e = AL.size()-1;
						int ans = -1;
						while(s<=e){
							int mid= (s+e)/2;
							if(AL.get(mid)>=ali){
								e = mid-1;
								ans =mid;
							}else{
								s = mid+1;
							}
						}
						AL.set(ans,ali);
					}
				}
				return AL.size();
			}
}
