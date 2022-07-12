package app.gui.paciente;

import app.dataStruct.ListaPacientes;
import app.gui.inicio.DerivarGui;
import app.gui.inicio.MainScreen;
import app.logic.Fecha;
import app.logic.HistoriaClinicaPaciente;
import app.logic.Main;
import app.logic.users.Paciente;
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarPacientePanel extends javax.swing.JPanel {

    private final Fecha actual;
    // Atributo de lista
    private static ListaPacientes listaPacientes;
    private DefaultTableModel model;
    public static Paciente pacienteActual;

 
    // Modelo lista
    private DefaultListModel dlm = new DefaultListModel();

    /**
     * Creates new form inicioPanel
     *
     * @param usuario
     */
    public BuscarPacientePanel() {
        initComponents();
        actual = new Fecha();
        pacienteActual = null;
        setInformation();
        lstResultados.setModel(dlm);
        ocultarBotones(false);
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
        atenderButton = new javax.swing.JButton();
        derivarButton = new javax.swing.JButton();
        eliminarPacienteButton = new javax.swing.JButton();
        modificarPacienteButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cedulaTxt1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        buscarPacienteButton1 = new javax.swing.JButton();
        refrescarListaBtn = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        filtrarBOX = new javax.swing.JComboBox<>();
        buscarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todosBtn.setBackground(new java.awt.Color(18, 84, 136));
        todosBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        todosBtn.setForeground(new java.awt.Color(255, 255, 255));
        todosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/search_1.png"))); // NOI18N
        todosBtn.setText("Mostrar todos");
        todosBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        todosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosBtnActionPerformed(evt);
            }
        });
        add(todosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 200, 40));

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
        add(cedulaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 140, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 140, 10));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Ingrese la cédula del paciente a buscar");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        buscarPacienteButton.setBackground(new java.awt.Color(18, 84, 136));
        buscarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        buscarPacienteButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarPacienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/search_1.png"))); // NOI18N
        buscarPacienteButton.setText("Buscar Paciente");
        buscarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPacienteButtonActionPerformed(evt);
            }
        });
        add(buscarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, -1));

        nombreLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(51, 51, 51));
        nombreLabel.setText("nombre");
        add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        apellidoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(51, 51, 51));
        apellidoLabel.setText("apellido");
        add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Encontrado:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        atenderButton.setBackground(new java.awt.Color(0, 204, 102));
        atenderButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        atenderButton.setForeground(new java.awt.Color(0, 0, 0));
        atenderButton.setText("Atender");
        atenderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atenderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderButtonActionPerformed(evt);
            }
        });
        add(atenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 80));

        derivarButton.setBackground(new java.awt.Color(204, 204, 0));
        derivarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        derivarButton.setForeground(new java.awt.Color(0, 0, 0));
        derivarButton.setText("Derivar");
        derivarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        derivarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derivarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivarButtonActionPerformed(evt);
            }
        });
        add(derivarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, 80));

        eliminarPacienteButton.setBackground(new java.awt.Color(255, 102, 102));
        eliminarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminarPacienteButton.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPacienteButton.setText("Eliminar");
        eliminarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarPacienteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPacienteButtonActionPerformed(evt);
            }
        });
        add(eliminarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 150, 80));

        modificarPacienteButton.setBackground(new java.awt.Color(0, 204, 204));
        modificarPacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificarPacienteButton.setForeground(new java.awt.Color(0, 0, 0));
        modificarPacienteButton.setText("Modificar");
        modificarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarPacienteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPacienteButtonActionPerformed(evt);
            }
        });
        add(modificarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 150, 80));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Ingrese la cédula del doctor a cargo");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

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
        add(cedulaTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, 10));

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
        add(buscarPacienteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 200, 30));

        refrescarListaBtn.setBackground(new java.awt.Color(51, 204, 255));
        refrescarListaBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        refrescarListaBtn.setForeground(new java.awt.Color(255, 255, 255));
        refrescarListaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/refresh_1.png"))); // NOI18N
        refrescarListaBtn.setText("Refrescar");
        refrescarListaBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        refrescarListaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarListaBtnActionPerformed(evt);
            }
        });
        add(refrescarListaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, -1));

        tituloLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(102, 0, 153));
        tituloLabel.setText("Búsqueda Paciente");
        add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator10.setBackground(new java.awt.Color(81, 3, 23));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 20));

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

        String cedula = cedulaTxt.getText();
        actualizarPacienteActual(cedula);
        vaciarCampos();
    }//GEN-LAST:event_buscarPacienteButtonActionPerformed

    private void vaciarCampos() {
        cedulaTxt.setText("");

    }

    private void modificarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPacienteButtonActionPerformed
        ModificarPacienteGui ventanaModificar = new ModificarPacienteGui(pacienteActual);
        ventanaModificar.setVisible(true);
        ventanaModificar.setLocationRelativeTo(null);
        actualizarInfo();
    }//GEN-LAST:event_modificarPacienteButtonActionPerformed

    private void eliminarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPacienteButtonActionPerformed

        // Solicita que se ingrese la clave admin para continuar
        String clave;
        try {
            clave = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador", "Clave", JOptionPane.QUESTION_MESSAGE);
            if (clave.equals("admin")) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar paciente?", "Borrar", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado) {
                    try {
                        Main.eliminarUsuarioDataBase(this.pacienteActual.getCedula());
                        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                        ocultarBotones(false);
                        this.pacienteActual = null;
                        nombreLabel.setText("Nombre: ");
                        apellidoLabel.setText("Apellido:");
                        cedulaTxt.setText("");
                        actualizarListaPacientes();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta", "Clave", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
            System.out.println("No se ingreso nada");
        } catch (HeadlessException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
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
        // Corta el String idSeleccion en hasta encontrar un espacio
        String idSeleccion = lstResultados.getSelectedValue().substring(0, lstResultados.getSelectedValue().indexOf(" "));

        listaPacientes = MainScreen.getListaPacientes();
        actualizarPacienteActual(idSeleccion);
    }//GEN-LAST:event_lstResultadosMouseClicked

    private void refrescarListaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarListaBtnActionPerformed
        actualizarInfo();
    }//GEN-LAST:event_refrescarListaBtnActionPerformed

    private void atenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(pacienteActual.getEstado());
        String estadoPaciente = pacienteActual.getEstado();
        this.pacienteActual = buscarPaciente(pacienteActual.getCedula());
        switch (estadoPaciente) {
            case "Espera":
                JOptionPane.showMessageDialog(null, "Primero registre signos vitales del paciente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Atendido":
                JOptionPane.showMessageDialog(null, "El paciente ya ha sido atendido", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                HistoriaClinicaPaciente historiaClinica = Main.obtenerHistoriaClinica(pacienteActual.getCedula());
                pacienteActual.setHistoriaClinica(historiaClinica);
                System.out.println(historiaClinica);
                if (historiaClinica.getPacienteId() != null) {
                    // Muestra
                    JOptionPane.showMessageDialog(null, "El paciente ya ha sido atendido", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                    HistoriaClinicaPanel historiaClinicaPanel = new HistoriaClinicaPanel(pacienteActual);
                    historiaClinicaPanel.setVisible(true);
                } else {
                    // Crea una
                    HistoriaClinicaGui nuevaHistoriaClinica = new HistoriaClinicaGui(pacienteActual);
                    nuevaHistoriaClinica.setVisible(true);
                }

                break;
        }
    }//GEN-LAST:event_atenderButtonActionPerformed

    private void derivarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivarButtonActionPerformed
        DerivarGui derivar = new DerivarGui(this.pacienteActual);
        derivar.setVisible(true);
        ocultarBotones(false);
        actualizarInfo();
    }//GEN-LAST:event_derivarButtonActionPerformed

    public void setUsuario(ListaPacientes usuarioListaPacientes) {
        this.listaPacientes = usuarioListaPacientes;
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

    /*
    public void actualizarListaPacientesCedula(String cedula) {
        listaPacientes = MainScreen.getListaPacientes();

        dlm.removeAllElements();
        listaPacientes.getPacientes().forEach(paciente -> {
            if (paciente.getCedula().equals(cedula)) {
                dlm.addElement(paciente.toString());
            }
        });
    }
     */
    public void actualizarListaPacientesMedico(String cedula) {
        listaPacientes = MainScreen.getListaPacientes();

        dlm.removeAllElements();
        listaPacientes.getPacientes().forEach(paciente -> {
            if (paciente.getIdMedicoResponsable().equals(cedula)) {
                dlm.addElement(paciente.toString());
            }
        });
    }

    public void setInformation() {

    }

    private Paciente buscarPaciente(String cedula) {
        for (Paciente paciente : listaPacientes.getPacientes()) {
            if (paciente.getCedula().equals(cedula)) {
                return paciente;
            }
        }
        return null;
    }

    private void actualizarPacienteActual(String idSeleccion) {
        listaPacientes = MainScreen.getListaPacientes();
        this.pacienteActual = buscarPaciente(idSeleccion);
        if (pacienteActual != null) {
            if (pacienteActual.getIdMedicoResponsable().equals(MainScreen.getUserID())) {
                ocultarBotones(true);
                actualizarInfo();
            } else {
                JOptionPane.showMessageDialog(null, "Paciente a cargo de otro médico");
                ocultarBotones(false);
            }
            // Habilita los botones
        } else {
            JOptionPane.showMessageDialog(null, "No encontrado");
            ocultarBotones(false);
        }
    }

    private void actualizarInfo() {
        nombreLabel.setText("Nombre: " + pacienteActual.getNombre());
        apellidoLabel.setText("Apellido: " + pacienteActual.getApellido());
        actualizarListaPacientes();
    }

    private void ocultarBotones(boolean booleano) {
        atenderButton.setVisible(booleano);
        derivarButton.setVisible(booleano);
        modificarPacienteButton.setVisible(booleano);
        eliminarPacienteButton.setVisible(booleano);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JButton atenderButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton buscarPacienteButton;
    private javax.swing.JButton buscarPacienteButton1;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField cedulaTxt1;
    private javax.swing.JButton derivarButton;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JButton eliminarPacienteButton;
    private javax.swing.JComboBox<String> filtrarBOX;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<String> lstResultados;
    private javax.swing.JButton modificarPacienteButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton refrescarListaBtn;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton todosBtn;
    // End of variables declaration//GEN-END:variables

}
