public class second {

    public static void rotateArray(int []arr,int k){
        
        while(k!=0 && k>0){
            int backup=arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=backup;
            k--;
        }

        System.out.print("{ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("}");
    }
    public static void main(String []args){
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        rotateArray(arr,k);
    }
}
