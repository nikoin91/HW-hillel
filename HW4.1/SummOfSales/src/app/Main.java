package app;

/*
Product No 1: smartphone,
total sales for 5 days is EUR 12153,41,
sales by day is EUR 2430,68.
Product No 2: laptop,
total sales for 7 days is EUR 10486,85,
sales by day is EUR 1498,12.

 */

public class Main {

    static int productNo1, productNo2;
    static String product1, product2;
    static int qtyDays1, qtyDays2;
    static float totSales1, totSales2;
    private final static String currency = "EUR";
    static float salesByDay1, salesByDay2;

    public static void main(String[] args) {

        productNo1 = 1;
        product1 = "smartphone";
        qtyDays1 = 5;
        totSales1 = 12153.41f;
        salesByDay1 = totSales1/qtyDays1;

        System.out.printf("Product No %d : %s," + System.lineSeparator()
                + "total sales for %d days is %s %.2f," + System.lineSeparator()
                + "sales by day is %s %.2f." + System.lineSeparator(),
                productNo1, product1, qtyDays1, currency, totSales1, currency, salesByDay1);

        productNo2 = 2;
        product2 = "laptop";
        qtyDays2 = 7;
        totSales2 = 10486.85f;
        salesByDay2 = totSales2/qtyDays2;

        System.out.printf("Product No %d : %s," + System.lineSeparator()
                + "total sales for %d days is %s %.2f," + System.lineSeparator()
                + "sales by day is %s %.2f.",
                productNo2, product2, qtyDays2, currency, totSales2, currency, salesByDay2);

    }
}