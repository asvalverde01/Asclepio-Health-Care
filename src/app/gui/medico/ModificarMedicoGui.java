package app.gui.medico;

import app.logic.Fecha;
import app.logic.users.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ModificarMedicoGui extends javax.swing.JFrame {

    Usuario medicoModificar;

    public ModificarMedicoGui(Usuario medico) {
        initComponents();
        this.medicoModificar = medico;
        diaSpinner.setValue(medico.getFechaNacimiento().getDia());
        anioSpinner.setValue(medico.getFechaNacimiento().getAnio());
        int indice;
        if (medico.getSexo().equals("Femenino")) {
            indice = 0;
        } else {
            indice = 1;
        }
        sexoCombo.setSelectedIndex(indice);
        nombreTxt.setText(medico.getNombre());
        apellidoTxt.setText(medico.getApellido());

        // Permite solamente ingresar letras en el text field
        nombreTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // ignore the event if it's not an alphabet
                }
            }
        }
        );

        // Permite solamente ingresar letras en el text field
        apellidoTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // ignore the event if it's not an alphabet
                }
            }
        }
        );
    }

    private ModificarMedicoGui() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        bienvenidaLabel = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        apellidoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        sexoCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        diaSpinner = new javax.swing.JSpinner();
        mesCombo = new javax.swing.JComboBox<>();
        anioSpinner = new javax.swing.JSpinner();
        modificarButton = new javax.swing.JButton();
        especialidadCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 430, 20));

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        bienvenidaLabel.setForeground(new java.awt.Color(102, 0, 153));
        bienvenidaLabel.setText("Modificar M??dico");
        getContentPane().add(bienvenidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        nombreTxt.setBackground(new java.awt.Color(102, 102, 102));
        nombreTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setBorder(null);
        nombreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreTxt.setOpaque(true);
        nombreTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 340, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 340, 10));

        apellidoTxt.setBackground(new java.awt.Color(102, 102, 102));
        apellidoTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setBorder(null);
        apellidoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoTxt.setOpaque(true);
        apellidoTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 340, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 340, 10));

        sexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        sexoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoComboActionPerformed(evt);
            }
        });
        getContentPane().add(sexoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 30));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Sexo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("D??a");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 20));

        diaSpinner.setValue(1);
        getContentPane().add(diaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesComboActionPerformed(evt);
            }
        });
        getContentPane().add(mesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 110, 30));
        getContentPane().add(anioSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 100, 30));

        modificarButton.setBackground(new java.awt.Color(18, 84, 136));
        modificarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modificarButton.setForeground(new java.awt.Color(255, 255, 255));
        modificarButton.setText("Modificar");
        modificarButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 220, 40));

        especialidadCombo.setBackground(new java.awt.Color(102, 102, 102));
        especialidadCombo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        especialidadCombo.setForeground(new java.awt.Color(51, 51, 51));
        especialidadCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina Interna", "Cardiolog??a", "Neurolog??a", "Dermatolog??a", " ", " ", " " }));
        especialidadCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadComboActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 340, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Especialidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
        nombreTxt.setText("");
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void sexoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoComboActionPerformed

    private void mesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesComboActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        boolean correcto = false;
        boolean correctoCampos = false;
        boolean valid = true;

        // Obtiene los valores ingresados
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String sexo = sexoCombo.getSelectedItem().toString();

        int dia = (Integer) diaSpinner.getValue();
        String mes = mesCombo.getSelectedItem().toString();
        int anio = (Integer) anioSpinner.getValue();
        Fecha nacimiento = new Fecha();

        // Se verifica que se ingresen datos
        // Verifica que nombre solamente contenga letras
        if (nombre.length() <= 0 && apellido.length() <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese nombre y apellido");
            valid = false;
        } else {
            if (nombre.length() > 0) {
                if (nombre.matches("[a-zA-Z]+")) {
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras");
                    valid = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vac??o");
                valid = false;
            }
            if (apellido.length() > 0 && valid) {
                if (apellido.matches("[a-zA-Z]+")) {
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El apellido solo puede contener letras");
                    valid = false;
                }
            } else {
                if (apellido.length() <= 0) {
                    JOptionPane.showMessageDialog(null, "El apellido no puede estar vac??o");
                    valid = false;
                }
            }
        }

        // Verifica que se hayan ingresado valores en nombre y apellido
        if (nombre.length() > 1 && apellido.length() > 1) {
            correctoCampos = true;
        }

        // Verifica que la fecha ingresada se encuentre dentro de los rangos permitidos
        if (dia < 1 || dia > 31 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "D??a inv??lido");

            correctoCampos = false;
        }

        if (dia >= 1 && dia <= 31) {
            correctoCampos = true;
        }

        // Verifica que el a??o ingresado sea valido y la edad del usuairo sea mayor a 18
        if (anio >= 1925 || anio <= 2022) {
            correctoCampos = true;
        } else {
            JOptionPane.showMessageDialog(null, "El a??o ingresado se encuentra fuera del rango permitido");
            correctoCampos = false;
        }
        if (anio < 1925 || anio > 2022 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "A??o inv??lido");
            correctoCampos = false;
        }

        // Intenta inicializar la fecha con los datos ingresados
        try {
            nacimiento.setDia(dia);
            nacimiento.setMes(nacimiento.setMesString(mes));
            nacimiento.setAnio(anio);

            correcto = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique los datos en fecha");
            correcto = false;
        }

        // Al final cuando el avatar ya ha sido seleccionado, se procede a continuar a la seleccion de la etapa
        if (correctoCampos && correcto) {
            // Crea un usuario usando el constructor por parametros
            // TODO
            this.medicoModificar.modificarInfoUsuario(nombre, apellido, nacimiento);

            //this.medicoModificar.modificarInfoUsuario("Fecha", nombre);
            vaciarCampos();
            this.dispose();
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void especialidadComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadComboActionPerformed

    }//GEN-LAST:event_especialidadComboActionPerformed
    private void vaciarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");

        diaSpinner.setValue(1);
        anioSpinner.setValue(2000);

    }

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
            java.util.logging.Logger.getLogger(ModificarMedicoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarMedicoGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner anioSpinner;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JSpinner diaSpinner;
    private javax.swing.JComboBox<String> especialidadCombo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> sexoCombo;
    // End of variables declaration//GEN-END:variables
}
