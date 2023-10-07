// https://practice.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints1135/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions


class Solution 
{ 
    static long countStr(long n)
	{
	    if(n<=1)
	    {
	        return 3;
	        
	    }
	    else if(n==2)
	    {
	        return 8;
	    }
	    
	    return (long) ((Math.pow(n,3)+ 3*n +2)/2);
	}
} 
