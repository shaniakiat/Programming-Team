import java.util.Scanner;

public class J3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] v = {'a','e','u','i','o'};
        char[] c = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','w','x','y','z'};
        char[] leetLetter = {'l','z','e','a','s','b','g','o'};
        char[] leetNumber = {'1','2','3','4','5','6','9','0'};

        String s = sc.next();

        int countVowel = 0;
        int countConsecutiveV = 0;
        int countConsecutiveC = 0;
        int countDoubleCons = 0;
        int countleet = 0;

        while(!s.equals("end")){
            // count the length of the string
            if(s.length() < 5){
                System.out.println("<"+s+"> is not acceptable");
            }
            else{
                // translate from leet letter to regular letter 
                char[] arr = s.toCharArray();
                for(int i = 0; i < s.length(); i++){
                    for(int j = 0; j < leetNumber.length; j++){
                        if(s.charAt(i) == leetNumber[j]){
                            arr[i] = leetLetter[j];
                        }
                    }
                }
                // convert array of char into the string
                s = new String(arr);

                // count vowell
                for(int i = 0; i < s.length(); i++){
                    for(int j=0; j < v.length; j++){
                        if(s.charAt(i) == v[j]){
                            countVowel++;
                        }
                    }
                }
                // need to have at least one vowel
                if(countVowel == 0){
                    System.out.println("<"+s+"> is not acceptable");
                }
                // if not zero, do this step
                else{
                    // countConsecutiveV will increase by one if there is
                    // three consecutive vows in the string
                    for(int i = 0; i < s.length()-2; i++) 
                        for (int j = 0; j < v.length; j++) 
                            if (s.charAt(i) == v[j]) 
                                for (int k = 0; k < v.length; k++) 
                                    if (s.charAt(i + 1) == v[k]) {
                                        for (int l = 0; l < v.length; l++) {
                                            if (s.charAt(i + 2) == v[l]) {
                                                countConsecutiveV++;
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

                    // can't have either three consecutive cons nor vows in the string
                    if(countConsecutiveC != 0 || countConsecutiveV != 0){
                        System.out.println("<"+s+"> is not acceptable");
                    }
                    // if there is none, do this step
                    else{
                        // checking if there are two consecutive occurrences of the same letter
                        for(int i = 0; i < s.length()-2; i++){
                            if(s.charAt(i) == s.charAt(i+1)){
                                if(s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                                    countDoubleCons++;
                                }
                            }
                        }
                        if(countDoubleCons != 0){
                            System.out.println("<"+s+"> is not acceptable");
                        }
                        // if none, do this step
                        else{

                            for(int i = 0; i < s.length(); i++){
                                for(int j = 0; j < leetLetter.length; j++){
                                    if(s.charAt(i) == leetLetter[j] || s.charAt(i) == leetNumber[j]){
                                        countleet++;
                                    }
                                }
                            }
                            if(countleet == 0){
                                System.out.println("<" + s + "> is not acceptable");
                            }
                            else{

                                // translate back to the leet number if possible
                                arr = s.toCharArray();
                                for(int i = 0; i < s.length(); i++){
                                    for(int j = 0; j < leetLetter.length; j++){
                                        if(s.charAt(i) == leetLetter[j]){
//                                            System.out.println(s.charAt(i) +" == "+ leetNumber[j]);
                                            arr[i] = leetNumber[j];
                                        }

                                    }
                                }
                                s = new String(arr);
                                System.out.println("<" + s + "> is acceptable");
                            }
                        }
                    }
                }
            }
            countVowel = 0;
            countConsecutiveV = 0;
            countConsecutiveC = 0;
            countDoubleCons = 0;
            countleet = 0;
            s = sc.next();
        }
    }
}