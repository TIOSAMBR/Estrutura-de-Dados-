/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.disco;

/**
 *
 * @author Samuel Toledo
 */
public class Disco {

    public static void main(String[] args){

        Pilha pilha = new Pilha();

        pilha.pilhaOriginal.push(40);
        pilha.pilhaOriginal.push(39);
        pilha.pilhaOriginal.push(38);
        pilha.pilhaOriginal.push(37);
        pilha.pilhaOriginal.push(36);
        pilha.pilhaOriginal.push(35);
        pilha.pilhaOriginal.push(34);
        pilha.pilhaOriginal.push(33);
        pilha.pilhaOriginal.push(32);
        pilha.pilhaOriginal.push(31);
        pilha.pilhaOriginal.push(30);
        pilha.pilhaOriginal.push(29);
        pilha.pilhaOriginal.push(28);
        pilha.pilhaOriginal.push(27);
        pilha.pilhaOriginal.push(26);
        pilha.pilhaOriginal.push(25);
        pilha.pilhaOriginal.push(24);
        pilha.pilhaOriginal.push(23);
        pilha.pilhaOriginal.push(22);
        pilha.pilhaOriginal.push(21);
        pilha.pilhaOriginal.push(20);
        pilha.pilhaOriginal.push(19);
        pilha.pilhaOriginal.push(18);
        pilha.pilhaOriginal.push(17);
        pilha.pilhaOriginal.push(16);
        pilha.pilhaOriginal.push(15);
        pilha.pilhaOriginal.push(14);
        pilha.pilhaOriginal.push(13);
        pilha.pilhaOriginal.push(12);
        pilha.pilhaOriginal.push(11);
        pilha.pilhaOriginal.push(10);
        pilha.pilhaOriginal.push(9);
        pilha.pilhaOriginal.push(8);
        pilha.pilhaOriginal.push(7);
        pilha.pilhaOriginal.push(6);
        pilha.pilhaOriginal.push(5);
        pilha.pilhaOriginal.push(4);
        pilha.pilhaOriginal.push(3);
        pilha.pilhaOriginal.push(2);
        pilha.pilhaOriginal.push(1);

        System.out.println("Original: " + pilha.pilhaOriginal);
        System.out.println("Destino: " + pilha.pilhaDest);
        System.out.println("Auxiliar: " + pilha.pilhaAux);
        System.out.println("-----");

        pilha.torreHanoi(pilha.pilhaOriginal.size()-1, pilha.pilhaOriginal, pilha.pilhaDest, pilha.pilhaAux);
        System.out.println("O numero de jogadas total foi: " + pilha.jogadas);
        System.out.println("-----");
        System.out.println("Original: " + pilha.pilhaOriginal);
        System.out.println("Destino: " + pilha.pilhaDest);
        System.out.println("Auxiliar: " + pilha.pilhaAux);
    }
}
