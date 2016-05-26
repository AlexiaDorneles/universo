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
public class Purgatorio {
    
    public void julgar(Falante julgado){
        if(julgado.falar() == true){
            System.out.printf("%s é um %s e fala verdade!\n", julgado.getNome(), julgado.getClass().getName().replaceAll("universo.", ""));
        }else{
            System.out.printf("%s é um %s e fala mentira!\n", julgado.getNome(), julgado.getClass().getName().replaceAll("universo.", ""));
        }
    }
}
