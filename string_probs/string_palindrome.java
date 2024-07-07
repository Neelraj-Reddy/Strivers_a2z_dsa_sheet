public class string_palindrome {
    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s){
        String s_duplicate = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int n = s_duplicate.length();
        if (n==0) return true;
        for (int i = 0; i<=n/2; i++){
            if(s_duplicate.charAt(i) != s_duplicate.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}