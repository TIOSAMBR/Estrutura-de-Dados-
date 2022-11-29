/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Samuel Toledo
 */
public class Celula {
    Celula proxima, anterior;
    Object elemento;

    Celula(Celula prox, Object elemento) {
        this.proxima = prox;
        this.anterior = null;
        this.elemento = elemento;
    }

    Celula(Object elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(Celula prox) {
        this.proxima = prox;
    }

    void setAnterior(Celula ant) {
        this.anterior = ant;
    }

    Celula getProxima() {
        return this.proxima;
    }

    Celula getAnterior() {
        return this.anterior;
    }

    int getElementInt() {
        return (int) this.elemento;
    }
    Object getElement(){
        return this.elemento;
    }
    
}