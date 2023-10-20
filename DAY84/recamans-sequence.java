//  https://practice.geeksforgeeks.org/problems/recamans-sequence4856/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        int i=1;
        while(al.size()<=n)
        {
            int k=fn(i,al);
            al.add(k);
            i++;
        }
        return al;
    }
    
    static int fn(int n,ArrayList<Integer> al)
    {
        int val = al.get(n-1)-n;
        if(val > 0 & !al.contains(val))
        {
            return val;
        }
        return val+(2*n);
    }
}
