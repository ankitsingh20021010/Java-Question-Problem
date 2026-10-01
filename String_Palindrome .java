//palindrome 121 -->121 both side are sane like 121 ->121
class String_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
