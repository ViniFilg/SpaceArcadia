package system.gui;

import system.usuario.UsuarioAbstract;
import system.usuario.UsuarioPadrao;
import system.usuario.RepositorioUsuario;
import system.usuario.exceptions.UEException;
import javax.swing.JOptionPane;

import system.gui.UsuarioADM;

public class Login extends javax.swing.JFrame {

  public Login () {
        this.repo = new RepositorioUsuario();
        initComponents();
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField(){
            @Override
            public void paint(java.awt.Graphics g) {
                java.awt.Dimension size = getSize();
                g.setColor(getBackground());
                g.fillRect(0, 0, size.width, size.height);
                super.paint(g);
            }};
            txtSenha = new javax.swing.JPasswordField();
            jLabel2 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("SpaceArcadia");
            setResizable(false);

            jPanel2.setOpaque(false);

            btnLogin.setBackground(new java.awt.Color(63, 63, 63));
            btnLogin.setForeground(new java.awt.Color(255, 255, 255));
            btnLogin.setBorderPainted(false);
            btnLogin.setContentAreaFilled(false);
            btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnLogin.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
          });

            btnRegistrar.setBorderPainted(false);
            btnRegistrar.setContentAreaFilled(false);
            btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRegistrarActionPerformed(evt);
                }
            });

            txtLogin.setBackground(new java.awt.Color(20, 46, 90));
            txtLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            txtLogin.setForeground(new java.awt.Color(255, 255, 255));
            txtLogin.setBorder(null);
            txtLogin.setMaximumSize(new java.awt.Dimension(64, 16));
            

            txtSenha.setBackground(new java.awt.Color(20, 46, 90));
            txtSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            txtSenha.setForeground(new java.awt.Color(255, 255, 255));
            txtSenha.setBorder(null);
            txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtSenha.setDisabledTextColor(new java.awt.Color(0,0,0,1));
            txtSenha.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtSenhaActionPerformed(evt);
                }
            });

            jLabel2.setIcon(new javax.swing.ImageIcon("arquivo/imagem/Login.png")); // NOI18N
            jLabel2.setText("jLabel2");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>                        

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
      String nomeUsuario = txtLogin.getText();
      String senhaUsuario = txtSenha.getText();
      if (nomeUsuario.equals("ADM") && senhaUsuario.equals("ADM")) {
        new UsuarioADM().setVisible(true);
        this.dispose();
      } else if(repo.existe(nomeUsuario)){
        UsuarioAbstract usuario = repo.procurar(nomeUsuario);
        if(usuario.getSenha().equals(senhaUsuario)){
          new Catalogo(usuario).setVisible(true);
          this.dispose();
        } else {
          JOptionPane.showMessageDialog(this, "Senha incorreta");
        }
      } else {
        JOptionPane.showMessageDialog(this, "O usuário " + nomeUsuario + " não foi cadastrado");
      }
    }                                        

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
      this.dispose();
      new Register().setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    private RepositorioUsuario repo;
    // End of variables declaration                   
}
