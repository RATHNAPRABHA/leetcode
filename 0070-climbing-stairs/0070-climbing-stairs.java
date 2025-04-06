class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int v=1;
            int m=2;
        for(int i=3;i<=n;i++){
            int k=v+m;
            v=m;
            m=k;
        }
        return m;
    }
}