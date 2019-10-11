/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class testaEmpresa {
    public static void main(String[] args) {
        
        Gerente g1=new Gerente("Diego","123","Tecnico");
        
        AssistenteTecnico AT1 = new AssistenteTecnico("Bruna","124",100,g1);
        
        Gerente g2=new Gerente("Tiago","125","Administrativo");
        
        AssistenteAdministrativo AM = new AssistenteAdministrativo("Carol","126",100,g2);
        
           
        
    }
    
}
