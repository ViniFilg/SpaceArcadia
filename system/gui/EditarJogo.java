/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.gui;

import system.gui.UsuarioADM;
import system.jogos.Jogo;
import system.jogos.RepositorioJogos;
import system.jogos.IRepo;

/**
 *
 * @author vinic
 */
public class EditarJogo extends javax.swing.JFrame {

  /**
   * Creates new form EditarJogo
   */
  public EditarJogo(String nome) {
    IRepo repo = new RepositorioJogos();
    jogo = repo.procurar(nome);
    initComponents();
    this.setTitle("SpaceArcadia");
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    txtFNomeEditar = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtFValorEditar = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    btnSalvarEdição = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtFDescricaoEditar = new javax.swing.JTextArea();
    jPanel2 = new javax.swing.JPanel();
    btnCancelar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtFNomeEditar.setBackground(new java.awt.Color(255, 255, 255));
    txtFNomeEditar.setForeground(new java.awt.Color(0, 0, 0));
    txtFNomeEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    txtFNomeEditar.setText(jogo.getNome());
    txtFNomeEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFNomeEditarActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Nome do jogo:");

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Descrição do jogo:");

    txtFValorEditar.setBackground(new java.awt.Color(255, 255, 255));
    txtFValorEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    txtFValorEditar.setText(Double.toString(jogo.getValor()));
    txtFValorEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFValorEditarActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("Valor do jogo:");

    btnSalvarEdição.setBackground(new java.awt.Color(102, 156, 255));
    btnSalvarEdição.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    btnSalvarEdição.setForeground(new java.awt.Color(0, 0, 0));
    btnSalvarEdição.setText("Salvar");
    btnSalvarEdição.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarEdiçãoActionPerformed(evt);
      }
    });

    txtFDescricaoEditar.setBackground(new java.awt.Color(255, 255, 255));
    txtFDescricaoEditar.setColumns(20);
    txtFDescricaoEditar.setLineWrap(true);
    txtFDescricaoEditar.setRows(5);
    txtFDescricaoEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    txtFDescricaoEditar.setText(jogo.getDescricao());
    jScrollPane1.setViewportView(txtFDescricaoEditar);

    jPanel2.setBackground(new java.awt.Color(102, 156, 255));

    btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
    btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
    btnCancelar.setText("cancelar");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelarActionPerformed(evt);
      }
    });

    jLabel1.setBackground(new java.awt.Color(0, 0, 0));
    jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Editar Jogo");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(320, 320, 320)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFValorEditar)
                            .addComponent(txtFNomeEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(250, 250, 250))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(btnSalvarEdição, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap()))));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFValorEditar, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarEdição, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    pack();
  }// </editor-fold>

  private void txtFNomeEditarActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void txtFValorEditarActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void btnSalvarEdiçãoActionPerformed(java.awt.event.ActionEvent evt) {
    // Para salvar as alterações de informações do jogo
    String nome = txtFNomeEditar.getText();
    String valor = txtFValorEditar.getText();
    String descricao = txtFDescricaoEditar.getText();

    IRepo repo = new RepositorioJogos();
    ((RepositorioJogos) repo).editarJogo(jogo.getNome(), nome, Double.parseDouble(valor), descricao);
    jogo = repo.procurar(nome);

;
  }

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    this.dispose();
    UsuarioADM adm = new UsuarioADM();
    adm.setVisible(true);

  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(EditarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EditarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EditarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EditarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        //new EditarJogo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnSalvarEdição;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea txtFDescricaoEditar;
  private javax.swing.JTextField txtFNomeEditar;
  private javax.swing.JTextField txtFValorEditar;
  private Jogo jogo;
  // End of variables declaration
}
