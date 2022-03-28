/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinis
 */
public class Circulo {

    private float raio;
    private static final float RAIO_POR_OMISSAO = 0;

    public Circulo() {
        setRaio(RAIO_POR_OMISSAO);
    }

    public Circulo(float raio) {
        setRaio(raio);
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public double calcularArea() {
        return raio * raio * Math.PI;
    }

    public String mostrarDados() {
        return "\nSou um círculo. O meu raio = " + raio + "\n" + "Tenho uma área = " + calcularArea();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nSou um círculo. O meu raio = " + raio);
        sb.append("Tenho uma área = " + calcularArea());
        return sb.toString();
    }
}
