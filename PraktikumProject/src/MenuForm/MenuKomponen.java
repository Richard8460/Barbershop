/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;

import javax.swing.*;
/**
 *
 * @author Acer
 */
public class MenuKomponen extends JFrame{
    MenuLayanan objMenuLayanan = new MenuLayanan();
    
    JLabel JLbarbershop = new JLabel ("===BARBERSHOP===");
    JLabel JLnama = new JLabel ("Nama");
    JLabel JLgender = new JLabel ("Gender");
    JLabel JLlayanan = new JLabel("Layanan");
    
    JButton JBcek = new JButton("cek");

    JTextField JTFnama = new JTextField();
    JTextField JTFcek = new JTextField();
    
    
    JCheckBox JCBgenderpria = new JCheckBox("Pria");
    JCheckBox JCBgenderwanita = new JCheckBox("Wanita");
    
    
    JComboBox JCBlayanan = new JComboBox(objMenuLayanan.getBox());
    
//    String[] columnName ={"Nama","Gender","Layanan","Harga"};
//    String[][] data
//    JTable JTtable = new JTable(data,columnName);
}
