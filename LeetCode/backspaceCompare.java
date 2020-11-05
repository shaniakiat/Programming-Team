class backspaceCompare{
    public static void main(String[] args){
        System.out.println(backspaceCompareFunction("ab#c", "ad#c"));
        System.out.println(backspaceCompareFunction("ab##", "c#d#"));
        System.out.println(backspaceCompareFunction("a##c", "#a#c"));
        System.out.println(backspaceCompareFunction("a#c", "b"));
        System.out.println(backspaceCompareFunction("y#fo##f", "y#f#o##f"));
    }

    public static boolean backspaceCompareFunction(String S, String T){

        int i = 0;
        while(i < S.length()){
            if(S.charAt(i) =='#' && i == 0){
                S = S.substring(i+1);
            }
            else if(S.charAt(i) =='#' && i > 0 ){
                if(i < S.length()-1){
                    S = S.substring(0, i-1) + S.substring(i+1);
                }
                else{
                    S = S.substring(0, i-1);
                }
                i--;
            } else{
                i++;
            }
        }
        System.out.println(S);

        i = 0;
        while(i < T.length()){
            if(T.charAt(i) =='#' && i == 0){
                T = T.substring(i+1);
            }
            else if(T.charAt(i) =='#' && i > 0 ){
                if(i < T.length()-1){
                    T = T.substring(0, i-1) + T.substring(i+1);
                }
                else{
                    T = T.substring(0, i-1);
                }
                i--;
            } else{
                i++;
            }
        }
        System.out.println(T);
        if(S.equals(T)){
            return true;
        } else{
            return false;
        }
    }
}