/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dinis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primeiro Utente
        System.out.println("Utente 1");
        Utente u1 = new Utente();
        
        u1.setNome("Dinis");
        u1.setGenero("Masculino");
        u1.setIdade(19);
        u1.setAltura((float) 1.75);
        u1.setPeso(85);
        
        System.out.println(u1.toString());
        System.out.print("IMC: ");
        System.out.println(u1.imc());
        System.out.print("Grau de obesidade: ");
        System.out.println(u1.grau());
        
        System.out.println("");
        
        //Segundo Utente
        System.out.println("Utente 2");
        Utente u2 = new Utente("Ana", "Feminino", 20, 63, (float) 1.60);
        
        System.out.println(u2.toString());
        System.out.print("IMC: ");
        System.out.println(u2.imc());
        System.out.print("Grau de obesidade: ");
        System.out.println(u2.grau());
        
        System.out.println("");
        System.out.print("Diferença de anos: ");
        System.out.println(u2.dif_idade(u1.getIdade()));
        System.out.print("Utente mais novo: ");
        System.out.println(u2.mais_novo(u1.getIdade(), u1.getNome()));
        System.out.print("Quantidade de utentes: ");
        System.out.println(Utente.count);
    }
    
}
