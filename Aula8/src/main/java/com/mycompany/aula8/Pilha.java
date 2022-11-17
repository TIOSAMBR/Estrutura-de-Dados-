/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula8;

/**
 *
 * @author Samuel Toledo
 */
import javax.swing.JOptionPane;

public class Pilha {
    String text = "", text1 = "", text2 = "";
    String[] pilha1 = new String[6];

    void exerc1() {
        text = JOptionPane.showInputDialog(null, "Digite o texto!");
        for (int i = text.length() - 1; i >= 0; i--) {
            text1 += text.charAt(i);
        }
        System.out.println(text1);

        for (int i = 0; i <= text1.length() - 1; i++) {
            text = "";
            text += text1.charAt(i);

            if (" ".equals(text)) {
            } else {
                text2 += text;
            }
        }
        text1 = "";
        for (int i = text2.length() - 1; i >= 0; i--) {
            text1 += text2.charAt(i);
        }

        if (text1.equals(text2)) {
            System.out.println("Esse texto eh um palindromo!\n");
        } else {
            System.out.println("Esse texto nao eh um palndromo!\n");
        }

    }

    String chave = "13@3rtg", nome = "";

    void exerc2() {
        int topoPilha = -1;

        for (int i = 0; i <= 5; i++) {

            nome = JOptionPane.showInputDialog(null, "Insira o nome do item!");
            String verificar = JOptionPane.showInputDialog(null, "Voce deseja adicionar uma chave no item?");

            if ("SIM".equals(verificar)) {

                nome += " ---- " + chave;
                pilha1[i] = nome;
                topoPilha++;
            } else {
                pilha1[i] = nome;
                topoPilha++;
            }
        }

        for (int i = topoPilha; i >= 0; i--) {

            if (pilha1[topoPilha].contains("13@3rtg")) {
                topoPilha--;
            } else {
                System.out.println(pilha1[topoPilha]);
                topoPilha--;
            }
        }
    }

}
