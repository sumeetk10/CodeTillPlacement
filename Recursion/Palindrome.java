package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(stringreverse(0,str));
    }

    static boolean stringreverse(int i, String str){
        int n = str.length();
        if(i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1)) return false;

        return stringreverse(i+1, str);
    }
}
