package app.gui.inicio;

import app.logic.Fecha;
import app.logic.SignosVitalesFormulario;
import app.logic.users.Paciente;
import javax.swing.JToggleButton;

public class TriajeGui extends javax.swing.JFrame {

    private final JToggleButton[] botones;
    private final Paciente paciente;
    int id;
    int nivelUrgenciaSeleccionado;

    /**
     * Creates new form HistoriaClinica
     *
     * @param paciente
     * @param id
     */
    public TriajeGui(Paciente paciente, int id) {
        initComponents();
        this.paciente = paciente;
        actualizarInfo();
        this.botones = new JToggleButton[]{sinUrgenciaTBtn, urgenciaMenorTBtn, urgenciaTBtn, emergenciaTBtn, resucitacionTBtn};
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aSpn2 = new javax.swing.JSpinner();
        jSeparator4 = new javax.swing.JSeparator();
        bienvenidaLabel = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        sexoLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edadLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        grupoSanguineoCmb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        urgenciaMenorTBtn = new javax.swing.JToggleButton();
        urgenciaTBtn = new javax.swing.JToggleButton();
        emergenciaTBtn = new javax.swing.JToggleButton();
        resucitacionTBtn = new javax.swing.JToggleButton();
        sinUrgenciaTBtn = new javax.swing.JToggleButton();
        continuarBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pesoSpn = new javax.swing.JSpinner();
        alturaSpn = new javax.swing.JSpinner();
        tensionSpn = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        respiracionSpn = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        pulsoSpn = new javax.swing.JSpinner();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 430, 20));

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        bienvenidaLabel.setForeground(new java.awt.Color(102, 0, 153));
        bienvenidaLabel.setText("Triaje");
        getContentPane().add(bienvenidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        salirBtn.setBackground(new java.awt.Color(204, 204, 204));
        salirBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(18, 84, 136));
        salirBtn.setText("X");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, -1));

        sexoLbl.setBackground(new java.awt.Color(51, 51, 51));
        sexoLbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        sexoLbl.setForeground(new java.awt.Color(51, 51, 51));
        sexoLbl.setText("null");
        getContentPane().add(sexoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 90, 30));

        nombreLbl.setBackground(new java.awt.Color(51, 51, 51));
        nombreLbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nombreLbl.setForeground(new java.awt.Color(51, 51, 51));
        nombreLbl.setText("null");
        getContentPane().add(nombreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 210, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Sexo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, 30));

        edadLbl.setBackground(new java.awt.Color(51, 51, 51));
        edadLbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        edadLbl.setForeground(new java.awt.Color(51, 51, 51));
        edadLbl.setText("null");
        getContentPane().add(edadLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 80, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Altura en cm:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 30));

        grupoSanguineoCmb.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        grupoSanguineoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "B+", "AB+", "AB-", "A-", "B-", "0+", "0-" }));
        getContentPane().add(grupoSanguineoCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Grupo sanguíneo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, 30));

        urgenciaMenorTBtn.setBackground(new java.awt.Color(0, 161, 0));
        urgenciaMenorTBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        urgenciaMenorTBtn.setForeground(new java.awt.Color(51, 51, 51));
        urgenciaMenorTBtn.setText("Urgencia Menor");
        urgenciaMenorTBtn.setFocusPainted(false);
        urgenciaMenorTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgenciaMenorTBtnActionPerformed(evt);
            }
        });
        getContentPane().add(urgenciaMenorTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 190, 80));

        urgenciaTBtn.setBackground(new java.awt.Color(254, 220, 0));
        urgenciaTBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        urgenciaTBtn.setForeground(new java.awt.Color(51, 51, 51));
        urgenciaTBtn.setText("Urgencia");
        urgenciaTBtn.setFocusPainted(false);
        urgenciaTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgenciaTBtnActionPerformed(evt);
            }
        });
        getContentPane().add(urgenciaTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 190, 80));

        emergenciaTBtn.setBackground(new java.awt.Color(255, 121, 0));
        emergenciaTBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emergenciaTBtn.setForeground(new java.awt.Color(51, 51, 51));
        emergenciaTBtn.setText("Emergencia");
        emergenciaTBtn.setFocusPainted(false);
        emergenciaTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergenciaTBtnActionPerformed(evt);
            }
        });
        getContentPane().add(emergenciaTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 190, 80));

        resucitacionTBtn.setBackground(new java.awt.Color(249, 13, 2));
        resucitacionTBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resucitacionTBtn.setForeground(new java.awt.Color(51, 51, 51));
        resucitacionTBtn.setText("Resucitación");
        resucitacionTBtn.setFocusPainted(false);
        resucitacionTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resucitacionTBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resucitacionTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 190, 80));

        sinUrgenciaTBtn.setBackground(new java.awt.Color(53, 81, 169));
        sinUrgenciaTBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sinUrgenciaTBtn.setForeground(new java.awt.Color(45, 45, 45));
        sinUrgenciaTBtn.setText("Sin Urgencia");
        sinUrgenciaTBtn.setFocusPainted(false);
        sinUrgenciaTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinUrgenciaTBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sinUrgenciaTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 80));

        continuarBtn.setBackground(new java.awt.Color(18, 84, 136));
        continuarBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        continuarBtn.setForeground(new java.awt.Color(255, 255, 255));
        continuarBtn.setText("Continuar");
        continuarBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(continuarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 210, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Peso en libras:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 30));

        pesoSpn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(pesoSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 40));

        alturaSpn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(alturaSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 40));

        tensionSpn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(tensionSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 110, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Tensión arterial:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Respiración:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 30));

        respiracionSpn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(respiracionSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 110, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Pulso:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, 30));

        pulsoSpn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(pulsoSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 110, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backgroundKeyPressed

    }//GEN-LAST:event_backgroundKeyPressed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirBtnActionPerformed

    private void sinUrgenciaTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinUrgenciaTBtnActionPerformed
        seleccionarUrgencia(sinUrgenciaTBtn, 5);
    }//GEN-LAST:event_sinUrgenciaTBtnActionPerformed

    private void urgenciaMenorTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgenciaMenorTBtnActionPerformed
        seleccionarUrgencia(urgenciaMenorTBtn, 4);
    }//GEN-LAST:event_urgenciaMenorTBtnActionPerformed

    private void urgenciaTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgenciaTBtnActionPerformed
        seleccionarUrgencia(urgenciaTBtn, 3);
    }//GEN-LAST:event_urgenciaTBtnActionPerformed

    private void emergenciaTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergenciaTBtnActionPerformed
        seleccionarUrgencia(emergenciaTBtn, 2);
    }//GEN-LAST:event_emergenciaTBtnActionPerformed

    private void resucitacionTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resucitacionTBtnActionPerformed
        seleccionarUrgencia(resucitacionTBtn, 1);
    }//GEN-LAST:event_resucitacionTBtnActionPerformed

    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        // Obtiene los datos
        String idPaciente = paciente.getCedula();
        int altura = (int) alturaSpn.getValue();
        int peso = (int) pesoSpn.getValue();
        int respiracion = (int) respiracionSpn.getValue();
        int tension = (int) tensionSpn.getValue();
        int pulso = (int) pulsoSpn.getValue();
        String grupoSanguineo = grupoSanguineoCmb.getSelectedItem().toString();
        int prioridad = this.nivelUrgenciaSeleccionado;
        
        // Creo un formulario de Signos Vitales
        SignosVitalesFormulario nuevo = new SignosVitalesFormulario(this.id, idPaciente, peso, altura, respiracion, tension, pulso, grupoSanguineo, prioridad, new Fecha());
        
        // Guardo la información localmente y en la base de datos.
        
    }//GEN-LAST:event_continuarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner aSpn2;
    private javax.swing.JSpinner alturaSpn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JButton continuarBtn;
    private javax.swing.JLabel edadLbl;
    private javax.swing.JToggleButton emergenciaTBtn;
    private javax.swing.JComboBox<String> grupoSanguineoCmb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JSpinner pesoSpn;
    private javax.swing.JSpinner pulsoSpn;
    private javax.swing.JSpinner respiracionSpn;
    private javax.swing.JToggleButton resucitacionTBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel sexoLbl;
    private javax.swing.JToggleButton sinUrgenciaTBtn;
    private javax.swing.JSpinner tensionSpn;
    private javax.swing.JToggleButton urgenciaMenorTBtn;
    private javax.swing.JToggleButton urgenciaTBtn;
    // End of variables declaration//GEN-END:variables

    private void seleccionarUrgencia(JToggleButton botonSeleciconado, int nivelUrgencia) {
        if (nivelUrgenciaSeleccionado == 0) {
            activarDesactivarBotones(false);
            botonSeleciconado.setEnabled(true);
            nivelUrgenciaSeleccionado = nivelUrgencia;
        } else {
            activarDesactivarBotones(true);
            nivelUrgenciaSeleccionado = 0;
        }
    }

    private void activarDesactivarBotones(boolean b) {
        for (JToggleButton boton : botones) {
            boton.setEnabled(b);
        }
    }

    private void actualizarInfo() {
        nombreLbl.setText(paciente.getNombre());
        edadLbl.setText("" + paciente.getEdad());
        sexoLbl.setText(paciente.getSexo());
    }
}
