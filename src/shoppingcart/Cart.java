/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingcart;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Mostafa
 */
public class Cart {
    private int cartId;
    private static ArrayList<Integer> cartIds = new ArrayList<>();
    private Date date;
    private Items[] items;
//    private ArrayList<Items> itemsArrayList =new ArrayList<>();
    private double total;
    private int[] numOfItems;

    public Cart() {
    }

    public Cart(int cartId, Date dateFormat) {
        this.cartId = cartId;
        this.date = dateFormat;
    }

    public Cart(int cartId, Date dateFormat, Items[] items, double total, int[] itemsNum) {
        this.cartId = cartId;
        this.date = dateFormat;
        this.items = items;
        this.total = total;
        this.numOfItems = itemsNum;
        cartIds.add(cartId);
    }

    public static ArrayList<Integer> getCartIds() {
        return cartIds;
    }
    public static String[] getCartIdsArrString() {
        String[] x = new String[cartIds.size()];
        for (int i = 0; i < cartIds.size(); i++) {
            x[i]=cartIds.get(i).toString();
        }
        return x;
    }
        public static String[] getCartIdsArrString(ArrayList<Cart> carts) {
        String[] x = new String[cartIds.size()];
        for (int i = 0; i < cartIds.size(); i++) {
            x[i]=cartIds.get(i).toString()+" total "+carts.get(i).total;
        }
        return x;
    }
    public static int[] getCartIdsArrInt() {
        int[] x = new int[cartIds.size()];
        for (int i = 0; i < cartIds.size(); i++) {
            x[i]=cartIds.get(i);
        }
        return x;
    }
    public static void setCartIds(ArrayList<Integer> cartIds) {
        Cart.cartIds = cartIds;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int[] getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int[] numOfItems) {
        this.numOfItems = numOfItems;
    }
    
}
