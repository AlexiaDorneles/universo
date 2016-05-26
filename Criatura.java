/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universo;

/**
 *
 * @author marcelo
 */
public abstract class Criatura{
    private String nome;
    
    public final void setNome(String nome){
        if(nome.equalsIgnoreCase("deus")){
            throw new IllegalArgumentException("Nao deveras possuir meu nome!");
        }
        this.nome = nome;
    }
    
    public final String getNome(){
        return this.nome;
    }
}
