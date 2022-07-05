package sysseguridad.appdesktop;

public class FrmInicio extends javax.swing.JFrame {

    public FrmInicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); // Colocar la pantalla maximizada al inicio
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meInicio = new javax.swing.JMenuBar();
        meMantenimiento = new javax.swing.JMenu();
        meRol = new javax.swing.JMenuItem();
        meUsuario = new javax.swing.JMenuItem();
        meCambiarPassword = new javax.swing.JMenu();
        meCambiarUsuario = new javax.swing.JMenu();
        meSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        meMantenimiento.setMnemonic('M');
        meMantenimiento.setText("Mantenimiento");

        meRol.setMnemonic('R');
        meRol.setText("Rol");
        meRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meRolActionPerformed(evt);
            }
        });
        meMantenimiento.add(meRol);

        meUsuario.setMnemonic('U');
        meUsuario.setText("Usuario");
        meUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meUsuarioActionPerformed(evt);
            }
        });
        meMantenimiento.add(meUsuario);

        meInicio.add(meMantenimiento);

        meCambiarPassword.setMnemonic('p');
        meCambiarPassword.setText("Cambiar password");
        meCambiarPassword.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                meCambiarPasswordMenuSelected(evt);
            }
        });
        meInicio.add(meCambiarPassword);

        meCambiarUsuario.setMnemonic('C');
        meCambiarUsuario.setText("Cambiar usuario");
        meCambiarUsuario.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                meCambiarUsuarioMenuSelected(evt);
            }
        });
        meInicio.add(meCambiarUsuario);

        meSalir.setMnemonic('S');
        meSalir.setText("Salir");
        meSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                meSalirMenuSelected(evt);
            }
        });
        meInicio.add(meSalir);

        setJMenuBar(meInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meCambiarPasswordMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_meCambiarPasswordMenuSelected
        FrmCambiarPassword frmCambiarPassword = new FrmCambiarPassword(this);
        frmCambiarPassword.setVisible(true);
        frmCambiarPassword.setAlwaysOnTop(true); // mostrar el formulario activo en el caso que este apareciendo atras del formulario de inicio
        this.setEnabled(false);
    }//GEN-LAST:event_meCambiarPasswordMenuSelected

    private void meCambiarUsuarioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_meCambiarUsuarioMenuSelected
        this.setVisible(false);
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_meCambiarUsuarioMenuSelected

    private void meSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_meSalirMenuSelected
        this.setVisible(false);
        this.dispose();
        System.exit(0); // cerrar el sistema, usar para cerrar el sistema completamente
    }//GEN-LAST:event_meSalirMenuSelected

    private void meRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meRolActionPerformed
        FrmRolLec frmRolLec = new FrmRolLec(this);
        frmRolLec.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_meRolActionPerformed

    private void meUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meUsuarioActionPerformed
        FrmUsuarioLec frmUsuarioLec = new FrmUsuarioLec(this);
        frmUsuarioLec.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_meUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu meCambiarPassword;
    private javax.swing.JMenu meCambiarUsuario;
    private javax.swing.JMenuBar meInicio;
    private javax.swing.JMenu meMantenimiento;
    private javax.swing.JMenuItem meRol;
    private javax.swing.JMenu meSalir;
    private javax.swing.JMenuItem meUsuario;
    // End of variables declaration//GEN-END:variables
}
