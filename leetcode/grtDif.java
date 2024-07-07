import java.util.*;
public class grtDif {
  public static int greatest(int arr[])
  {
     int temp  =Integer.MIN_VALUE;
     for (int i = 0; i <arr.length; i++) {
      if (arr[i]>temp) 
      {
        temp = arr[i];
      }
     }
    //  System.out.println("the greatest no of this array is :"+temp);
    return temp;
  }
  public static int Secgreatest(int arr[])
  {
     int temp1  =Integer.MIN_VALUE;
     int temp2  =Integer.MIN_VALUE;
     for (int i = 0; i <arr.length; i++) {
      if (arr[i]>temp1) 
      {
        temp1 = arr[i];
      }
     }
     for (int i = 0; i <arr.length; i++) {
      if ( arr[i] > temp2 && temp1 != arr[i]) 
      {
        temp2 = arr[i];
      }
     }
    //  System.out.println("the second greatest no of this array is :"+temp2);
    return temp2;
  }
  public static int smallest(int arr[])
  {
     int temp  =Integer.MAX_VALUE;
     for (int i = 0; i < arr.length; i++) {
      if (temp>arr[i]) 
      {
        temp = arr[i];
      }
     }
    //  System.out.println("the smallest no of this array is :"+temp);
    return temp;
  }
  public static int SecSmallest(int arr[])
  {
     int temp1  =Integer.MAX_VALUE;
     int temp2  =Integer.MAX_VALUE;
     for (int i = 0; i < arr.length; i++) {
      if (temp1>arr[i]) 
      {
        temp1 = arr[i];
      }
     }
     for (int i = 0; i < arr.length; i++) {
      if (temp2>arr[i] && arr[i] !=temp1) 
      {
        temp2 = arr[i];
      }
     }
    //  System.out.println("the second smallest no of this array is :"+temp2);
    return temp2;
  }
  public static void greetstDif(int arr[] )
  {
    Arrays.sort(arr);
    int finaal =0;
    for (int i = 0; i < arr.length; i++) {
      finaal =  (arr[arr.length-1]*arr[arr.length-2]) - (arr[0]*arr[1]);
    }
    System.out.println(finaal);
  }
  public static void main(String[] args) {
     int arr[] = {5,12,6,7,8,11};
    //  int gre = greatest(arr);
    //  int smal = smallest(arr);
    //  int secsmal = SecSmallest(arr);
    //  int secbig = Secgreatest(arr);
    //  int fianal = gre*secbig -smal*secsmal;
    //  System.out.println("the final ans is :"+fianal);
    greetstDif(arr);
   }
}
