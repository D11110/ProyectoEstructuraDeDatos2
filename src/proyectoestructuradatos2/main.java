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
        jLabel8 = new javax.swing.JLabel();
        jD_Registros = new javax.swing.JDialog();
        btnRegistrosIntroducir = new javax.swing.JButton();
        btnRegistrosModificar = new javax.swing.JButton();
        btnRegistrosBuscar = new javax.swing.JButton();
        btnRegistrosBorrar = new javax.swing.JButton();
        btnRegistrosListar = new javax.swing.JButton();
        btnRegistrosSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jD_Indices = new javax.swing.JDialog();
        btnIndicesCrear = new javax.swing.JButton();
        btnIndicesIndexar = new javax.swing.JButton();
        btnIndicesSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jD_Estandarizacion = new javax.swing.JDialog();
        btnEstandExportExcel = new javax.swing.JButton();
        btnEstandXMLSchema = new javax.swing.JButton();
        btnEstandSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnMainMenuArchivo = new javax.swing.JButton();
        btnMainMenuCampos = new javax.swing.JButton();
        btnMainMenuRegistros = new javax.swing.JButton();
        btnMainMenuIndices = new javax.swing.JButton();
        btnMainMenuEstandarizacion = new javax.swing.JButton();
        btnMainMenuSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jD_Archivo.setMaximumSize(new java.awt.Dimension(450, 450));
        jD_Archivo.setMinimumSize(new java.awt.Dimension(450, 450));
        jD_Archivo.setPreferredSize(new java.awt.Dimension(450, 450));
        jD_Archivo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnArchivoAbrir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnArchivoAbrir.setText("Abrir archivo");
        btnArchivoAbrir.setMaximumSize(new java.awt.Dimension(100, 20));
        btnArchivoAbrir.setMinimumSize(new java.awt.Dimension(100, 20));
        btnArchivoAbrir.setPreferredSize(new java.awt.Dimension(100, 20));
        jD_Archivo.getContentPane().add(btnArchivoAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 180, 30));

        btnArchivoSalvar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnArchivoSalvar.setText("Salvar archivo");
        jD_Archivo.getContentPane().add(btnArchivoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 180, 30));

        btnArchivoCerrar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnArchivoCerrar.setText("Cerrar archivo");
        jD_Archivo.getContentPane().add(btnArchivoCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 180, 30));

        btnArchivoSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 14)); // NOI18N
        btnArchivoSalir.setText("Salir");
        btnArchivoSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoSalirMouseClicked(evt);
            }
        });
        jD_Archivo.getContentPane().add(btnArchivoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        btnArchivoNuevo.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnArchivoNuevo.setText("Nuevo archivo");
        btnArchivoNuevo.setMaximumSize(new java.awt.Dimension(100, 20));
        btnArchivoNuevo.setMinimumSize(new java.awt.Dimension(100, 20));
        btnArchivoNuevo.setPreferredSize(new java.awt.Dimension(100, 20));
        btnArchivoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoNuevoMouseClicked(evt);
            }
        });
        jD_Archivo.getContentPane().add(btnArchivoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Archivo");
        jD_Archivo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/gradientarchivebg.png"))); // NOI18N
        jD_Archivo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -110, 530, 630));

        jD_Campos.setMinimumSize(new java.awt.Dimension(400, 400));
        jD_Campos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCamposCrear.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnCamposCrear.setText("Crear campos");
        jD_Campos.getContentPane().add(btnCamposCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        btnCamposListar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnCamposListar.setText("Listar campos");
        jD_Campos.getContentPane().add(btnCamposListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        btnCamposModificar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnCamposModificar.setText("Modificar campos");
        jD_Campos.getContentPane().add(btnCamposModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, -1));

        btnCamposBorrar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnCamposBorrar.setText("Borrar campos");
        jD_Campos.getContentPane().add(btnCamposBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        btnCamposSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnCamposSalir.setText("Salir");
        btnCamposSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCamposSalirMouseClicked(evt);
            }
        });
        jD_Campos.getContentPane().add(btnCamposSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Campos");
        jD_Campos.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/gradientarchivebg.png"))); // NOI18N
        jD_Campos.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jD_Registros.setMinimumSize(new java.awt.Dimension(400, 400));
        jD_Registros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrosIntroducir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosIntroducir.setText("Introducir registros");
        jD_Registros.getContentPane().add(btnRegistrosIntroducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 174, 39));

        btnRegistrosModificar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosModificar.setText("Modificar registros");
        jD_Registros.getContentPane().add(btnRegistrosModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 174, 39));

        btnRegistrosBuscar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosBuscar.setText("Buscar registros");
        jD_Registros.getContentPane().add(btnRegistrosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 174, 39));

        btnRegistrosBorrar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosBorrar.setText("Borrar registros");
        jD_Registros.getContentPane().add(btnRegistrosBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 174, 39));

        btnRegistrosListar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosListar.setText("Listar registros");
        jD_Registros.getContentPane().add(btnRegistrosListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, 174, 39));

        btnRegistrosSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnRegistrosSalir.setText("Salir");
        btnRegistrosSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrosSalirMouseClicked(evt);
            }
        });
        jD_Registros.getContentPane().add(btnRegistrosSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 70, 33));

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registros");
        jD_Registros.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/gradientarchivebg.png"))); // NOI18N
        jD_Registros.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jD_Indices.setMinimumSize(new java.awt.Dimension(400, 400));
        jD_Indices.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIndicesCrear.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnIndicesCrear.setText("Crear indices");
        jD_Indices.getContentPane().add(btnIndicesCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 163, 36));

        btnIndicesIndexar.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnIndicesIndexar.setText("Re-indexar indices");
        jD_Indices.getContentPane().add(btnIndicesIndexar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, 36));

        btnIndicesSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnIndicesSalir.setText("Salir");
        btnIndicesSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIndicesSalirMouseClicked(evt);
            }
        });
        jD_Indices.getContentPane().add(btnIndicesSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 351, 79, 38));

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Indices");
        jD_Indices.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/gradientarchivebg.png"))); // NOI18N
        jD_Indices.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, -1, -1));

        jD_Estandarizacion.setMinimumSize(new java.awt.Dimension(400, 400));
        jD_Estandarizacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstandExportExcel.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnEstandExportExcel.setText("Exportar excel");
        jD_Estandarizacion.getContentPane().add(btnEstandExportExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 229, 39));

        btnEstandXMLSchema.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnEstandXMLSchema.setText("Exportar XML con Schema");
        jD_Estandarizacion.getContentPane().add(btnEstandXMLSchema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, 39));

        btnEstandSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnEstandSalir.setText("Salir");
        btnEstandSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstandSalirMouseClicked(evt);
            }
        });
        jD_Estandarizacion.getContentPane().add(btnEstandSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 345, 78, 44));

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estandarizacion");
        jD_Estandarizacion.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/gradientarchivebg.png"))); // NOI18N
        jD_Estandarizacion.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMainMenuArchivo.setFont(new java.awt.Font("Eras Light ITC", 0, 36)); // NOI18N
        btnMainMenuArchivo.setText("Archivo");
        btnMainMenuArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuArchivoMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 179, -1));

        btnMainMenuCampos.setFont(new java.awt.Font("Eras Light ITC", 0, 36)); // NOI18N
        btnMainMenuCampos.setText("Campos");
        btnMainMenuCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuCamposMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, -1));

        btnMainMenuRegistros.setFont(new java.awt.Font("Eras Light ITC", 0, 36)); // NOI18N
        btnMainMenuRegistros.setText("Registros");
        btnMainMenuRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuRegistrosMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, -1));

        btnMainMenuIndices.setFont(new java.awt.Font("Eras Light ITC", 0, 36)); // NOI18N
        btnMainMenuIndices.setText("Indices");
        btnMainMenuIndices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuIndicesMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuIndices, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        btnMainMenuEstandarizacion.setFont(new java.awt.Font("Eras Light ITC", 0, 36)); // NOI18N
        btnMainMenuEstandarizacion.setText("Estandarizacion");
        btnMainMenuEstandarizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuEstandarizacionMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuEstandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnMainMenuSalir.setFont(new java.awt.Font("Eras Light ITC", 0, 24)); // NOI18N
        btnMainMenuSalir.setText("Salir");
        btnMainMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnMainMenuSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 481, 100, 40));

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 0, 56)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Standard File Manager");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoestructuradatos2/imgs/bgproyecto.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 660, 620));

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
