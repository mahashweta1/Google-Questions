import java.util.ArrayList;


public class returnTheSumOfSubsequenceThatMatch {

    int sum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }
    void solution1(int[] arr, ArrayList<Integer> out, int index, int sum, int target){
        if(index == arr.length){
            if(sum == target) {
                System.out.println();
                for(int i: out){
                    System.out.print(i + " ");
                }
            }
            return;
        }
        out.add(arr[index]);
        sum = sum(out);
        solution1(arr,out, index+1, sum, target);
        out.remove(out.size()-1);
        sum = sum(out);
        solution1(arr,out, index+1, sum, target);
    }
}
