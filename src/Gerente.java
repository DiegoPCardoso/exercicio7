/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Gerente extends Funcionario{
    private String nomeDepartamento;

    public Gerente(String nd, String n, String m) {
        super(n, m);
        this.nomeDepartamento = nd;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nd) {
        this.nomeDepartamento = nd;
    }
    
}
