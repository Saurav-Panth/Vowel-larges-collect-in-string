public class vowels {

        public static boolean Vowels(char words){
            char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
            for(char vowel : vowels){
                if(vowel==words) return true;
            }
            return false;
        }

        public static int countVowels(String sub){
            int count=0;
            for(int i = 0; i < sub.length(); i++) {
                if(Vowels(sub.charAt(i))) {
                    count++;
                }
            }
            System.out.println("THIS IS SUB LINE "+sub+" --> "+ count);
            return count;
        }

        public static String findSubstring(String s, int k) {
            // Write your code here
            String sub2 = null;
            int i =0;
            int count=0;
            while(s.length()>=i+k){
                String subS = s.substring(i,i+k);
                int ma = countVowels(subS);
                if(ma>count){
                    count=ma;
                    sub2=subS;
                }
                i++;
            }

            return sub2;


        }
}
