//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions

// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int f=1;
        Stack<Node> rl = new Stack<>();
        Stack<Node> lr = new Stack<>();
        
        rl.push(root);
        while((!rl.isEmpty()) || (!lr.isEmpty()))
        {
            if(f==1)
            {
                Node t= rl.pop();
                ans.add(t.data);
                if(t.right!=null) lr.push(t.right);
                if(t.left!=null) lr.push(t.left);
                if(rl.isEmpty())
                {
                    f=0;
                }
            }
            else{
                Node t= lr.pop();
                ans.add(t.data);
                if(t.left!=null) rl.push(t.left);
                if(t.right!=null) rl.push(t.right);
                if(lr.isEmpty())
                {
                    f=1;
                }
            }
        }
        return ans;
    }
}
