package Lec_27;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.createCycle();
		System.out.println(LL.detectCycle());
//		for(int i =10;i<=110;i=i+10) {
//			LL.add(i);
//		}
//		LL.disp();
//		
//		LL.K_Rev(300);
//		LL.disp();
		
		
		
	}
//	//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
//public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        
//        ListNode C1 = headA;
//        ListNode C2 = headB;
//        while(C1!=C2){
//
//            C1 = C1.next;
//            C2 = C2.next;
//            if(C1==C2){
//                return C1;
//            }
//            if(C1==null){
//                C1 = headB;
//            }
//            if(C2==null){
//                C2 = headA;
//            }
//        }
//        return C1;
//         
//    }
//	 public ListNode reverseKGroup(ListNode head, int k) {
//	        if(head ==null){
//	            return null;
//	        }
//	        ListNode nn = head;
//	        for(int i=1;i<=k;i++){
//	            if(nn==null){
//	                return head;
//	            }
//	            nn = nn.next;
//	            
//	        }
//	        ListNode sp = reverseKGroup(nn, k);
//	        ListNode prev = null;
//	        ListNode curr = head;
//	        ListNode baaackup = head;
//	        for(int i=1;i<=k;i++){
//	            ListNode After = curr.next;
//
//	            curr.next = prev;
//	            prev = curr;
//	            curr = After;
//	        }
//	        baaackup.next = sp;
//	        return prev;
//	    }
	
}
