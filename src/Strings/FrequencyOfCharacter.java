package Strings;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s = "abcaackbcb";
        int []freq = new int[26]; //0-a,1-b
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            freq[idx]++;
        }
        int max = -1;
        for (int i=0;i<freq.length;i++) {
            max = Math.max(max, freq[i]);
        }
        for (int i=0;i<freq.length;i++) {
            if(freq[i] == max) {
                char ch = (char)(i+97);
                System.out.print(ch+ " occurs "+max+ " times ");
                System.out.println();
            }
        }
    }
}
