package app.gui.inicio;

import app.dataStruct.ListaPacientes;
import app.gui.paciente.ModificarPacienteGui;
import app.logic.Fecha;
import app.logic.Main;
import app.logic.users.Paciente;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class buscarPacientePanel extends javax.swing.JPanel {

    private final Fecha actual;
    // Atributo de lista
    private static ListaPacientes listaPacientes;
    private DefaultTableModel model;
    private Paciente pacienteActual;

    // Modelo lista
    private DefaultListModel dlm = new DefaultListModel();

    /**
     * Creates new form inicioPanel
     *
     * @param usuario
     */
    public buscarPacientePanel() {
        initComponents();
        actual = new Fecha();
        pacienteActual = null;
        actualizarFecha(actual);
        setInformation();
        lstResultados.setModel(dlm);
        modificarPacienteButton.setVisible(false);
        eliminarPacienteButton.setVisible(false);
        if (MainScreen.getUserID().equals("admin")) {
            jLabel10.setText("Ingrese la cédula del doctor a cargo");
            cedulaTxt1.setVisible(true);
            buscarPacienteButton1.setVisible(true);
            jSeparator4.setVisible(true);

        } else {

            jLabel10.setText("");
            cedulaTxt1.setVisible(false);
            buscarPacienteButton1.setVisible(false);
            jSeparator4.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fechaLabel = new javax.swing.JLabel();
        bienvenidaLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        todosBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstResultados = new javax.swing.JList<>();
        cedulaTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        buscarPacienteButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eliminarPacienteButton = new javax.swing.JButton();
        modificarPacienteButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cedulaTxt1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        buscarPacienteButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        filtrarBOX = new javax.swing.JComboBox<>();
        buscarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 870, -1));

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        bienvenidaLabel.setForeground(new java.awt.Color(102, 0, 153));
        bienvenidaLabel.setText("Búsqueda Paciente");
        add(bienvenidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(81, 3, 23));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 570, 20));

        todosBtn.setBackground(new java.awt.Color(18, 84, 136));
        todosBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        todosBtn.setForeground(new java.awt.Color(255, 255, 255));
        todosBtn.setText("Mostrar todos");
        todosBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        todosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosBtnActionPerformed(evt);
            }
        });
        add(todosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, -1));

        lstResultados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstResultados);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 730, 150));

        cedulaTxt.setBackground(new java.awt.Color(102, 102, 102));
        cedulaTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedulaTxt.setForeground(new java.awt.Color(255, 255, 255));
        cedulaTxt.setBorder(null);
        cedulaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedulaTxt.setOpaque(true);
        cedulaTxt.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });
        add(cedulaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 140, 10));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Ingrese la cédula del paciente a buscar");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        buscarPacienteButton.setBackground(new java.awt.Color(18, 84, 136));
        buscarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        buscarPacienteButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarPacienteButton.setText("Buscar Paciente");
        buscarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPacienteButtonActionPerformed(evt);
            }
        });
        add(buscarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 200, 30));

        nombreLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(51, 51, 51));
        nombreLabel.setText("nombre");
        add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        apellidoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(51, 51, 51));
        apellidoLabel.setText("apellido");
        add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Encontrado:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        eliminarPacienteButton.setBackground(new java.awt.Color(255, 102, 102));
        eliminarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminarPacienteButton.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPacienteButton.setText("Eliminar Paciente");
        eliminarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPacienteButtonActionPerformed(evt);
            }
        });
        add(eliminarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 210, -1));

        modificarPacienteButton.setBackground(new java.awt.Color(0, 204, 204));
        modificarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificarPacienteButton.setForeground(new java.awt.Color(0, 0, 0));
        modificarPacienteButton.setText("Modificar Paciente");
        modificarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPacienteButtonActionPerformed(evt);
            }
        });
        add(modificarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 210, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Ingrese la cédula del doctor a cargo");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        cedulaTxt1.setBackground(new java.awt.Color(102, 102, 102));
        cedulaTxt1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedulaTxt1.setForeground(new java.awt.Color(255, 255, 255));
        cedulaTxt1.setBorder(null);
        cedulaTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedulaTxt1.setOpaque(true);
        cedulaTxt1.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        cedulaTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxt1ActionPerformed(evt);
            }
        });
        add(cedulaTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 140, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 140, 10));

        buscarPacienteButton1.setBackground(new java.awt.Color(18, 84, 136));
        buscarPacienteButton1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        buscarPacienteButton1.setForeground(new java.awt.Color(255, 255, 255));
        buscarPacienteButton1.setText("Filtrar Pacientes");
        buscarPacienteButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPacienteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPacienteButton1ActionPerformed(evt);
            }
        });
        add(buscarPacienteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 200, 30));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        edadLabel.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel.setText("Filtrar resultados");
        add(edadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, 40));

        filtrarBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", " " }));
        add(filtrarBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 210, -1));

        buscarButton.setBackground(new java.awt.Color(18, 84, 136));
        buscarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(0, 0, 0));
        buscarButton.setText("Filtrar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // Saca el objeto seleccionado del menu desplegable y lo almacena como String en filtro
        String filtro = filtrarBOX.getSelectedItem().toString();

        // Limpia los contenidos de la tabla
        model.setRowCount(0);

        // Invoca a la funcion buscarResultadoActividad en usuario enviando el filtro por el cual quiero buscar
        // Como resultado obtiene una lista de ResultadoActividad el cual se almacena en listaResultados
        //List<ResultadoActividad> listaResultados = usuario.buscarResultadoActividad(filtro);
        // se recorre la lista de resultados e inserta los valores en la tabla fila por fila
        //listaResultados.forEach(resultadoActividad -> {
        //model.addRow(new Object[]{resultadoActividad.getNombre(), resultadoActividad.getEtapa(), resultadoActividad.getAciertos(), resultadoActividad.getSegundos(), resultadoActividad.getFecha().getDia(), resultadoActividad.getFecha().getMesString()});
        //});
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void todosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosBtnActionPerformed
        actualizarListaPacientes();
    }//GEN-LAST:event_todosBtnActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed

    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void buscarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteButtonActionPerformed
        listaPacientes = MainScreen.getListaPacientes();

        String cedula = cedulaTxt.getText();
        this.pacienteActual = buscarPaciente(cedula);
        if (pacienteActual != null) {
            if (pacienteActual.getIdMedicoResponsable().equals(MainScreen.getUserID())) {
                modificarPacienteButton.setVisible(true);
                eliminarPacienteButton.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Paciente a cargo de otro médico");
            }
            actualizarListaPacientesCedula(cedula);
            nombreLabel.setText("Nombre: " + pacienteActual.getNombre());
            apellidoLabel.setText("Apellido: " + pacienteActual.getApellido());

            // Habilita los botones
        } else {
            JOptionPane.showMessageDialog(null, "No encontrado");
        }

    }//GEN-LAST:event_buscarPacienteButtonActionPerformed

    private void modificarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPacienteButtonActionPerformed
        buscarPacienteButtonActionPerformed(evt);
        ModificarPacienteGui ventanaModificar = new ModificarPacienteGui(pacienteActual);
        ventanaModificar.setVisible(true);
        ventanaModificar.setLocationRelativeTo(null);
        this.pacienteActual = buscarPaciente(cedulaTxt.getText());
        nombreLabel.setText("Nombre: " + pacienteActual.getNombre());
        apellidoLabel.setText("Apellido: " + pacienteActual.getApellido());
    }//GEN-LAST:event_modificarPacienteButtonActionPerformed

    private void eliminarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPacienteButtonActionPerformed
        try {
            Main.eliminarUsuarioDataBase(this.pacienteActual.getCedula());
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            modificarPacienteButton.setVisible(false);
            eliminarPacienteButton.setVisible(false);
            this.pacienteActual = null;
            nombreLabel.setText("Nombre: ");
            apellidoLabel.setText("Apellido:");
            cedulaTxt.setText("");
            actualizarListaPacientes();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_eliminarPacienteButtonActionPerformed

    private void cedulaTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxt1ActionPerformed

    private void buscarPacienteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteButton1ActionPerformed
        listaPacientes = MainScreen.getListaPacientes();

        String cedula = cedulaTxt1.getText();

        actualizarListaPacientesMedico(cedula);

    }//GEN-LAST:event_buscarPacienteButton1ActionPerformed

    private void lstResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstResultadosMouseClicked
        System.out.println(lstResultados.getSelectedValue());
        String idSeleccion = lstResultados.getSelectedValue();
       
    }//GEN-LAST:event_lstResultadosMouseClicked

    public void setUsuario(ListaPacientes usuarioListaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void actualizarListaPacientes() {
        listaPacientes = MainScreen.getListaPacientes();

        dlm.removeAllElements();
        String doctorId = MainScreen.getUserID();
        listaPacientes.getPacientes().forEach(paciente -> {
            if (paciente.getIdMedicoResponsable().equals(doctorId)) {
                dlm.addElement(paciente.toString());

            } else if (doctorId.equals("admin")) {
                dlm.addElement(paciente.toString());
            }
        });
    }

    public void actualizarListaPacientesCedula(String cedula) {
        listaPacientes = MainScreen.getListaPacientes();

        dlm.removeAllElements();
        listaPacientes.getPacientes().forEach(paciente -> {
            if (paciente.getCedula().equals(cedula)) {
                dlm.addElement(paciente.toString());
            }
        });
    }

    public void actualizarListaPacientesMedico(String cedula) {
        listaPacientes = MainScreen.getListaPacientes();

        dlm.removeAllElements();
        listaPacientes.getPacientes().forEach(paciente -> {
            if (paciente.getIdMedicoResponsable().equals(cedula)) {
                dlm.addElement(paciente.toString());
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton buscarPacienteButton;
    private javax.swing.JButton buscarPacienteButton1;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField cedulaTxt1;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JButton eliminarPacienteButton;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JComboBox<String> filtrarBOX;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<String> lstResultados;
    private javax.swing.JButton modificarPacienteButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton todosBtn;
    // End of variables declaration//GEN-END:variables

    private void actualizarFecha(Fecha actual) {
        fechaLabel.setText("Hoy es " + actual.getDia() + " de " + actual.getMesString() + " del año " + actual.getAnio() + " ");
    }

    public void setInformation() {

    }

    private Paciente buscarPaciente(String cedula) {
        dlm.removeAllElements();

        for (Paciente paciente : listaPacientes.getPacientes()) {
            if (paciente.getCedula().equals(cedula)) {
                dlm.addElement(paciente.toString());
                return paciente;
            }
        }
        return null;

    }
}
