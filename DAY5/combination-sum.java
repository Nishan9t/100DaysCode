// https://leetcode.com/problems/combination-sum/


class Solution {

    public void backTrack(List<List<Integer>> result, LinkedList<Integer> lst, int idx,int[] arr,int sum)
    {
        //best condition, if target become 0
        if(sum==0)
        {
            result.add(new ArrayList(lst));
            return;
        }
        //traverse
        for(int i=idx;i<arr.length;i++)
        {
            //if candidates of i is greater than target=> then break
            if(sum-arr[i]>=0)
            {
                lst.add(arr[i]);
                backTrack(result,lst,i,arr,sum-arr[i]);
                lst.removeLast();
            }
        }
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result= new ArrayList<>();
        LinkedList<Integer> temp= new LinkedList<>();
        backTrack(result,temp,0,candidates,target);
        return result;
    }
}

