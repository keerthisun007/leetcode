class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int k : nums) {
            if (set.contains(k)) {
                list.add(k);
            } else {
                set.add(k);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

/*
1. The HashSet checks whether each number already exists; if yes, list.add(k) stores the duplicate, otherwise set.add(k) remembers the number.
2. Finally, convert the list into an integer array and return it as the answer.

*/