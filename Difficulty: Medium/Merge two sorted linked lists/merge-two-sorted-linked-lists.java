/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node list1, Node list2) {
        Node head = new Node(-1);
        Node tail = head;
        while (list1 != null && list2 != null){
            if(list1.data < list2.data){
                tail.next = list1;
                list1 = list1.next;
                tail=tail.next;
            }
            else{
                tail.next = list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
            while(list1!=null){
                tail.next = list1;
                list1 = list1.next;
                tail=tail.next;
            }
            while(list2!=null){
                tail.next = list2;
                list2=list2.next;
                tail=tail.next;
            }
            return head.next;
    }

}