import java.util.List;
import java.util.Stack;

public class minimumAddToMakeParenthesisValid {
    public int solution1(List<String> p){
        Stack<String> balancedP = new Stack<>();
        int index = 0;
        int count =0;
        if(p.get(0).equals(")") || p.get(0).equals("}") || p.get(0).equals("]"))
        {
            count = p.size();
        }
        for(int i=0;i<p.size();i++){
            if(p.get(i).equals("(") || p.get(i).equals("{") || p.get(i).equals("[")){
                balancedP.push(p.get(i));
            }
            else{
                if(!balancedP.isEmpty()){
                    if(p.get(i).equals("}") && balancedP.peek().equals("{") ||
                            p.get(i).equals("]") && balancedP.peek().equals("[") ||
                            p.get(i).equals(")") && balancedP.peek().equals("(")){
                        balancedP.pop();
                    }
                }else{
                    index = i; break;
                }
            }
        }
        if(!balancedP.isEmpty()){
            count = balancedP.size();
        }else if(balancedP.isEmpty() && index != 0){
            count = p.size() - index;
        }
        return count;
    }
    public int solution2(String str) {
        Stack<Character> p = new Stack<>();
        for( Character c : str.toCharArray()){
            if(c.equals('('))
                p.push(c);
            else if(c.equals(')') && !p.isEmpty() && p.peek().equals('(')){
                    p.pop();
            }else
                p.push(c);
        }
        return p.size();
    }
}
