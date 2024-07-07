import java.util.*;

public class Occurence {
    public static void firstOccurence0(int arr[],int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("The index value is : " + i);
            }
        }
    }
    public static int firstOccurence1(int arr[],int key,int i)
    {
        if (i==arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence1(arr, key, i +1);
    }
    public static int lastoccerence(int arr[],int key,int i)
    {
        if (i==arr.length) {
            return-1;
        }
        int isfound = lastoccerence(arr, key, i+1);
        if (isfound== -1 && arr[i]==key) {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 8, 3,5, 6, 9, 5, 4, 15 };
        // firstOccurence0(arr,7);
        System.out.println("first occurence is "+firstOccurence1(arr, 5, 0));
        System.out.println("last occurence is "+lastoccerence(arr, 5, 0));

    }
}
