package app.gui.inicio;

import app.dataStruct.ListaPacientes;
import app.logic.Fecha;
import app.logic.Main;
import app.logic.users.Paciente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Programa AsclepioHC InicioPanel permite entrar y registrar
 *
 */
public class registroPacientePanel extends javax.swing.JPanel {

    /**
     * Creates new form inicioPanel
     */
    public registroPacientePanel() {
        initComponents();
        // Invoca al método actualizarFecha enviando un objeto de fecha actual para actualizar el label fecha con la fecha actual 
        actualizarFecha(new Fecha());
        anioSpinner.setValue(2000);

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

        // Permite solamente ingresar dígitos en el text field
        cedulaTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // ignore the event if it's not an alphabet
                }
            }
        }
        );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        fechaLabel = new javax.swing.JLabel();
        bienvenidaLabel = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        avatarLogo = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        apellidoTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diaSpinner = new javax.swing.JSpinner();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        anioSpinner = new javax.swing.JSpinner();
        cedulaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        registrarBtn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mesCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        sexoCombo = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(870, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 84, 136));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setText("El día de hoy es -- de -- del año --");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(fechaLabel)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fechaLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 870, 60));

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        bienvenidaLabel.setForeground(new java.awt.Color(102, 0, 153));
        bienvenidaLabel.setText("Registrar un paciente");
        bg.add(bienvenidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        msg2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        msg2.setForeground(new java.awt.Color(0, 0, 102));
        bg.add(msg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));
        bg.add(avatarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 70));

        nombreTxt.setBackground(new java.awt.Color(102, 102, 102));
        nombreTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setText("Alberto");
        nombreTxt.setBorder(null);
        nombreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreTxt.setOpaque(true);
        nombreTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        bg.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 340, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 340, 10));

        apellidoTxt.setBackground(new java.awt.Color(102, 102, 102));
        apellidoTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setText("Valverde");
        apellidoTxt.setBorder(null);
        apellidoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoTxt.setOpaque(true);
        apellidoTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        bg.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 340, 30));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Día");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nombre");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        diaSpinner.setValue(1);
        bg.add(diaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 90, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 460, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Fecha de Nacimiento");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Año");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Apellido");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        bg.add(anioSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 100, 30));

        cedulaTxt.setBackground(new java.awt.Color(102, 102, 102));
        cedulaTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedulaTxt.setForeground(new java.awt.Color(255, 255, 255));
        cedulaTxt.setText("0605226992");
        cedulaTxt.setBorder(null);
        cedulaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedulaTxt.setOpaque(true);
        cedulaTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });
        bg.add(cedulaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 340, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 340, 10));

        registrarBtn.setBackground(new java.awt.Color(18, 84, 136));
        registrarBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrar");
        registrarBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        bg.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 220, 40));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 340, 10));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Mes");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Cédula");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesComboActionPerformed(evt);
            }
        });
        bg.add(mesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 110, 30));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Sexo");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        sexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        sexoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoComboActionPerformed(evt);
            }
        });
        bg.add(sexoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 160, 30));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 800));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
        nombreTxt.setText("");
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed

    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
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
        String cedula = cedulaTxt.getText();
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
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
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
                    JOptionPane.showMessageDialog(null, "El apellido no puede estar vacío");
                    valid = false;
                }
            }
        }

        // Verifica que la cedula sea valida solamente si los campos anteriormente se validaron
        if (valid) {
            valid = validarCedula(cedula);
            if (validarCedulaUnica(cedula)) {
                valid = true;
            } else {
                valid = false;
                JOptionPane.showMessageDialog(null, "Paciente ya registrado");
                //vaciarCampos();
            }
        }

        // Verifica que se hayan ingresado valores en nombre y apellido
        if (nombre.length() > 1 && apellido.length() > 1) {
            correctoCampos = true;
        }

        // Verifica que la fecha ingresada se encuentre dentro de los rangos permitidos
        if (dia < 1 || dia > 31 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "Día inválido");

            correctoCampos = false;
        }

        if (dia >= 1 && dia <= 31) {
            correctoCampos = true;
        }

        // Verifica que el año ingresado sea valido y la edad del usuairo sea mayor a 18
        if (anio >= 1925 || anio <= 2022) {
            correctoCampos = true;
        } else {
            JOptionPane.showMessageDialog(null, "El año ingresado se encuentra fuera del rango permitido");
            correctoCampos = false;
        }
        if (anio < 1925 || anio > 2022 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "Año inválido");
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
        if (valid && correctoCampos && correcto) {
            // Crea un usuario usando el constructor por parametros
            Paciente pacienteNuevo = new Paciente(cedula, nombre, apellido, sexo, nacimiento);
            if (registrarPacienteDataBase(pacienteNuevo)) {
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
                MainScreen.listaPacientes = Main.obtenerPacientesDataBase();
                vaciarCampos();
            } else {
                System.out.println("error en registro");
            }
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void mesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesComboActionPerformed

    private void sexoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner anioSpinner;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel avatarLogo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JSpinner diaSpinner;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JLabel msg2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JComboBox<String> sexoCombo;
    // End of variables declaration//GEN-END:variables

    private void actualizarFecha(Fecha actual) {
        fechaLabel.setText("Hoy es " + actual.getDia() + " de " + actual.getMesString() + " del año " + actual.getAnio() + " ");
    }

    /**
     * Recibe como parametro la cedula y verifica si es una cédula Ecuatoriana
     * válida
     *
     * @param document String cédula a evaluar
     * @return boolean true si es una cédula válida, false en caso de ser
     * inválida
     */
    private boolean validarCedula(String document) {
        byte sum = 0;
        try {
            if (document.trim().length() != 10) {
                JOptionPane.showMessageDialog(null, "Cédula debe constar de 10 dígitos");
                return false;
            }
            String[] data = document.split("");
            byte verifier = Byte.parseByte(data[0] + data[1]);
            if (verifier < 1 || verifier > 24) {
                JOptionPane.showMessageDialog(null, "Formato de cédula inválido");
                return false;
            }
            byte[] digits = new byte[data.length];
            for (byte i = 0; i < digits.length; i++) {
                digits[i] = Byte.parseByte(data[i]);
            }
            if (digits[2] > 6) {
                JOptionPane.showMessageDialog(null, "Formato de cédula inválido");
                return false;
            }
            for (byte i = 0; i < digits.length - 1; i++) {
                if (i % 2 == 0) {
                    verifier = (byte) (digits[i] * 2);
                    if (verifier > 9) {
                        verifier = (byte) (verifier - 9);
                    }
                } else {
                    verifier = digits[i];
                }
                sum = (byte) (sum + verifier);
            }
            if ((sum - (sum % 10) + 10 - sum) == digits[9]) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Formato de cédula inválido");
        return false;
    }

    /**
     * Verifica que la cedula sea unica buscandola en la lista
     *
     * @param cedula cedula a buscar
     * @return true si no existe, false si ya existe
     */
    private boolean validarCedulaUnica(String cedula) {
        // Busca en la lista listaPacientes si ya existe la cedula
        ListaPacientes listaPacientes = MainScreen.getListaPacientes();
        for (Paciente paciente : listaPacientes.getPacientes()) {
            if (paciente.getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(null, "Paciente ya registrado");
                return false;
            }
        }
        // En caso de no encontrarla
        return true;
    }

    private boolean registrarPacienteDataBase(Paciente usuarioNuevo) {
        boolean conectado = Main.isConectado();
        if (conectado) {
            // En el la tabla usuario de la base de datos registra los datos
            try {
                String cedula = usuarioNuevo.getCedula();

                String nombre = usuarioNuevo.getNombre();
                String apellido = usuarioNuevo.getApellido();
                String sexo = usuarioNuevo.getSexo();

                int dia = usuarioNuevo.getFechaNacimiento().getDia();
                int mes = usuarioNuevo.getFechaNacimiento().getMes();
                int anio = usuarioNuevo.getFechaNacimiento().getAnio();

                String SQL = "INSERT INTO paciente (nombre, apellido, cedula, sexo, dia, mes, anio) VALUES ('" + nombre + "', '" + apellido + "', '" + cedula + "', '" + sexo + "', '" + dia + "', '" + mes + "', '" + anio + "')";
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                st.executeUpdate();
                System.out.println("registrado");
                return true;

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
        return false;
    }

    private void vaciarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");

        cedulaTxt.setText("");
        diaSpinner.setValue(1);
        anioSpinner.setValue(2000);

    }
}
