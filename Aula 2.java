public class App {

    public static void main(String[] args) {
        System.out.println("1---  Raiz 64 : " + Math.sqrt(64));
        
        Double a = (Math.exp(0.5 * Math.log(64)));
        int b = (int) Math.round(a);

        System.out.println("2---  Raiz com exp, log e realint: h " + b);
        System.out.println("3---  Raiz com exp e log sem realint: h " +  Math.exp(0.5 * Math.log(64)));
        
        Double a1 = Math.sin(45*3.14/180 + 0.0001)*10000*0.1;
        
        System.out.println("4---  Formatar "+ Math.ceil(a1)*0.001);

        Double a2 =Math.floor(Math.exp(3*Math.log(8) + 0.001))*1000;
        
             
        System.out.println("5---  Potencia com exp e log formatando: " + a2*0.001);
        System.out.println("6---  Potencia com exp e log sem formatar: " + Math.exp(3*Math.log(8)));
        System.out.println("7---  Potencia com operador ** e formatar: ");
        System.out.println("8---  Raiz cubica " + Math.exp(1/3 * Math.log(8)));
        System.out.println("9---  Absoluto " + Math.abs(-8));
        System.out.println("10--- Absoluto " + Math.abs(8));
        System.out.println("11--- Convertendo para Inteiro: 5.5 " + Math.round(5.5));
        System.out.println("12--- Convertendo para Inteiro: 6.5 " + (int )Math.floor(6.5));
        System.out.println("13--- Convertendo para Inteiro: 6.5 + 0.0001: " + Math.round(6.5 + 0.0001));
        System.out.println("14--- Convertendo para Inteiro: 5.45 " + Math.round(5.45));
        System.out.println("15--- Convertendo para Inteiro: 5.51 " + Math.round(5.51));
        System.out.println("16--- Convertendo para Real 87: " + Double.parseDouble("87"));
        System.out.println("17--- Convertendo pata Inteiro 3/4: " + Math.round(0.75));
    }
    
    
}
