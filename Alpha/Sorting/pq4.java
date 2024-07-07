public class pq4 {
        public static void countingSort0(int arr[]) {
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                largest = Math.max(largest, arr[i]);
            }
            int count[] = new int[largest + 1];
            for (int i = 0; i < count.length; i++) {
                count[arr[i]]++;
            }
            int j = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }

    static void printArr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3};
        countingSort0(arr);
        printArr(arr);
    }
    
}