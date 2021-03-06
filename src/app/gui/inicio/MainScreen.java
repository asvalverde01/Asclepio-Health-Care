package app.gui.inicio;

import app.dataStruct.ArbolPacientes;
import app.dataStruct.ColaPacientes;
import app.gui.medico.BuscarMedicoPanel;
import app.gui.medico.RegistroMedicoPanel;
import app.gui.paciente.BuscarPacientePanel;
import app.gui.paciente.RegistroPacientePanel;
import app.logic.Fecha;
import app.logic.Main;
import app.logic.users.Administrador;
import app.logic.users.Medico;
import app.logic.users.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public final class MainScreen extends javax.swing.JFrame {

    // Atributos estáticos para poder acceder a estos en cualquier parte del programa
    public static Usuario usuario;
    public static String userID; // Guarda el numero de cedula del doctor que ha entrado
    public static ArbolPacientes listaPacientes; //
    public static ColaPacientes colaEmergencia; 
    // Paneles de contenido para cada botón
    private app.gui.inicio.InicioPanel pInicio = null;
    private BuscarPacientePanel pResultados = null;
    private SignosVitales pTriaje = null;
    private ConfigPanel pConfig = null;
    private AyudaPanel pAyuda = null;
    private RegistroMedicoPanel pRegistrarMedico = null;
    private BuscarMedicoPanel pBuscarMedico = null;
    private RegistroPacientePanel pRegistrarPaciente = null;

    private MainScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getters y setters para los atributos estáticos
    public static Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        MainScreen.usuario = usuario;
    }

    public static String getUserID() {
        return userID;
    }

    public static void setUserID(String userID) {
        MainScreen.userID = userID;
    }

    public static ArbolPacientes getListaPacientes() {
        MainScreen.listaPacientes = Main.obtenerPacientesDataBase();
        return listaPacientes;
    }

    public static void setListaPacientes(ArbolPacientes listaPacientes) {
        MainScreen.listaPacientes = listaPacientes;
    }

    /**
     * Creates new form MainScreen
     *
     * @param usuario
     */
    public MainScreen(Usuario usuario) {
        MainScreen.usuario = usuario;
        MainScreen.userID = usuario.getCedula();
        // LLeno la lista de pacientes
        MainScreen.listaPacientes = Main.obtenerPacientesDataBase();
        initComponents();
        actualizarFecha(new Fecha());
        homeButton1.setBackground(new java.awt.Color(247, 247, 247));
        homeButton1.setForeground(new java.awt.Color(10, 10, 10));
        // Por defecto
        // Si  el rol es administrador entonces se muestran más opciones
        if (usuario instanceof Administrador) {
            registrarMedicoButton.setVisible(true);
            buscarMedicoButton.setVisible(true);
            registrarPacienteButton.setEnabled(false);
            signosVitalesButton.setEnabled(false);
            content.setBackground(new java.awt.Color(46, 64, 114));
        } else if (usuario instanceof Medico) {
            registrarMedicoButton.setVisible(false);
            buscarMedicoButton.setVisible(false);
            configButton.setVisible(false);
        }

        // Inicializa los paneles
        inicializarPaneles(usuario);

        //setInformation();
        this.setVisible(true);
        showPanel(pInicio);
        // Guardo el número de cédula del usuario como un identificador de quién ha entrado
        MainScreen.userID = usuario.getCedula();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        iconImg = new javax.swing.JLabel();
        buscarMedicoButton = new javax.swing.JButton();
        registrarMedicoButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        homeButton1 = new javax.swing.JButton();
        signosVitalesButton = new javax.swing.JButton();
        buscarPacienteButton = new javax.swing.JButton();
        configButton = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();
        salirButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        registrarPacienteButton = new javax.swing.JButton();
        fechaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asclepio");
        setResizable(false);

        content.setBackground(new java.awt.Color(5, 71, 121));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/home_house.png"))); // NOI18N
        content.add(iconImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 90));

        buscarMedicoButton.setBackground(new java.awt.Color(0, 204, 204));
        buscarMedicoButton.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        buscarMedicoButton.setForeground(new java.awt.Color(36, 36, 36));
        buscarMedicoButton.setText("Buscar Médico");
        buscarMedicoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarMedicoButton.setBorderPainted(false);
        buscarMedicoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarMedicoButton.setFocusPainted(false);
        buscarMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMedicoButtonActionPerformed(evt);
            }
        });
        content.add(buscarMedicoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, 240, 40));

        registrarMedicoButton.setBackground(new java.awt.Color(0, 204, 204));
        registrarMedicoButton.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        registrarMedicoButton.setForeground(new java.awt.Color(36, 36, 36));
        registrarMedicoButton.setText("Registrar Médico");
        registrarMedicoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarMedicoButton.setBorderPainted(false);
        registrarMedicoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarMedicoButton.setFocusPainted(false);
        registrarMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedicoButtonActionPerformed(evt);
            }
        });
        content.add(registrarMedicoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 340, 240, 40));

        helpButton.setBackground(new java.awt.Color(173, 217, 216));
        helpButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        helpButton.setForeground(new java.awt.Color(36, 36, 36));
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/chat_sms.png"))); // NOI18N
        helpButton.setText("Ayuda");
        helpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        helpButton.setBorderPainted(false);
        helpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpButton.setDisabledIcon(null);
        helpButton.setFocusPainted(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        content.add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 510, 240, 40));

        homeButton1.setBackground(new java.awt.Color(42, 147, 213));
        homeButton1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        homeButton1.setForeground(new java.awt.Color(255, 255, 255));
        homeButton1.setText("Inicio");
        homeButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeButton1.setBorderPainted(false);
        homeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton1.setFocusPainted(false);
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });
        content.add(homeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 240, 50));

        signosVitalesButton.setBackground(new java.awt.Color(55, 202, 236));
        signosVitalesButton.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        signosVitalesButton.setForeground(new java.awt.Color(36, 36, 36));
        signosVitalesButton.setText("Signos Vitales");
        signosVitalesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signosVitalesButton.setBorderPainted(false);
        signosVitalesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signosVitalesButton.setFocusPainted(false);
        signosVitalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signosVitalesButtonActionPerformed(evt);
            }
        });
        content.add(signosVitalesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 240, 40));

        buscarPacienteButton.setBackground(new java.awt.Color(55, 202, 236));
        buscarPacienteButton.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        buscarPacienteButton.setForeground(new java.awt.Color(36, 36, 36));
        buscarPacienteButton.setText("Buscar Paciente");
        buscarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPacienteButton.setBorderPainted(false);
        buscarPacienteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarPacienteButton.setFocusPainted(false);
        buscarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPacienteButtonActionPerformed(evt);
            }
        });
        content.add(buscarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 240, 40));

        configButton.setBackground(new java.awt.Color(173, 217, 216));
        configButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        configButton.setForeground(new java.awt.Color(36, 36, 36));
        configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear_1.png"))); // NOI18N
        configButton.setText("Configurar");
        configButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        configButton.setBorderPainted(false);
        configButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configButton.setDisabledIcon(null);
        configButton.setFocusPainted(false);
        configButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configButtonActionPerformed(evt);
            }
        });
        content.add(configButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 470, 240, 40));

        contenido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        content.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 800, 600));

        salirButton.setBackground(new java.awt.Color(255, 102, 102));
        salirButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        salirButton.setForeground(new java.awt.Color(36, 36, 36));
        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear_1.png"))); // NOI18N
        salirButton.setText("Salir");
        salirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirButton.setBorderPainted(false);
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.setDisabledIcon(null);
        salirButton.setFocusPainted(false);
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        content.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 240, 30));

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(36, 36, 36));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear_1.png"))); // NOI18N
        logoutButton.setText("Cerrar sesión");
        logoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setDisabledIcon(null);
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        content.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 570, 240, 40));

        registrarPacienteButton.setBackground(new java.awt.Color(55, 202, 236));
        registrarPacienteButton.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        registrarPacienteButton.setForeground(new java.awt.Color(36, 36, 36));
        registrarPacienteButton.setText("Registrar Paciente");
        registrarPacienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarPacienteButton.setBorderPainted(false);
        registrarPacienteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarPacienteButton.setFocusPainted(false);
        registrarPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPacienteButtonActionPerformed(evt);
            }
        });
        content.add(registrarPacienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 240, 40));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setText("El día de hoy es -- de -- del año --");
        content.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear.png"));
        iconImg.setIcon(icono);
        colorButtons();
        showPanel(pConfig);
        configButton.setBackground(new java.awt.Color(254, 254, 254));
    }//GEN-LAST:event_configButtonActionPerformed

    private void signosVitalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signosVitalesButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/news_paper.png"));
        iconImg.setIcon(icono);
        colorButtons();
        signosVitalesButton.setBackground(new java.awt.Color(247, 247, 247));
        // TODO
        showPanel(pTriaje);
    }//GEN-LAST:event_signosVitalesButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        showPanel(pInicio);
        colorButtons();
        pInicio.setInformation();
        homeButton1.setBackground(new java.awt.Color(247, 247, 247));
        homeButton1.setForeground(new java.awt.Color(10, 10, 10));
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/home_house.png"));
        iconImg.setIcon(icono);
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/view_eye.png"));
        iconImg.setIcon(icono);
        colorButtons();
        showPanel(pAyuda);
        helpButton.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_helpButtonActionPerformed

    private void registrarMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedicoButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/pencil.png"));
        iconImg.setIcon(icono);
        colorButtons();
        registrarMedicoButton.setBackground(new java.awt.Color(250, 250, 250));
        // TODO
        showPanel(pRegistrarMedico);

    }//GEN-LAST:event_registrarMedicoButtonActionPerformed

    private void buscarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/zoom_search_find.png"));
        iconImg.setIcon(icono);
        colorButtons();
        buscarPacienteButton.setBackground(new java.awt.Color(247, 247, 247));
        showPanel(pResultados);
    }//GEN-LAST:event_buscarPacienteButtonActionPerformed

    private void registrarPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPacienteButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/pencil.png"));
        iconImg.setIcon(icono);
        colorButtons();
        registrarPacienteButton.setBackground(new java.awt.Color(247, 247, 247));
        showPanel(pRegistrarPaciente);
    }//GEN-LAST:event_registrarPacienteButtonActionPerformed


    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        // Inicia el programa mostrando el inicio
        InicioForm mainInicio = new InicioForm();
        mainInicio.setVisible(true);
        mainInicio.setLocationRelativeTo(null);

    }//GEN-LAST:event_logoutButtonActionPerformed

    private void buscarMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMedicoButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/zoom_search_find.png"));
        iconImg.setIcon(icono);
        colorButtons();
        buscarMedicoButton.setBackground(new java.awt.Color(251, 251, 251));
        showPanel(pBuscarMedico);
    }//GEN-LAST:event_buscarMedicoButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed


    /**
     * Recibe el panel para cabiarlo en el panel contenido
     *
     * @param p panel
     */
    private void showPanel(JPanel p) {
        p.setSize(870, 800);
        contenido.removeAll();
        contenido.add(p, new AbsoluteConstraints(0, 0, -1, -1));
        contenido.revalidate();
        contenido.repaint();
    }

    /**
     * Inicializa los paneles enviando información necesaria para cada una de las clases
     *
     * @param usuario
     */
    private void inicializarPaneles(Usuario usuario) {
        pInicio = new InicioPanel(usuario);

        pConfig = new ConfigPanel(usuario);
        pTriaje = new SignosVitales();

        if (usuario instanceof Administrador) {
            pRegistrarMedico = new RegistroMedicoPanel((Administrador) usuario);
        } else {
            pRegistrarMedico = null;
        }
        pRegistrarPaciente = new RegistroPacientePanel();
        pBuscarMedico = new BuscarMedicoPanel(usuario);
        pResultados = new BuscarPacientePanel();
        pAyuda = new AyudaPanel();
        pInicio.setUsuario(usuario);
        pConfig.setUsuario(usuario);
    }

    // Colorea los botones
    private void colorButtons() {
        homeButton1.setBackground(new java.awt.Color(55, 202, 236));
        registrarMedicoButton.setBackground(new java.awt.Color(0, 204, 204));
        buscarMedicoButton.setBackground(new java.awt.Color(0, 204, 204));
        signosVitalesButton.setBackground(new java.awt.Color(55, 202, 236));
        buscarPacienteButton.setBackground(new java.awt.Color(55, 202, 236));
        registrarPacienteButton.setBackground(new java.awt.Color(55, 202, 236));
        configButton.setBackground(new java.awt.Color(55, 202, 236));
        homeButton1.setForeground(new java.awt.Color(255, 255, 255));
        configButton.setBackground(new java.awt.Color(173, 217, 216));
        helpButton.setBackground(new java.awt.Color(173, 217, 216));

    }

    // ...
    private void actualizarFecha(Fecha actual) {
        fechaLabel.setText("     Hoy es " + actual.getDia() + " de " + actual.getMesString() + " del año " + actual.getAnio() + " ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarMedicoButton;
    private javax.swing.JButton buscarPacienteButton;
    private javax.swing.JButton configButton;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton homeButton1;
    private javax.swing.JLabel iconImg;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registrarMedicoButton;
    private javax.swing.JButton registrarPacienteButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton signosVitalesButton;
    // End of variables declaration//GEN-END:variables

}
