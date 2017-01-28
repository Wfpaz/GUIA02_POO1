/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Walter
 */
public class clsEje1 {
    private int numBase;
    private int numPote;

    public int getNumBase() {
        return numBase;
    }

    public void setNumBase(int numBase) {
        this.numBase = numBase;
    }

    public int getNumPote() {
        return numPote;
    }

    public void setNumPote(int numPote) {
        this.numPote = numPote;
    }
    
    public int getResultado() {
        int resp = 1;
        try {
            if(numPote == 0){
                return 1;
            }
            for(int i=0; i < numPote; i++){
                resp = this.multi(resp, numBase);
            }
            
        } catch (Exception e) {
            System.out.println("Su error es: " + e.getMessage());
        }
        return resp;
    }
    
    private int multi(int num1, int num2){
        int res=0;
        for (int i = 0; i < num1; i++) {
            res += num2;
        }
        return res;
    }
}
