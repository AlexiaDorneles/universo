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
public class Humano extends Criatura implements Falante{
    private boolean fala;
    
    public void setFala(boolean fala){
        this.fala = fala;
    }
    
    @Override
    public boolean falar() {
        return fala;
    }
    
}
