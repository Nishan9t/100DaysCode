//  https://practice.geeksforgeeks.org/problems/finding-profession3834/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions






   class Solution{
    static char profession(int level, int pos){
        
        if(pos==1 || level ==1)
        {
            return 'e';
        }
        
        char p = profession(level-1,(pos+1)/2);
        
        if(pos%2 ==1)
        {
            return p;
        }
        
        return p=='e'?'d':'e';
    }
}


