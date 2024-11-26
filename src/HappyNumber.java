//
//
//
//public class HappyNumber {
//    int number;
//    HappyNumber next;
//    HappyNumber(){};
//    HappyNumber(int n){
//        this.number = n;
//    }
//}
//
//class LinkedList1{
//
//    HappyNumber head;
//    public void createLL(int n){
//        HappyNumber slow = new HappyNumber();
//        HappyNumber fast = new HappyNumber();
//        HappyNumber rootNode = new HappyNumber(n);
//        head=rootNode;
//        slow = head;
//        fast = head;
//        insertRecur(n, rootNode, slow, fast);
//        display();
//    }
//
//    void insertRecur(int n, HappyNumber node, HappyNumber slow, HappyNumber fast){
//        int sum=0;
//        while(n>0){
//            sum = sum + (n%10)*(n%10);
//            n = n/10;
//        }
//        HappyNumber newNode = new HappyNumber(sum);
//        node.next = newNode;
//        if(fast.next != null && fast.next.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        if(sum == 1) return;
//        if(slow == fast && slow != head)
//            return;
//        insertRecur(sum, newNode, slow, fast);
//    }
//    void display(){
//        HappyNumber p= new HappyNumber();
//        p = head;
//        while(p!=null){
//            System.out.print(p.number + "->");
//            p=p.next;
//        }
//        System.out.println("END");
//    }
//}
//https://leetcode.com/problems/happy-number/description/
public class HappyNumber {
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findS(slow);
            fast = findS(findS(fast));
        }while(slow != fast);

        if(slow == 1) return  true;
        return  false;
    }

    int findS(int n){
        int sum =0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
