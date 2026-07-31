class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int index = 0;
        while (i < chars.length) {
            int count = 0;
            char curr = chars[i];

            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }

            chars[index++] = curr;
            if (count > 1) {
                String str = Integer.toString(count);
                for (char ch : str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}