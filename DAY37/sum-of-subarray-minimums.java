//   https://leetcode.com/problems/sum-of-subarray-minimums




class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer>s=new Stack<>();
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        //left[]
        for(int i=0;i<n;i++){
            if(s.empty()){
                left[i]=-1;
            }
            else if(arr[s.peek()]<arr[i]){
                left[i]=s.peek();
            }
            else{
                while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                    s.pop();
                }
                if(s.isEmpty())left[i]=-1;
                else left[i]=s.peek();
            }
            s.push(i);
        }
        //right[]
        s.clear();
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                right[i]=n;
            }
            else if(arr[s.peek()]<arr[i]){
                right[i]=s.peek();
            }
            else{
                while(!s.isEmpty()&&arr[s.peek()]>=arr[i])s.pop();
                if(s.isEmpty())right[i]=n;
                else right[i]=s.peek();
            }
            s.push(i);
        }
        long total=0;
        for(int i=0;i<n;i++){
             long p=((i-left[i])*(right[i]-i));
             total=(total+arr[i]*p)%1000000007;
        }
        return (int)total;
    }
}

