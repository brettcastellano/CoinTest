/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointest;

import java.util.Random;

/**
 *
 * @author Brett
 */
public class Coin {

    Random r = new Random();
    int faceUp;

    public Coin() {

        faceUp = r.nextInt(2);
    }

    public void flipCoin() {
        faceUp = r.nextInt(2);

    }

    public int showFace() {
        return faceUp;
    }
}
