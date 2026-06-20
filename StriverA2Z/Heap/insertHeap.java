package Heap;
import java.util.*;
public class insertHeap
{
  int size;
  int arr[] = new int[100];

  insertHeap()
  {
    this.size = 0;
    arr[0] = -1;
  }

  void insert(int val)
  {
    size = size + 1;
    int index = size;
    arr[index] = val;
    while(index > 1)
    {
      int parent = index / 2;
      if(arr[parent] < arr[index])
      {
        int temp = arr[parent];
        arr[parent] = arr[index];
        arr[index] = temp;
        index = parent;
      }
      else
      {
        return;
      }
    }

  }

  static void heapify(int arr[], int n, int i)
  {
    int largest = i;
    int left = 2* i;
    int right = 2 * i + 1;

    if(arr[largest] < arr[left] && left < n)
    {
      largest = left;
    }
    if(arr[largest] < arr[right] && right < n)
    {
      largest = right;
    }
    if(largest != i)
    {
      int temp = arr[largest];
      arr[largest] = arr[i];
      arr[i] = temp;
      heapify(arr, n, largest);
    }
  }




  void display()
  {
    for(int i = 1; i <= size; i++)
    {
      System.out.print(arr[i] + " ");
    }

  }


  public static void main(String args[])
  {

    insertHeap obj = new insertHeap();
    obj.insert(10);
    obj.insert(20);
    obj.insert(30);
    obj.insert(25);
    obj.insert(5);
    obj.display();

    int arr[] = {-1, 54, 53, 55, 52, 50};
    int n = 5;
  for(int i = n/2; i>0; i--) 
  {
    heapify(arr, n, i);
  }

  System.out.println("printing the array now ");
  for(int i = 1; i<=n; i++) {
  System.out.print(arr[i] + " ");
  } 
  System.out.println();



  }
}