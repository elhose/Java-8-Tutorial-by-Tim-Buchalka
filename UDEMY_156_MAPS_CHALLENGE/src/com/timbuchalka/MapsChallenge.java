package com.timbuchalka;

import java.util.LinkedHashMap;

public class MapsChallenge {

private static StockList stockList = new StockList();
private static Basket basket = new Basket("moje");
    private static Basket xdd = new Basket("oja");

    public static void main(String[] args) {

        StockItem a1 = new StockItem("bread", 0.86, 100);
        stockList.addStock(a1);

        StockItem a2 = new StockItem("białko", 41.99, 10);
        stockList.addStock(a2);

        StockItem a3 = new StockItem("kreatyna", 23.99, 20);
        stockList.addStock(a3);

        StockItem a4 = new StockItem("spalacz", 52.99, 15);
        stockList.addStock(a4);

        StockItem a5 = new StockItem("ser", 6.76, 123);
        stockList.addStock(a5);

        StockItem a6 = new StockItem("mleko", 2.49, 50);
        stockList.addStock(a6);

        System.out.println( basket.addToBasket(a1,5));
        System.out.println(basket.addToBasket(a2, 3));
        System.out.println(basket.addToBasket(a4, 2));
        System.out.println(basket.addToBasket(a5,100));
        System.out.println(basket.removeFromBasket(a6));

        System.out.println(xdd.addToBasket(a6,32));
        xdd.checkout(xdd);
        basket.checkout(basket);


    }


}
