public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int count=0,low=0,high=arr.length-1,mid;
        int ans=-1;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                ans=mid;
                break;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(ans==-1)
        return 0;
        for(int i=ans;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
            else{
                break;
            }
        }
        for(int i=ans-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
