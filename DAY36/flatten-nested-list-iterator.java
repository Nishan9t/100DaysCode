//   https://leetcode.com/problems/flatten-nested-list-iterator/




/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack;
    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        addToStack(nestedList);
        
    }
    @Override
    public Integer next() {
        return stack.pop().getInteger();
        
    }
    @Override
    public boolean hasNext() {
        //pop off the stack unitl it's empty or we've found an integer
        while(!stack.isEmpty() && !stack.peek().isInteger())
        {
            addToStack(stack.pop().getList());
        }
        return !stack.isEmpty();
        
    }
    // Function to add NestedIntegers in the passed-in list to the stack.
    private void addToStack(List<NestedInteger> list)
    {
        for(int i=list.size()-1;i>=0;i--)
        {
    // iterate in reverse to preserve the consecutive order of the list as they're popped off the stack.
            if(list.get(i).isInteger() || !list.get(i).getList().isEmpty())
            {
                // We don't want to include empty lists in our stack so we skip them.
                stack.add(list.get(i));
            }
        }
    }
}
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */