//Input: arr[] = {0, -1, 2, -3, 1}
//        Output: {{0, 1, 4}, {2, 3, 4}}
//        Explanation:  Two triplets with sum 0 are:
//        arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
//        arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
import java.util.Arrays;

public class SumFindAllTripletsWithZeroSum {
    public int findSum(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        int j,k;
        for(int i=0;i<n;i++){
            j=i+1; k=n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    count = count+1;
                    j = j+1;
                }
                else if(sum<0) j = j+1;
                else k= k-1;
            }
        }
        return  count;
    }
}
