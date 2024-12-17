class minBitFlips {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        return Integer.bitCount(ans);
    }
}