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
