/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

<<<<<<< HEAD
import javax.swing.table.AbstractTableModel;

=======
import bean.GasUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


>>>>>>> 69a4caa (provinha enviada)
/**
 *
 * @author u05682855140
 */
<<<<<<< HEAD
public class UsuariosControle extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 1;
=======
public class UsuariosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }

    public GasUsuarios getbean(int linha){
    return (GasUsuarios) lista.get(linha);
        
    }
    
    
    @Override
    public int getRowCount() {
       return lista.size();
>>>>>>> 69a4caa (provinha enviada)
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
<<<<<<< HEAD
        return "";
    }
    
      @Override
    public String getColumnName(int column){
     if (column == 0 )   {
         return "ID";
    }
     if (column == 1 )   {
         return "Nome";
    }
     if (column == 2 )   {
         return "Apelido";
    }
     if (column == 3 )   {
         return "Telefone";
    }
     return null;
=======
        GasUsuarios gasUsuarios = (GasUsuarios) lista.get(rowIndex);
         if(columnIndex == 0){
           return gasUsuarios.getGasIdusuarios();
       } 
         if(columnIndex == 1){
           return gasUsuarios.getGasNome();
       } 
         if(columnIndex == 2){
           return gasUsuarios.getGasApelido();
       } 
         if(columnIndex == 3){
           return gasUsuarios.getGasCpf();
       } 
         
           return "";
    }
    
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == 0){
           return "ID";
       } 
       if(columnIndex == 1){
           return "Nome";
       } 
       if(columnIndex == 2){
           return "Apelido";
       } 
       if(columnIndex == 3){
           return "Cpf";
       } 
       return "";
>>>>>>> 69a4caa (provinha enviada)
    }
}
