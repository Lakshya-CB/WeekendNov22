package Lec_23;

import Lec_22.Stack;

public class Dyncamic_Stack extends Stack {

	@Override
	public void add(int ali) {
		if(isFull()) {
			grow();
		}
		super.add(ali);
	}

	private void grow() {
		int[] biggy = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			biggy[i] = arr[i];
		}
		this.arr = biggy;		
	}
}
