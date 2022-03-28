/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinis
 */
public class Circulo {
    private static float raio;

    public static float getRaio() {
        return raio;
    }

    public static void setRaio(float r) {
        raio = r;
    }

    public static double calcularArea() {
        return raio * raio * Math.PI;
    }

    public static String mostrarDados() {
        return "\n Sou um círculo. O meu raio = " + raio + "\n" + "Tenho uma área = " + calcularArea();
    }
}
