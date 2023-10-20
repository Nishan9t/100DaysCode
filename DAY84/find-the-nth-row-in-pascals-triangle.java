//  https://prepinsta.com/java-program/find-the-nth-row-in-pascals-triangle/



public class Main {
 
    public static ArrayList getRow(int rowIndex)
    {
        ArrayList <Integer> currow = new ArrayList();
        
        currow.add(1);
 
        if (rowIndex == 0) {
            return currow;
        }
        
        ArrayList <Integer> prev = getRow(rowIndex- 1);
 
        for (int i = 1; i < prev.size(); i++) {
int curr = prev.get(i - 1) + prev.get(i);
            currow.add(curr);
        }
        currow.add(1);
 
        
        return currow;
    }
 
    // Driver Program
    public static void main(String[] args)
    {
        int n = 3;
        ArrayList arr = getRow(n);
 
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i)  + ", ");
        }
    }
}
