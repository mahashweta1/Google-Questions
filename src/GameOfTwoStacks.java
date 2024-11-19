import java.util.List;
import java.util.Stack;

import static java.lang.Math.max;
import static java.lang.Math.min;


public class GameOfTwoStacks {

    public int findMaxSum(Stack<Integer> a, Stack<Integer> b, int sum, int finalsum, int count) {
       int a1 =0,a2=0;
        if(finalsum> sum){
            return count-1;
        }
        if (!a.isEmpty()) {
            System.out.println("sum, finalsum, count a pop " +sum + " " + finalsum +  " " + count);
            a1 = findMaxSum(a, b, sum, finalsum + a.pop(), count+1);
        }
        if (!b.isEmpty()) {
            System.out.println("sum, finalsum, count b pop " +sum + " " + finalsum +  " " + count);
            a2 = findMaxSum(a, b, sum, finalsum + b.pop(), count+1);
        }
        return max(a1, a2);
    }
}
