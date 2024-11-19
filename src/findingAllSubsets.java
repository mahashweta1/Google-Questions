import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findingAllSubsets {
    List<List<Integer>> solution1(List<Integer> in, int i,int j, List<List<Integer>> ans){
        List<Integer> a = new ArrayList<>();
        for(int k=i;k<=j;k++){
            a.add(in.get(k));
        }
        ans.add(a);
        if(j < in.size()) j=j+1;
        if(j > in.size() - 1){
            i = i+1; j=i;
        }
        if(i > in.size() - 1){
            return ans;
        }
        solution1(in,i,j,ans);
        return ans;
    }
}
