/*vfvf
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import desplazable.Desface;
import interfaces.PanelRound;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTable;


public class mover {
    Desface desplace;
    
    public mover(){
        desplace = new Desface();
    }
    

    
    public void realizarMov(JPanel menu){
        if (menu.getX() == 0) {
            desplace.desplazarIzquierda(menu, menu.getX(), -170, 10, 10);
        } else if (menu.getX() == -170) {
            desplace.desplazarDerecha(menu, menu.getX(), 0, 10, 10);
        }
    }
    
    public void gestionarPnl(JPanel panel,JPanel[] arr) {
        panel.setVisible(true);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i].setVisible(false);
        }
    }
    
    public void gestionarTables(JTable[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            arr[i].getTableHeader().setOpaque(false);
            arr[i].getTableHeader().setBackground(new Color(255,255,255));
            arr[i].getTableHeader().setForeground(new Color(255,255,255));
            arr[i].setRowHeight(20);
        }
    }
    
}
