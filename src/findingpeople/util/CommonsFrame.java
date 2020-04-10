/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingpeople.util;

import findingpeople.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CommonsFrame {

    public static void setFrameCenter(JFrame f) {

        Toolkit toolkit = f.getToolkit();
        Dimension tamanoPantalla = toolkit.getScreenSize();
        f.setLocation((tamanoPantalla.width / 2) - (f.getWidth() / 2), (tamanoPantalla.height / 2) - (f.getHeight() / 2));

    }

    public static void frameAtributes(JFrame f) {
        f.setTitle("KeLiz System");
        f.setResizable(false);
    }

}
