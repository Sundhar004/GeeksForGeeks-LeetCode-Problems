class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n<=2) return n;
        int maxpoints = 0;
        for(int i=0;i<n;i++)
        {
            int currentMax = 0;
            Map<String, Integer> slope = new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                int gcd = findGcd(dx,dy);

                dx = dx/gcd;
                dy = dy/gcd;
                
                if(dx < 0 || (dx == 0 && dy<0))
                {
                    dx = -dx;
                    dy = -dy;
                } 
                String key = dx+"_"+dy;
                slope.put(key,slope.getOrDefault(key,0)+1);
                currentMax = Math.max(currentMax,slope.get(key));
            }
            maxpoints = Math.max(maxpoints,currentMax+1);
        }
        return maxpoints;
    }
    public int findGcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return findGcd(b, a%b);
    }
}