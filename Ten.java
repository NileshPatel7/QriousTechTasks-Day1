public class Ten {
    public static void main(String[] args) {
        String drinks[]={"lemonade","lime"};
        int prices[] =   {15,10};

        if(drinks.length == prices.length){
            for(int i=0;i<drinks.length-1;i++){
                for(int j=i+1;j<drinks.length;j++){

                    if(prices[i]>prices[j]){
                        int temp=prices[i];
                        prices[i]=prices[j];
                        prices[j]=temp;

                        String t=drinks[i];
                        drinks[i]=drinks[j];
                        drinks[j]=t;
                    }
                }
            }
            System.out.print("{ ");
            for(int i=0;i<drinks.length;i++){
                System.out.print("{"+"name: "+drinks[i]+" ,price: "+prices[i]+"} ,");
            }
            System.out.print(" }");
        }else{
            System.out.println("Proper data is not given{name and price}");
        }

    }
}
