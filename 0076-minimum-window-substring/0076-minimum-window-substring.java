class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) return "";
        
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        
        for (char c: t.toCharArray()) {
            int count = countT.getOrDefault(c, 0);
            countT.put(c, count + 1);
        }
        
        int res[] = new int[]{-1, -1};
        int resLen = Integer.MAX_VALUE;
        int have = 0;
        int need = countT.size();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            int countOfRight = window.getOrDefault(r, 0);
            window.put(r, countOfRight + 1);
            
            if (countT.containsKey(r) && Objects.equals(window.get(r), countT.get(r))) {
                have++;
            }
            
            while (have == need) {
                if (right - left + 1 < resLen) {
                    res[0] = left;
                    res[1] = right;
                    resLen = right - left + 1;
                }
                
                char l = s.charAt(left);
                int countOfLeft = window.get(l);
                window.put(l, countOfLeft - 1);
                
                if (countT.containsKey(l) && window.get(l) < countT.get(l)) {
                    have--;
                }
                left++;
            }
        }
        
        if (Objects.equals(resLen, Integer.MAX_VALUE)) return "";
        
        return s.substring(res[0], res[1] + 1);
    }
}