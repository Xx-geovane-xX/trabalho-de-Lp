/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

<<<<<<< HEAD
import java.util.Date;
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javassist.bytecode.stackmap.BasicBlock;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
>>>>>>> 69a4caa (provinha enviada)
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u05682855140
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetcomp) {
<<<<<<< HEAD
        for (int i = 0; vetcomp.length < 10; i++) {
            vetcomp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            ((JTextField) vetComp[i]).setText("");

        }

=======
        for (int i = 0; i < vetcomp.length; i++) {
            vetcomp[i].setEnabled(valor);
        }
    }
   
    

       public static void limparCampos(JComponent... vetComp) {
        for (JComponent componente : vetComp) {
            if ( componente instanceof JTextField){
                JTextField objeto = (JTextField) componente;
                objeto.setText("");
            } else if ( componente instanceof JComboBox) {
                JComboBox objeto = (JComboBox) componente;
                objeto.setSelectedIndex(-1);
            } else if ( componente instanceof JCheckBox) {
                JCheckBox objeto = (JCheckBox) componente;
                objeto.setSelected(false);
            }
        }
       
>>>>>>> 69a4caa (provinha enviada)
    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean pergunta(String pergunta) {
<<<<<<< HEAD
        JOptionPane.showConfirmDialog(null, pergunta, "Perguntaa", JOptionPane.YES_NO_OPTION);

        return false;
    }

    public static int Strint(String cad) {
        return 0;
    }

    public static String intStr(int num) {
        return "";
    }

    public static double strDouble(String cad) {
        return 0;
    }

    public static String doubleStr(double num) {
        return "";
    }

    public static Date strDate(String car) {
        return null;
    }

    public static String dateStr(String cad) {
        return "";
    }

}
=======

        int innt = JOptionPane.showConfirmDialog(null, pergunta, "Perguntaa", JOptionPane.YES_NO_OPTION);

        if (innt == 1) {
            return true;
        } else if (innt == 0) {
            return false;
        } else {
            return false;
        }

    }

    public static int strInt(String cad) {
        return Integer.valueOf(cad);
    }

    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
        return String.valueOf(num);
    }

    public static Date strDate(String data) {
       try{
           SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
           return formato.parse(data);
    } catch(ParseException ex){
            System.out.println("erro na conversao da data");
            
    }return null;}

    public static String dateStr(java.util.Date data) {
       SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
       return formato.format(data);
      }
}


>>>>>>> 69a4caa (provinha enviada)
