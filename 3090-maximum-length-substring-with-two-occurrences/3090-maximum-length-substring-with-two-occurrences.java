class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<=s.length()-1)
        {
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2)
            {
                char ch = s.charAt(i);
                map.put(ch,map.get(ch)-1);
                i++;
            }
            ans = Math.max(ans,(j-i)+1);
            j++;
        }
        return ans;
    }
}