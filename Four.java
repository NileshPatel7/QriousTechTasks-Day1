public class Four {
    public static boolean checkFlowerPlace(int []arr,int n){
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1 ){
                continue;
            }else if(arr[i]==0 && !(i-1<0) && !(i+1>=(arr.length))) {
                if (arr[i-1] == 0 && arr[i + 1] == 0)
                {
                    arr[i]=1;
                    count++;
                }
            }

            if(arr[i]==0 && i==0){
                if(arr[i+1]==0){
                    arr[i]=1;
                    count++;
                }
            }else if(arr[i]==0 && i+1==arr.length){
                if(arr[i-1] == 0){
                    count++;
                    arr[i]=1;
                }
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }

    public  static void main(String[] args){
        System.out.println(checkFlowerPlace(new int[]{1,0,0,0,0,1,0,0,0,0},3));
    }
}
