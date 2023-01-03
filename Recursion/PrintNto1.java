package Recursion;
// print numbers from N to 1 using backtracking
public class PrintNto1 {
    public static void main(String[] args) {
        number(1,5);
    }

    static void number(int i, int N){
        if(i>N){
            return;
        }
        number(i+1,N);
        System.out.println(i);
    }
}
