/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Administrator
 */
public class Mavenproject11 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        
        name.add("Name List");
        name.add("Joriz");
        name.add("Hazel");
        
        System.out.println(name.get(1));
        
        HashMap<String, Integer> uniquelnumber = new HashMap();
        
        
        uniquelnumber.put ("Hi Joriz", 10);
        uniquelnumber.put ("Hi Hazel", 18);
        uniquelnumber.put ("Alice", 15);
        
        uniquelnumber.remove("Alice");
         for(String key : uniquelnumber.keySet()){
            System.out.println(key + " Your Age is = " + uniquelnumber.get(key));  
        }
    }
}