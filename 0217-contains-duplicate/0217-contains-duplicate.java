class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> countOfNums = new HashMap<>();

        for (int num : nums) {
            if (!countOfNums.containsKey(num)) {
                countOfNums.put(num, 1);
            } else {
                int count = countOfNums.get(num);
                countOfNums.put(num, count + 1);
            }
        }

        return countOfNums.values().stream().anyMatch(x -> x > 1);
    }
}