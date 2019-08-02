import java.util.HashMap;
import java.util.Map;

public class LC804{
    public static void main(String[] args){
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        //match the letter on the alphabet to the morse code
        HashMap<Character, String> alphaToMorse = new HashMap<Character, String>();
        char ch = 'a';
        for(int i = 0; i < 26; i++){
            alphaToMorse.put(ch, morseCode[i]);
            ch++;
        }

        //
        String[] morse = new String[words.length];
        HashMap<String, String> newWords = new HashMap<String, String>();
        int count = 0;
        String morseWord = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            morseWord = "";
            for(int j = 0; j < word.length(); j++){
                morseWord += alphaToMorse.get(word.charAt(j));
            }

            morse[i] = morseWord;

            

            newWords.put(morseWord, words[i]);
            // if(i==0)
            //     count++;
            // else {
            //     for(int j = 0; j < i; j++){
            //         if(!morseWord.equals(morse[j])){
            //             count++;
            //         }
            //     }
            }
            count = newWords.size();
            return count;
        }
        
    }
