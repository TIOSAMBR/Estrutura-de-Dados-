/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.disco;

import java.util.Stack;

/**
 *
 * @author damuc
 */
public class Pilha {

    Stack <Integer> pilhaOriginal = new Stack<>(); 
    Stack <Integer> pilhaDest = new Stack<>(); 
    Stack <Integer> pilhaAux = new Stack<>(); 

    Long jogadas = (long) 0;

    void torreHanoi(int nDiscos, Stack<Integer> original, Stack <Integer> dest, Stack<Integer> aux){

        if(nDiscos >= 0){
            torreHanoi(nDiscos -1, original, aux, dest);
            dest.push(original.pop());
            jogadas++;
            // System.out.println("-----");
            // System.out.println("Original: " + original);
            // System.out.println("Destino: " + dest);
            // System.out.println("Auxiliar: " + aux);
            torreHanoi(nDiscos -1, aux, dest, original);
        }
    }


}