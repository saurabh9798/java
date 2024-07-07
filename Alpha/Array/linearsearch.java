public class linearsearch {
    public static int linearsearch0(int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[] = {2,4,6,8,10,1,3,5,7,9};
        int key = 11;
        int index = linearsearch0(num,key);
        if (index == -1) {
            System.out.print("not found");
        }
        else{
            System.out.print("Key is at index : "+index);
        }
    }
}
