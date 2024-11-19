import java.util.List;
import java.util.Stack;

public class ValidParenthesis {
    public void checkParenthesis(List<String> input){
        Stack<String> bracket = new Stack<>();
        boolean balanced = false;
        for(int i=0;i<input.size();i++){
            if(input.get(i).equals("{") || input.get(i).equals("[") || input.get(i).equals("(")){
                bracket.push(input.get(i));
            }
            if(input.get(i).equals("}") ||input.get(i).equals("]") || input.get(i).equals(")")){
                if(input.get(i).equals("}") && bracket.pop().equals("{") ||
                        input.get(i).equals("]") && bracket.pop().equals("[") ||
                        input.get(i).equals(")") && bracket.pop().equals("(")){
                    balanced = true;
                    continue;
                }else {
                    balanced = false;
                    break;
                }
                };
            }
        if(balanced) System.out.println("Balanced brakets");
        else System.out.println(" Not Balanced Bracket");
        }
}
