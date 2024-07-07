public class practiceQuestion1 {
    public static boolean twince(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 21, 7, 30 };

        System.out.println(twince(arr));
       
    }
}
