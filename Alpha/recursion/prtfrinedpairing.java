// given n friends , each one can remain single or can be paired up with some other friends
// each friends can be paired can be paired only once . find out the total number of ways in 
// which friends can remain single or can be paired up .
public class prtfrinedpairing {
    public static int friendpairing(int n)
    {
        if (n==1 || n==2) {
            return n;
        }
        // choice 
        // single 
        // int fnm1 = friendpairing(n-1);

        // // pair
        // int fnm2 = friendpairing(n-2);
        // int pairWays = (n-1)*fnm2;

        // // totWays
        // int totWays = fnm1 + pairWays;
        // return totWays;
        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendpairing(3));
    }
}
