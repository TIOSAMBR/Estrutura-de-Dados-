import javax.swing.JOptionPane;

public class Pilha {
    String[] pilha1 = new String[25];
    String resultado = "";
    int topoPilha1 = -1;


    void push(int topo){
        String y = JOptionPane.showInputDialog(null, "Digite o numero de frases que vai digitar!");
        int x = Integer.parseInt(y);

        for(int i = x -1; i>=0; i--){
            this.topoPilha1 = topo;
            this.topoPilha1++;

            if(this.topoPilha1<0){
                this.topoPilha1 = 0;
            }

            if(this.topoPilha1>24){
                JOptionPane.showMessageDialog(null, "Estouro de pilha1, Erro 9010");
                this.topoPilha1--;
            }else {
                String text = JOptionPane.showInputDialog(null, "Digite o texto desejado!");
                this.pilha1[this.topoPilha1] = text;

                for(int j = text.length() - 1; j >= 0; j--){
                    resultado += text.charAt(j);
                }
                resultado += " "; 
            }
        }
        System.out.println(resultado);
    }
}
