package Lec_17;

public class Maze_path {
	public static void main(String[] args) {
		maze(0, 0, "", 2, 2);
	}
	public static void maze(int r, int c, String path,
			int dest_r, int dest_c) {
		if(r>dest_r||c>dest_c) {
			return;
		}
		if(r==dest_r && dest_c==c) {
			System.out.println(path);
			
		}
		maze(r, c+1, path+"R", dest_r, dest_c);
		maze(r+1, c, path+"D", dest_r, dest_c);
		
	}
}
