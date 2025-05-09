public class maxDaysBouquets
{
public boolean possible(int arr[],int day,int m,int k)
    {
        int n = arr.length;
        int cnt =0;
        int bDay = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] <= day)
            {
                cnt++;
            }
            else
            {
                bDay+=cnt/k;
                cnt = 0;
            }

        }
        bDay+=cnt / k;
        return bDay>=m;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        int val = m * k;
        int n = bloomDay.length;
        if(val >= n)
        return -1;
        int mini = Integer.MIN_VALUE;
        int maxi = Integer.MAX_VALUE;
        for(int i=0; i<n;i++)
        {
            mini = Math.min(mini,bloomDay[i]);
            maxi = Math.max(maxi,bloomDay[i]);
        }
        int low = mini;
        int high = maxi;
        while(low <= high)
        {
            int mid = low + (high - low)  / 2;
            if(possible(bloomDay,mid,m,k))
            {
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
        return low;
    }

    public static void main(String args[])
    {
       int bloomDay[] = {7,7,7,7,13,11,12,7};
       int m = 2;
       int k = 3;
       maxDaysBouquets obj = new maxDaysBouquets();
       int ans = obj.minDays(bloomDay,m,k);
       System.out.println("Minimum number of days needed is: " + ans);
    }



  }