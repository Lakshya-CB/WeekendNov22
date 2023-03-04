package Heap_and_HashMap;

import java.util.ArrayList;

public class maze_path {
	public static void main(String[] args) {
		System.out.println(solve(3,7,1,1));
//		System.out.println(print_paths(3,7,1,1,""));
		System.out.println(paths(3,7,1,1,new ArrayList<String>()));
		
	}
	  public static int solve(int m,int n ,int i,int j){
	        if(i>m || j>n) return 0;
	        if(i==m && j==n){
	            return 1;
	        }
	        // Moving towards right
	        int sp1=solve(m,n,i,j+1);
	        //Moving Downwards
	        int sp2=solve(m,n,i+1,j);
	        return sp1+sp2;
	    }
	  public static int print_paths(int m,int n ,int i,int j,String path){
	        if(i>m || j>n) return 0;
	        if(i==m && j==n){
	        	System.out.println(path);
	        	System.out.println("=========================================");
	            return 1;
	        }
	        // Moving towards right
	        int sp1=print_paths(m,n,i,j+1,path+"R");
	        //Moving Downwards
	        int sp2=print_paths(m,n,i+1,j,path+"D");
	        return sp1+sp2;
	    }
	  public static int paths(int m,int n ,int i,int j,ArrayList<String>Al){
	        if(i>m || j>n) return 0;
	        if(i==m && j==n){
	        	System.out.println(Al);
	        	System.out.println("=========================================");
	            return 1;
	        }
	        // Moving towards right
	        Al.add("R");
	        int sp1=paths(m,n,i,j+1,Al);
	        //Backtracking
	        Al.remove(Al.size()-1);
	        //Moving Downwards
	        Al.add("D");
	        int sp2=paths(m,n,i+1,j,Al);
	        //Backtracking
	        Al.remove(Al.size()-1);
	        return sp1+sp2;
	    }
	  
}
