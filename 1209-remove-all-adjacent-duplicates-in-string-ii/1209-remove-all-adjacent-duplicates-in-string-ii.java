import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (st.isEmpty()) {
                st.push(new int[]{c, 1});
                continue;
            }

            if (st.peek()[0] != c) {
                st.push(new int[]{c, 1});
                continue;
            }

            st.peek()[1]++;

            if (st.peek()[1] == k) {
                st.pop();
            }
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            int[] p = st.pop();

            while (p[1]-- > 0) {
                res.append((char) p[0]);
            }
        }

        return res.reverse().toString();
    }
}