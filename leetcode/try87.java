public class try87 {
    public static void main(String[] args) {
        String str = "Saurabh";
        String temp = "";
        for (int i=str.length()-1;i>=0;i--) 
        {
            temp = temp + str.charAt(i);
        }
         System.out.print(temp);
    }
}
