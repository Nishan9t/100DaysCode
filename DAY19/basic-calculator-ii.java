//   https://leetcode.com/problems/basic-calculator-ii/description/


class Solution {
    public int calculate(String s) {
       int currNo=0;
       char op='+';
       int len=s.length();
       Stack<Integer> stack= new Stack<>();
       for(int i=0;i<len;i++)
       {
           char ch= s.charAt(i);
           //check for digit
           //for numbers greater than 9(mean two or three digit numbers)
           if(Character.isDigit(ch))
           {
               currNo=(currNo*10)+(ch-'0');
           }
            //check for operator
           if(!Character.isDigit(ch) && ch !=' ' || i==len-1)
           {
               if(op == '+')
               {
                   stack.push(currNo);
               }
               else if(op=='-')
               {
                   stack.push(-currNo);
               }
               else if(op=='*')
               {
                   stack.push(stack.pop()*currNo);
               }
               else if(op == '/')
               {
                   stack.push(stack.pop()/currNo);
               }
               currNo=0;
               op=ch;
           }
       }
       int sum =0;
       while(!stack.isEmpty())
       {
           sum+=stack.pop();
       }
       return sum;
        
    }
}

