class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        // Loop through every stone you have
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            
            // Check if this stone character exists in the jewels string
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }
        
        return count;
    }
}