package system.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/** @see https://stackoverflow.com/q/45603312/230513 */
public class GradientPanel extends JPanel {

  private static final int WIDE = 300;
  private static final int HIGH = 400;
  private static final float HUE_MIN = 0.55f;
  private static final float HUE_MAX = 0.60f;
  public Timer timer;
  private float hue = HUE_MIN;
  private Color color1 = Color.white;
  private Color color2 = Color.black;
  private float delta = 0.0001f;

  public GradientPanel() {
    ActionListener action = new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent evt) {
        hue += delta;
        if (hue > HUE_MAX) {
          hue = HUE_MAX;
          delta = -delta;
        } if(hue < HUE_MIN){
          hue = HUE_MIN;
          delta = -delta;
        }
        color1 = Color.getHSBColor(hue, 1, 1);
        color2 = Color.getHSBColor(hue, 3f/4 + delta, 3f/4 + delta);
        repaint();
      }
    };
    timer = new Timer(10, action);
    timer.start();
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    GradientPaint p = new GradientPaint(
        0, 0, color1, getWidth(), getHeight(), color2);
    g2d.setPaint(p);
    g2d.fillRect(0, 0, getWidth(), getHeight());
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(WIDE, HIGH);
  }
}