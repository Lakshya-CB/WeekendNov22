package Lec_19_20;

public class Word_Search {
	 public boolean exist(char[][] board, String word) {
	        boolean ans = false;
	        for(int r=0;r<board.length;r++){
	            for(int c =0;c<board[0].length;c++){
	                ans = ans || solve(r,c,0,word,new boolean[board.length][board[0].length],board);
	            }
	        }
	        return ans;
	    }
	    public boolean solve(int r, int c, int idx, String word,boolean[][] Visited, char[][] board){
	        if(idx==word.length()){
	            return true;
	        }
	        if(r<0||c<0||r==board.length||c==board[0].length||
	         board[r][c]!=word.charAt(idx)||Visited[r][c] ){
	            return false;
	        }
	        Visited[r][c] =true;

	        boolean sp1=solve(r+1,c,idx+1,word,Visited,board);
	        boolean sp2=solve(r-1,c,idx+1,word,Visited,board);
	        boolean sp3=solve(r,c+1,idx+1,word,Visited,board);
	        boolean sp4=solve(r,c-1,idx+1,word,Visited,board);
	        Visited[r][c] =false;
	        
	        return sp1 || sp2||sp3||sp4;
	    }
}
