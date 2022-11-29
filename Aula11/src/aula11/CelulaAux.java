/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Samuel Toledo
 */
public class CelulaAux {
    String expressao;
    CelulaAux anterior;
    
    CelulaAux(){

    }

    CelulaAux(String expressao, CelulaAux anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    CelulaAux getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaAux anterior) {
        this.anterior = anterior;
    }
}