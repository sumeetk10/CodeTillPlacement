package Recursion;
// sum of N natural number
public class SumOfN {
    public static void main(String[] args) {
        sum(1,0);
    }

    static void sum(int i, int sum){
        if(i>10){
            System.out.println(sum);
            return;
        }
        sum(i+1, sum+i);
    }
}

// functional way

class solution {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static int sum(int n){
        if(n == 0) return 0;
        return n+sum(n-1);
    }
}
