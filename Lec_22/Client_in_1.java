package Lec_22;

import java.util.ArrayList;

public class Client_in_1 {
	public static void main(String[] args) {
//		c1!!
		P obj_1 = new P();
//		c2!!
		P obj_2 = new C();
		
		System.out.println(obj_2.datap);
		System.out.println(obj_2.data);
		
		System.out.println(((C)obj_2).data);
		System.out.println(((C)obj_2).datac);
		
		obj_2.funP();
		obj_2.fun();
		((C)obj_2).fun();
		((P)obj_2).fun();
		
//		c3!!!
		System.out.println("==========");
		C obj3 = new C();
		
		System.out.println(obj3);
		System.out.println(obj3.data);
		System.out.println(((P)obj3).data);
		
		System.out.println(obj3.datap);
		
//		c4!?
//		C obj4 = new P();
//		######################################
		Object oo = new P();
		String ster = obj3.toString();
		System.out.println(ster);
		
		System.out.println(new ArrayList<>());
		
	}
}
