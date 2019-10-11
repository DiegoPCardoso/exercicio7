/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class AssistenteAdministrativo extends Funcionario {
    private double adicionalNoturno;

    public AssistenteAdministrativo(double an, String n, String m) {
        super(n, m);
        this.adicionalNoturno = an;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double an) {
        this.adicionalNoturno = an;
    }
    
}
