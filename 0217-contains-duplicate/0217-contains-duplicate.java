class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num: nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }
}