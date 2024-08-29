import java.util.HashMap;

class mooresVotingAlgo
{
  public static void main(String args[])
  {
    // Better
    int arr[] = {2,2,3,3,1,2,2};
    int n = arr.length;
    // Hashing
    HashMap <Integer, Integer> map = new HashMap<>();
    for(int i =0; i<n;i++)
    {
      if(map.containsKey(arr[i]))
        map.put(arr[i], map.get(arr[i])+1);
      else
        map.put(arr[i], 1);
    }


  }
}