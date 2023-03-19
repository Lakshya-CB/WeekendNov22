package Lec_24;

public class Board_path {
	public static void main(String[] args) {
		int mat[][] = { { 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 1, 0 } };
		
		boolean[][] Visited = new boolean[mat.length][mat[0].length];
		
		solve(0, 0,"", mat,Visited);
	}
	public static void solve(int r, int c, String path,int[][] maze, boolean[][] Visited) {
		
		if(r<0||c<0||r==maze.length||c==maze[0].length||
				maze[r][c]==1|| Visited[r][c]) {
			return;
		}
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(path);
			return;
		}
		Visited[r][c] = true;
		solve(r-1, c, path+"U", maze,Visited);
		solve(r+1, c, path+"D", maze,Visited);
		solve(r, c-1, path+"L", maze,Visited);
		solve(r, c+1, path+"R", maze,Visited);

		Visited[r][c] = false;
	}
}
