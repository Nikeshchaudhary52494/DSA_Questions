class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // short the both arrays and check one by one can the cookie be assign to the child
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while(child<g.length&& cookie<s.length){
            if(g[child]<=s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}