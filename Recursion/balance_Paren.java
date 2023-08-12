package Recursion;

public class balance_Paren {
    public static void main(String[] args) {
        int n = 3, ob = 0, cb = 0;
        StringBuilder ans = new StringBuilder();
        FindBalanceParentheses(n, ob, cb, ans);
    }

    public static void FindBalanceParentheses(int n, int ob, int cb, StringBuilder ans) {
        if (n == ob && cb == n) {
            System.out.println(ans.toString());
            return;
        }
        if (ob < n) {
            ans.append("(");
            FindBalanceParentheses(n, ob + 1, cb, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
        if (ob > cb) {
            ans.append(")");
            FindBalanceParentheses(n, ob, cb + 1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
    }
}
