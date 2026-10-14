class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> keerthi = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                keerthi.add(i);
            }
        }
        return keerthi;
    }
}