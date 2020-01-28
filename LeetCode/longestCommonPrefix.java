public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String s = "";

        for (int i = 0; i < strs.length; i++) {
            // getting the first string .
            char c = strs[0].charAt(i);
            // System.out.println("c: " + c);
            for (int j = 1; j < strs.length; j++) {
                String temp = strs[j];
                // System.out.println("temp: " + temp);
                if (temp.contains(c + "")) {
                    s = s + c;
                }
            }
        }
        String res = "";
        
        for(int i = 0; i < s.length(); i++){
            if(res.length() == 0){
                res = s + s.charAt(0);
            } else{
                if(s.charAt(i) != s.charAt(i-1)){
                    res
                }
            }
        }
        System.out.println("result: " + s);
    }
}