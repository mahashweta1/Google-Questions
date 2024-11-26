//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/description/



public class NumberOfDiceRollsWithTargetSum {
    public int sum(String ans){
        int sum =0;
        for(int i=0;i<ans.length();i++){
            sum = sum + ans.charAt(i) - '0';
        }
        return sum;
    }
    public void solution1(int n, int k, int target, String ans, int level, int targetActual){
        if(level == n){
            if(targetActual == sum(ans))
                System.out.println(ans);
            return;

        }
        for(int i=1;i<=k;i++){
            solution1(n,k,target-i, ans +i, level+1, targetActual);
        }
    }
}
