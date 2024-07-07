public class findlargest {
    public static void main(String[] args) {
        int nmm[]={5,2,33,11,7,8,9,17};
        int max = nmm[0];
        for(int i=1;i< nmm.length;i++)
        {
            if (nmm[i]>max) {
                max = nmm[i];
            }
        }
        System.out.println("the gratest no array is : "+max);
    }
}
