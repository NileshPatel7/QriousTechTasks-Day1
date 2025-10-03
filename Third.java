public class Third {
    public static boolean checkVowel(char c){
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            return true;
        }else {
            return false;
        }
    }
    public static StringBuffer rotateVowel(StringBuffer s){
        int l=0,r=s.length()-1;

        while(l<=r ){

            for(;l<s.length();l++){
                if(checkVowel(s.charAt(l)))
                    break;
            }
            for(;r>0;r--){
                if(checkVowel(s.charAt(r)))
                    break;
            }
            char left=s.charAt(l);
            char right=s.charAt(r);
            s.setCharAt(l,right);
            s.setCharAt(r,left);

            l++;
            r--;
        }
        return s;
    }

    public static void main(String []args){
       System.out.println(rotateVowel(new StringBuffer("IDEA")));
    }
}
