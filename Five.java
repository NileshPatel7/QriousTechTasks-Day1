public class Five {
    public static int stringMatch(String haystack,String needle){

        if(needle.length()==0 || haystack.length() == 0){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=i;
                int c=0;
                for(j=i;c<needle.length();j++,c++){
                    if(!(haystack.charAt(j)==needle.charAt(c))) {
                        break;
                    }
                }
                if(c==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String []args){
        System.out.println(stringMatch("iyphr","h"));
    }
}
