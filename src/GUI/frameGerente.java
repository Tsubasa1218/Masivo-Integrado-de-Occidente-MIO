/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Usuarios.ControladorUsuario;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Suaza
 */
public class frameGerente extends javax.swing.JFrame {

    /**
     * Creates new form frameGerente
     */
    
    ControladorUsuario cUsuario;
    CardLayout cl;
    public frameGerente() {
        initComponents();
        cUsuario = new ControladorUsuario();
        
        panelContenedor.setLayout(new CardLayout());
        panelContenedor.add(panelInicialSlogan, "Inicio");
        panelContenedor.add(panelSeleccionReporte, "Seleccionar reporte");
        panelContenedor.add(panelAgregarUsuario, "Agregar usuario");
        panelContenedor.add(panelMostrarReporte, "Reporte");
        cl = (CardLayout)panelContenedor.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeleccionReporte = new javax.swing.JPanel();
        panelAgregarUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cedulaCrearEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreCrearEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordCrearEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cargoCrearEmpleado = new javax.swing.JComboBox();
        aceptarCrearUsuario = new javax.swing.JButton();
        panelMostrarReporte = new javax.swing.JPanel();
        panelInicialSlogan = new javax.swing.JPanel();
        slogan = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reportesBoton = new javax.swing.JButton();
        empleadosBoton = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();

        javax.swing.GroupLayout panelSeleccionReporteLayout = new javax.swing.GroupLayout(panelSeleccionReporte);
        panelSeleccionReporte.setLayout(panelSeleccionReporteLayout);
        panelSeleccionReporteLayout.setHorizontalGroup(
            panelSeleccionReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelSeleccionReporteLayout.setVerticalGroup(
            panelSeleccionReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelAgregarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Contraseña:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cargo:");

        cargoCrearEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Seleccione un cargo --", "Conductor", "Director operativo", "Auxiliar de servicio al cliente", "Vendedor", "Director de estacion", " ", " ", " " }));

        aceptarCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/Botones/aceptar.png"))); // NOI18N
        aceptarCrearUsuario.setBorder(null);
        aceptarCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarUsuarioLayout = new javax.swing.GroupLayout(panelAgregarUsuario);
        panelAgregarUsuario.setLayout(panelAgregarUsuarioLayout);
        panelAgregarUsuarioLayout.setHorizontalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreCrearEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(cedulaCrearEmpleado)))
                    .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(aceptarCrearUsuario)
                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                            .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(35, 35, 35)
                            .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cargoCrearEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordCrearEmpleado)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelAgregarUsuarioLayout.setVerticalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cedulaCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cargoCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aceptarCrearUsuario)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMostrarReporteLayout = new javax.swing.GroupLayout(panelMostrarReporte);
        panelMostrarReporte.setLayout(panelMostrarReporteLayout);
        panelMostrarReporteLayout.setHorizontalGroup(
            panelMostrarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelMostrarReporteLayout.setVerticalGroup(
            panelMostrarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelInicialSlogan.setBackground(new java.awt.Color(255, 255, 255));

        slogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/slogan.png"))); // NOI18N

        javax.swing.GroupLayout panelInicialSloganLayout = new javax.swing.GroupLayout(panelInicialSlogan);
        panelInicialSlogan.setLayout(panelInicialSloganLayout);
        panelInicialSloganLayout.setHorizontalGroup(
            panelInicialSloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialSloganLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(slogan)
                .addGap(39, 39, 39))
        );
        panelInicialSloganLayout.setVerticalGroup(
            panelInicialSloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialSloganLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(slogan)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/banner.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/bars-chart.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/id-card.png"))); // NOI18N

        reportesBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/Botones/reportes.png"))); // NOI18N
        reportesBoton.setBorder(null);
        reportesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesBotonActionPerformed(evt);
            }
        });

        empleadosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/Botones/empleadosAgregar.png"))); // NOI18N
        empleadosBoton.setBorder(null);
        empleadosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosBotonActionPerformed(evt);
            }
        });

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(banner)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(reportesBoton))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(empleadosBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(reportesBoton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(empleadosBoton))
                        .addGap(254, 254, 254))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(banner)
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))))
                .addGap(0, 140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCrearUsuarioActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = nombreCrearEmpleado.getText();
            int cedula = Integer.parseInt(cedulaCrearEmpleado.getText());
            String password = passwordCrearEmpleado.getText();
            String cargo = cargoCrearEmpleado.getSelectedItem().toString();
            if (!cargo.equals("-- Seleccione un cargo --")) {
                int id_cargo = cUsuario.obtenerCodigoCargo(cargo);
                String cedula_s = "" + cedula;
                int numFilas = cUsuario.agregarEmpleado(nombre, cedula_s, password, id_cargo);
                if (numFilas != -1 || numFilas != 0) {
                    JOptionPane.showMessageDialog(null, "Empleado registrado!");

                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_aceptarCrearUsuarioActionPerformed

    private void empleadosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosBotonActionPerformed
        // TODO add your handling code here:
        cl.show(panelContenedor, "Agregar usuario");
    }//GEN-LAST:event_empleadosBotonActionPerformed

    private void reportesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesBotonActionPerformed
        // TODO add your handling code here:
        cl.show(panelContenedor, "Seleccionar reporte");
    }//GEN-LAST:event_reportesBotonActionPerformed

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
            java.util.logging.Logger.getLogger(frameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarCrearUsuario;
    private javax.swing.JLabel banner;
    private javax.swing.JComboBox cargoCrearEmpleado;
    private javax.swing.JTextField cedulaCrearEmpleado;
    private javax.swing.JButton empleadosBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreCrearEmpleado;
    private javax.swing.JPanel panelAgregarUsuario;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInicialSlogan;
    private javax.swing.JPanel panelMostrarReporte;
    private javax.swing.JPanel panelSeleccionReporte;
    private javax.swing.JTextField passwordCrearEmpleado;
    private javax.swing.JButton reportesBoton;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
