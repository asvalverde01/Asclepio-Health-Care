package app.gui.inicio;

import app.dataStruct.Lista;
import app.logic.Fecha;
import static app.logic.Main.connect;
import app.logic.users.Administrador;
import app.logic.users.Medico;
import app.logic.users.Usuario;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class InicioForm extends javax.swing.JFrame {

    // Atributo de lista
    private static Lista usuarios = new Lista();

    public static Lista getUsuarios() {
        return obtenerUsuarioDataBase(usuarios);
    }

    public void setUsuarios(Lista usuarios) {
        InicioForm.usuarios = usuarios;
    }

    public InicioForm() {
        initComponents();
        InicioForm.usuarios = obtenerUsuarioDataBase(usuarios);
    }

    /**
     * Creates new form InicioForm
     *
     * @param usuarios
     */
    public InicioForm(Lista usuarios) {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        InicioForm.usuarios = obtenerUsuarioDataBase(usuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        usuarioTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        mensaje1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseniaTxt = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        estadoLbl = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar");
        setMinimumSize(new java.awt.Dimension(1015, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/AsclepiusRodSmall).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -10, 250, 560));

        entrarButton.setBackground(new java.awt.Color(18, 84, 136));
        entrarButton.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setText("ENTRAR");
        entrarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 160, 40));

        usuarioTxt.setBackground(new java.awt.Color(204, 204, 204));
        usuarioTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(51, 51, 51));
        usuarioTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usuarioTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuarioTxt.setOpaque(true);
        usuarioTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        usuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTxtActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 220, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Asclepio - Health Care");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 70));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 46)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 84, 136));
        jLabel7.setText("Asclepio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 310, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 220, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, 30));

        mensaje1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        mensaje1.setForeground(new java.awt.Color(0, 0, 0));
        mensaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/userSmall.png"))); // NOI18N
        mensaje1.setText("Iniciar sesión");
        getContentPane().add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 320, 80));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, 30));

        contraseniaTxt.setBackground(new java.awt.Color(204, 204, 204));
        contraseniaTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contraseniaTxt.setForeground(new java.awt.Color(51, 51, 51));
        contraseniaTxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        contraseniaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaTxtActionPerformed(evt);
            }
        });
        contraseniaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseniaTxtKeyPressed(evt);
            }
        });
        getContentPane().add(contraseniaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 220, 40));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 200, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 220, 20));

        estadoLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estadoLbl.setForeground(new java.awt.Color(153, 0, 51));
        getContentPane().add(estadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 210, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed

        String usuarioInput = usuarioTxt.getText();
        String contraseniaInput = contraseniaTxt.getText();

        // Busca en la lista de usuarios un match en usuairo y contraseña
        for (Usuario usuario : usuarios.getUsuarios()) {
            if (usuario.getUsuario().equals(usuarioInput)) {
                if (usuario.getContrasenia().equals(contraseniaInput)) {
                    MainScreen main = new MainScreen(usuario);
                    main.setVisible(true);
                    main.setLocationRelativeTo(null);
                    estadoLbl.setText("");
                    this.dispose();
                    break;
                }
            }
        }
        if (usuarioInput.equals("") || contraseniaInput.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            estadoLbl.setText("");
        } else {
            estadoLbl.setText("Usuario o contraseña incorrecta");
        }

    }//GEN-LAST:event_entrarButtonActionPerformed

    private void usuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTxtActionPerformed
        // TODO add your handling code here:
        usuarioTxt.setText("");
    }//GEN-LAST:event_usuarioTxtActionPerformed

    private void contraseniaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseniaTxtActionPerformed

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backgroundKeyPressed

    }//GEN-LAST:event_backgroundKeyPressed

    private void contraseniaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseniaTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarButtonActionPerformed(null);
        }
    }//GEN-LAST:event_contraseniaTxtKeyPressed

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
            java.util.logging.Logger.getLogger(InicioForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioForm(usuarios).setVisible(true);
            }
        });
    }

    private static Lista obtenerUsuarioDataBase(Lista usuariosLista) {
        usuariosLista.eliminarElementos();
        Fecha nacimiento = new Fecha();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Usuario usuario;

            while (rs.next()) {
                // Obtengo el rol del usuario
                String rol = rs.getString("rol");
                // Si el rol es Administrador 
                if (rol.equals("Administrador")) {
                    usuario = new Administrador();
                    // Caso contrario es de rol Medico
                } else {
                    usuario = new Medico(rs.getString("especialidad"), rs.getString("correo"));
                }
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setRol(rs.getString("rol"));
                usuario.setCedula(rs.getString("cedula"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setAvatar(rs.getInt("avatar"));

                nacimiento.setDia(rs.getInt("dianac"));
                nacimiento.setMes(rs.getInt("mesnac"));
                nacimiento.setAnio(rs.getInt("anionac"));
                usuario.setFechaNacimiento(nacimiento);
                usuario.setRol(rs.getString("rol"));

                // añade el usuario registrado a la lista
                usuariosLista.agregar(usuario);
                usuario = null;
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return usuariosLista;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField contraseniaTxt;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel estadoLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
