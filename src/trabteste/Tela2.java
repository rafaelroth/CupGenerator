/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author solange
 */
public class Tela2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Tela2() {
        initComponents();
        this.setSize(510, 335);
        Participantes.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 260, 70, 30);

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 100, 100, 30);

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 150, 100, 30);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(321, 260, 80, 30);

        jButton5.setText("Ver Participantes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 260, 140, 30);

        jTextField1.setText("Mata-Mata");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 50, 160, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 100, 160, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 150, 210, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(120, 210, 330, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 70, 14);

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome dos participantes :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 170, 14);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Escolha aqui as configurações do seu campeonato");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 500, 14);

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Remover time :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 150, 110, 14);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Diretório: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 210, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabteste/WhatsApp Image 2017-09-12 at 23.25.53.jpeg"))); // NOI18N
        jLabel2.setText("Adicionar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Array que salva os participantes
    public static ArrayList<String> Participantes = new ArrayList();
    public static String diretorio;


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*este botão adicionara o conteudo do jTextField2 a um array do tipo string
        contido nas funçoes*/
        //*******************código**********************************
        if (Participantes.size() < 17) {
            Participantes.add(jTextField2.getText());
            jTextField2.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Não é possível adicionar mais de 16 participantes");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //esse botão remove algum time digitado anteriormente
        //********************código************************************
        if (Participantes.size() > 0) {
            Participantes.remove(jTextField3.getText());
            jTextField3.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Não há participantes a serem removidos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela2 tela2 = new Tela2();
        tela2.setVisible(false);
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        diretorio = jTextField4.getText();
        if (jTextField1.getText().equals("Mata-Mata")) {
            if (Tela2.Participantes.size() == 8) {
                TelaMataMata8 tm8 = new TelaMataMata8();
                tm8.setVisible(true);
                this.setVisible(false);
            } else if (Tela2.Participantes.size() == 9) {
                TelaMataMata10 tm10 = new TelaMataMata10();
                tm10.setVisible(true);
                this.setVisible(false);
            } else if (Tela2.Participantes.size() > 9 && Tela2.Participantes.size() < 13) {
                TelaMataMata12p1 tm12 = new TelaMataMata12p1();
                tm12.setVisible(true);
                this.setVisible(false);
            } else if (Tela2.Participantes.size() > 12 && Tela2.Participantes.size() < 17) {
                TelaMataMata16 tm16 = new TelaMataMata16();
                tm16.setVisible(true);
                this.setVisible(false);

            } else if (Participantes.size() == 6 || Participantes.size() == 7) {
                Classificado c = new Classificado();
                c.setVisible(true);
                this.setVisible(false);
            } else {
                try {
                    throw new InvalidParticipantsAmountException("Número inválido de participantes");
                } catch (InvalidParticipantsAmountException ex) {
                    Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, "Número inválido de participantes");
                }
            }
        }


        /*        if (jTextField1.getText().equals("Mata-Mata")) {
            if (Participantes.size() == 8) {
                TelaMataMata8 tm8= new TelaMataMata8();
                tm8.setVisible(true);
                this.setVisible(false);
            } else if (Participantes.size() == 16 ) {
                TelaMataMata16 tm16 = new TelaMataMata16();
                tm16.setVisible(true);
                this.setVisible(false);           
            } else if(Participantes.size() != 8 && Participantes.size() != 16 && Participantes.size() < 17 && Participantes.size() > 5){
                Classificado c = new Classificado();
                c.setVisible(true);
                this.setVisible(false);
            }
            else {
                try {
                    throw new InvalidParticipantsAmountException("Número inválido de participantes");
                } catch (InvalidParticipantsAmountException ex) {
                    Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Vetor = "";
        for (int i = 0; i < Participantes.size(); i++) {
            Vetor = Vetor + Participantes.get(i) + ", ";
        }
        JOptionPane.showMessageDialog(this, "" + Vetor);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
