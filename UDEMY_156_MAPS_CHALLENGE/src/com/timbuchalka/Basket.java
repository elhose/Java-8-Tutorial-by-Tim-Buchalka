package com.timbuchalka;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            if (quantity + inBasket <= item.quantityInStock()) {
                item.setReserved(inBasket + quantity);
                list.put(item, item.getReserved());
                return inBasket;
            }else {
                System.out.println("nie możesz zarezerować tej ilości");
            }
        }
        return 0;
    }

    public boolean removeFromBasket(StockItem item, int quantity){
        if((item != null) &&(quantity > 0)) {
            if (item.getReserved() == quantity && list.containsKey(item)){
                list.remove(item);
                return true;
            } else if (item.getReserved() > quantity && list.containsKey(item)) {
                item.setReserved(item.getReserved()-quantity);
                int inBasket = list.get(item);
                list.put(item,inBasket-quantity);
                return true;
            }
        }
        System.out.println("poebao");
        return false;
    }

    public boolean removeFromBasket(StockItem item){
        if (item != null && list.containsKey(item)){
            list.remove(item);
        }
        return false;
    }

    public boolean checkout(Basket basket){
        if(basket != null){
            for (Map.Entry<StockItem,Integer> item : list.entrySet()){
                StockItem stockItem = item.getKey();
                int reservedByCustomer = item.getValue();

                stockItem.adjustStock(-reservedByCustomer);
                stockItem.setReserved(0);
            }
            System.out.println(basket.toString());
            list.clear();
            return true;
        }
        return false;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey().toString() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
