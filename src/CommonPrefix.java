public class CommonPrefix {

    public static String longestCommonPrefix(String[] words) {
        String prefix= "";
        //loop through the first word
        for(int i=0; i< words[0].length(); i++){
            char character= words[0].charAt(i);
            //inner loop to go through the other words
            for (int j=1; j<words.length; j++){
                if (words[j].charAt(i) != character){
                    return prefix;
                }
            }
            prefix += character;
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
