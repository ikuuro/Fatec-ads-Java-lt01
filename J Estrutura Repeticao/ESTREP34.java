/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT01_ESTREP34 {
    public static void main (String[]args){
            
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
       
       tabuada(numero);
        
    }
     public static void tabuada(int numero){
            for (int i=1 ; i <= 10; i ++){
                int resultado = i * numero;
                JOptionPane.showMessageDialog(null,i +"x"+numero+"="+resultado);
            }
          
        }
     
     
    
}
