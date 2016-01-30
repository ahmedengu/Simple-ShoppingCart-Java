/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mostafa
 */
public class Customer {

    public static ArrayList<Customer> customerList = new ArrayList<>();
    private int customerId;
    private Date date;
    private Cart cart;
    private String name;
    private double budget;
    public static ArrayList<String> customerNames = new ArrayList<>();

    public Customer(int customerId, Date date, Cart cart, String name, double budget) {
        this.customerId = customerId;
        this.date = date;
        this.cart = cart;
        this.name = name;
        this.budget = budget;
        customerNames.add(name);
        if(cart!=null){
        if (budget - cart.getTotal() < 0) {
            this.budget = budget - cart.getTotal();
         JOptionPane.showMessageDialog(null, "the total is less than the budget you debit is " + this.budget);
        } else {
         JOptionPane.showMessageDialog(null, "your budget = " + this.budget);

        }}
    }

    public static ArrayList<String> getCustomerNames() {
        return customerNames;
    }

    public static String[] getCustomerNamesSTR() {
        String[] x = new String[customerNames.size()];
        for (int i = 0; i < customerNames.size(); i++) {
            x[i] = customerNames.get(i);
        }
        return x;
    }

    public static void setCustomerNames(ArrayList<String> customerNames) {
        Customer.customerNames = customerNames;
    }

    public static ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(ArrayList<Customer> customerList) {
        Customer.customerList = customerList;
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {

        this.cart = cart;

        if (this.budget - cart.getTotal() < 0) {
            this.budget = this.budget - cart.getTotal();
            JOptionPane.showMessageDialog(null, "the total is less than the budget you debit is " + this.budget);
        } else {
            JOptionPane.showMessageDialog(null, "your budget = " + this.budget);

        }
    }

}
