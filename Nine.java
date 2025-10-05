import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DataFormatException;

public class Nine {
    public static double getCircleArea(double r){
        return Math.PI*r*r;
    }
    public static double getSquareArea(double size){
        return size*size;
    }

    public static double getRectangleArea(double l,double b){
        return l*b;
    }

    public static double getTriangleArea(double b,double h){
        return b*h/2;
    }

    //getAreaOfShape is main function
    public static double getAreaOfShapeArea(Map<String,String> mp){
        //all if conditions are check the specific shape and their measurements
        try{
            if(mp.get("shape").equalsIgnoreCase("circle")){
                if(mp.get("radius")!=null)
                    return getCircleArea(Double.parseDouble(mp.get("radius")));
                else
                    System.out.println("please give radious also");

            }else if(mp.get("shape").equalsIgnoreCase("rectangle")){
                if(mp.get("length")!=null) {
                    if(mp.get("width")!=null)
                        return getRectangleArea(Double.parseDouble(mp.get("length")),Double.parseDouble(mp.get("width")));
                    else
                        System.out.println("Please enter width of rectangle");

                }else
                    System.out.println("please give length and width also");

            }else if(mp.get("shape").equalsIgnoreCase("square")){
                if(mp.get("size")!=null)
                    return getSquareArea(Double.parseDouble(mp.get("size")));
                else
                    System.out.println("please give size also");

            }else if(mp.get("shape").equalsIgnoreCase("triangle")){
                if(mp.get("base")!=null){
                    if(mp.get("height")!=null)
                        return getTriangleArea(Double.parseDouble(mp.get("base")),Double.parseDouble(mp.get("height")));
                    else
                        System.out.println("please give height also");
                }else
                    System.out.println("please give base and height");

            }else
                System.out.println("shape is not given");
        }catch (NumberFormatException e){
            System.out.println("Please enter number in measurement values");
        }


        return 0.0;
    }

    public static void main(String[] args) {

        //some instructions
        // 1. shape is mandatory in map key
        // 2. for specify shape value their measurements is required like
                    // circle then radius
                    // square then size
                    // rectangle then length and width
                    // triangle then base and height
        //3. note all measurements and shape is mandatory write in small case. and value in string "10","20.5"
        Map<String,String> mp=new HashMap<>();
        mp.put("shape","triangle");
        mp.put("bae","4");
        mp.put("height","2");
        System.out.println(getAreaOfShapeArea(mp));
    }
}
