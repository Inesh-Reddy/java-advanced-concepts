package dev.inesh.Ecommerce_App;

import java.util.LinkedList;

public class RecentlyViewedItems <T extends Item>{
    private LinkedList<T> recentlyViewedItems = new LinkedList<>();
    private int MAX_SIZE = 3;

    public RecentlyViewedItems() {
        recentlyViewedItems = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item){
        recentlyViewedItems
    }



}
