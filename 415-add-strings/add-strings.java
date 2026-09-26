class Solution {
    public String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(p1 >= 0 || p2 >= 0 || carry > 0) {
            int digit1 = p1 >= 0 ? num1.charAt(p1--) - '0' : 0;
            int digit2 = p2 >= 0 ? num2.charAt(p2--) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }
}