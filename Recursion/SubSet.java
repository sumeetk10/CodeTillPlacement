package Recursion;

public class SubSet {
    public static void main(String[] args) {
        subset(" ","abc");
    }

    static void subset(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);
        subset(p+ch, str.substring(1));
        subset(p, str.substring(1));

    }
}
