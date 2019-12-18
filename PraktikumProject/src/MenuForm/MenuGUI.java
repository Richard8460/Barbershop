/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class MenuGUI extends MenuKomponen {
    public MenuGUI(){
        JLbarbershop.setBounds(110,20,300,50);
        JLbarbershop.setFont(new Font("Arial",Font.BOLD,20));
        JLnama.setBounds(100,100,100,100);
        JLnama.setFont(new Font("Arial",Font.BOLD,14));
        JLgender.setBounds(100,150,100,100);
        JLgender.setFont(new Font("Arial",Font.BOLD,14));
        JLlayanan.setBounds(100,200,100,100);
        JLlayanan.setFont(new Font("Arial",Font.BOLD,14));
        
        JBcek.setBounds(100,300,237,25);
        
        
       
        
        JTFnama.setBounds(160,140,170,25);
        JTFcek.setBounds(100,350,237,35);
        JTFcek.setFont(new Font("Arial",Font.BOLD,20));
        JTFcek.setEditable(false);
        
        JCBgenderpria.setBounds(160,175,50,50);
        JCBgenderwanita.setBounds(220,175,100,50);
        JCBlayanan.setBounds(160,237,175,25);
        
        JBcek.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.15000");
                }if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.35000");
                }if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.50000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.20000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.45000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.75000");
                }if(JCBgenderpria.isSelected()&&JCBgenderwanita.isSelected()){
                    JOptionPane.showMessageDialog(rootPane,"harap pilih satu gender!");
                }
        }});
        
        
        
//        JTtable.setBounds(20,150,300,200);
//        
//        add(JTtable);
        add(JTFcek);
        add(JBcek);
        add(JLgender);
        add(JLlayanan);
        add(JCBgenderwanita);
        add(JCBgenderpria);
        add(JTFnama);
        add(JLnama);
        add(JCBlayanan);
        add(JLbarbershop);
        setTitle("Project_Barbershop");
        setSize(450,650);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
