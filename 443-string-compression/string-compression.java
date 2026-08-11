class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int write = 0;

        while (i < chars.length) {

            int j = i;

            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }

            chars[write++] = chars[i];

            int count = j - i;

            if (count > 1) {
                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[write++] = c;
                }
            }

            i = j;
        }

        return write;
    }
}