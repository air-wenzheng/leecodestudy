Note:
Here I collect two solutions. Solution 2 uses HashMap, and performance is worse than solution 1.
    
Solution 1:
-----------------------------------------
class Solution {
    public int romanToInt(String s) {
        int value=0;
        
        // Creating array of string length
        char[] ch = new char[s.length()];
  
        // Copy character by character into array
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        char c_pre =' ';
        for (int i = 0; i < s.length(); i++) {
            char c = ch[i];
            if (i>0) c_pre = ch[i-1];
            
            switch (c) {
                case 'M':
                    value +=1000;
                    if (c_pre=='C') value-=200;
                    break;
                case 'D':
                    value +=500;
                   if (c_pre=='C') value-=200;
                    break;
                case 'C':
                    value +=100;
                    if (c_pre=='X') value-=20;
                    break;
                case 'L':
                    value +=50;
                     if (c_pre=='X') value-=20;
                    break;
                case 'X':
                    value +=10;
                    if (c_pre=='I') value-=2;
                    break;
                case 'V':
                    value+=5;
                    if (c_pre=='I') value-=2;
                    break;
                case 'I':
                    value+=1;
                    break;
            }
        }
        return value;
    }
}
------------------------
    Performance:
Runtime: 6 ms, faster than 74.41% of Java online submissions for Roman to Integer.
Memory Usage: 45.5 MB, less than 53.86% of Java online submissions for Roman to Integer.
    
-----------------------
    Solution 2: (use HashMap)
-------------------------
    class Solution {

    public int romanToInt(String s) {
        // Map to store romans numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
       // HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        // Length of the given string
        int n = s.length();
        // Variable to store result
        int num = romanMap.get(s.charAt(n - 1));
        // Loop for each character from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }
}
------------------------
    Performance:
Runtime: 11 ms, faster than 37.83% of Java online submissions for Roman to Integer.
Memory Usage: 46.5 MB, less than 40.71% of Java online submissions for Roman to Integer.
    
