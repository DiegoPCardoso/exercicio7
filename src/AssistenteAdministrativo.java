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
    private Gerente supervisor;

    public AssistenteAdministrativo( String n, String m, double an, Gerente s) {
        super(n, m);
        this.adicionalNoturno = an;
        this.supervisor = s;
    }

    

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double an) {
        this.adicionalNoturno = an;
    }

    public Gerente getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Gerente supervisor) {
        this.supervisor = supervisor;
    }
    
}
