class Drink{
    String drinkName;
    int drinkPrice;

    public Drink(String dn,int dp){
        drinkName=dn;
        drinkPrice=dp;
    }

    public void setDrink(String dn,int dp){
        drinkName=dn;
        drinkPrice=dp;
    }

    @Override
    public String toString() {
        return "{" +
                "drinkName:'" + drinkName + '\'' +
                ", drinkPrice:" + drinkPrice +
                '}';
    }
}
public class Ten {

    public static void printDrints(Drink[] d){
        System.out.print("[ ");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.print(" ]");
    }

    public static Drink[] arrangeDrink(Drink[] d){
        for(int i=0;i<d.length-1;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i].drinkPrice>d[j].drinkPrice) {
                    Drink temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        return d;
    }
    public static void main(String[] args) {
        Drink[] drinks={
                        new Drink("lemonade",15),
                        new Drink("lime",10),
                        new Drink("Black Tea",20),
                        new Drink("Cola",17)
                       };

        printDrints(arrangeDrink(drinks));

    }
}
