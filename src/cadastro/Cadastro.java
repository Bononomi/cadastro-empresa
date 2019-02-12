/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import javax.swing.JFrame;

/**
 *
 * @author Aluno
 */
public class Cadastro {

   
    public static void main(String[] args) {
        JFrame janela = new JFrame ("Cadastro de Empresa");
        TelaCadastro painel = new TelaCadastro();
        
        
        //Define atributos da tela
        
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(650, 600);
        janela.add(painel);
        janela.setVisible(true);
    }
    
}
