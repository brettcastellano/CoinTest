/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cointest;

/**
 *
 * @author Brett
 */
public class CoinTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coin nickel = new Coin();
        
        if (nickel.showFace() == 0) {
            System.out.println("Heads up!");
        } else if (nickel.showFace() == 1) {
            System.out.println("Tails up!");
        }
    }
    
}
