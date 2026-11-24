package Tree;
   class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class FindMax {

    public int find(TreeNode node){
        if(node==null) return Integer.MIN_VALUE;

        int left=find(node.left);
        int right=find(node.right);

        return Math.max(node.val,Math.max(left,right));
    }
}
