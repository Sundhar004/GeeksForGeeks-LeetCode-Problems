class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int oneCount = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            oneCount = 0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j) == '1') oneCount++;
                if(oneCount == k)
                {
                    String sub = s.substring(i,j+1);
                    map.put(sub,sub.length());
                }
            }
        }
        int min = Integer.MAX_VALUE;
        String ans = "";
        for(String key: map.keySet())
        {
            int size = map.get(key);
            if(size<min) 
            {
                ans = key;
                min = key.length();
            }
            else if(size == min && key.compareTo(ans)<0)
            {
                ans = key;
            }
        }
        return ans;
    }
}