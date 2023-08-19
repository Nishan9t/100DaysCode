//   https://leetcode.com/problems/excel-sheet-column-title


class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder row= new StringBuilder();
        while(columnNumber > 0)
        {
            //we decrease columnNumber beacuse we have to add modulo and 'A'=16
            // ex 16+2=18 i.e. C
           // but 2 should be B so we decrease columnNumber
            columnNumber--;
            //if we add 1 to 'A' it will become 'B'
            //that's why for 'A' we have to add 0
            row.insert(0,(char)('A' + columnNumber%26));
            columnNumber = columnNumber /26;
        }
        return row.toString();
    }
}

