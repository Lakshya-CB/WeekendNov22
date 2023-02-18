package Lec_16;

public class Climb_Stairs {
	public static void main(String[] args) {
		solve(0, "", 4);
	}
	public static void solve(int curr,
			String path, int dest) {
		if(curr== dest) {
			System.out.println(path);
			return;
		}
		if(curr> dest) {
			return;
		}
		
		solve(curr+1, path+1, dest);
		solve(curr+2, path+2, dest);
		
	}
}
