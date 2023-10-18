//  https://practice.geeksforgeeks.org/problems/help-the-old-man3848/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Count{
    int count = 0;
}

class Solution{
    static List<Integer> shiftPile(int N, int n){
        List<Integer> list = new ArrayList<>();
        traverse(list, N, n, 1, 3, 2, new Count());
        return list;
    }
    
    static void traverse(List<Integer> list, 
            int N, int n, int from, int to, int aux, Count c){
        if(N>0){
            traverse(list, N-1, n, from, aux, to, c);
            c.count+=1;
            if(c.count==n){
                list.add(from);
                list.add(to);
            }
            traverse(list, N-1, n, aux, to, from, c);
        }
    }
}
