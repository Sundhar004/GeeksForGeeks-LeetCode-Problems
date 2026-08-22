class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int og = n;
        while(n != 0)
        {
            sum += n%10;
            n = n/10;
        }
        n = og;
        while(n != 0)
        {
            prod *= (n%10);
            n = n/10;
        }
        return og%(sum+prod) == 0;
    }
}