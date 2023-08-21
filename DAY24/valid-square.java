//   https://leetcode.com/problems/valid-square


class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        //we use a set to store the distancces between the points
        Set<Integer> set= new HashSet<>();
        //calculate the distance betwen all pairs of points and add to the set
        set.add(distanceSquare(p1,p2));
        set.add(distanceSquare(p1,p3));
        set.add(distanceSquare(p1,p4));
        set.add(distanceSquare(p2,p3));
        set.add(distanceSquare(p2,p4));
        set.add(distanceSquare(p3,p4));
         // A square must have 4 equal sides, so the set must contain 2 different values (the lengths of the sides and the diagonals)
        // The set should not contain 0, as that would mean that two points have the same coordinates
        return !set.contains(0) && set.size()==2;
    }
    private int distanceSquare(int[] a , int[] b)
    {
        // we use the pythagorean theorem between two points and return the points
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}
