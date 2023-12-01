package system.gui;

import system.usuario.UsuarioAbstract;
import system.usuario.UsuarioPadrao;
import system.usuario.RepositorioUsuario;
import system.usuario.exceptions.UEException;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;

import system.jogos.Jogo;
import system.jogos.RepositorioJogos;
import system.usuario.RepositorioUsuario;
import system.jogos.IRepo;
import system.jogos.exceptions.JEException;
import system.jogos.Comentario;
import system.jogos.exceptions.CLEException;

import java.util.Vector;

public class Comentarios extends javax.swing.JFrame {

    /**
     * Creates new form Comentarios
     */
    public Comentarios(Jogo jogo, UsuarioAbstract usuario) {
        repo = new RepositorioJogos();
        repoUser = new RepositorioUsuario();
        this.jogo = jogo;
        this.usuario = usuario;
      
        initComponents();
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);

        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
      
        txtComentario.setLineWrap(true);
        txtComentario.setBorder(null);
        txtComentario.setBackground(new java.awt.Color (20,46,90,255));
        txtComentario.setForeground(new java.awt.Color (105,182,248,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnEnviar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        mainList = new javax.swing.JPanel(new GridBagLayout());
        jScrollPane3 = new javax.swing.JScrollPane(mainList);
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SpaceArcadia");
        setResizable(false);

        btnEnviar.setForeground(new java.awt.Color(0, 51, 102));
        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtComentario.setBackground(new java.awt.Color(20, 46, 90));
        txtComentario.setColumns(20);
        txtComentario.setForeground(new java.awt.Color(105, 182, 248));
        txtComentario.setLineWrap(true);
        txtComentario.setRows(5);
        txtComentario.setBorder(null);
        txtComentario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtComentario.setOpaque(false);
        jScrollPane1.setViewportView(txtComentario);

        jScrollPane3.setViewportView(mainList);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        mainList.setOpaque(false);
        mainList.add(new JPanel(), gbc);

        for(Comentario comentario : jogo.getComentarios()) {
          gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          gbc.weightx = 1;
          gbc.fill = GridBagConstraints.HORIZONTAL;
          mainList.add(new InterfaceComentario(comentario.getNome(), comentario.getComentario()), gbc, 0);
          mainList.revalidate();
          mainList.repaint();
        }

        jLabel1.setIcon(new javax.swing.ImageIcon("arquivo/imagem/Comentarios.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGap(10, 10, 10)
              .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                        
      new Catalogo(usuario).setVisible(true);
      this.dispose();
    }

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {                                        
      if(txtComentario.getText().length() > 0) {
        Comentario comentario = new Comentario(usuario.getNome(), txtComentario.getText());
        try{
          repo.adicionarComentario(jogo.getNome(), comentario);

          //Adiciona comentario dinamicamente na lista
          GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          gbc.weightx = 1;
          gbc.fill = GridBagConstraints.HORIZONTAL;
          mainList.add(new InterfaceComentario(comentario.getNome(), comentario.getComentario()), gbc, 0);
          mainList.revalidate();
          mainList.repaint();
  
          txtComentario.setText("");
        } catch(CLEException e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
      }
    }


  
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
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Comentarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<JPanel> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtComentario;
    private UsuarioAbstract usuario;
    private RepositorioJogos repo;
    private Jogo jogo;
    private Vector<String> comentarios;
    private Vector<JPanel> paineisComentarios;
    private JPanel mainList;
    private RepositorioUsuario repoUser;
    // End of variables declaration                   

}