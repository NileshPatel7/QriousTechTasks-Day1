import java.util.ArrayList;
public class Eight {
    public static int countSize(int[][] ar){
        int size=0;
        for(int i=0;i<ar.length;i++){
            size+=ar[i].length;
        }
        return size;
    }
    public static int[] array(int[][] ar){
        int newAr[]=new int[countSize(ar)];

        int x=0;

        for(int i=0;i<ar.length;i++){
            for(int z=0;z<ar[i].length;z++){
                newAr[x]=ar[i][z];
                x++;
            }
        }

        return newAr;
    }
    public static void main(String[] args) {
        int ar[][]={{1},{2},{5,4,12},{3},{5},{7,10}};

        First.printArray(array(ar));
    }
}
