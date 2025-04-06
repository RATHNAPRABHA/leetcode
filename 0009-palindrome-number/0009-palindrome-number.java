class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int h=x;
        int n=0;
       // if(x<0) return false;
        while(x!=0){
            int d=x%10;
            n=n*10+d;
            x/=10;
        }
      return n==h;
    }

}