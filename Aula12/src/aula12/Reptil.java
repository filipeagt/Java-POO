/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author filipe
 */
public class Reptil extends Animal {
    //Atributo
    private String corEscama;
    
    //Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Métodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
}
