class Node{
    int n;
    Node next;
    int index;

    Node(){}
    Node(int val){
        this.n = val;
    }
    Node(int val, Node node){
        this.n = val;
        this.next = node;
    }
}

public class LinkedList {

    Node head;
    Node tail;
//    Node tailer;
//    Node holdNext;
//    Node holdLast;
    void insertFirst(int n){
        Node n1 = new Node(n);
        n1.index = 1;
        this.head = n1;
        this.tail = n1;

    }

    void insertNext(int n){
        Node newNode = new Node(n);
        Node p = this.head;
        int count = p.index;
        while(p.next!= null){
            p = p.next;
            count+=1;
            p.index = count;
        }
        newNode.index = p.index +1;
        p.next = newNode;
        this.tail = newNode;
    }

    void display(){
        Node p = this.head;
        while (p!=null){
            System.out.print(p.n + " -> ");
            p = p.next;
        }
        System.out.println("END");
    }

    void insertInMiddle(int n, int index){
        Node newNode = new Node(n);
        Node p = this.head;
        int c =0;
        while(p!=null){
            if(c == index-1){
                newNode.next = p.next;
                p.next = newNode;
            }
            c = c+1;
            p= p.next;
        }
    }

    void deleteFirst(){
        Node p = this.head;
        this.head = this.head.next;
        p.next = null;
    }

    //two pointer method to enter a new node in the middle with recursion
    void insertRecur(int n, int index){
        Node p = this.head;
        insertRecur(n, index, p, new Node());
    }

    void insertRecur(int n, int index, Node current, Node next){
        if (index == 1) {
            Node newNode = new Node(n);
            next = current.next;
            newNode.next = next;
            current.next = newNode;
            return;
        }
        index = index-1;
        insertRecur(n, index, current.next, next);
    }

    //one pointer method to enter a new node in the middle with recursion
    void insertRecurOnePointer(int n, int index){
        Node p = this.head;
        insertRecurOnePointer(n, index, p);
    }

    Node insertRecurOnePointer(int n, int index, Node current){
        if(index == 0){
            Node newNode = new Node(n);
            newNode.next = current;
            return  newNode;
        }
        index = index - 1;
        current.next = insertRecurOnePointer(n, index, current.next);
        return current;
    }


    void ReverseLL(){
        this.ReverseLL(head);
    }
    void ReverseLL(Node node){
        if(node ==tail){
            head = tail;
            return;
        }
        ReverseLL(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    void ReverseAPartOfLL(int sindex, int endIndex){
        int c=1;
        Node startNode = head;
        Node endNode = head;
        while(c <sindex-1){
            c+=1;
            startNode = startNode.next;
        }
        c =1;
        while (c< endIndex){
            c+=1;
            endNode = endNode.next;
        }
        threePointerReversal(startNode.next, startNode.next.next, startNode, endNode);
    }

    void threePointerReversal(Node current, Node NextNode, Node p, Node q){
        Node prev = null;
        Node curr = current;
        Node nextN = NextNode;
        Node joinEnd = current;
        while(curr.next !=q.next && nextN.next != null){
            curr.next = prev;
            prev = curr;
            curr = nextN;
            nextN = nextN.next == null? null: nextN.next;
        }
        p.next = curr == null? prev: curr;
        joinEnd.next = null;
    }

    boolean findPalindromeinLL(){
        boolean palindrom = false;
        int size = tail.index;
        int startIndex = 0;
        if(size/2!=0)
            startIndex = size/2 +1;
        else startIndex = size/2;
        ReverseAPartOfLL(startIndex,size);
        Node p = head;
        Node q= head;
        while(q.index != (size/2 +1)){
            q = q.next;
        }

        while(q.next!=null){
            if(p.n == q.n){
                palindrom = true;
            }
            else{
                if(q.index == size){
                    palindrom = true;
                }
                palindrom = false;
                break;
            }
            p = p.next;
            q = q.next;
        }
        return palindrom;
    }

}

//https://leetcode.com/problems/reverse-linked-list-ii/submissions/1460869406/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if(left == right)
//            return head;
//        ListNode curr = head;
//        ListNode prev = null;
//        for(int i=0;i<left-1 && curr!=null;i++){
//            prev = curr;
//            curr = curr.next;
//        }
//
//        ListNode last = prev;
//        ListNode newEnd = curr;
//        ListNode next = curr.next;
//        for(int i=0;i<right-left+1;i++){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            next = next==null? null: next.next==null? null:next.next;
//        }
//
//        if(last!=null) last.next = prev;
//        else head = prev;
//        newEnd.next = curr;
//        return head;
//    }
//}



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//https://leetcode.com/problems/reorder-list/
//class Solution {
//    ListNode middleNode(ListNode head){
//        ListNode fastptr = head;
//        ListNode slowPtr = head;
//        System.out.println(slowPtr);
//        while(fastptr!=null && fastptr.next!=null){
//            slowPtr = slowPtr.next;
//            fastptr = fastptr.next.next;
//        }
//        return slowPtr;
//    }
//
//    ListNode reverseLL(ListNode head){
//        if(head == null)
//            return head;
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode next = curr.next;
//        while(curr != null){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            next = next == null? null : next.next;
//        }
//        return prev;
//    }
//
//    public void reorderList(ListNode head) {
//        if(head == null || head.next == null)
//            return;
//        ListNode midLL = middleNode(head);
//        ListNode midElement = midLL;
//        ListNode hs = reverseLL(midLL);
//        ListNode hf = head;
//
//        ListNode temp1 = hs;
//        ListNode temp2 = hf;
//        while(hf != midElement){
//            temp2 = hf.next;
//            temp1 = hs.next;
//            hs.next = hf.next;
//            hf.next = hs;
//            hs = temp1;
//            hf = temp2;
//        }
//        if(hf.next != null) hf.next = null;
//    }
//}


//https://leetcode.com/problems/reverse-nodes-in-k-group/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    ListNode createNewList(ListNode newList, ListNode subList){
//        if(newList == null){
//            newList = subList;
//            return newList;
//        }
//        ListNode p = newList;
//        while(p.next!=null){
//            p = p.next;
//        }
//        p.next = subList;
//        return newList;
//    }
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if(k==1 || head == null){
//            return head;
//        }
//        ListNode newList = null;
//        int n=k;
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode next = curr.next;
//        ListNode q = head;
//        int count = 0;
//        while (q != null) {
//            count++;
//            q = q.next;
//        }
//        while(count >= k){
//            for(int j=0;j<n && curr!=null;j++){
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//                next = next == null? null: next.next;
//            }
//            newList = createNewList(newList, prev);
//            prev = null;
//            count = count-k;
//        }
//
//        ListNode p = newList;
//        while(p.next!=null)
//            p=p.next;
//        p.next = curr;
//        head = newList;
//        return head;
//    }
//}