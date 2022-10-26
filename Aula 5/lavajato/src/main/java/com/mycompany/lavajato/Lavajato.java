/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lavajato;
import javax.swing.JOptionPane;
/**
 *
 * @author Samuel Toledo
 */
public class Lavajato {

    private static int i;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Bem vindo a lavafast");
        
        filajava F1 = new filajava();
        filajava F2 = new filajava();
        
        int lav = 0;
        
        carrojava C = new carrojava();
        
        Object obj = new Object();
        
        for(int i = 1; i<16; i++);{
        
        carrojava ent = new carrojava();
        
        ent.modelo = JOptionPane.showInputDialog("Modelo");
        ent.identificacao = Integer.parseInt(JOptionPane.showInputDialog("Identificacao"));
        ent.cor = JOptionPane.showInputDialog("Cor");
        
        System.out.println("Entrando na fila para lavar: \n");
        F1.inserir(ent);
        
        System.out.println("Modelo:" +ent.modelo);
        System.out.println("Identificacao:" +ent.identificacao);
        System.out.println("Cor:" +ent.cor);
        System.out.println("---------------------------------");
          
        if(i % 3 == 0){
            if(F1.fila_vazia()){
               System.out.println("A fila esta vazia");
            }else{
              
                System.out.println("Veiculo lavado - Indo pra fila dos lavados: \n");
                obj = F1.remover();
                
                C = (carrojava) obj;
                
               F2.inserir(C);
                System.out.println("Modelo:" +C.modelo);
                System.out.println("Identificacao:" +C.identificacao);
                System.out.println("Cor:" +C.cor);
                lav ++;
                System.out.println("------------------------------");
               
            }
        }
    }
    }
}

  
