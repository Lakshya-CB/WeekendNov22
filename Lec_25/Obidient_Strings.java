package Lec_25;

public class Obidient_Strings {
	static boolean ans = false;
	public static void main(String[] args) {

	}

	public static void solve(String curr, String toCheck) {
		if(!toCheck.startsWith(curr)) {
			return;
		}
		if(curr.equals(toCheck)) {
			ans = true;
			return;
		}
		if(curr.isEmpty()) {
			solve("a", toCheck);
		}else if(curr.endsWith("a")) {
			solve(curr+"a", toCheck); 
			solve(curr+"bb", toCheck); 
		}else if(curr.endsWith("bb")) {
			solve(curr+"a", toCheck);
		}
	}
}
