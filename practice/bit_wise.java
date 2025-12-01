public class bit_wise {

    public static void main(String[] args){
         int a=5;
        System.out.println(Integer.toBinaryString(a));

        int c=5 & 4;
        int d=5 | 4;
        //xor
        int e= 5^4;

        int f=~5;
        System.out.println("f:"+f);
        System.out.println(e);
        System.out.println(c);
        //left shift the bit
        int n=5;
        int m=n<<1;
        int left=n>>1;
        System.out.println(m);
        System.out.println(left);
    }
}
