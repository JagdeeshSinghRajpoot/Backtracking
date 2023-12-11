public class findSubSet {
    public static void findSSet(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes
        findSSet(str, ans + str.charAt(i), i + 1);

        // No
        findSSet(str, ans, i + 1);
    }

    public static void main(String[] args) {
        findSSet("abc", "", 0);
        // hello
    }

}
