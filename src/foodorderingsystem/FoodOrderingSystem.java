/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.util.Scanner;

/**
 *
 * @author Lito
 */
public class FoodOrderingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getOrder();
    }

    static void getOrder() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose your order: Lunch or Drink? ");
        String name = in.nextLine();
        chooseOrder(name);
    }

    static void chooseOrder(String name) {
        Menu m = new Menu();
        DictionaryWrapper d;
        Scanner inn = new Scanner(System.in);
        if (name.equals("Lunch")) {
            System.out.println("Please choose cuisine:Polish, Mexican, Italian? ");
            String cuisine = inn.nextLine();
            d = m.getMenu(cuisine);
            if (d != null) {
                System.out.println(d.getName() + " - " + d.getPrice());
                Scanner drinkOrder = new Scanner(System.in);
                System.out.print("Would you like drink? Yes/No ");
                String drink = drinkOrder.nextLine();
                if(drink.equals("Yes")){
                    chooseOrder("Drink");
                }else{
                    System.out.println("Thanks...");
                }
            }else{
                chooseOrder(name);
            }
        }
        else if(name.equals("Drink")){
            System.out.println("Yeddi gozel or Min bir gece? ");
            String drink = inn.nextLine();
            d = m.getMenu(drink);
            Scanner add = new Scanner(System.in);
            if(d!=null){
                System.out.println("Ice cubes or lemon? ");
                String additional = add.nextLine();
                d.setAdditional("- "+additional);
                System.out.println(d.getName() + " - " + d.getPrice() + " "+d.getAdditional());
            }else{
                chooseOrder(name);
            }
        }else{
            getOrder();
        }
    }

}
