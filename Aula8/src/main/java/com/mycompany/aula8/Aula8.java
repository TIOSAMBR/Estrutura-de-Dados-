/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula8;

/**
 *
 * @author Samuel Toledo
 */
public class Aula8 {

    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        System.out.println("----------Exercicio 1----------\n");

        pilha.exerc1();

        System.out.println("----------Exercicio 2----------\n");

        pilha.exerc2();

        System.out.println("----------Exercicio 3----------\n");

        Aviao aviao1 = new Aviao("Raptor", 10001);
        Aviao aviao2 = new Aviao("Esquadrilha da fumaça", 10002);
        Aviao aviao3 = new Aviao("Gripen", 10003);
        Aviao aviao4 = new Aviao("F16", 10004);
        Aviao aviao5 = new Aviao("F22", 10005);
        Aviao aviao6 = new Aviao("F5", 10006);
        Aviao aviao7 = new Aviao("Tucano", 10007);
        Aviao aviao8 = new Aviao("T-25", 10008);
        Aviao aviao9 = new Aviao("T-28", 10009);
        Aviao aviao10 = new Aviao("F-35B", 100010);
        Aviao aviao11 = new Aviao("Raptor 25K-7", 100011);

        fila.adicionar(aviao1);
        fila.adicionar(aviao2);
        fila.adicionar(aviao3);
        fila.adicionar(aviao4);
        fila.adicionar(aviao5);
        fila.adicionar(aviao6);
        fila.adicionar(aviao7);
        fila.adicionar(aviao8);
        fila.adicionar(aviao9);
        fila.adicionar(aviao10);

        System.out.println("Existem " + fila.tamnhFila() + " avioes na fila de espera\n");

        fila.libeVoo();
        fila.adicionar(aviao11);

        fila.exerc3();

        fila.primeiroFila(fila.filaAviao.get(0));

        System.out.println("\nO primeiro aviao na fila eh o " + ((Aviao) aviao2).nomeAviao + " , com codigo "
                + ((Aviao) aviao1).idAviao + "\n");

        System.out.println("----------Exercicio 4----------\n");

        fila.exerc4();

        System.out.println("----------Exercicio 5----------\n");

        fila.exerc5();
System.out.println("\n----------Exercicio 6----------\n");

        fila.exerc6();

        System.out.println("\n----------Exercicio 7----------\n");

        fila.exerc7();

        System.out.println("\n----------Exercicio 8----------\n");

        fila.exerc8();
    }
}