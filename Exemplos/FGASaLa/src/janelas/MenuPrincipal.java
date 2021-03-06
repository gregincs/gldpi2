package janelas;

import classes.Usuario;
import db.UsuarioDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import projetofinaltecnicas.Main;

/**
 *
 * @author itallorossi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    ButtonGroup grupoIdioma = new ButtonGroup();
    String idioma;
    String usuario;
    String tipoUsuario;

    /** Creates new form MenuPrincipal */
    public MenuPrincipal(String idioma) {
        initComponents();
        setLocationRelativeTo(null);

        grupoIdioma.add(jRadioEn);
        grupoIdioma.add(jRadioPt);

        if(idioma.equals("en_US")){
            jRadioEn.setSelected(true);
        }
        else{
            jRadioPt.setSelected(true);
        }

        jMenuLogout.setVisible(false);
        jSeparator1.setVisible(false);
        jMenuAjuda.setVisible(false);
        
        getRootPane().setDefaultButton(jEntrar);

        alterarIdioma(idioma);

        this.idioma = idioma;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jPainel = new javax.swing.JPanel();
        jMatricula = new javax.swing.JLabel();
        jSenha = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jEntrar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuOpcao = new javax.swing.JMenu();
        jMenuIdioma = new javax.swing.JMenu();
        jRadioPt = new javax.swing.JRadioButtonMenuItem();
        jRadioEn = new javax.swing.JRadioButtonMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jAjudaDoc = new javax.swing.JMenuItem();
        jSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sala.png"))); // NOI18N

        desktop.setBackground(new java.awt.Color(238, 238, 238));

        jPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Login do Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jMatricula.setText("Matrícula: *");

        jSenha.setText("Senha: *");

        matricula.setText("admin");
        matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matriculamatriculaKeyTyped(evt);
            }
        });

        senha.setText("admin");
        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhasenhaKeyTyped(evt);
            }
        });

        jEntrar.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_in.png"))); // NOI18N
        jEntrar.setText("Entrar");
        jEntrar.setPreferredSize(new java.awt.Dimension(110, 50));
        jEntrar.setSize(new java.awt.Dimension(110, 50));
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarjEntrarActionPerformed(evt);
            }
        });

        jSair.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        jSair.setText("Sair");
        jSair.setPreferredSize(new java.awt.Dimension(110, 50));
        jSair.setSize(new java.awt.Dimension(110, 50));
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairjSairActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPainelLayout = new org.jdesktop.layout.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPainelLayout.createSequentialGroup()
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPainelLayout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPainelLayout.createSequentialGroup()
                                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jMatricula, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jSenha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(matricula)
                                    .add(senha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPainelLayout.createSequentialGroup()
                                .add(jSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jEntrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPainelLayout.createSequentialGroup()
                        .add(119, 119, 119)
                        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jMatricula)
                    .add(matricula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSenha)
                    .add(senha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(13, 13, 13)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jEntrar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSair, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPainel.setBounds(140, 180, 536, 222);
        desktop.add(jPainel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuArquivo.setText("Menu Arquivo");

        jMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jMenuLogout.setText("Menu Logout");
        jMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoutActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuLogout);
        jMenuArquivo.add(jSeparator1);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        jMenuSair.setText("Menu Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuOpcao.setText("Menu Opcao");

        jMenuIdioma.setText("Menu Idioma");

        jRadioPt.setSelected(true);
        jRadioPt.setText("Idioma Portugues");
        jRadioPt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sport_soccer.png"))); // NOI18N
        jRadioPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPtActionPerformed1(evt);
            }
        });
        jMenuIdioma.add(jRadioPt);

        jRadioEn.setText("Idioma Ingles");
        jRadioEn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sport_football.png"))); // NOI18N
        jRadioEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEnActionPerformed(evt);
            }
        });
        jMenuIdioma.add(jRadioEn);

        jMenuOpcao.add(jMenuIdioma);

        jMenuBar1.add(jMenuOpcao);

        jMenuAjuda.setText("Menu Ajuda");

        jAjudaDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        jAjudaDoc.setText("Menu Documento de Ajuda");
        jAjudaDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjudaDocActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jAjudaDoc);

        jSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        jSobre.setText("Menu Sobre...");
        jMenuAjuda.add(jSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(desktop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(desktop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAjudaDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjudaDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAjudaDocActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i=0;

        if(jRadioEn.isSelected()){
            Object[] options = {"Yes","No"};
            i = JOptionPane.showOptionDialog(null,
                            "Do you really want to close the application?",
                            "Exit the System",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
        }
        else{
            Object[] options = {"Sim","Não"};
            i = JOptionPane.showOptionDialog(null,
                            "Deseja realmente finalizar a aplicação?",
                            "Sair do Sistema",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
            }
        if (i==JOptionPane.YES_OPTION){
        }
        else{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        } 
    }//GEN-LAST:event_formWindowClosing

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:

        int i=0;

        if(jRadioEn.isSelected()){
            Object[] options = {"Yes","No"};
            i = JOptionPane.showOptionDialog(null,
                            "Do you really want to close the application?",
                            "Exit the System",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
        }
        else{
            Object[] options = {"Sim","Não"};
            i = JOptionPane.showOptionDialog(null,
                            "Deseja realmente finalizar a aplicação?",
                            "Sair do Sistema",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
            }
        if (i==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogoutActionPerformed
        // TODO add your handling code here:

        JInternalFrame[] iframe = desktop.getAllFrames();

        int i=0;

        if(jRadioEn.isSelected()){
            Object[] options = {"Yes","No"};
            i = JOptionPane.showOptionDialog(null,
                            "Do you really want to logout?",
                            "Logout",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
        }
        else{
            Object[] options = {"Sim","Não"};
            i = JOptionPane.showOptionDialog(null,
                            "Deseja realmente finalizar a sessão?",
                            "Finalizar sessão",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[1]);
            }
        if(i==JOptionPane.YES_OPTION){

            jEntrar.setEnabled(true);
            matricula.requestFocus();

            if(isVisible()){
                if(idioma.equals("en_US")){
                    JOptionPane.showMessageDialog(null, "Thank you for using our system.\nBye bye!!!", "Logout", JOptionPane.INFORMATION_MESSAGE);
                }
                 else{
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema.\nTchau tchau!!!", "Sessão Encerrada", JOptionPane.INFORMATION_MESSAGE);
                 }

            }
            else{

                if(idioma.equals("en_US")){
                    JOptionPane.showMessageDialog(null, "Thank you for using our system.\nBye bye!!!", "Logout", JOptionPane.INFORMATION_MESSAGE);
                }
                 else{
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema.\nTchau tchau!!!", "Sessão Encerrada", JOptionPane.INFORMATION_MESSAGE);
                 }
            }

            try{
                    iframe[0].setClosed(true);
            }
            catch(java.beans.PropertyVetoException e){}

            jSeparator1.setVisible(false);
            jMenuLogout.setVisible(false);
        }
    }//GEN-LAST:event_jMenuLogoutActionPerformed

    private void jRadioPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPtActionPerformed
       
}//GEN-LAST:event_jRadioPtActionPerformed

    private void jRadioPtActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPtActionPerformed1
        // TODO add your handling code here:
        idioma = "pt_BR";

        JInternalFrame teste = desktop.getSelectedFrame();

        if(teste==null){
            alterarIdioma(idioma);
        }
        else{
            Object[] options = {"Yes","No"};
            int i = JOptionPane.showOptionDialog(
                              null,
                              "You should logout to change language.\nDo you want to logout?",
                              "Change Language",
                              JOptionPane.YES_NO_OPTION,
                              JOptionPane.QUESTION_MESSAGE,
                              null,
                              options,
                              options[1]
                         );

            if(i==JOptionPane.YES_OPTION){
                jMenuLogout.setVisible(false);
                jSeparator1.setVisible(false);
                jEntrar.setEnabled(true);
                matricula.requestFocus();

                idioma = "pt_BR";
                
                try{
                    teste.setClosed(true);
                }
                catch(java.beans.PropertyVetoException e){}

                alterarIdioma(idioma);
             }else{
                jRadioEn.setSelected(true);
             }
        }
    }//GEN-LAST:event_jRadioPtActionPerformed1

    private void jRadioEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEnActionPerformed
        // TODO add your handling code here:
        idioma = "en_US";

        JInternalFrame teste = desktop.getSelectedFrame();

        if(teste==null){
            alterarIdioma(idioma);
        }
        else{
            System.out.println("tem coisa");
            Object[] options = {"Sim","Não"};
            int i = JOptionPane.showOptionDialog(
                              null,
                              "Você deve encerrar a sessão para alterar o idioma.\nDeseja encerrrar a sessão agora?",
                              "Alterar Idioma",
                              JOptionPane.YES_NO_OPTION,
                              JOptionPane.QUESTION_MESSAGE,
                              null,
                              options,
                              options[1]
                         );

            if(i==JOptionPane.YES_OPTION){
                jMenuLogout.setVisible(false);
                jSeparator1.setVisible(false);
                jEntrar.setEnabled(true);
                matricula.requestFocus();

                idioma = "en_US";
                
                try{
                    teste.setClosed(true);
                }
                catch(java.beans.PropertyVetoException e){}

                alterarIdioma(idioma);
             }else{
                jRadioPt.setSelected(true);
             }
        }
    }//GEN-LAST:event_jRadioEnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        matricula.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void matriculamatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculamatriculaKeyTyped
        // TODO add your handling code here:

        matricula.setBackground(Color.white);
}//GEN-LAST:event_matriculamatriculaKeyTyped

    private void senhasenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhasenhaKeyTyped
        // TODO add your handling code here:

        senha.setBackground(Color.white);
}//GEN-LAST:event_senhasenhaKeyTyped

    private void jEntrarjEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarjEntrarActionPerformed
        // TODO add your handling code here:
        String mat = matricula.getText();
        String pw = senha.getText();

        int tMat = mat.replaceAll(" ", "").length();
        int tPw = pw.replaceAll(" ","").length();

        int cheio = 0;

        if((tMat==0) && (tPw==0)){
            cheio=1;
            if(idioma.equals("en_US")){
                JOptionPane.showMessageDialog(null, "All fields are required.\nPlease fill them all to login!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.\nPor favor preencher todos os campos para fazer o login!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            matricula.setBackground(Color.red);
            senha.setBackground(Color.red);
        } else{
            if(tMat==0){
                cheio=1;
                if(idioma.equals("pt_BR")){
                    JOptionPane.showMessageDialog(null, "Campo Usuário obrigatório.\nFavor preencher o campo!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(null, "Field User required.\nPlease fill the field!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                matricula.setBackground(Color.red);
            } else{
                if(tPw==0){
                    cheio=1;
                    if(idioma.equals("pt_BR")){
                        JOptionPane.showMessageDialog(null, "Campo Senha obrigatório.\nFavor preencher o campo!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "Field Password required.\nPlease fill the field!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                    senha.setBackground(Color.red);
                }
            }
        }

        if(cheio==0){
            try{
                UsuarioDAO userDAO = new UsuarioDAO();
                Usuario user = new Usuario();

                if(userDAO.verificarLogin(user,mat,pw)==1){
                    if(idioma.equals("pt_BR")){
                        JOptionPane.showMessageDialog(null, "Sessão iniciada com sucesso!", "Sessão iniciada!", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "Successful login!", "Session started!", JOptionPane.INFORMATION_MESSAGE);
                    }

                    Main.log.info("Sessão iniciada com sucesso!");

                    usuario = matricula.getText();
                    matricula.setText("");
                    senha.setText("");
                    jEntrar.setEnabled(false);

                    if(user.getTipo().equals("usuario")){
                        MenuUsuario usr = new MenuUsuario(idioma,usuario);
                        usr.setVisible(true);
                        desktop.add(usr);

                        jSeparator1.setVisible(true);
                        jMenuLogout.setVisible(true);

                        try{
                            usr.setMaximum(true);
                            usr.setSelected(true);
                        } catch(java.beans.PropertyVetoException e){}
                    }else{
                        MenuAdmin adm = new MenuAdmin(idioma,usuario);
                        adm.setVisible(true);
                        desktop.add(adm);

                        jSeparator1.setVisible(true);
                        jMenuLogout.setVisible(true);

                        try{
                            adm.setMaximum(true);
                            adm.setSelected(true);
                        } catch(java.beans.PropertyVetoException e){}
                    }

                } else{
                    if(idioma.equals("pt_BR")){
                        JOptionPane.showMessageDialog(null, "Problema ao efetuar login!\nSenha e/ou Usuário incorretos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "Problem to login!\nPassword and/or User incorrects!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
}//GEN-LAST:event_jEntrarjEntrarActionPerformed

    private void jSairjSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairjSairActionPerformed
        // TODO add your handling code here:
        int i=0;

        if(idioma.equals("en_US")){
            Object[] options = {"Yes","No"};
            i = JOptionPane.showOptionDialog(null,
                    "Do you really want to close the application?",
                    "Exit the System",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
        } else{
            Object[] options = {"Sim","Não"};
            i = JOptionPane.showOptionDialog(null,
                    "Deseja realmente finalizar a aplicação?",
                    "Sair do Sistema",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
        }
        if (i==JOptionPane.YES_OPTION){
            System.exit(0);
        }
}//GEN-LAST:event_jSairjSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jAjudaDoc;
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIdioma;
    private javax.swing.JMenuItem jMenuLogout;
    private javax.swing.JMenu jMenuOpcao;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JPanel jPainel;
    private javax.swing.JRadioButtonMenuItem jRadioEn;
    private javax.swing.JRadioButtonMenuItem jRadioPt;
    private javax.swing.JButton jSair;
    private javax.swing.JLabel jSenha;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem jSobre;
    private javax.swing.JTextField matricula;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables

    public void alterarIdioma(String idioma){
        ResourceBundle palavras = ResourceBundle.getBundle("idiomas.Lingua_"+idioma);

        this.setTitle(palavras.getString("MenuPrincipal.titulo"));

        jMenuArquivo.setText(palavras.getString("MenuPrincipal.jMenuArquivo"));
        jMenuLogout.setText(palavras.getString("MenuPrincipal.jMenuLogout"));
        jMenuSair.setText(palavras.getString("MenuPrincipal.jMenuSair"));

        jMenuOpcao.setText(palavras.getString("MenuPrincipal.jMenuOpcao"));
        jMenuIdioma.setText(palavras.getString("MenuPrincipal.jMenuIdioma"));
        jRadioPt.setText(palavras.getString("MenuPrincipal.jMenuRadioPt"));
        jRadioEn.setText(palavras.getString("MenuPrincipal.jMenuRadioEn"));

        jMenuAjuda.setText(palavras.getString("MenuPrincipal.jMenuAjuda"));
        jAjudaDoc.setText(palavras.getString("MenuPrincipal.jAjudaDoc"));
        jSobre.setText(palavras.getString("MenuPrincipal.jSobre"));

        jMatricula.setText(palavras.getString("MenuPrincipal.jMatricula"));
        jSenha.setText(palavras.getString("MenuPrincipal.jSenha"));
        jEntrar.setText(palavras.getString("MenuPrincipal.jEntrar"));
        jSair.setText(palavras.getString("MenuPrincipal.jSair"));

        jPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(palavras.getString("MenuPrincipal.jPainel")));
    }

}
