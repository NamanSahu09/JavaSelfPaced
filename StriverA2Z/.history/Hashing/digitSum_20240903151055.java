package Hashing;

import java.util.HashMap;

public class digitSum {
  public static void main(String args[])
  {
    HashMap<Char,Integer> map = new HashMap<>();
    int a = 65;
    for(int i=1;i<26;i++)
    {
      map.put((char)a, i);
      a++;
    }
  }
  
}