public class stockPurchase {
    public static void main(String[] args){

    int savings = 25000;
    int stock = 989;

    int share = savings / stock;
    int remaining = share * 989;
    int cdStocks = savings - remaining;


    System.out.println("Buy " + share + " shares of stock");

    System.out.println("Invest $" + cdStocks + " in CD account" );

    }

}
