//  https://practice.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Tree {
    
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root, 0, list);
        return list;
        
    }
    
    public static void traverse(Node root, int index, ArrayList<Integer> list){
        if(root!=null){
            if(list.size()==index) 
            {
                list.add(root.data);
            }
            else 
            {
                list.set(index, list.get(index)+root.data);
            }
            traverse(root.right, index, list);
            traverse(root.left, index+1, list);
        }
    }
}


