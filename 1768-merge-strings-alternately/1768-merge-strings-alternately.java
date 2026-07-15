class Solution {
    public String mergeAlternately(String word1, String word2) {
       String str="";
       int n = word1.length();
       int m = word2.length();

       while(n>0 && m>0){
        str += word1.charAt(word1.length()-n);
        --n;
        str += word2.charAt(word2.length()-m);
        --m;
       }

       while(n>0){
        str += word1.charAt(word1.length()-n);
        --n;
       }

       while(m>0){
        str += word2.charAt(word2.length()-m);
        --m;
       }

       return str;
    }
}