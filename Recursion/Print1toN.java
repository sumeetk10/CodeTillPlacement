package Recursion;
// print number from 1 to 10
public class Print1toN {
    public static void main(String[] args) {
        number(1,10);
    }

    static void number(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        number(i+1,n);                      // you can do the reverse by putting number(i,n-1)
    }
}
