public class evenOdd {
  public static void checkeven(int n) {
    int bitmask = 1;
    if ((bitmask & n) == 0) {
      System.out.print("Even number ");
    } else {
      System.out.print("odd number ");
    }
  }
  public static int getIthBit(int n,int i)
    {
        int bitmask= 1 << i;
        if ((n & bitmask)==0) {
          return 0;
        }
        else{
          return 1;
        }
    }
    public static int setIthBit(int n,int i)
    {
      int bitmask = 1<< i;
      return n | bitmask;
    }
    public static int clearIthBit(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i,int newBit)
    {
      if (newBit == 0) {
        return clearIthBit(n, i);
      } 
      else
      {
        return setIthBit(n, i);
      }

      // n = clearIthBit(n, i);
      // int bitmask = newBit<<i;
      // return n| bitmask;
    }
    public static int clearLastbits(int n,int i)
    {
      int bitmask = (~0)<<i;
      return n & bitmask;
    }
    public static int clearBitOfRange(int n,int i,int j)
    {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean ispowerOfTwo(int n)
    {
        return (n&(n-1))==0;
    }
    public static int countSetBits(int n)
    {
      int count = 0;
      while (n>0) {
        if ((n & 1) != 0) {
          count++;
        }
        n = n>>1;
      }
      return count;
    }
    public static int fastExpo(int a,int n)
    {
      int ans = 1;
      while (n>0) {
        if ((n & 1) != 0) {
          ans = ans*a;
        }
        a = a*a;
        n = n>>1;
      }
      return ans;
    }
  public static void main(String args[]) {
    // checkeven(7);
    // System.out.println(getIthBit(8, 3));
    // System.out.println(setIthBit(10, 2));
    // System.out.println(clearIthBit(10, 1));
    // System.out.println(updateIthBit(10, 2, 1));
    // System.out.println(clearLastbits(10, 2));
    // System.out.println(clearBitOfRange(10, 2, 4));
    // System.out.println(ispowerOfTwo(25));
    // System.out.println(countSetBits(11));
    System.out.println(fastExpo(2, 6));
  }
}