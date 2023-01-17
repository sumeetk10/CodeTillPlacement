package Recursion;

public class TowerOfHanoi {
    class Hanoi {

        public long toh(int N, int from, int to, int aux) {
    
            // Your code here// from is source and to is destination and aux is helper;
            if(N==1){
               System.out.println("move disk " + N +" from rod "+ from + " to rod " + to );
               return 1;
            }
    
            toh(N-1,from,aux,to);               //source to helper using destination
            System.out.println("move disk "+ N +" from rod "+ from + " to rod " + to);
            toh(N-1,aux,to,from);               //helper to destination using source
    
            long ans= (long)(Math.pow(2,N)-1);
            return ans;
    
        }
    
    }
}
