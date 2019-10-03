/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author Lito
 */
public class Menu {

   private DictionaryWrapper italian = new DictionaryWrapper(1, "Italian", "100$");
   private DictionaryWrapper mexican = new DictionaryWrapper(2, "Mexican", "110$");
   private DictionaryWrapper polan = new DictionaryWrapper(3, "Poland", "120$");
   private DictionaryWrapper yeddiGozel = new DictionaryWrapper(4, "Yeddi Gozel", "1000$", null);
   private DictionaryWrapper minBirGece = new DictionaryWrapper(5, "Min bir gece", "1210$", null);

   public DictionaryWrapper getMenu(String choose){
   
       if(choose.equals("Italian")){
           return italian;
       }
       if(choose.equals("Mexican")){
           return mexican;
       }
       if(choose.equals("Poland")){
           return polan;
       }
       if(choose.equals("Yeddi gozel")){
           return yeddiGozel;
       }
       if(choose.equals("Min bir gece")){
           return minBirGece;
       }
       return null;
   }
   
   
}
