package reto;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUND = new javax.swing.JPanel();
        HEADER = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        CONTAINER = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnEjercicio4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKGROUND.setBackground(new java.awt.Color(255, 255, 255));

        HEADER.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("RETO 2 – GUI CON JAVA JFRAME ");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        CONTAINER.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(29, 185, 84));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULADORA");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEjercicio4.setBackground(new java.awt.Color(29, 185, 84));
        btnEjercicio4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        btnEjercicio4.setForeground(new java.awt.Color(255, 255, 255));
        btnEjercicio4.setText("RIFAS");
        btnEjercicio4.setBorderPainted(false);
        btnEjercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CONTAINERLayout = new javax.swing.GroupLayout(CONTAINER);
        CONTAINER.setLayout(CONTAINERLayout);
        CONTAINERLayout.setHorizontalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnEjercicio4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        CONTAINERLayout.setVerticalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjercicio4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BACKGROUNDLayout = new javax.swing.GroupLayout(BACKGROUND);
        BACKGROUND.setLayout(BACKGROUNDLayout);
        BACKGROUNDLayout.setHorizontalGroup(
            BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BACKGROUNDLayout.setVerticalGroup(
            BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BACKGROUNDLayout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio4ActionPerformed
        Rifas rifas = new Rifas();
        rifas.setVisible(true);
    }//GEN-LAST:event_btnEjercicio4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JPanel CONTAINER;
    private javax.swing.JPanel HEADER;
    private javax.swing.JButton btnEjercicio4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
