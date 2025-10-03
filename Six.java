public class Six {
    public static String getBinary(int n){
        String bin="";
        while(n!=0){
            bin=(n%2)+bin;
            n=n/2;
        }
        return bin;
    }

    public static String zero(String s,int n){
        String z="";
        for(int i=0;i<n;i++){
            z=z+"0";
        }
        return z+s;
    }

    public static int bitDifference(int x,int y){
        String xb=getBinary(x);
        String yb=getBinary(y);
//        System.out.println(yb+" "+xb);
        int c=0;
        if(xb.length()>yb.length())
            yb=zero(yb,xb.length()-yb.length());
        else
            xb=zero(xb,yb.length()-xb.length());
//        System.out.println(yb+" "+xb);
        for(int i=0;i<xb.length();i++){
            if((xb.charAt(i)=='0' && yb.charAt(i)=='1')||(xb.charAt(i)=='1' && yb.charAt(i)=='0'))
                c++;
        }
        return c;
    }

    public static void main(String []args){
        System.out.print(bitDifference(10,5));
    }
}
