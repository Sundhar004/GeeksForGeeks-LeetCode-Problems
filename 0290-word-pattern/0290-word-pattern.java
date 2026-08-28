class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] st = s.split(" ");
        if(pattern.length() != st.length) return false; 
        Map<Character,String>map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i<pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            if(!map.containsKey(c)) 
            {
                if(set.contains(st[i])) return false;
                set.add(st[i]); 
                map.put(c, st[i]);
            }
            else
            {
               if(!map.get(c).equals(st[i])) return false;
            }
        }
        return true;
    }
}