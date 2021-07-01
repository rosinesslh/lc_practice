class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        int remain =0;
        
        while(x!=0){
             remain = x%10;
             if(reverse > Integer.MAX_VALUE/10 || (reverse ==Integer.MAX_VALUE/10 && remain >7)){
            return 0;
        }
        else if (reverse < Integer.MIN_VALUE/10 || (reverse ==Integer.MIN_VALUE/10 && remain <-8))
            return 0;
        
           
            reverse *=10;
            reverse += remain;
            x = x/10;
        }
        return reverse;
        }
    }
