# Rex-Ryan-olofernes-and-bialen-
I hope is the right my project 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

import java.util.HashMap;

/**
 *
 * @author Administrator
 */
public class Mavenproject12 {

    public static void main(String[] args) {
        for(int i=30; i>=1; i--) {
            System.out.println(i);
        }
        System.out.println("Start!");
        
        HashMap<String, Integer> score = new HashMap();
        
        score.put("Elaina", 98);
        score.put("Josh", 92);
        score.put("Alice", 85);
        score.put("bryan", 87);
        score.put("Maple", 95);
        score.put("Aliza", 94);
        
        //score.remove(Josh);
        //System.out.println(score.get("josh"));
        //System.out.println(score.containskey("bryan"));
        //System.out.println(score.size());
        for(String key : score.keySet()) {
            System.out.println(key + " Your Grade is = " + score.get(key));        
        }
    }
}
