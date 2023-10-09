//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
         HashMap<Integer, Integer> map=new HashMap<>();
         
         for(int i=0;i<n;i++)
         {
             //if two meeting starts at same time so we will take the meeting of shorter time span
             if(map.containsKey(end[i]) && start[i]>start[map.get(end[i])])
             {
                 map.put(end[i],i);
             }
             if(!map.containsKey(end[i]))
             {
                 map.put(end[i],i);
             }
         }
         
         Arrays.sort(end);
         int count =0;
         int time =0;
         
         //for counting no. of meeting done before start[i];
         for(int i=0;i<n;i++)
         {
             if(start[map.get(end[i])] > time)
             {
                 count++;
                 time=end[i];
             }
         }
         return count;
    }
}

