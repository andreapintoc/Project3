/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Asdrubal Rivas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuPrincipal Menu = new MenuPrincipal();
        Menu.setTitle("Menu Principal");
        Menu.setSize(800,700);
        Menu.setResizable(false);
        Menu.setLocationRelativeTo(null);
        Menu.setVisible(true);
    }
}
