/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dinis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primeiro círculo
        System.out.println("Exercício: Sou um Circulo");
        Circulo c1 = new Circulo(4);
        System.out.println(c1.mostrarDados());
        System.out.println(c1.toString());
        
        // Segundo círculo
        System.out.println("Exercício: Sou um Circulo");
        Circulo c2 = new Circulo();
        c2.setRaio(2);
        System.out.println(c2.mostrarDados());
        System.out.println(c2.toString());

    }

}
