/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyearornot;

import javax.swing.JOptionPane;

/**
 *
 * @author khafi
 */
public class LeapYearOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tahun;
        String input;
        
        input = JOptionPane.showInputDialog("Masukkan Tahun");
        tahun = Integer.parseInt(input);
        
        if (tahun%4==0 && tahun%100!=0 || tahun%400==0){
            JOptionPane.showMessageDialog(null, tahun+" adalah merupakan tahun kabisat.");
        }else{
            JOptionPane.showMessageDialog(null, tahun+" adalah bukan tahun kabisat.");
        }
    }
    
}
