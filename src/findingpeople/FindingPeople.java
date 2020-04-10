/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingpeople;

import javax.swing.JFrame;
import org.opencv.core.Core;

/**
 *
 * @author USER
 */
public class FindingPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
       
     /*  Container container = new Container();
       container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       container.setVisible(true);*/
       
       /*UploadPeople uploadPeople = new UploadPeople();
       uploadPeople.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       uploadPeople.setVisible(true);*/
       
       /*EncontrarDesaparecido encontrarDesaparecido = new EncontrarDesaparecido();
       encontrarDesaparecido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       encontrarDesaparecido.setVisible(true);*/
    
    }

}
