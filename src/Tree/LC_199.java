package Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode4 {
      int val;
      TreeNode4 left;
      TreeNode4 right;
      TreeNode4() {}
      TreeNode4(int val) { this.val = val; }
      TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class LC_199 {
    public List<Integer> rightSideView(TreeNode4 root) {
        List<Integer>al=new ArrayList<>();
        if(root==null) return al;

        helper(root, 1, al);
        return al;

    }
    public void helper(TreeNode4 root, int level, List<Integer> al){
        if(root==null)return;

        if (al.size()<level){
            al.add(root.val);
        }
        helper(root.right,level+1,al);
        helper(root.left,level+1,al);
    }
    }
