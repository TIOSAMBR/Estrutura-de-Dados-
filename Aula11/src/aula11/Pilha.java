/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Samuel Toledo
 */
public class Pilha {
    Celula topo = null;

    PilhaAux pilhaAux = new PilhaAux();

    void push(String expressao) {
        Celula nova = new Celula(expressao, topo);
        this.topo = nova;
    }

    void pop() {
        if (!isEmpty()) {
            System.out.println("Retirando o elemento da pilha..: " + this.topo.getExpressao());
            this.topo = this.topo.getAnterior();
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    boolean isEmpty() {
        if (this.topo == null) {
            return true;
        }
        return false;
    }

    int sizePilha() {
        Celula p;
        int cont = 0;
        p = topo;
        while (p != null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }

    void imprimir() {
        Celula p = topo;
        if (isEmpty()) {
            System.out.println("Pilha vazia!!!");
        } else {
            while (p != null) {
                System.out.println("Nome da pilha.::" + p.getExpressao());
                p = p.getAnterior();
            }
        }
    }

    void topo() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!!!");
        } else {
            System.out.println("Topo da pilha eh.::" + topo.getExpressao());
        }
    }

    boolean vefExpressao(String expressao) {
        boolean x = false;

        for (int i = 0; i < expressao.length(); i++) {
            String expr = "";
            expr += expressao.charAt(i);
            if (expr.equals("{") || expr.equals("[") || expr.equals("(")) {
                push(expr);
            }
        }
        for (int i = expressao.length() - 1; i >= 0; i--) {
            String expr = "";
            expr += expressao.charAt(i);
            if (expr.equals("}") || expr.equals("]") || expr.equals(")")) {
                pilhaAux.push(expr);
            }
        }
        Celula p = topo;
        CelulaAux p2 = pilhaAux.topo;
        
        while (p.getAnterior() != null) {
            if (p.getExpressao().equals("{")) {
                if (p2.getExpressao().equals("}")) {
                    x = true;
                } else {
                    x = false;
                }
                p = p.getAnterior();
                p2 = p2.getAnterior();
            }

            if (p.getExpressao().equals("[")) {
                if (p2.getExpressao().equals("]")) {
                    x = true;
                } else {
                    x = false;
                }
                p = p.getAnterior();
                p2 = p2.getAnterior();
            }

            if (p.getExpressao().equals("(")) {
                if (p2.getExpressao().equals(")")) {
                    x = true;
                } else {
                    x = false;
                }
                p = p.getAnterior();
                p2 = p2.getAnterior();
            }
        }
        return x;
    }

}