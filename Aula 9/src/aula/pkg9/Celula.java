/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg9;

/**
 *
 * @author Samuel Toledo
 */
public class Celula {
    Celula proximo;
    Object elemento;
    
    public Celula(Object elemento){
        this.elemento = elemento;
    }
    public Celula(Celula proximo, Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    void setProximo(Celula proximo){
        this.proximo = proximo;
    }

    Celula getProximo(){
        return this.proximo;
    }

    Object getElement(){
        return this.elemento;
    }

}
