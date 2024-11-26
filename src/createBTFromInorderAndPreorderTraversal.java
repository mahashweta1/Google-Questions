import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int value){
        this.val = value;
    }
}

public class createBTFromInorderAndPreorderTraversal {

    void  solution1(int[] inOrder, int[] preOrder){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inOrder.length;i++){
            map.put(inOrder[i], i);
        }

        helper(inOrder, preOrder,0, preOrder.length-1, map, 0);
    }

    TreeNode helper(int[] inOrder, int[] preOrder, int i, int j, HashMap<Integer, Integer> map, int index){
        if(i>j){
            return null;
        }
        TreeNode node = new TreeNode();
        node.val = preOrder[index];
        index = index+1;
        int inOrderIndex = map.get(preOrder[index]);

        if(i==j)
            return node;

        node.left = helper(inOrder, preOrder,i , inOrderIndex-1, map, index);
        node.right = helper(inOrder, preOrder,inOrderIndex+1, j, map, index);
        return node;

    }
}
