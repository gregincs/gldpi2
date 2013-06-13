/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InserirAdmin.java
 *
 * Created on Jul 15, 2011, 4:44:19 PM
 */

package janelas;

import classes.Usuario;
import db.UsuarioDAO;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import projetofinaltecnicas.Main;

/**
 * 
 * @author Vinicius
 */
public class InserirAdmin extends javax.swing.JPanel {

    String idioma;
    String usuario;

    /** Creates new form InserirAdmin */
    public InserirAdmin(String idioma, String usuario) {
        initComponents();

        this.idioma = idioma;
        this.usuario = usuario;

        jiduser.setText(usuario);

        alterarIdioma();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        jNome = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jTelefone = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        matricula = new javax.swing.JTextField();
        jUser = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jSenha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jSenhaC = new javax.swing.JLabel();
        senhac = new javax.swing.JPasswordField();
        jRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jiduser = new javax.swing.JLabel();
        juser = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(776, 552));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Usuário"));

        jNome.setText("Nome: *");

        jEmail.setText("E-mail: *");

        jTelefone.setText("Telefone: *");

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jUser.setText("Usuário: *");

        jSenha.setText("Senha: *");

        jSenhaC.setText("Confirmar Senha: *");

        jRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        jRegistrar.setText("Registrar");
        jRegistrar.setPreferredSize(new java.awt.Dimension(140, 45));
        jRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPainelLayout = new org.jdesktop.layout.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jRegistrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPainelLayout.createSequentialGroup()
                        .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jUser)
                            .add(jEmail)
                            .add(jNome)
                            .add(jTelefone)
                            .add(jSenha))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(nome, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .add(jPainelLayout.createSequentialGroup()
                                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, email)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPainelLayout.createSequentialGroup()
                                        .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, senha)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, telefone)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, matricula, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jSenhaC)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(senhac, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jNome)
                    .add(nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jEmail)
                    .add(email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTelefone)
                    .add(telefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(matricula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jUser))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(senha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSenhaC)
                    .add(senhac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSenha))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jRegistrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18))
        );

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        titulo.setText("Inserir Novo Administrador");

        jiduser.setText("ID User");

        juser.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        juser.setText("Usuário");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(titulo)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 327, Short.MAX_VALUE)
                                .add(juser)
                                .add(18, 18, 18)
                                .add(jiduser)
                                .add(158, 158, 158))))
                    .add(layout.createSequentialGroup()
                        .add(116, 116, 116)
                        .add(jPainel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titulo)
                    .add(juser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jiduser))
                .add(8, 8, 8)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(54, 54, 54)
                .add(jPainel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarActionPerformed

        int verificar = verificarSenha();
        int verificar2 = verificarEmail(email.getText());

        if(verificar==1){
            Main.log.warning("O usuario: "+usuario+", tentou inserir um admin com senhas diferentes ou menores do que o permitido.");
            if(idioma.equals("en_US")){
                JOptionPane.showMessageDialog(null, "The passwords should have at least 6 characters!\nOr they aren't the same!\nPlease retype the passwords.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "As senhas devem ter no minimo 6 caracteres!\nOu elas não são iguais.\nPor favor redigite as senhas.", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if(verificar2==1){
                if(idioma.equals("en_US")){
                    JOptionPane.showMessageDialog(null, "Invaid email!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Email inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                int j;
                
                if(idioma.equals("en_US")){
                    Object[] options = {"Yes","No"};
                    j = JOptionPane.showOptionDialog(null,
                                    "Do you really want to register this admin?",
                                    "Register Admin",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[1]);
                }
                else{
                    Object[] options = {"Sim","Não"};
                    j = JOptionPane.showOptionDialog(null,
                                "Deseja realmente registrar esse administrador?",
                                "Registrar Administrador",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                options[1]);
                }
                
                if (j==JOptionPane.YES_OPTION){
                    try{
                        Usuario user = new Usuario();
                        UsuarioDAO userc = new UsuarioDAO();

                        user.setUser(matricula.getText());
                        user.setNome(nome.getText());
                        user.setSenha(senha.getText());
                        user.setTipo("admin");
                        user.setTelefone(telefone.getText());
                        user.setEmail(email.getText());

                        userc.usuarioInserir(user);
                        JOptionPane.showMessageDialog(null,"Usuário inserido com sucesso!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
                        Main.log.info("O usuario: "+usuario+", inseriu com sucesso um novo administrador.");
                        limparCampos();
                    } catch(SQLException e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"Problema ao inserir Usuário!","ERRO!!!",JOptionPane.ERROR_MESSAGE);
                        Main.log.severe("O usuario: "+usuario+", teve problemas e não conseguiu inserir um novo administrador.");
                    }
                }
            }
            
            
        }
    }//GEN-LAST:event_jRegistrarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        nome.requestFocus();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPainel;
    private javax.swing.JButton jRegistrar;
    private javax.swing.JLabel jSenha;
    private javax.swing.JLabel jSenhaC;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jiduser;
    private javax.swing.JLabel juser;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private javax.swing.JPasswordField senhac;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


    private void limparCampos(){
        matricula.setText("");
        nome.setText("");
        senha.setText("");
        senhac.setText("");
        telefone.setText("");
        email.setText("");
    }

    public void alterarIdioma(){
        ResourceBundle palavras = ResourceBundle.getBundle("idiomas.Lingua_"+idioma);

        jNome.setText(palavras.getString("iadmin.nome"));
        jEmail.setText(palavras.getString("iadmin.email"));
        jTelefone.setText(palavras.getString("iadmin.telefone"));
        jUser.setText(palavras.getString("iadmin.usuario"));
        jSenha.setText(palavras.getString("iadmin.senha"));
        jSenhaC.setText(palavras.getString("iadmin.csenha"));
        jRegistrar.setText(palavras.getString("iadmin.botao"));

        titulo.setText(palavras.getString("iadmin.titulo"));
        juser.setText(palavras.getString("iadmin.user"));

        jPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(palavras.getString("iadmin.painel")));
    }

    /**
     * Função para validação das senhas
     * Verificando se são iguais e não estão em branco
     * @return 0 se a senhas são validas e 1 se não são válidas
     */
    public int verificarSenha(){
        String sen = senha.getText();
        String senC = senhac.getText();

        if(sen.length()<6){
            return 1;
        }

        if((sen.equals(senC) && senC.equals(sen)) && (!sen.equals("") || !senC.equals(""))){
            return 0;
        }else{
            return 1;
        }
    }

    public int verificarEmail(String email){

          Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

          Matcher m = p.matcher(email);

          boolean matchFound = m.matches();

          if (matchFound){
              return 0;
          }else{
              return 1;
          } 
    }
}
