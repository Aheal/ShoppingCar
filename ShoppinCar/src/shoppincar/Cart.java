/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppincar;

import java.util.ArrayList; 

/**
 *
 * @author aleja
 */
public class Cart {
    ArrayList tours; 
    int pos;
    public Cart () 
    {
        tours = new ArrayList(); 
        pos = 0;
    } 
    
    public void addTour(Items tour) 
    {
        tours.add(pos,tour);
        pos++;
    }
    
}
