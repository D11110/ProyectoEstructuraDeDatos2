/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuradatos2;

/**
 *
 * @author Daniel
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_Archivo = new javax.swing.JDialog();
        btnArchivoAbrir = new javax.swing.JButton();
        btnArchivoSalvar = new javax.swing.JButton();
        btnArchivoCerrar = new javax.swing.JButton();
        btnArchivoSalir = new javax.swing.JButton();
        btnArchivoNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jD_Campos = new javax.swing.JDialog();
        btnCamposCrear = new javax.swing.JButton();
        btnCamposListar = new javax.swing.JButton();
        btnCamposModificar = new javax.swing.JButton();
        btnCamposBorrar = new javax.swing.JButton();
        btnCamposSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jD_Registros = new javax.swing.JDialog();
        btnRegistrosIntroducir = new javax.swing.JButton();
        btnRegistrosModificar = new javax.swing.JButton();
        btnRegistrosBuscar = new javax.swing.JButton();
        btnRegistrosBorrar = new javax.swing.JButton();
        btnRegistrosListar = new javax.swing.JButton();
        btnRegistrosSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jD_Indices = new javax.swing.JDialog();
        btnIndicesCrear = new javax.swing.JButton();
        btnIndicesIndexar = new javax.swing.JButton();
        btnIndicesSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jD_Estandarizacion = new javax.swing.JDialog();
        btnEstandExportExcel = new javax.swing.JButton();
        btnEstandXMLSchema = new javax.swing.JButton();
        btnEstandSalir = new javax.swing.JButton();
        btnMainMenuArchivo = new javax.swing.JButton();
        btnMainMenuCampos = new javax.swing.JButton();
        btnMainMenuRegistros = new javax.swing.JButton();
        btnMainMenuIndices = new javax.swing.JButton();
        btnMainMenuEstandarizacion = new javax.swing.JButton();
        btnMainMenuSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jD_Archivo.setMinimumSize(new java.awt.Dimension(400, 400));
        jD_Archivo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnArchivoAbrir.setText("Abrir archivo");
        jD_Archivo.getContentPane().add(btnArchivoAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, -1, -1));

        btnArchivoSalvar.setText("Salvar archivo");
        jD_Archivo.getContentPane().add(btnArchivoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, -1, -1));

        btnArchivoCerrar.setText("Cerrar archivo");
        jD_Archivo.getContentPane().add(btnArchivoCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        btnArchivoSalir.setText("Salir");
        btnArchivoSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoSalirMouseClicked(evt);
            }
        });
        jD_Archivo.getContentPane().add(btnArchivoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 366, -1, -1));

        btnArchivoNuevo.setText("Nuevo archivo");
        btnArchivoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoNuevoMouseClicked(evt);
            }
        });
        jD_Archivo.getContentPane().add(btnArchivoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Archivo");
        jD_Archivo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/bgproyecto.jpg"))); // NOI18N
        jD_Archivo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-26, -20, 480, 450));

        jD_Campos.setMinimumSize(new java.awt.Dimension(400, 400));

        btnCamposCrear.setText("Crear campos");

        btnCamposListar.setText("Listar campos");

        btnCamposModificar.setText("Modificar campos");

        btnCamposBorrar.setText("Borrar campos");

        btnCamposSalir.setText("Salir");
        btnCamposSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCamposSalirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Campos");

        javax.swing.GroupLayout jD_CamposLayout = new javax.swing.GroupLayout(jD_Campos.getContentPane());
        jD_Campos.getContentPane().setLayout(jD_CamposLayout);
        jD_CamposLayout.setHorizontalGroup(
            jD_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_CamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_CamposLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCamposSalir))
                    .addGroup(jD_CamposLayout.createSequentialGroup()
                        .addGroup(jD_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCamposCrear)
                            .addComponent(btnCamposListar)
                            .addComponent(btnCamposModificar)
                            .addComponent(btnCamposBorrar)
                            .addComponent(jLabel1))
                        .addGap(0, 253, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jD_CamposLayout.setVerticalGroup(
            jD_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_CamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCamposCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCamposListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCamposModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCamposBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnCamposSalir)
                .addContainerGap())
        );

        jD_Registros.setMinimumSize(new java.awt.Dimension(400, 400));

        btnRegistrosIntroducir.setText("Introducir registros");

        btnRegistrosModificar.setText("Modificar registros");

        btnRegistrosBuscar.setText("Buscar registros");

        btnRegistrosBorrar.setText("Borrar registros");

        btnRegistrosListar.setText("Listar registros");

        btnRegistrosSalir.setText("Salir");
        btnRegistrosSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrosSalirMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Registros");

        javax.swing.GroupLayout jD_RegistrosLayout = new javax.swing.GroupLayout(jD_Registros.getContentPane());
        jD_Registros.getContentPane().setLayout(jD_RegistrosLayout);
        jD_RegistrosLayout.setHorizontalGroup(
            jD_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_RegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_RegistrosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrosSalir))
                    .addGroup(jD_RegistrosLayout.createSequentialGroup()
                        .addGroup(jD_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrosIntroducir)
                            .addComponent(btnRegistrosModificar)
                            .addComponent(btnRegistrosBuscar)
                            .addComponent(btnRegistrosBorrar)
                            .addComponent(btnRegistrosListar)
                            .addComponent(jLabel3))
                        .addGap(0, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jD_RegistrosLayout.setVerticalGroup(
            jD_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_RegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(btnRegistrosIntroducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrosModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrosBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrosBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrosListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnRegistrosSalir)
                .addContainerGap())
        );

        jD_Indices.setMinimumSize(new java.awt.Dimension(400, 400));

        btnIndicesCrear.setText("Crear indices");

        btnIndicesIndexar.setText("Re-indexar indices");

        btnIndicesSalir.setText("Salir");
        btnIndicesSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIndicesSalirMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Indices");

        javax.swing.GroupLayout jD_IndicesLayout = new javax.swing.GroupLayout(jD_Indices.getContentPane());
        jD_Indices.getContentPane().setLayout(jD_IndicesLayout);
        jD_IndicesLayout.setHorizontalGroup(
            jD_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_IndicesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_IndicesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIndicesSalir))
                    .addGroup(jD_IndicesLayout.createSequentialGroup()
                        .addGroup(jD_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIndicesCrear)
                            .addComponent(btnIndicesIndexar)
                            .addComponent(jLabel4))
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jD_IndicesLayout.setVerticalGroup(
            jD_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_IndicesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(btnIndicesCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIndicesIndexar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(btnIndicesSalir)
                .addContainerGap())
        );

        jD_Estandarizacion.setMinimumSize(new java.awt.Dimension(400, 400));

        btnEstandExportExcel.setText("Exportar excel");

        btnEstandXMLSchema.setText("Exportar XML con Schema");

        btnEstandSalir.setText("Salir");
        btnEstandSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstandSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jD_EstandarizacionLayout = new javax.swing.GroupLayout(jD_Estandarizacion.getContentPane());
        jD_Estandarizacion.getContentPane().setLayout(jD_EstandarizacionLayout);
        jD_EstandarizacionLayout.setHorizontalGroup(
            jD_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_EstandarizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstandExportExcel)
                    .addComponent(btnEstandXMLSchema))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_EstandarizacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEstandSalir)
                .addContainerGap())
        );
        jD_EstandarizacionLayout.setVerticalGroup(
            jD_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_EstandarizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEstandExportExcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstandXMLSchema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(btnEstandSalir)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMainMenuArchivo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMainMenuArchivo.setText("Archivo");
        btnMainMenuArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuArchivoMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 179, -1));

        btnMainMenuCampos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMainMenuCampos.setText("Campos");
        btnMainMenuCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuCamposMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        btnMainMenuRegistros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMainMenuRegistros.setText("Registros");
        btnMainMenuRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuRegistrosMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btnMainMenuIndices.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMainMenuIndices.setText("Indices");
        btnMainMenuIndices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuIndicesMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuIndices, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        btnMainMenuEstandarizacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMainMenuEstandarizacion.setText("Estandarizacion");
        btnMainMenuEstandarizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuEstandarizacionMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuEstandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnMainMenuSalir.setText("Salir");
        btnMainMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 566, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Standard File Manager");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/bgproyecto.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 630, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuArchivoMouseClicked
        // TODO add your handling code here:
        jD_Archivo.pack();
        jD_Archivo.setLocationRelativeTo(this);
        jD_Archivo.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuArchivoMouseClicked

    private void btnMainMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnMainMenuSalirMouseClicked

    private void btnArchivoSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoSalirMouseClicked
        // TODO add your handling code here:
        jD_Archivo.pack();
        jD_Archivo.setLocationRelativeTo(this);
        jD_Archivo.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnArchivoSalirMouseClicked

    private void btnMainMenuCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuCamposMouseClicked
        // TODO add your handling code here:
        jD_Campos.pack();
        jD_Campos.setLocationRelativeTo(this);
        jD_Campos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuCamposMouseClicked

    private void btnCamposSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamposSalirMouseClicked
        // TODO add your handling code here:
        jD_Campos.pack();
        jD_Campos.setLocationRelativeTo(this);
        jD_Campos.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnCamposSalirMouseClicked

    private void btnMainMenuRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuRegistrosMouseClicked
        // TODO add your handling code here:
        jD_Registros.pack();
        jD_Registros.setLocationRelativeTo(this);
        jD_Registros.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuRegistrosMouseClicked

    private void btnRegistrosSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosSalirMouseClicked
        // TODO add your handling code here:
        jD_Registros.pack();
        jD_Registros.setLocationRelativeTo(this);
        jD_Registros.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnRegistrosSalirMouseClicked

    private void btnMainMenuIndicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuIndicesMouseClicked
        // TODO add your handling code here:
        jD_Indices.pack();
        jD_Indices.setLocationRelativeTo(this);
        jD_Indices.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuIndicesMouseClicked

    private void btnIndicesSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIndicesSalirMouseClicked
        // TODO add your handling code here:
        jD_Indices.pack();
        jD_Indices.setLocationRelativeTo(this);
        jD_Indices.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnIndicesSalirMouseClicked

    private void btnMainMenuEstandarizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuEstandarizacionMouseClicked
        // TODO add your handling code here:
        jD_Estandarizacion.pack();
        jD_Estandarizacion.setLocationRelativeTo(this);
        jD_Estandarizacion.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuEstandarizacionMouseClicked

    private void btnEstandSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstandSalirMouseClicked
        // TODO add your handling code here:
        jD_Estandarizacion.pack();
        jD_Estandarizacion.setLocationRelativeTo(this);
        jD_Estandarizacion.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnEstandSalirMouseClicked

    private void btnArchivoNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoNuevoMouseClicked
        // TODO add your handling code here:
        //dlasdasudlhdas
    }//GEN-LAST:event_btnArchivoNuevoMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivoAbrir;
    private javax.swing.JButton btnArchivoCerrar;
    private javax.swing.JButton btnArchivoNuevo;
    private javax.swing.JButton btnArchivoSalir;
    private javax.swing.JButton btnArchivoSalvar;
    private javax.swing.JButton btnCamposBorrar;
    private javax.swing.JButton btnCamposCrear;
    private javax.swing.JButton btnCamposListar;
    private javax.swing.JButton btnCamposModificar;
    private javax.swing.JButton btnCamposSalir;
    private javax.swing.JButton btnEstandExportExcel;
    private javax.swing.JButton btnEstandSalir;
    private javax.swing.JButton btnEstandXMLSchema;
    private javax.swing.JButton btnIndicesCrear;
    private javax.swing.JButton btnIndicesIndexar;
    private javax.swing.JButton btnIndicesSalir;
    private javax.swing.JButton btnMainMenuArchivo;
    private javax.swing.JButton btnMainMenuCampos;
    private javax.swing.JButton btnMainMenuEstandarizacion;
    private javax.swing.JButton btnMainMenuIndices;
    private javax.swing.JButton btnMainMenuRegistros;
    private javax.swing.JButton btnMainMenuSalir;
    private javax.swing.JButton btnRegistrosBorrar;
    private javax.swing.JButton btnRegistrosBuscar;
    private javax.swing.JButton btnRegistrosIntroducir;
    private javax.swing.JButton btnRegistrosListar;
    private javax.swing.JButton btnRegistrosModificar;
    private javax.swing.JButton btnRegistrosSalir;
    private javax.swing.JDialog jD_Archivo;
    private javax.swing.JDialog jD_Campos;
    private javax.swing.JDialog jD_Estandarizacion;
    private javax.swing.JDialog jD_Indices;
    private javax.swing.JDialog jD_Registros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
