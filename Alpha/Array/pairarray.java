public class pairarray {
    public static void printpair(int number[])
    {
        int sum = 0;
        for(int i=0;i<number.length;i++)
        {
            int curr = number[i];
            for(int j=i+1;j<number.length ; j++)
            {
                System.out.print(" ("+curr+","+number[j]+") ");
                sum = sum + number[j] +number[i];
            //   System.out.println("the sum is :"+sum);
            }
             System.out.println();
        }

    }
    public static void main(String[] args) {
        int number[]= {2,4,6,8,10};
        printpair(number);
    }
}
