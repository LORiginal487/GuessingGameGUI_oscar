/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGpckg;


import java.util.Random;

/**
 *
 * @author User
 */
public class RandmNumGen {
   private int min = 0;
   private int max = 0;
   private int num;
   
    public RandmNumGen(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNum() {
        generateRndNum();
        return num;
    }

    
    public void generateRndNum(){
        /**
         * Random random = new Random();
         * num = random.nextInt((max-min+1)+min);
        */
        num = (int)Math.floor(Math.random()*(max - min + 1)+ 1);
    }
   
   
}
