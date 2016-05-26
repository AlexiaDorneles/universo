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
public class Universo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Purgatorio purgatorio = new Purgatorio();
        Animal animal = new Animal();
        Humano humano = new Humano();
        Humano humano2 = new Humano();
        Anjo anjo = new Anjo();
        
        humano.setFala(false);
        humano.setFala(true);
        
        try{
            animal.setNome("Gato Preto");
            humano.setNome("Pink");
            humano2.setNome("Floyd");
            anjo.setNome("Lucifer");
            //animal.setNome("deus"); Por que da erro?
            
            System.out.println("O nome do animal é "+animal.getNome());
            //purgatorio.julgar(animal); Por que da erro?
            purgatorio.julgar(humano);
            purgatorio.julgar(anjo);
            
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage()); //Pesquise de onde vem o getMessage()
        }
    }
    
}
