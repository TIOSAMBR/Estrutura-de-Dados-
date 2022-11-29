/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg9;

/**
 *
 * @author Samuel Toledo
 */
public class Aula9 {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("1 Joao Pedro Alcatra", "(64) 99212-4354", "Rua Irineu, n 75, Centro, Paraisopoles", "123.321.213-45");
        Pessoa pessoa2 = new Pessoa("2 Thiago Vinicios Felisberto", "(64) 98123-4675", "Rua Plameiras, n 674, Flora das Aguas, Goianesia-GO", "123.456.432-54");
        Pessoa pessoa3 = new Pessoa("3 Joao Claudio Teodoro", "(11) 3413-7452", "Rua das Camelias, n14321, Vila da folhal, Brasilia", "078.965.666-43");
        Pessoa pessoa4 = new Pessoa("4 Pedro Felipe dos Reis", "(37) 92342-1245", "Rua Dona Florinda, n435, Mato Fundo, Ouro Fino-GO", "102.203.309-12");
        Pessoa pessoa5 = new Pessoa("5 Naruto Uzumaki Pereira", "(24) 98789-0097", "Rua 2, n12, Vila da Folha, Morrinhos-GO", "123.456.789-09");
        Pessoa pessoa6 = new Pessoa("6 Bob Esponja da Silva", "(12) 78078-4567", "Rua Molhada, n23, Fundo do Mar, Goiania-GO", "234.432.123-88");
        Pessoa pessoa7 = new Pessoa("7 Neymar Junior", "(64) 99212-0990", "Rua Rio de Janeiro, n23, Centro, Morrinhos-GO", "456.345.433.13");
        Pessoa pessoa8 = new Pessoa("8 Gustavo Lima Ferreira", "(12)0234-2356", "Avenida 101, n147, Setor Aeroporto, Morrinhos-GO", "089.898.345.12");
        Pessoa pessoa9 = new Pessoa("9 Silvio Santos Filho", "(34) 89788-2457", "Avenida Coronel Pedro Nunes, Centro, Morrinhos-GO", "101.299.444.11");
        Pessoa pessoa10 = new Pessoa("10 Bart Simpson Kant", "3413-2244", "Evergreen Terrace, n632, Springfield, Oregon", "111.222.333-44");
        Pessoa pessoa11 = new Pessoa("11 Pica Pau dos Santos", "1111-0809", "Zona rural", "545.346.554-09");
        Pessoa pessoa12 = new Pessoa("12 Max Steel Lima", "(12) 09879-3455", "Rua das Laranjeiras, n89999999, Setor Verde, Acre", "000.000.111-11");
        Pessoa pessoa13 = new Pessoa("13 Yudi Tamashiro", "4002-8922", "Avenida Central, n233, Centro, Sao Paulo", "446.678.555-12");
        Pessoa pessoa14 = new Pessoa("14 Scooby Doo Fernandes", "(90) 89000-7823", "Rua Cachoro Louco, n66, Zona Sul, Rio de Janeiro", "000.000.000-01");
        Pessoa pessoa15 = new Pessoa("15 Zeus do Olimpo Borges", "0000-0001", "Rua das Nuvens, n1, Setor dos Deuses, Monte Olimpo", "101.010.001-10");
        Pessoa pessoa16 = new Pessoa("16 Cleitin Bom de Guerra", "1111-1111", "Avenida das Dores, n 90, Setor do Conflito, Sparta", "333.333.322-45");
        Pessoa pessoa17 = new Pessoa("17 Peppa Pig Hampshire", "3413-2244", " Rua da Linguica, n69, Setor Sujo, Florida", "098.987.876-65");
        Pessoa pessoa18 = new Pessoa("18 Jhon Mayer Lopes", "(90) 77889-0344", "Rua Florenca, n223, Jardim Romano, Morrinhos-GO", "090.788.435-88");
        Pessoa pessoa19 = new Pessoa("19 Vaquinha Mococa Martins", "4444-4444", "Zona rural", "111.111.111-01");
        Pessoa pessoa20 = new Pessoa("20 Pedro Alvarez Cabral", "000-0011", "Rua Rio de Janeiro, n1, Sao Vicente, Sao Paulo", "000.000.123-05");

        Lista lista = new Lista();

        lista.addFinal(pessoa1);
        lista.addFinal(pessoa2);
        lista.addFinal(pessoa3);
        lista.addFinal(pessoa4);
        lista.addFinal(pessoa5);
        lista.addFinal(pessoa6);
        lista.addFinal(pessoa7);
        lista.addFinal(pessoa8);
        lista.addFinal(pessoa9);
        lista.addFinal(pessoa10);
        lista.addFinal(pessoa11);
        lista.addFinal(pessoa12);
        lista.addFinal(pessoa13);
        lista.addFinal(pessoa14);
        lista.addFinal(pessoa15);
        lista.addFinal(pessoa16);
        lista.addFinal(pessoa17);
        lista.addFinal(pessoa18);
        lista.addFinal(pessoa19);
        lista.addFinal(pessoa20);

        lista.sortear();
        System.out.println(lista.tamanho);

    }
}
