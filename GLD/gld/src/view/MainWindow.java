/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Login;
import utils.PowerGridMonitor;

/**
 *
 * @author itallorossi
 */
public class MainWindow extends javax.swing.JFrame {

    public static Login user;
    public static LoadCurveWindow loadWindow;
    public static CostWindow costWindow;
    public static UserWindow userWindow;
    PowerGridMonitor powerGridMonitor;
    Thread monitorThread;
    int state = 0;
    private MainMenu pg;

    /**
     * Creates new form JanelaPrincipal
     */
    public MainWindow(Login usuario) {
        initComponents();
        initPowerGridMonitor();
        setSize(1024, 700);
        setLocationRelativeTo(null);
        this.user = usuario;
        this.menuRelatorios.setVisible(false);
        this.menuMainHibrido.setVisible(false);

        if (Integer.parseInt(user.getTipo()) == 2) {
            menuCadastros.setVisible(false);
        }

        this.init();

    }

    public MainWindow() {
        initComponents();
    }

    private void init() {
        desktop.removeAll();
        pg = new MainMenu(user);
        desktop.add(pg);
        desktop.revalidate();
        desktop.repaint();

        state = 1;
    }

    private void initPowerGridMonitor() {
        Logger.getLogger(MainWindow.class.getName()).log(Level.INFO, "Inicializando PowerGridMonitorThread");
        
        powerGridMonitor = new PowerGridMonitor();

        monitorThread = new Thread(powerGridMonitor);

        monitorThread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuCadastros = new javax.swing.JMenu();
        menuInserirUser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCustos = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuMainHibrido = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento da Energia Elétrica pelo Lado da Demanda Associado a um Sistema Híbrido de Abastecimento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        org.jdesktop.layout.GroupLayout desktopLayout = new org.jdesktop.layout.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 800, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 614, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reports.png"))); // NOI18N
        menuRelatorios.setText("Relatórios");

        jMenuItem9.setText("Custo");
        menuRelatorios.add(jMenuItem9);

        jMenuItem10.setText("Consumo");
        menuRelatorios.add(jMenuItem10);

        jMenuItem11.setText("Estimativas");
        menuRelatorios.add(jMenuItem11);

        jMenu1.add(menuRelatorios);

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/application_form.png"))); // NOI18N
        menuCadastros.setText("Cadastros");

        menuInserirUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        menuInserirUser.setText("Usuários");
        menuInserirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirUserActionPerformed(evt);
            }
        });
        menuCadastros.add(menuInserirUser);

        jMenu1.add(menuCadastros);
        jMenu1.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Monitoramento");

        menuCustos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chart_curve.png"))); // NOI18N
        menuCustos.setText("Custo");
        menuCustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustosActionPerformed(evt);
            }
        });
        jMenu2.add(menuCustos);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chart_line.png"))); // NOI18N
        jMenuItem4.setText("Consumo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Estimativas");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money-coin.png"))); // NOI18N
        jMenuItem2.setText("Custo");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lightning.png"))); // NOI18N
        jMenuItem3.setText("Consumo");
        jMenu4.add(jMenuItem3);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report_magnify.png"))); // NOI18N
        jMenuItem7.setText("Estudo Contratual");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        menuMainHibrido.setText("Sistema Hibrído");
        jMenuBar1.add(menuMainHibrido);

        jMenu5.setText("Ajuda");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/information.png"))); // NOI18N
        jMenuItem8.setText("Sobre...");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, desktop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int i;

        Object[] options = {"Sim", "Não"};
        i = JOptionPane.showOptionDialog(null,
                "Deseja realmente finalizar a aplicação?",
                "Sair do Sistema",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuCustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustosActionPerformed
        desktop.removeAll();
        costWindow = new CostWindow(desktop.getHeight(), user);
        desktop.add(costWindow);
        desktop.revalidate();
        desktop.repaint();
    }//GEN-LAST:event_menuCustosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        desktop.removeAll();
        loadWindow = new LoadCurveWindow(desktop.getHeight(), user);
        desktop.add(loadWindow);
        desktop.revalidate();
        desktop.repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuInserirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirUserActionPerformed
        desktop.removeAll();
        userWindow = new UserWindow(desktop.getHeight());
        desktop.add(userWindow);
        desktop.revalidate();
        desktop.repaint();
    }//GEN-LAST:event_menuInserirUserActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closePowerGridMonitorThread();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i;

        Object[] options = {"Sim", "Não"};
        i = JOptionPane.showOptionDialog(null,
                "Deseja realmente finalizar a aplicação?",
                "Sair do Sistema",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (i == JOptionPane.YES_OPTION) {
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        AboutWindow about = new AboutWindow();
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void closePowerGridMonitorThread() {
        monitorThread.stop();
        Logger.getLogger(MainWindow.class.getName()).log(Level.INFO, "PowerGridMonitorThread parada.");
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCustos;
    private javax.swing.JMenuItem menuInserirUser;
    private javax.swing.JMenu menuMainHibrido;
    private javax.swing.JMenu menuRelatorios;
    // End of variables declaration//GEN-END:variables
}
