/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaCadastro extends javax.swing.JPanel {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        
        //CAIXA DE SELEÇÃO ESTADOS DO BRASIL // 
        comboBoxUF.addItem("AC");
        comboBoxUF.addItem("AL");
        comboBoxUF.addItem("AP");
        comboBoxUF.addItem("AM");
        comboBoxUF.addItem("BA");
        comboBoxUF.addItem("CE");
        comboBoxUF.addItem("DF");
        comboBoxUF.addItem("ES");
        comboBoxUF.addItem("GO");
        comboBoxUF.addItem("MA");
        comboBoxUF.addItem("MT");
        comboBoxUF.addItem("MS");
        comboBoxUF.addItem("MG");
        comboBoxUF.addItem("PA");
        comboBoxUF.addItem("PB");
        comboBoxUF.addItem("PR");
        comboBoxUF.addItem("PE");
        comboBoxUF.addItem("RJ");
        comboBoxUF.addItem("RN");
        comboBoxUF.addItem("RS");
        comboBoxUF.addItem("RO");
        comboBoxUF.addItem("RR");
        comboBoxUF.addItem("SC");
        comboBoxUF.addItem("SE");
        comboBoxUF.addItem("TO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEmpresa = new javax.swing.JLabel();
        labelCNPJ = new javax.swing.JLabel();
        labelIE = new javax.swing.JLabel();
        labelDataCadastro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpEmpresa = new javax.swing.JTextField();
        cpIE = new javax.swing.JTextField();
        cpCNPJ = new javax.swing.JFormattedTextField();
        cpDataCadastro = new javax.swing.JFormattedTextField();
        labelCidade = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        comboBoxUF = new javax.swing.JComboBox<>();
        labelEndereco = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        cpEndereco = new javax.swing.JTextField();
        cpNumero = new javax.swing.JTextField();
        cpCidade = new javax.swing.JTextField();
        cpBairro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelEmail = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        cpEmail = new javax.swing.JTextField();
        cpTelefone = new javax.swing.JFormattedTextField();
        cpCelular = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelResponsavel = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        labelCelularResponsavel = new javax.swing.JLabel();
        labelRenda = new javax.swing.JLabel();
        cpResponsavel = new javax.swing.JTextField();
        cpRenda = new javax.swing.JTextField();
        cpCPF = new javax.swing.JFormattedTextField();
        cpCelularResponsavel = new javax.swing.JFormattedTextField();
        labelInstagram = new javax.swing.JLabel();
        labelFacebook = new javax.swing.JLabel();
        cpInstagram = new javax.swing.JTextField();
        cpFacebook = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        labelCEP = new javax.swing.JLabel();
        cpCEP = new javax.swing.JFormattedTextField();

        labelEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEmpresa.setText("Empresa: ");

        labelCNPJ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCNPJ.setText("CNPJ:");

        labelIE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelIE.setText("Inscrição Estadual:");

        labelDataCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelDataCadastro.setText("Data de Cadastro:");

        try {
            cpCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpCNPJActionPerformed(evt);
            }
        });

        try {
            cpDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDataCadastroActionPerformed(evt);
            }
        });

        labelCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCidade.setText("Cidade:");

        labelNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNumero.setText("Nº");

        comboBoxUF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF" }));
        comboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUFActionPerformed(evt);
            }
        });

        labelEndereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEndereco.setText("Endereço:");

        labelBairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBairro.setText("Bairro:");

        labelEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEmail.setText("Email: ");

        labelCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCelular.setText("Celular:");

        labelTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone:");

        try {
            cpTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelResponsavel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelResponsavel.setText("Responsável: ");

        labelCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCPF.setText("CPF do Responsável: ");

        labelCelularResponsavel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCelularResponsavel.setText("Celular do Responsável:");

        labelRenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelRenda.setText("Renda:");

        try {
            cpCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCelularResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelInstagram.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelInstagram.setText("Link do Instagram");

        labelFacebook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelFacebook.setText("Link do Facebook");

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labelCEP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCEP.setText("CEP: ");

        try {
            cpCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelInstagram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(labelRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFacebook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCelularResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpCelularResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelEmpresa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cpEmpresa))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelIE, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cpIE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelCNPJ)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cpCNPJ))))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelCEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelBairro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpBairro))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelEndereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cpEmail))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelCelular)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpresa)
                    .addComponent(cpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCNPJ)
                    .addComponent(cpCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIE)
                    .addComponent(cpIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCadastro)
                    .addComponent(cpDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEP)
                    .addComponent(labelNumero)
                    .addComponent(cpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(labelBairro)
                    .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(cpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelCelular)
                    .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResponsavel)
                    .addComponent(labelRenda)
                    .addComponent(cpResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(labelCelularResponsavel)
                    .addComponent(cpCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCelularResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInstagram)
                    .addComponent(cpInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFacebook)
                    .addComponent(cpFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataCadastroActionPerformed

    private void cpCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpCNPJActionPerformed

    private void comboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxUFActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "CAMPOS PREENCHIDOS CORRETAMENTE");
            JOptionPane.showMessageDialog(null, comboBoxUF.getSelectedItem());
            }    }//GEN-LAST:event_btnSalvarActionPerformed
        
        // VALIDAÇÃO DE CAMPOS //
        private boolean validarCampos() {
        CPFValidator validator = new CPFValidator();

        try {
           
           
            String empresa = cpEmpresa.getText();
            String cnpj = cpCNPJ.getText();
            String telefone = cpTelefone.getText();
            String IE = cpIE.getText();
            String data = cpDataCadastro.getText();
            String endereco = cpEndereco.getText();
            String n = cpNumero.getText();
            String cidade = cpCidade.getText();
            String bairro = cpBairro.getText();
            

            if (empresa.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Empresa!");
                return false;       
            } 
             
            cnpj = cnpj.replaceAll(" . ", "");
            cnpj = cnpj.replaceAll("/", "");
            cnpj = cnpj.replaceAll("-", "");
             if (cnpj.trim().equals("")){
                JOptionPane.showMessageDialog(null, "Informe o CNPJ!");
                return false;
            }
             
            if (IE.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Inscrição Estadual!");
                return false;       
            } 
            
            data = data.replaceAll(" / ", "");
            if (data.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Data do Cadastro!");
                return false;       
            } 
            
            if (endereco.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Endereço!");
                return false;       
            } 
            
            if (n.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Número!");
                return false;       
            } 
            
            if (cidade.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Cidade!");
                return false;       
            } 
            
            if (bairro.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Bairro!");
                return false;       
            } 
            
            
 
           // validator.assertValid(cpCPF.getText());
             
            
            telefone = telefone.replaceAll(" ","");
            telefone = telefone.replaceAll("-","");
                        
            if (telefone.trim().equals("") || telefone.trim().equals("()")){
                JOptionPane.showMessageDialog(null, "Informe o telefone!");
                return false;
            } 
    
            
          if (comboBoxUF.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione a UF!");
            return false;
          } else {
            return true;
          }
           
            
        } catch (InvalidStateException e) { // exception lançada quando o documento é inválido
            JOptionPane.showMessageDialog(null, "CPF INVÁLIDO!");
            return false;
        }

        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxUF;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JFormattedTextField cpCEP;
    private javax.swing.JFormattedTextField cpCNPJ;
    private javax.swing.JFormattedTextField cpCPF;
    private javax.swing.JFormattedTextField cpCelular;
    private javax.swing.JFormattedTextField cpCelularResponsavel;
    private javax.swing.JTextField cpCidade;
    private javax.swing.JFormattedTextField cpDataCadastro;
    private javax.swing.JTextField cpEmail;
    private javax.swing.JTextField cpEmpresa;
    private javax.swing.JTextField cpEndereco;
    private javax.swing.JTextField cpFacebook;
    private javax.swing.JTextField cpIE;
    private javax.swing.JTextField cpInstagram;
    private javax.swing.JTextField cpNumero;
    private javax.swing.JTextField cpRenda;
    private javax.swing.JTextField cpResponsavel;
    private javax.swing.JFormattedTextField cpTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCelularResponsavel;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataCadastro;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFacebook;
    private javax.swing.JLabel labelIE;
    private javax.swing.JLabel labelInstagram;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRenda;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
}
