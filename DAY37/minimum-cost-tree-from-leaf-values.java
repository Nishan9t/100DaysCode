//   https://leetcode.com/problems/minimum-cost-tree-from-leaf-values




class Solution {
    //https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/solutions/2089010/java-mono-stack-solution-with-case-break-down/
    public int mctFromLeafValues(int[] arr) {
        int sum=0;
        Stack<Integer> stack = new Stack<>();
        for(int num: arr)
        {
            sum +=cleanUpStack(num,stack);
        }
        //1 <= arr[i] <= 15
        sum += cleanUpStack(17,stack);
        return sum;
        
    }
    private int cleanUpStack(int target, Stack<Integer> stack)
    {
        int last=0;
        int sum=0;
        while(!stack.isEmpty() && stack.peek() <=target)
        {
            int cur = stack.pop();
            sum+=last*cur;
            last=cur;
        }
        if(target != 17)
        {
            sum +=target*last;
            stack.push(target);
        }
        return sum;
    }
}
