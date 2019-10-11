/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class AssistenteTecnico extends Funcionario{
    private double bonus;
    private Gerente supervisor;

    public AssistenteTecnico( String n, String m, double b, Gerente s) {
        super(n, m);
        this.bonus = b;
        this.supervisor = s;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }

    public Gerente getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Gerente s) {
        this.supervisor = s;
    }
    
}
