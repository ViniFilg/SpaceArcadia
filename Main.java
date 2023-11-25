import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import system.gui.Login;
import system.gui.UsuarioADM;
import system.gui.TemplateJogo;
import system.gui.GradientPanel;


import system.usuario.RepositorioUsuario;

class Main {
  public static void main(String[] args) throws Exception{
    Teste teste = new Teste();
    
    new Login(new RepositorioUsuario()).setVisible(true);
    //new TemplateJogo().setVisible(true);
  }
}

