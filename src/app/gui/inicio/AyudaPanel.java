package app.gui.inicio;

import app.logic.Fecha;

public class AyudaPanel extends javax.swing.JPanel {

    /**
     * Creates new form inicioPanel
     *
     */
    public AyudaPanel() {
        initComponents();
        setInformation();
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
        edadLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        edadLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        edadLabel10 = new javax.swing.JLabel();
        edadLabel7 = new javax.swing.JLabel();
        edadLabel12 = new javax.swing.JLabel();
        edadLabel13 = new javax.swing.JLabel();
        edadLabel14 = new javax.swing.JLabel();
        edadLabel15 = new javax.swing.JLabel();
        edadLabel16 = new javax.swing.JLabel();
        edadLabel17 = new javax.swing.JLabel();
        edadLabel18 = new javax.swing.JLabel();
        edadLabel19 = new javax.swing.JLabel();
        edadLabel20 = new javax.swing.JLabel();
        contacto1 = new javax.swing.JLabel();
        contacto2 = new javax.swing.JLabel();
        contacto3 = new javax.swing.JLabel();
        contacto4 = new javax.swing.JLabel();
        contacto5 = new javax.swing.JLabel();
        contacto6 = new javax.swing.JLabel();
        edadLabel21 = new javax.swing.JLabel();
        edadLabel22 = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edadLabel6.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel6.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel6.setText("Configurar");
        bg.add(edadLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 580, 20));

        edadLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel8.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel8.setText("Advertencia: El apartado borrar base de datos es de uso administrativo.");
        bg.add(edadLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 580, 20));

        edadLabel10.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel10.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel10.setText("Desarolladores");
        bg.add(edadLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        edadLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel7.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel7.setText("thyara.vintimilla@udla.edu.ec");
        bg.add(edadLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        edadLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel12.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel12.setText("Estefanía Vinueza ");
        bg.add(edadLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        edadLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel13.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel13.setText("Thyara Vintimitilla");
        bg.add(edadLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        edadLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel14.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel14.setText("Alberto Valverde");
        bg.add(edadLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        edadLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel15.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel15.setText("sebastian.valverde@udla.edu.ec");
        bg.add(edadLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        edadLabel16.setBackground(new java.awt.Color(0, 0, 0));
        edadLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel16.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel16.setText("jadira.vinueza@udla.edu.ec");
        bg.add(edadLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        edadLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel17.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel17.setText("Fabiana Liria");
        bg.add(edadLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        edadLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel18.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel18.setText("fabiana.liria@udla.edu.ec");
        bg.add(edadLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        edadLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel19.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel19.setText("Jhoann Ordoñez");
        bg.add(edadLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

        edadLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel20.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel20.setText("johann.ordonez@udla.edu.ec");
        bg.add(edadLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        contacto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/contactos/contacto1.png"))); // NOI18N
        bg.add(contacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        contacto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/contactos/contacto3.png"))); // NOI18N
        bg.add(contacto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        contacto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/contactos/contacto2.png"))); // NOI18N
        bg.add(contacto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        contacto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar4.png"))); // NOI18N
        bg.add(contacto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        contacto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar1.png"))); // NOI18N
        bg.add(contacto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        contacto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar1.png"))); // NOI18N
        bg.add(contacto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        edadLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        edadLabel21.setForeground(new java.awt.Color(204, 204, 0));
        edadLabel21.setText("Mateo Ávila");
        bg.add(edadLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        edadLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        edadLabel22.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel22.setText("mateo.avila@udla.edu.ec");
        bg.add(edadLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, -1));

        tituloLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(102, 0, 153));
        tituloLabel.setText("Ayuda");
        bg.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator10.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 20));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel contacto1;
    private javax.swing.JLabel contacto2;
    private javax.swing.JLabel contacto3;
    private javax.swing.JLabel contacto4;
    private javax.swing.JLabel contacto5;
    private javax.swing.JLabel contacto6;
    private javax.swing.JLabel edadLabel10;
    private javax.swing.JLabel edadLabel12;
    private javax.swing.JLabel edadLabel13;
    private javax.swing.JLabel edadLabel14;
    private javax.swing.JLabel edadLabel15;
    private javax.swing.JLabel edadLabel16;
    private javax.swing.JLabel edadLabel17;
    private javax.swing.JLabel edadLabel18;
    private javax.swing.JLabel edadLabel19;
    private javax.swing.JLabel edadLabel20;
    private javax.swing.JLabel edadLabel21;
    private javax.swing.JLabel edadLabel22;
    private javax.swing.JLabel edadLabel6;
    private javax.swing.JLabel edadLabel7;
    private javax.swing.JLabel edadLabel8;
    private javax.swing.JLabel fondo;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    public void setInformation() {

    }
}
