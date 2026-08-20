class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int fact[] = new int[n];
        fact[0] = 1;
        for(int i=1;i<n;i++)
        {
            fact[i] = i*fact[i-1];
            list.add(i);
        }
        list.add(n);
        k = k-1;

        for(int i=n-1;i>=0;i--)
        {
            int ind = k/fact[i];
            sb.append(list.get(ind));
            list.remove(ind);
            k = k%fact[i];
        }
        return sb.toString();
    }
}