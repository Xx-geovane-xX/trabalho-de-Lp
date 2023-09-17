package bean;
// Generated 15/09/2023 09:35:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * GasCompra generated by hbm2java
 */
@Entity
@Table(name="gas_compra"
    ,catalog="db_geovane_silva"
)
public class GasCompra  implements java.io.Serializable {


     private int gasIdcompra;
     private String gasDataCompra;
     private String gasValorTOtal;
     private String gasFormaDePagamento;
     private String gasNumeroDaFatura;
     private Set gasCompraProdutos = new HashSet(0);

    public GasCompra() {
    }

	
    public GasCompra(int gasIdcompra) {
        this.gasIdcompra = gasIdcompra;
    }
    public GasCompra(int gasIdcompra, String gasDataCompra, String gasValorTOtal, String gasFormaDePagamento, String gasNumeroDaFatura, Set gasCompraProdutos) {
       this.gasIdcompra = gasIdcompra;
       this.gasDataCompra = gasDataCompra;
       this.gasValorTOtal = gasValorTOtal;
       this.gasFormaDePagamento = gasFormaDePagamento;
       this.gasNumeroDaFatura = gasNumeroDaFatura;
       this.gasCompraProdutos = gasCompraProdutos;
    }
   
     @Id 

    
    @Column(name="gas_idcompra", unique=true, nullable=false)
    public int getGasIdcompra() {
        return this.gasIdcompra;
    }
    
    public void setGasIdcompra(int gasIdcompra) {
        this.gasIdcompra = gasIdcompra;
    }

    
    @Column(name="gas_data_compra", length=45)
    public String getGasDataCompra() {
        return this.gasDataCompra;
    }
    
    public void setGasDataCompra(String gasDataCompra) {
        this.gasDataCompra = gasDataCompra;
    }

    
    @Column(name="gas_valor t_otal", length=45)
    public String getGasValorTOtal() {
        return this.gasValorTOtal;
    }
    
    public void setGasValorTOtal(String gasValorTOtal) {
        this.gasValorTOtal = gasValorTOtal;
    }

    
    @Column(name="gas_forma_de_pagamento", length=45)
    public String getGasFormaDePagamento() {
        return this.gasFormaDePagamento;
    }
    
    public void setGasFormaDePagamento(String gasFormaDePagamento) {
        this.gasFormaDePagamento = gasFormaDePagamento;
    }

    
    @Column(name="gas_numero_da_fatura", length=45)
    public String getGasNumeroDaFatura() {
        return this.gasNumeroDaFatura;
    }
    
    public void setGasNumeroDaFatura(String gasNumeroDaFatura) {
        this.gasNumeroDaFatura = gasNumeroDaFatura;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="gasCompra")
    public Set getGasCompraProdutos() {
        return this.gasCompraProdutos;
    }
    
    public void setGasCompraProdutos(Set gasCompraProdutos) {
        this.gasCompraProdutos = gasCompraProdutos;
    }




}


