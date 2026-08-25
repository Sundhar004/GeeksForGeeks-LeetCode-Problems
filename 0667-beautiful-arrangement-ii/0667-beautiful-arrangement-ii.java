class Solution {
    public int[] constructArray(int n, int k) {
        int ans[] = new int[n];
        int in = 1;
        for(int i=0;i<n-k;i++)
        {
            ans[i] = in++;
        }
        boolean alt = true;
        int low = n-k+1;
        int high = n;
        for(int i=n-k;i<n;i++)
        {
            if(alt)
            {
                ans[i] = high;
                high--;
                alt = !alt;
            }
            else
            {
                ans[i] = low;
                low++;
                alt = !alt;
            }
        }
        return ans;
    }
}