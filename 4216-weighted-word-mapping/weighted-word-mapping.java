class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int weight = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char curr = words[i].charAt(j);
                weight += weights[curr - 'a'];
            }

            int rem = weight % 26;
            char ch = (char) ('z' - rem);

            sb.append(ch);
        }

        return sb.toString();
    }
}