/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingcart;

import java.text.DecimalFormat;

/**
 *
 * @author Mostafa
 */
public class Items {
    private int itemId;
    private String itemName;
    private double price;
    private int onStock;
//     private int quantity;
private String image;

    public Items(int itemId, String itemName, double price, int onStock, String image) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.onStock = onStock;
        this.image = image;
    }

    public boolean decreaseStock(){
        if(onStock>0){
            onStock--;
//            quantity++;
            return true;
        }
        return false;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOnStock() {
        return onStock;
    }

    public void setOnStock(int onStock) {
        this.onStock = onStock;
    }
        public static String itemsString(Items[] itemses,int[] numOfItems) {
            String x="id        name            price       quantity\n\n";
            int totalQ=0;
            double totalpr=0.0;
            for (int i = 0; i < itemses.length; i++) {
                x+=itemses[i].getItemId()+"         "+itemses[i].getItemName()+"             "+itemses[i].getPrice()+"                 "+numOfItems[i]+"\n";
                totalpr+=numOfItems[i]*itemses[i].getPrice();
                totalQ+=numOfItems[i];
            }
            DecimalFormat df = new DecimalFormat("##.##");
            return x+"\n"+"total price : ( "+df.format(totalpr)+" )  total q: "+totalQ+"\n";
    }
}
