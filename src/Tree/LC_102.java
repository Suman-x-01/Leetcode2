package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode3 {
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode3() {}
      TreeNode3(int val) { this.val = val; }
      TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class LC_102 {

        public List<List<Integer>> levelOrder(TreeNode3 root) {
            List<List<Integer>> al=new ArrayList<>();
            Queue<TreeNode3> q=new LinkedList<>();
            if(root==null){
                return al;
            }

            q.add(root);

            while(!q.isEmpty()){
                ArrayList<Integer>level=new ArrayList<>();
                int n=q.size();
                for(int i=0;i<n;i++){
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    level.add(q.poll().val);
                }
                al.add(level);
            }
            return al;
        }

}
