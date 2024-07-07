// import java.util.Scanner;
public class practiceQuestion
{
    // find total occurence
    public static void Totaloccurence(int arr[],int key,int i)
    {
       if (i == arr.length) {
            return ;
       }
      
       if (arr[i] == key ) {
        System.out.println(i+" ");
       }
       Totaloccurence(arr, key, i+1);
    }
    // convert number to string 
     static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int number)
    {
        if (number == 0) {
            return;
        }
        int lastdigit = number %10;
        printDigit(number/10);
        System.out.print(digit[lastdigit]+" ");
    }
    // write a program to find length of a string using recursion
    public static int length(String str)
    {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // Totaloccurence(arr, 2, 0);
        // printDigit(1234);
        String str = "saurabh kumar";
        System.out.println(length(str));
    }
}