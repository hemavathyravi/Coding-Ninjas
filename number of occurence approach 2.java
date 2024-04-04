public class Solution {
    
    public  int count(int arr[], int n, int x) {
        int l=lastocc(arr,n,x);
        int f=firstocc(arr,n,x);
        if(f==-1)
        {
            return 0;
        }
        return (l-f+1);

        
    }
    public int firstocc(int arr[],int n,int x)
    {
        int first=-1;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public int lastocc(int arr[],int n,int x)
    {
        int last=-1;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
