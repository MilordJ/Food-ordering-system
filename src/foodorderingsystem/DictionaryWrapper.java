/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import lombok.Data;


/**
 *
 * @author Lito
 */
@Data
public class DictionaryWrapper {
    private int id; 
    private String name;
    private String price;
    private String additional = "";

    public DictionaryWrapper() {
    }

    public DictionaryWrapper(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public DictionaryWrapper(int id, String name, String price, String additional) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.additional = additional;
    }
    
}
