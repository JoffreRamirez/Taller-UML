/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

/**
 *
 * @author User
 */
public class Doctor extends Persona {
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    
    
    
    public void recetar(){
        
    }
    public void agregarPlanNut(){
        
    }
    public void registraSecretaria(Secretaria secretaria){
        this.secretaria=secretaria;
        
    }
    
}
