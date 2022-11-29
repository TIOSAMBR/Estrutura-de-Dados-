/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Samuel Toledo
 */
public class Celula {
    String expressao;
    Celula anterior;
    
    Celula(){

    }

    Celula(String expressao, Celula anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    Celula getAnterior() {
        return this.anterior;
    }

    void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }


}