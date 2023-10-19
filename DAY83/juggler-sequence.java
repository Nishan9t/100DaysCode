//  https://practice.geeksforgeeks.org/problems/juggler-sequence3930/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Solution{
    static List<Integer> jugglerSequence(int N){
        
        ArrayList<Integer> sequence = new ArrayList<>();
        return F(N,sequence);
    }
    
    static List<Integer> F(int N, ArrayList<Integer> sequence)
    {
        sequence.add(N);
        int k;
        if(N%2==0)
        {
            k=(int) Math.pow(N,0.5);
        }
        else{
            k=(int) Math.pow(N,1.5);
        }
        
        if(k==N)
        {
            return sequence;
        }
        return F(k,sequence);
    }
}
