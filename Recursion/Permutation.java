package Recursion;

public class Permutation {
    public static void main(String[] args) {
       combination(" ", "abc"); 
       
    }

    static void combination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i=0; i<p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            combination(f+ch+l, up.substring(1));
        }
    }

    
        
    
    
}
