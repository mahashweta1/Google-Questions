import java.util.ArrayList;

public class generateSubsequencesOfArray {

    void solution1(ArrayList<Integer> out, ArrayList<Integer> in, Integer index){
        if(index == in.size()){
            System.out.println();
            for (Integer integer : out) System.out.print(integer + " ");
            return;
        }
        out.add(in.get(index));
        solution1(out,in,index+1);
        out.remove(out.size()-1);
        solution1(out,in,index+1);
    }
}
