package Tree;

import java.util.ArrayList;
import java.util.List;

/*题目描述：给定一个二叉树，返回它的中序 遍历。
  示例:
  输入: [1,null,2,3]
       1
        \
         2
        /
      3
   输出: [1,3,2]*/
public class TreeByLdr {

    //递归方式的二叉树中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<>();
        ldr(rst,root);
        return rst;

        //注释掉的为采用迭代方式的二叉树中序遍历
        /*List<Integer> rst = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty()||p!=null){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            TreeNode tmp = stack.pop();
            rst.add(tmp.val);
            p = tmp.right;
        }
        return rst;*/
    }

    public void ldr(List<Integer> list,TreeNode node){
        if(node==null) return;
        ldr(list,node.left);
        list.add(node.val);
        ldr(list,node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
