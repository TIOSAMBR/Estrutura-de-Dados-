/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula8;

/**
 *
 * @author Samuel Toledo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Fila {
    List<Object> filaAviao = new ArrayList<>();
    TestaPilha testaPilha = new TestaPilha();

    int[] filaF1 = new int[100];
    int[] filaF2 = new int[100];
    int[] filaSorteio = new int[1000];
    int[] filaSorteio2 = new int[2000];
    int[] pilhaSorteio = new int[1000];
    int[] fila3 = new int[20];
    int[] pilha3 = new int[20];

    Random random = new Random();

    void exerc4() {
        for (int i = 0; i <= filaF1.length - 1; i++) {
            int numRandom = random.nextInt(5000);
            filaF1[i] = numRandom;
        }

        int j = 0;
        for (int i = filaF1.length - 1; i >= 0; i--) {
            filaF2[i] = filaF1[j];
            j++;
        }

        for (int i = 0; i <= filaF1.length - 1; i++) {
            System.out.println(
                    "Valor da fila F1 na posicao " + i + " eh: " + filaF1[i] + " e da fila F2 eh: " + filaF2[i] + ".");
        }
    }

    void adicionar(Object obj) {
        this.filaAviao.add(obj);
    }
    void primeiroFila(Object obj){
        System.out.println("\nO primeiro aviao na fila eh o " + ((Aviao) obj).nomeAviao + " , com codigo "
        + ((Aviao) obj).idAviao + "\n");
    }

    void libeVoo() {
        Object obj;
        obj = filaAviao.get(0);
        String resposta;
        resposta = new String();
        resposta = JOptionPane.showInputDialog(null, "Atorizar o aviao " + ((Aviao) obj).nomeAviao + " com o codigo "
                + ((Aviao) obj).idAviao + " a decolar?");

        if ("SIM".equals(resposta)) {
            System.out.println("O aviao " + ((Aviao) obj).nomeAviao + " com o codigo " + ((Aviao) obj).idAviao
                    + " ganhou autorizacao para voar!\n");
            remover();
        } else {
            System.out.println("Acesso negado!");
            libeVoo();
        }

    }
void remover() {
        this.filaAviao.remove(0);
    }

    int tamnhFila() {
        return this.filaAviao.size();
    }

    void exerc3() {
        for (int i = 0; i <= filaAviao.size() - 1; i++) {
            Object obj;
            obj = filaAviao.get(i);
            System.out
                    .println("O aviao " + ((Aviao) obj).nomeAviao + " esta na fila ocupando o " + (i + 1) + " lugar!");
        }
    }

    void exerc5() {
        int topoPilha = 0, topoFila = 0;

        for (int i = 0; i <= filaSorteio.length - 1; i++) {
            int numRandom = random.nextInt(5000);
            boolean verificar = true;

            for (int j = 0; j <= i; j++) {
                if (numRandom == filaSorteio[j]) {
                    pilhaSorteio[topoPilha] = numRandom;
                    topoPilha++;
                    verificar = false;
                }
            }

            if (verificar == true) {
                filaSorteio[topoFila] = numRandom;
                topoFila++;
            }

        }
        for (int i = 0; i <= topoFila - 1; i++) {
            System.out.println("O valor da fila na posicao " + i + " eh: " + filaSorteio[i]);
        }
        System.out.println("\n");
        int j = 0;
        for (int i = topoPilha - 1; i >= 0; i--) {
            System.out.println("O valor da pilha na posicao " + j + " eh: " + pilhaSorteio[i]);
            j++;
        }

    }

    void exerc6() {
        int j = 1, topoPilha = 0, topoFila = 0, k = 0;
        boolean verificar = true;

        for (int i = 0; i <= filaSorteio2.length - 1; i++) {
            int numRandom = random.nextInt(5000);

            if (verificar == true) {
                filaSorteio2[i] = numRandom;

                if (j % 1000 == 0) {
                    verificar = false;
                }
                j++;

            } else {
                filaSorteio2[i] = numRandom * (-1);
if (j % 1000 == 0) {
                    verificar = true;
                }
                j++;
            }
            System.out.println(filaSorteio2[i]);
        }

        for (int i = 0; i <= filaSorteio2.length - 1; i++) {

            if (filaSorteio2[topoFila] >= 0) {
                pilhaSorteio[topoPilha] = filaSorteio2[topoFila];
                topoPilha++;
                topoFila++;

            } else {
                System.out.println("Retirando o numero " + pilhaSorteio[topoPilha - 1] + " na posicao " + k);
                topoPilha--;
                k++;
            }
        }
    }

    void exerc7() {
        int j = 1, topoFila = 0;

        for (int i = 0; i <= fila3.length - 1; i++) {
            fila3[i] = j;
            j++;
            topoFila++;
            System.out.println("Fila sem inverter = " + fila3[i]);
        }
        System.out.println("---------------");

        for (int i = fila3.length - 1; i >= 0; i--) {
            pilha3[i] = fila3[topoFila - 1];
            topoFila--;
            System.out.println("Fila apos inverter = " + pilha3[i]);
        }

    }

    void exerc8() {
        int negativo , topoPilhaP = 0, topoPilhaN = 0;

        for (int i = 0; i <= testaPilha.pilhaP.length - 1; i++) {
            int numRandom = random.nextInt(201);

            if (numRandom == 0) {
                System.out.println("O elemento removido da pilha N foi " + testaPilha.pilhaN[topoPilhaN -1]);
                System.out.println("O elemento removido da pilha P foi " + testaPilha.pilhaP[topoPilhaP -1]);
                topoPilhaN--;
                topoPilhaP--;
            }
            if (numRandom != 0) {
                if (numRandom > 100) {
                    negativo = (numRandom - 100) * -1;
                    testaPilha.pilhaN[topoPilhaN] = negativo;
                    topoPilhaN++;
                    System.out.println("Pilha N =  " + negativo + " na posicao " + topoPilhaN);
                } else {
                    testaPilha.pilhaP[topoPilhaP] = numRandom;
                    topoPilhaP++;
                    System.out.println("Pilha P = " + numRandom + " na posicao " + topoPilhaP);
                }
            }

        }
    }
}
