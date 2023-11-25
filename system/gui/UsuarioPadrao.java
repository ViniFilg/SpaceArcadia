package system.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioPadrao extends JFrame {

    public UsuarioPadrao() {
        initComponents();
    }

    private void initComponents() {
        // Inicializações de componentes
        JButton listaDeJogosButton = new JButton("Lista de Jogos");

        // Adiciona um ouvinte de ação ao botão
        listaDeJogosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaDeJogosButtonActionPerformed(e);
            }
        });

        // Configuração do layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(listaDeJogosButton)
                                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(listaDeJogosButton)
                                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void listaDeJogosButtonActionPerformed(ActionEvent evt) {
        // Lógica para lidar com o clique no botão "Lista de Jogos"
        JOptionPane.showMessageDialog(this, "Abrindo Lista de Jogos!");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioPadrao().setVisible(true);
            }
        });
    }
}