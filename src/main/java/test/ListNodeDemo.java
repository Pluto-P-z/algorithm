package test;


import java.util.*;


public class ListNodeDemo {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode dummy=new ListNode();
        ListNode head=dummy;
        while (sc.hasNext()) {
            int len=sc.nextInt();
            for(int i=0;i<len;i++){
                int value = sc.nextInt();
                head.next=new ListNode(value);
                head=head.next;
            }
            head=dummy.next;
            ListNode res = new ListNodeDemo().reverseList(head);
            while(res!=null){
                System.out.println(res.val);
                res=res.next;
            }
        }
    }
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while (head!=null) {
            next = head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}