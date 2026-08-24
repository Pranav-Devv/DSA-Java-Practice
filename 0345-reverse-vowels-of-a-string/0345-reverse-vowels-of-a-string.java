class Solution {
    public String reverseVowels(String s) {

        int i = 0;
        int r = s.length() - 1;

        String vowel = "AEIOUaeiou";

        char[] arr = s.toCharArray();

        while (i < r) {

            while (i < r && vowel.indexOf(arr[i]) == -1) {
                i++;
            }

            while (i < r && vowel.indexOf(arr[r]) == -1) {
                r--;
            }

            char temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;

            i++;
            r--;
        }

        return new String(arr);
    }
}