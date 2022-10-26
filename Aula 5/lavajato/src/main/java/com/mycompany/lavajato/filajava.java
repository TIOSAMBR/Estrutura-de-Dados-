/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Nathany
 */
public class filajava {
    
        List<carrojava> obj = new ArrayList<>();
    
    void inserir(carrojava carro){
        this.obj.add(carro);
    }
    Object remover(){
        return (this.obj.remove(0));
    }
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
    Object mostrar(int i){
        return this.obj.get(i);
    }
    boolean mostrar(List<carrojava> obj){
        throw  new UnsupportedOperationException("not supported yet.");
    }
}






