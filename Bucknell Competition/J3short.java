import java.util.*;

public class J3short{
    public static void main(String[] args){
        Scanner sc = new Scanner(system..in);
        HashMap<Integer,Character> map = new HashMap<>();
        // 
        map.put(1,'l');
        map.put(2,'z');
        map.put(3,'e');
        map.put(4,'a');
        map.put(5,'s');
        map.put(6,'b');
        map.put(9,'g');
        map.put(0,'o');

        
        char[] v = {'a','e','u','i','o'};
        char[] c = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','w','x','y','z'};
        char[] leetLetter = {'l','z','e','a','s','b','g','o'};
        char[] leetNumber = {'1','2','3','4','5','6','9','0'};

        String s = sc.next();

        char[] arr = s.toCharArray();

        int countVowel = 0;
        int countConsecutiveV = 0;
        int countConsecutiveC = 0;
        int countDoubleCons = 0;
        int countleet = 0;

        while(!s.equals("end")){
            // s has to have length greater and equal to 5

            if(s.length() > 5){
                // s must contains at least one vowel
                for(int i =0; i<s.length();i++){
                    if(s.charAt(i) == v[i])
                        countVowel++;
                }
                if(countVowel !=0){
                    // s can't contains more than three consecutive vowels and consonants
                    
                    // countConsecutiveV will increase by one if there is
                    // three consecutive vows in the string
                    for(int i = 0; i < s.length()-2; i++) {
                        for (int j = 0; j < v.length; j++) {
                            if (s.charAt(i) == v[j]) {
                                for (int k = 0; k < v.length; k++) {
                                    if (s.charAt(i + 1) == v[k]) {
                                        for (int l = 0; l < v.length; l++) {
                                            if (s.charAt(i + 2) == v[l]) {
                                                countConsecutiveV++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    // countConsecutiveC will increase by one if there is
                    // three consecutive cons in the string
                    for(int i = 0; i < s.length()-2; i++) {
                        for (int j = 0; j < c.length; j++) {
                            if (s.charAt(i) == c[j]) {
                                for (int k = 0; k < c.length; k++) {
                                    if (s.charAt(i + 1) == c[k]) {
                                        for (int l = 0; l < c.length; l++) {
                                            if (s.charAt(i + 2) == c[l]) {
                                                countConsecutiveC++;
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                    // s can't contains more than two of the same vowels, execpt 'ee' and 'oo'
                    if(countConsecutiveC == 0 || countConsecutiveV == 0){
                        for(int i = 0; i < s.length()-2; i++){
                            if(s.charAt(i) == s.charAt(i+1)){
                                if(s.charAt(i) != 'e' && s.charAt(i) != 'o' && s.charAt(i) != '0' && s.charAt(i)!= '3') {
                                    countDoubleCons++;
                                }
                            }
                        }
                        if(countDoubleCons==0){
                            // s must contains one letter than can be translated to the leet number
                            for(int i = 0; i < s.length(); i++){
                                for(int j = 0; j < leetLetter.length; j++){
                                    if(s.charAt(i) == leetLetter[j] || s.charAt(i) == leetNumber[j]){
                                        countleet++;
                                    }
                                }
                            }
                            if(countleet !=0){
                                //using hashmap to translate the string
                                arr = s.toCharArray();
                                for(int i = 0; i < s.length(); i++){
                                    for(int j = 0; j < leetLetter.length; j++){
                                        if(s.charAt(i) == leetLetter[j]){
                                            arr[i] = leetNumber[j];
                                        }
                                    }
                            }

                        }
                    }
                }
            }

            

            else if(countVowel == 0){
                System.out.pritnln("<"+s+"> is not acceptable");
            }
            


        }
    }
}