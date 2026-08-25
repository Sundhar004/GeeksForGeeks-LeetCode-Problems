class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int l = 0;
        int ind = 0;
        int r = arr.length-1;
        for(int i=r; i>0;i--) //Right to left
        {
            if(arr[i] < arr[i-1])
            {
                ind = i-1;
                break;
            }
        }
        int max = 0;
        int second = 0;
        for(int j=ind;j<arr.length;j++) //Left to right
        {
            if(arr[j]<arr[ind] && arr[j]>max)
            {
                max = arr[j];
                second = j;
            }
        }
        int temp = arr[ind];
        arr[ind] = arr[second];
        arr[second] = temp;
        return arr;
    }
}