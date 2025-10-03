// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class First {
    public static boolean check(int []arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public static int[] f1(int []arr){
        // -1 is like underscore in this code
        int newArr[]=new int[arr.length];
        int itr=0;

        for(int i=0;i<arr.length;i++){
            if(!check(newArr,arr[i])){
                newArr[itr]=arr[i];
                itr++;
            }
        }

        for(int i=newArr.length-(arr.length-newArr.length);i<newArr.length;i++){
            newArr[i]=0;
        }
        return newArr;
    }

    public static void printArray(int []arr){
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                System.out.print(arr[i]+", ");
            else
                System.out.print("_, ");
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
       int arr[]={1,1,2,2,2,3}; // 1 1 2 3 4 4 5 6 7 7
        printArray(f1(arr));

    }
}