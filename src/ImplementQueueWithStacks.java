import java.util.Stack;

public class ImplementQueueWithStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int n1){
        while(!s2.empty()){
            int n = s2.pop();
            s1.push(n);
        }
        s1.push(n1);
    }
    public int pop(){
        while(!s1.empty()){
            int n1 = s1.pop();
            s2.push(n1);
        }
        return s2.pop();
    }

}
