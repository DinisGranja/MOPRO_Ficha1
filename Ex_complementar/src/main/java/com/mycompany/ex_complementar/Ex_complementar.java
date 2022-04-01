/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ex_complementar;

/**
 *
 * @author dinis
 */
public class Ex_complementar {

    public static void main(String[] args) {

        Ponto q = new Ponto(10, 100);
        
        Ponto p = new Ponto(3, 4);
        
        Ponto vec[] = new Ponto[2];
        
        vec[0]=q;
        vec[1]=p;

        System.out.println(p.coordenadasPositivas());
        System.out.println(q.coordenadasPositivas());
        System.out.println(p.calcularDistancia(q));
        
        //Calcular o ponto mais próximo da Origem
        System.out.println(p.maisProximoDaOrigem(vec));
        
        
    }
}
