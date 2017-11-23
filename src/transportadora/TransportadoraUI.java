/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicLookAndFeel;
import transportadora.veiculos.Furgao;

/**
 *
 * @author Wesley
 */
public class TransportadoraUI extends javax.swing.JFrame {
    
    AddCidade novaCidade = new AddCidade();
    ViagemSaida novaViagem = new ViagemSaida();
    AddMotorista adicionarMotorista = new AddMotorista();
    Icon erroIcone = new ImageIcon(getToolkit().createImage(getClass().getResource("/transportadora/images/Erro.png")));

    /**
     * Creates new form TransportadoraUI
     */
    public TransportadoraUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMotoristaBotao = new javax.swing.JButton();
        addAuxiliarBotao = new javax.swing.JButton();
        addViagemBotao = new javax.swing.JButton();
        emitirRelatorioBotao = new javax.swing.JButton();
        visualizarAuxiliaresBotao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        adicioanarCidadeEstado = new javax.swing.JButton();
        visualizarMotoristasBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);
        setMinimumSize(new java.awt.Dimension(888, 631));
        setResizable(false);
        getContentPane().setLayout(null);

        addMotoristaBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        addMotoristaBotao.setForeground(new java.awt.Color(235, 235, 235));
        addMotoristaBotao.setText("Adicionar motorista");
        addMotoristaBotao.setBorder(addAuxiliarBotao.getBorder());
        addMotoristaBotao.setOpaque(false);
        addMotoristaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMotoristaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(addMotoristaBotao);
        addMotoristaBotao.setBounds(90, 110, 180, 50);

        addAuxiliarBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        addAuxiliarBotao.setForeground(new java.awt.Color(235, 235, 235));
        addAuxiliarBotao.setText("Adicionar auxiliar");
        addAuxiliarBotao.setOpaque(false);
        getContentPane().add(addAuxiliarBotao);
        addAuxiliarBotao.setBounds(90, 160, 180, 50);

        addViagemBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        addViagemBotao.setForeground(new java.awt.Color(235, 235, 235));
        addViagemBotao.setText("Adicionar viagem");
        addViagemBotao.setOpaque(false);
        addViagemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addViagemBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(addViagemBotao);
        addViagemBotao.setBounds(90, 210, 180, 50);

        emitirRelatorioBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        emitirRelatorioBotao.setForeground(new java.awt.Color(235, 235, 235));
        emitirRelatorioBotao.setText("Emitir relatório");
        emitirRelatorioBotao.setOpaque(false);
        getContentPane().add(emitirRelatorioBotao);
        emitirRelatorioBotao.setBounds(90, 410, 180, 50);

        visualizarAuxiliaresBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        visualizarAuxiliaresBotao.setForeground(new java.awt.Color(235, 235, 235));
        visualizarAuxiliaresBotao.setText("Visualizar auxiliares");
        visualizarAuxiliaresBotao.setOpaque(false);
        visualizarAuxiliaresBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarAuxiliaresBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(visualizarAuxiliaresBotao);
        visualizarAuxiliaresBotao.setBounds(90, 310, 180, 50);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(235, 235, 235));
        jButton1.setText("Visualizar viagens");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 360, 180, 50);

        adicioanarCidadeEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adicioanarCidadeEstado.setForeground(new java.awt.Color(235, 235, 235));
        adicioanarCidadeEstado.setText("Add Cidade / Estado");
        adicioanarCidadeEstado.setOpaque(false);
        adicioanarCidadeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicioanarCidadeEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(adicioanarCidadeEstado);
        adicioanarCidadeEstado.setBounds(90, 460, 180, 50);

        visualizarMotoristasBotao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        visualizarMotoristasBotao.setForeground(new java.awt.Color(235, 235, 235));
        visualizarMotoristasBotao.setText("Visualizar motoristas");
        visualizarMotoristasBotao.setOpaque(false);
        visualizarMotoristasBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarMotoristasBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(visualizarMotoristasBotao);
        visualizarMotoristasBotao.setBounds(90, 260, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transportadora/images/mainWallpaper01.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 890, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addViagemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addViagemBotaoActionPerformed
        ViagemSaida.seletorDeMotorista.removeAllItems();
        ViagemSaida.seletorDeCidade.removeAllItems();
        ViagemSaida.seletorDeEstado.removeAllItems();
        
        for (int i = 0; i < AddMotorista.motoristas.size(); i++) {
            
            ViagemSaida.seletorDeMotorista.addItem(AddMotorista.motoristas.get(i).getNome());
        }

        for (int i = 0; i < AddCidade.estado.size(); i++) {
            ViagemSaida.seletorDeEstado.addItem(AddCidade.estado.get(i).getNome());

        }

        novaViagem.setVisible(true);


    }//GEN-LAST:event_addViagemBotaoActionPerformed

    private void addMotoristaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMotoristaBotaoActionPerformed
//       if(trigger == 0){
        adicionarMotorista.setVisible(true);
        //      }
        //    trigger = 1;
    }//GEN-LAST:event_addMotoristaBotaoActionPerformed

    private void visualizarAuxiliaresBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarAuxiliaresBotaoActionPerformed
        for (int i = 0; i < AddAuxiliarUI.auxiliares.size(); i++) {

            JOptionPane.showMessageDialog(null, "Nome: " + AddAuxiliarUI.auxiliares.get(i).getNome() + "\n" + "CPF: " + AddAuxiliarUI.auxiliares.get(i).getCpf());
        }
    }//GEN-LAST:event_visualizarAuxiliaresBotaoActionPerformed

    private void adicioanarCidadeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicioanarCidadeEstadoActionPerformed
        novaCidade.setVisible(true);
    }//GEN-LAST:event_adicioanarCidadeEstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       for(int i = 0; i < ViagemSaida.viagens.size(); i++){
        JOptionPane.showMessageDialog(null, "\nData de Saída: " + ViagemSaida.viagens.get(i).getSaida() +  "\nPeso: " + ViagemSaida.viagens.get(i).getPeso() + "\nVolume: " + ViagemSaida.viagens.get(i).getVolume() + "\nMotorista: " + ViagemSaida.viagens.get(i).motorista.getNome());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void visualizarMotoristasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarMotoristasBotaoActionPerformed
        for (int i = 0; i < AddMotorista.motoristas.size(); i++) {

            JOptionPane.showMessageDialog(null, AddMotorista.motoristas.get(i).getNome());
        }
    }//GEN-LAST:event_visualizarMotoristasBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                BasicLookAndFeel darcula = new DarculaLaf();
             //   if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(darcula);
                  //  break;
               // }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransportadoraUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addAuxiliarBotao;
    public static javax.swing.JButton addMotoristaBotao;
    public static javax.swing.JButton addViagemBotao;
    public static javax.swing.JButton adicioanarCidadeEstado;
    public static javax.swing.JButton emitirRelatorioBotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JButton visualizarAuxiliaresBotao;
    public static javax.swing.JButton visualizarMotoristasBotao;
    // End of variables declaration//GEN-END:variables
}