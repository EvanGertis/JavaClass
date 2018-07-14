package com.evangertis;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 1);
        stockList.addStock(temp);

        temp = new StockItem("pie", 30, 1);
        stockList.addStock(temp);



        temp = new StockItem("cheesecake", 5, 9);
        stockList.addStock(temp);

        Basket evansBasket = new Basket("Evan");
        sellItem(evansBasket, "pie", 1);

        System.out.println(evansBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("pie").adjustStock(2000);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity){
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Item either does not exist or is no longer in stock");
            return 0;
        }
        if(stockList.sellsStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}


