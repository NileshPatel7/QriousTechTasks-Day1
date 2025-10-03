public class Seven {
    public static String longestCommonPrefix(String []arr){
        String lcp="";
        for(int i=0;i<arr[0].length();i++){
            int j=0;
            for(j=0;j<arr.length;j++){
                if(!(arr[j].charAt(i)==arr[0].charAt(i))){
                    break;
                }
            }
            if(j==arr.length)
                lcp=lcp+(String.valueOf(arr[0].charAt(i)));
            else
                break;
        }
        return lcp;
    }

    public static void main(String []args){
        String []s={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
