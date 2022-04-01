/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_complementar;

/**
 *
 * @author dinis
 */
public class Ponto {

    private int x, y;
    private static final int ABCISSA_POR_OMISSAO = 0;
    private static final int ORDENADA_POR_OMISSAO = 0;

    /**
     * Construtor sem parâmetos.
     */
    public Ponto() {
        setPonto(ABCISSA_POR_OMISSAO, ORDENADA_POR_OMISSAO);
    }

    /**
     * Construtor com dois parâmetros.
     *
     * @param a Abcissa
     * @param b Ordenada
     */
    public Ponto(int a, int b) {
        setPonto(a, b);
    }

    /**
     * Altera as coordenadas de um ponto.
     *
     * @param a nova abcissa
     * @param b nova ordenada
     */
    public void setPonto(int a, int b) {
        x = a;
        y = b;
    }

    /**
     * Obtem valor da abcissa.
     *
     * @return abcissa
     */
    public int getX() {
        return x;
    }

    /**
     * Obtem valor da ordenada.
     *
     * @return ordenada
     */
    public int getY() {
        return y;
    }

    /**
     * Descreve as coordenadas de um ponto.
     *
     * @return descrição
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Determinda se um ponto tem ambas as coordenadas positivas.
     *
     * @return true ou false
     */
    public boolean coordenadasPositivas() {
        return x > 0 && y > 0;
    }

    /**
     * Calcula e devolve a distância entre dois pontos.
     *
     * @param ponto q
     * @return distância
     */
    public double calcularDistancia(Ponto q) {
        Ponto p = this;
        return Math.sqrt(Math.pow((p.x - q.x), 2) + Math.pow((p.y - q.y), 2));
    }
    
    /**
     * Calcula e devolve a distância entre dois pontos.
     *
     * @param ponto q
     * @return distância
     */
    public double calcularDistanciaZero(Ponto q) {
        Ponto p = this;
        return Math.sqrt(Math.pow((p.x - 0), 2) + Math.pow((p.y - 0), 2));
    }
    
    public Ponto maisProximoDaOrigem(Ponto [] vec){
        if (calcularDistanciaZero(vec[0]) < calcularDistanciaZero(vec[1])) {
            return vec[0];
        }else{
            return vec[1];
        }
    }
}
