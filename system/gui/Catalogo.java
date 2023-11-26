package system.gui;

import system.usuario.UsuarioAbstract;
import system.usuario.UsuarioPadrao;
import system.usuario.RepositorioUsuario;
import system.usuario.exceptions.UEException;

import system.jogos.Jogo;
import system.jogos.RepositorioJogos;
import system.jogos.IRepo;
import system.jogos.exceptions.JEException;

import java.util.Vector;

public class Catalogo extends javax.swing.JFrame {

    public Catalogo(UsuarioAbstract usuario) {
        this.usuario = usuario;
        repo = new RepositorioJogos();
        for(Jogo jogo : ((RepositorioJogos) repo).getJogos()){
          jogos.add(jogo.getNome());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJogos = new javax.swing.JList<>();
        btnComentario = new javax.swing.JButton();
        tituloJogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoJogo = new javax.swing.JTextArea();
        btnComprar = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SpaceArcadia");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setOpaque(false);

        listJogos.setBackground(new java.awt.Color(82, 123, 193));
        listJogos.setBorder(null);
        listJogos.setModel(new javax.swing.AbstractListModel<String>() {
            Vector<String> strings = new Vector<String>(jogos);
            public int getSize() { return strings.size(); }
            public String getElementAt(int i) { return strings.get(i); }
        });
        listJogos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listJogos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listJogosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listJogos);

        btnComentario.setBackground(new java.awt.Color(0,0,0,0));
        btnComentario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnComentario.setForeground(new java.awt.Color(255, 255, 255));
        btnComentario.setText("Comentários");
        btnComentario.setAlignmentY(0.0F);
        btnComentario.setBorderPainted(false);
        btnComentario.setContentAreaFilled(false);
        btnComentario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComentario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComentario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComentarioMouseClicked(evt);
            }
        });

        tituloJogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloJogo.setForeground(new java.awt.Color(255, 255, 255));
        tituloJogo.setText("Shadow of the Colossus");

        jScrollPane2.setBorder(null);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setOpaque(false);

        descricaoJogo.setEditable(false);
        descricaoJogo.setBackground(new java.awt.Color(51, 102, 255));
        descricaoJogo.setColumns(20);
        descricaoJogo.setForeground(new java.awt.Color(255, 255, 255));
        descricaoJogo.setLineWrap(true);
        descricaoJogo.setRows(5);
        descricaoJogo.setText("sadadasdada");
        descricaoJogo.setBorder(null);
        descricaoJogo.setFocusable(false);
        descricaoJogo.setHighlighter(null);
        descricaoJogo.setOpaque(false);
        descricaoJogo.setBackground(new java.awt.Color(0,0,0,1));
        jScrollPane2.setViewportView(descricaoJogo);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setBackground(new java.awt.Color(255,0,0,0));
        jScrollPane2.getViewport().setOpaque(false);

        btnComprar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setLabel("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });

        btnPerfil.setBorder(null);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setLabel("");
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilMouseClicked(evt);
            }
        });

        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setLabel("");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(475, 475, 475)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloJogo)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tituloJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnComentario.setContentAreaFilled(false);
        btnComentario.setBorderPainted(false);
        btnComentario.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("arquivo/imagem/Catalogo.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(616, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void listJogosValueChanged(javax.swing.event.ListSelectionEvent evt) {                                       
        descricaoJogo.setText(listJogos.getSelectedValue());

    }                                      

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnComentarioMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnComentario;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextArea descricaoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listJogos;
    private javax.swing.JLabel tituloJogo;
    private IRepo repo;
    private UsuarioAbstract usuario;
    private Vector<String> jogos;
    // End of variables declaration                   
}
