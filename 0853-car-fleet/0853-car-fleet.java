class Solution {
    static private class Pair<L, R> {
        L left;
        R right;
        
        private Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
        
        @Override
        public String toString() {
            return "Pair{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        List<Pair<Integer, Integer>> pairs = new LinkedList<>();
        
        for (int i = 0; i < length; i++) {
            pairs.add(new Pair<>(position[i], speed[i]));
        }
        
        pairs.sort((p1, p2) -> p2.left - p1.left);
        
        Stack<Double> stack = new Stack<>();
        for (Pair<Integer, Integer> pair: pairs) {
            int p = pair.left;
            Double s = (double)pair.right;
            stack.push((target - p) / s);
            
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        
        return stack.size();
    }
}