package Lec_31;

import java.util.ArrayList;

public class Heap {
//	min heap!!
	ArrayList<Integer> AL = new ArrayList<>();

	public void add(int ali) {
		// cbt !! rehega!!
		AL.add(ali);
		upHeapify(AL.size() - 1);

	}

	private void upHeapify(int ch) {
		int p = (ch - 1) / 2;
		if (AL.get(p) > AL.get(ch)) {
			schwap(p, ch);
			upHeapify(p);
		}
	}

	private void schwap(int p, int ch) {
		int temp = AL.get(p);
		AL.set(p, AL.get(ch));
		AL.set(ch, temp);
	}

	public int poll() {
		int ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size()-1);
//		CBT ki condition is maintained
		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {

		int L = 2 * p + 1;
		int R = 2 * p + 2;

		int min = p;
		if (L < AL.size() && AL.get(min) > AL.get(L)) {
			min = L;
		}
		if (R < AL.size() && AL.get(min) > AL.get(R)) {
			min = R;
		}
		if (min != p) {
			schwap(p, min);
			downHeapify(min);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return AL + "";
	}
}
