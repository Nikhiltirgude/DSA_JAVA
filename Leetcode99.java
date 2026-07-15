class Solution {
    public void recoverTree(TreeNode root) {
      Stack<Pair>st=new Stack<>();
      st.push(new Pair(root,1));

      TreeNode a=null;
      TreeNode b=null;

      TreeNode prev=null;
      TreeNode curr=getNextInorder(st);

      while(curr!=null){
        if(prev!=null && prev.val>curr.val){                //problematic area
            if(a==null){
                a=prev;
                b=curr;
            }
            else{
                b=curr;
            }
        }

        prev=curr;
        curr=getNextInorder(st);
      }

      int temp=a.val;
      a.val=b.val;
      b.val=temp;
    }

    private TreeNode getNextInorder(Stack<Pair>st){
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state==1){
                //preorder
                top.state++;
                if(top.node.left!=null) {
                    st.push(new Pair(top.node.left,1));
                }
            }

            else if(top.state==2){
                //inorder
                top.state++;
                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,1));
                }
                return top.node;
            }
            else{
                //postorder
                st.pop();
            }
        }

        return null;
    }
}

class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode node,int state){
        this.node=node;
        this.state=state;
    }
}