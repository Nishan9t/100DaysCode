//   https://leetcode.com/problems/angle-between-hands-of-a-clock


class Solution {
    public double angleClock(int hour, int minutes) {
        //hour hand turns 30deg 12 to 1 => 1 to 2
        //hour hand turns 0.5deg in eanch minute of an hour

        // 3:15 k liye
        // hour hand moves=:
        //             3hour*30deg +  15min * 0.5 deg
        double hourDegree = (hour*30) + (minutes*0.5); //shows location of hour hand
        double minuteDegree = (minutes*6); //shows location of minute hand
        double angleBetween =Math.abs(hourDegree - minuteDegree);
        return Math.min(angleBetween, 360-angleBetween);
        
    }
}
