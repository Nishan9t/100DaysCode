//   https://leetcode.com/problems/time-based-key-value-store



class Node{
    int time;
    String value;
    Node(int time, String value){
        this.time = time;
        this.value = value;
    }
}
class TimeMap {
    HashMap<String,List<Node>>timeMap;
    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Node newNode = new Node(timestamp,value);
        if(timeMap.containsKey(key)){
            timeMap.get(key).add(newNode);
        }
        else{
            List<Node>l = new ArrayList<>();
            l.add(newNode);
            timeMap.put(key,l);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key))return "";
        List<Node>list = timeMap.get(key);
        return binarySearch(list,0,list.size()-1,timestamp);
    }
    String binarySearch(List<Node>list,int left, int right, int target){
        int mid = 0;
        while(left<right){
            mid = left+(right-left)/2+1;
            if(list.get(mid).time<target){
                left = mid;
            }
            else if(list.get(mid).time>target)right = mid-1;
            else return list.get(mid).value;
        }
        return list.get(left).time>target?"":list.get(left).value;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */




