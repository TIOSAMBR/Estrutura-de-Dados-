/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg9;

/**
 *
 * @author Samuel Toledo
 */
import java.util.Random;

public class Lista {
    Celula primeiro, ultimo, removido = new Celula(null);
    int tamanho;

    void addInicio(Object elemento) {
        Celula nova = new Celula(primeiro, elemento);
        this.primeiro = nova;

        if (this.tamanho == 0) {
            ultimo = primeiro;
        }
        this.tamanho++;
    }

    void addFinal(Object elemento) {
        if (this.tamanho == 0) {
            addInicio(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.tamanho++;
        }
    }

    boolean posicaoOcupada(int pos) {
        return (pos >= 0) && (pos < this.tamanho);
    }

    Celula pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Não existe!");
        } else {
            Celula atual = this.primeiro;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProximo();
            }
            return (atual);

        }
    }

    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            this.addInicio(elemento);
        } else {
            if (pos == this.tamanho) {
                this.addFinal(elemento);
            } else {
                Celula anterior = this.pegarCelula(pos - 1);
                Celula nova = new Celula(anterior.getProximo(), elemento);
                anterior.setProximo(nova);
                this.tamanho++;
            }
        }
    }

    Object pega(int pos) { // Pega o elemento na posição desajada
        return (this.pegarCelula(pos).getElement());
    }

    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Não existe!");
        } else {
            this.primeiro = this.primeiro.getProximo();
            // this.tamanho;
            if (this.tamanho == 0) {
                this.ultimo = null;
            }
        }
    }

    void remover(int pos) {

        if (posicaoOcupada(pos)) {
            if (pos == 0) {
                
                removerInicio();
            }
            if ((pos > 0) && (pos < this.tamanho)) {

                if (pos == tamanho - 1) {
                    Celula anterior = this.pegarCelula(pos - 1);
                    ultimo = anterior;
                }else {
                    Celula proximo = this.pegarCelula(pos + 1);
                    Celula anterior = this.pegarCelula(pos - 1);
                    anterior.setProximo(proximo);
                }

            }

            this.tamanho--;

        } else {
            throw new IllegalArgumentException("Não existe essa posição");
        }
    }

    Boolean contem(Object elemento) {
        Celula atual = this.primeiro;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProximo();
        }
        return false;
    }

    int tamanho() {
        return this.tamanho;
    }

    Random random = new Random();
    int sorteado = 0;

    int x = 20;

    void sortear() {
        for (int i = 0; i <= 19; i++) {
            System.out.println(" \nrodada " + (i + 1) + "\n");

            if(x == 0){
                sorteado = 0;
            }else {
                sorteado = random.nextInt(x);
            }
            this.remover(sorteado);

            x--;

            for (int j = 0; j < x; j++) {
                Pessoa atual = (Pessoa) pega(j);

                System.out.println("O nome da pessoa eh:" + atual.nome);
                System.out.println("Seu telefone eh: " + atual.telefone);
                System.out.println("Seu endereco eh: " + atual.endereco);
                System.out.println("Seu CPF eh: " + atual.cpf + "\n\n");

            }

        }
    }

    void imprimirRemovido() {
        Pessoa removid = (Pessoa) removido.getElement();

        System.out.println("A pessoa removida eh: " + removid.nome);
        System.out.println("Seu numero eh: " + removid.telefone);
        System.out.println("Seu endereco eh: " + removid.endereco);
        System.out.println("Seu CPF eh: " + removid.cpf + "\n\n\n");
    }

}

