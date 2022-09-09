/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

import java.util.Date;

/**
 *
 * @author user
 */
public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor() {
        super();
    }

    public float calcularSalario() {
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

}
