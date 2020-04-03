/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingpeople;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Container extends javax.swing.JFrame {

    Login login = new Login();

    /**
     * Creates new form Container
     */
    public Container() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new WindowAdapter(){
                
                @Override
                public void windowClosing(WindowEvent e){
                    int x = JOptionPane.showConfirmDialog(null, "¿Realmemte quiere salir de ReLiz System?",
                                                          "Cerrar",
                                                          JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if(x == JOptionPane.YES_OPTION){
                        e.getWindow().dispose();
                        System.out.println("Cerrar");
                    }else{
                        System.out.println("Seguimo'");
                    }
                }
        });
        setFrameCenter(this);
        setTitle("KeLiz System - Menú Principal");
        setResizable(false);
        //  setExtendedState(MAXIMIZED_BOTH);
        button_RegistrarPersonaDesaparecida.setIcon(setIconInButtonPresioned("Images/EncontrarPersonaImagen.png", button_RegistrarPersonaDesaparecida,20,20));
        button_RegistrarPersonaDesaparecida.setIcon(setIconInButton("Images/EncontrarPersonaImagen.png", button_RegistrarPersonaDesaparecida));
    }

    public void setFrameCenter(JFrame f) {

        Toolkit toolkit = getToolkit();
        Dimension tamanoPantalla = toolkit.getScreenSize();
        f.setLocation((tamanoPantalla.width / 2) - (getWidth() / 2), (tamanoPantalla.height / 2) - (getHeight() / 2));

    }

    private void setImagenJLabel(JLabel label, String ruta) {

        // El codigo esta explicado en este video (https://www.youtube.com/watch?v=G3QJqbYuJ7M)
        ImageIcon miImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(ruta)));
        Image img1 = miImageIcon.getImage();
        Image img2 = img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        label.setIcon(i);
    }

    private Icon setIconInButton(String ruta, JButton button) {

        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        int ancho = button.getWidth();
        int alto = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }

        private Icon setIconInButtonPresioned(String ruta, JButton button,int ancho, int altura) {

        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        int width = button.getWidth() - ancho;
        int height = button.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Container = new javax.swing.JPanel();
        button_Reportes = new javax.swing.JButton();
        panel_EncontrarPersonasDesaparecidas = new javax.swing.JPanel();
        label_EncontrarPersonaDesaparecida = new javax.swing.JLabel();
        button_EncontrarPersonaDesaparecida = new javax.swing.JButton();
        panel_SimulacionEnTiempoReal = new javax.swing.JPanel();
        label_SimulacionEnTiempoReal = new javax.swing.JLabel();
        button_SimulacionEnTiempoReal = new javax.swing.JButton();
        button_CerrarSesion = new javax.swing.JButton();
        panel_RegistrarPersonasDesaparecidas = new javax.swing.JPanel();
        label_ImagenFondo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label_ImagenFondo2 = new javax.swing.JLabel();
        label_EncontrarPersonaDesaparecida1 = new javax.swing.JLabel();
        button_RegistrarPersonaDesaparecida = new javax.swing.JButton();
        label_RegistrarPersonaDesaparecida = new javax.swing.JLabel();
        label_MenuPrincipal = new javax.swing.JLabel();
        button_Accesos = new javax.swing.JButton();

        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        panel_Container.setBackground(new java.awt.Color(37, 47, 65));
        panel_Container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_Container.setMaximumSize(null);
        panel_Container.setPreferredSize(new java.awt.Dimension(1000, 650));
        panel_Container.setLayout(null);

        button_Reportes.setBackground(new java.awt.Color(4, 96, 194));
        button_Reportes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_Reportes.setForeground(new java.awt.Color(225, 225, 225));
        button_Reportes.setActionCommand("Reportes");
        button_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_Reportes.setLabel("Reportes");
        button_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ReportesActionPerformed(evt);
            }
        });
        panel_Container.add(button_Reportes);
        button_Reportes.setBounds(830, 180, 130, 60);

        panel_EncontrarPersonasDesaparecidas.setBackground(new java.awt.Color(4, 96, 194));

        label_EncontrarPersonaDesaparecida.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label_EncontrarPersonaDesaparecida.setForeground(new java.awt.Color(225, 255, 255));
        label_EncontrarPersonaDesaparecida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_EncontrarPersonaDesaparecida.setText("Encontrar Persona Desaparecida");

        button_EncontrarPersonaDesaparecida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findingpeople/Images/lost_find.png"))); // NOI18N
        button_EncontrarPersonaDesaparecida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EncontrarPersonaDesaparecidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_EncontrarPersonasDesaparecidasLayout = new javax.swing.GroupLayout(panel_EncontrarPersonasDesaparecidas);
        panel_EncontrarPersonasDesaparecidas.setLayout(panel_EncontrarPersonasDesaparecidasLayout);
        panel_EncontrarPersonasDesaparecidasLayout.setHorizontalGroup(
            panel_EncontrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EncontrarPersonasDesaparecidasLayout.createSequentialGroup()
                .addGroup(panel_EncontrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EncontrarPersonasDesaparecidasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_EncontrarPersonaDesaparecida, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_EncontrarPersonasDesaparecidasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(button_EncontrarPersonaDesaparecida, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_EncontrarPersonasDesaparecidasLayout.setVerticalGroup(
            panel_EncontrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EncontrarPersonasDesaparecidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_EncontrarPersonaDesaparecida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_EncontrarPersonaDesaparecida)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_Container.add(panel_EncontrarPersonasDesaparecidas);
        panel_EncontrarPersonasDesaparecidas.setBounds(290, 180, 260, 220);

        panel_SimulacionEnTiempoReal.setBackground(new java.awt.Color(4, 96, 194));

        label_SimulacionEnTiempoReal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label_SimulacionEnTiempoReal.setForeground(new java.awt.Color(225, 225, 225));
        label_SimulacionEnTiempoReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SimulacionEnTiempoReal.setText("Simulacion en tiempo real");

        button_SimulacionEnTiempoReal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findingpeople/Images/recogface.jpg"))); // NOI18N
        button_SimulacionEnTiempoReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SimulacionEnTiempoRealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_SimulacionEnTiempoRealLayout = new javax.swing.GroupLayout(panel_SimulacionEnTiempoReal);
        panel_SimulacionEnTiempoReal.setLayout(panel_SimulacionEnTiempoRealLayout);
        panel_SimulacionEnTiempoRealLayout.setHorizontalGroup(
            panel_SimulacionEnTiempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SimulacionEnTiempoRealLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_SimulacionEnTiempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SimulacionEnTiempoRealLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_SimulacionEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button_SimulacionEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_SimulacionEnTiempoRealLayout.setVerticalGroup(
            panel_SimulacionEnTiempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SimulacionEnTiempoRealLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_SimulacionEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_SimulacionEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_SimulacionEnTiempoReal.getAccessibleContext().setAccessibleName("Simulacion en Tiempo Real");

        panel_Container.add(panel_SimulacionEnTiempoReal);
        panel_SimulacionEnTiempoReal.setBounds(560, 180, 240, 220);

        button_CerrarSesion.setBackground(new java.awt.Color(4, 96, 194));
        button_CerrarSesion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_CerrarSesion.setForeground(new java.awt.Color(225, 225, 225));
        button_CerrarSesion.setText("Cerrar Sesión");
        button_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CerrarSesionActionPerformed(evt);
            }
        });
        panel_Container.add(button_CerrarSesion);
        button_CerrarSesion.setBounds(830, 340, 130, 60);

        panel_RegistrarPersonasDesaparecidas.setBackground(new java.awt.Color(4, 96, 194));
        panel_RegistrarPersonasDesaparecidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_ImagenFondo1.setBackground(new java.awt.Color(37, 47, 65));
        label_ImagenFondo1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(4, 96, 194));

        label_ImagenFondo2.setBackground(new java.awt.Color(37, 47, 65));
        label_ImagenFondo2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        label_EncontrarPersonaDesaparecida1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label_EncontrarPersonaDesaparecida1.setForeground(new java.awt.Color(225, 255, 255));
        label_EncontrarPersonaDesaparecida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_EncontrarPersonaDesaparecida1.setText("Encontrar Persona Desaparecida");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(label_ImagenFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_EncontrarPersonaDesaparecida1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(label_EncontrarPersonaDesaparecida1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_ImagenFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_RegistrarPersonaDesaparecida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findingpeople/Images/EncontrarPersonaImagen.png"))); // NOI18N
        button_RegistrarPersonaDesaparecida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_RegistrarPersonaDesaparecida.setMaximumSize(new java.awt.Dimension(100, 200));
        button_RegistrarPersonaDesaparecida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegistrarPersonaDesaparecidaActionPerformed(evt);
            }
        });

        label_RegistrarPersonaDesaparecida.setBackground(new java.awt.Color(37, 47, 65));
        label_RegistrarPersonaDesaparecida.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label_RegistrarPersonaDesaparecida.setForeground(new java.awt.Color(255, 255, 255));
        label_RegistrarPersonaDesaparecida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_RegistrarPersonaDesaparecida.setText("Registrar Persona Desaparecida");

        javax.swing.GroupLayout panel_RegistrarPersonasDesaparecidasLayout = new javax.swing.GroupLayout(panel_RegistrarPersonasDesaparecidas);
        panel_RegistrarPersonasDesaparecidas.setLayout(panel_RegistrarPersonasDesaparecidasLayout);
        panel_RegistrarPersonasDesaparecidasLayout.setHorizontalGroup(
            panel_RegistrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(label_ImagenFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_RegistrarPersonaDesaparecida))
                    .addComponent(button_RegistrarPersonaDesaparecida, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                    .addGap(498, 498, 498)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(498, Short.MAX_VALUE)))
        );
        panel_RegistrarPersonasDesaparecidasLayout.setVerticalGroup(
            panel_RegistrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_RegistrarPersonaDesaparecida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_RegistrarPersonaDesaparecida)
                .addGap(82, 82, 82)
                .addComponent(label_ImagenFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_RegistrarPersonasDesaparecidasLayout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        panel_Container.add(panel_RegistrarPersonasDesaparecidas);
        panel_RegistrarPersonasDesaparecidas.setBounds(20, 180, 260, 220);

        label_MenuPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        label_MenuPrincipal.setForeground(new java.awt.Color(225, 255, 255));
        label_MenuPrincipal.setText("Menú Principal");
        panel_Container.add(label_MenuPrincipal);
        label_MenuPrincipal.setBounds(30, 50, 310, 50);

        button_Accesos.setBackground(new java.awt.Color(4, 96, 194));
        button_Accesos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_Accesos.setForeground(new java.awt.Color(225, 225, 225));
        button_Accesos.setText("Accesos");
        button_Accesos.setActionCommand("Reportes");
        button_Accesos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_Accesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AccesosActionPerformed(evt);
            }
        });
        panel_Container.add(button_Accesos);
        button_Accesos.setBounds(830, 260, 130, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistrarPersonaDesaparecidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarPersonaDesaparecidaActionPerformed

        UploadPeople uploadPeople = new UploadPeople();
        this.hide();
        uploadPeople.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_button_RegistrarPersonaDesaparecidaActionPerformed

    private void button_EncontrarPersonaDesaparecidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EncontrarPersonaDesaparecidaActionPerformed
        System.out.println("Esta wea funciona");        // TODO add your handling code here:
    }//GEN-LAST:event_button_EncontrarPersonaDesaparecidaActionPerformed

    private void button_SimulacionEnTiempoRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SimulacionEnTiempoRealActionPerformed
        System.out.println("Esta wea funciona");        // TODO add your handling code here:
    }//GEN-LAST:event_button_SimulacionEnTiempoRealActionPerformed

    private void button_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ReportesActionPerformed
        Reports reports = new Reports();
        this.hide();
        reports.show();
    }//GEN-LAST:event_button_ReportesActionPerformed

    private void button_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CerrarSesionActionPerformed
            int logout = JOptionPane.showConfirmDialog(null, "Do you really want to logout?",
                                                       "Logout",
                                                       JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(logout == JOptionPane.YES_OPTION){
                            Login login = new Login();
                            this.hide();
                            login.show();
                            System.out.println("Logout");
                        }else{
                            System.out.println("Still Login");
                        }
       
        

    }//GEN-LAST:event_button_CerrarSesionActionPerformed

    private void button_AccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AccesosActionPerformed
        Accesos access = new Accesos();
        this.hide();
        access.show();
    }//GEN-LAST:event_button_AccesosActionPerformed

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
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Container().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Accesos;
    private javax.swing.JButton button_CerrarSesion;
    private javax.swing.JButton button_EncontrarPersonaDesaparecida;
    private javax.swing.JButton button_RegistrarPersonaDesaparecida;
    private javax.swing.JButton button_Reportes;
    private javax.swing.JButton button_SimulacionEnTiempoReal;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_EncontrarPersonaDesaparecida;
    private javax.swing.JLabel label_EncontrarPersonaDesaparecida1;
    private javax.swing.JLabel label_ImagenFondo1;
    private javax.swing.JLabel label_ImagenFondo2;
    private javax.swing.JLabel label_MenuPrincipal;
    private javax.swing.JLabel label_RegistrarPersonaDesaparecida;
    private javax.swing.JLabel label_SimulacionEnTiempoReal;
    private javax.swing.JPanel panel_Container;
    private javax.swing.JPanel panel_EncontrarPersonasDesaparecidas;
    private javax.swing.JPanel panel_RegistrarPersonasDesaparecidas;
    private javax.swing.JPanel panel_SimulacionEnTiempoReal;
    // End of variables declaration//GEN-END:variables
}
