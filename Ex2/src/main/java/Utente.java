/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinis
 */
public class Utente {

    public static int count=0;  
    private String nome, genero;
    private int idade, peso;
    private float altura;
    
    private static final String NOME_POR_OMISSAO = "Sem Nome", GENERO_POR_OMISSAO = "";
    private static final int IDADE_POR_OMISSAO = 0, PESO_POR_OMISSAO = 0;
    private static final float ALTURA_POR_OMISSAO = 0;

    public Utente() {
        setNome(NOME_POR_OMISSAO);
        setGenero(GENERO_POR_OMISSAO);
        setIdade(IDADE_POR_OMISSAO);
        setPeso(PESO_POR_OMISSAO);
        setAltura(ALTURA_POR_OMISSAO);
        count++;
    }

    public Utente(String nome, String genero, int idade) {
        setNome(nome);
        setGenero(genero);
        setIdade(idade);
        count++;
    }

    public Utente(String nome, String genero, int idade, int peso, float altura) {
        setNome(nome);
        setGenero(genero);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
        count++;
    }

    //Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //Gênero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    //Idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    //Peso
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    //Altura
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    //Descrição
    public String toString() {
        return "Nome: " + getNome() + "\nGênero: " + getGenero() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura() + "\nPeso: " + getPeso();
    }

    //IMC
    public float imc() {
        return (peso / (altura * altura));
    }

    //Grau de obesidade
    public String grau() {
        if (imc() <= 19) {
            return "Abaixo do peso normal";
        } else if (imc() <= 25 && imc() > 19) {
            return "Peso normal";
        } else if (imc() <= 30 && imc() > 25) {
            return "Excesso de peso";
        } else {
            return "Obeso";
        }
    }

    //Diferença de idade
    public int dif_idade(Utente outroUtente) {
        return this.idade - outroUtente.idade;
    }
    
    //Utente mais novo
    public String mais_novo(Utente outroUtente) {
        if (outroUtente.idade < this.idade) {
            return outroUtente.nome;
        }else{
            return this.nome;
        }
    }
}
