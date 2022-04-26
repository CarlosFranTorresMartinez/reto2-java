package reto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Rifas extends javax.swing.JFrame {

    private final Random random = new Random();
    private final DefaultListModel<String> listModel = new DefaultListModel<>();

    public Rifas() {
        initComponents();
    }

    private Integer generateNumberRandom() {
        final int min = 0000001;
        final int max = 9999999;
        int ramdom = random.nextInt(max + min) + min;
        return ramdom;
    }

    private String addZeroLeft(String value) {
        return String.format("%07d", Integer.valueOf(value));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuRifas = new javax.swing.JPanel();
        btnGenerarRifas = new javax.swing.JButton();
        txtCantidadRifas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSelectGanadores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsWinner = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlRifas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRifas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerarRifas.setText("Generar Rifas");
        btnGenerarRifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRifasActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad de rifas a generar");

        btnSelectGanadores.setText("Seleccionar Ganadores");
        btnSelectGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectGanadoresActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lsWinner);

        jLabel7.setText("GANADORES:");

        jButton2.setText("Limpiar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuRifasLayout = new javax.swing.GroupLayout(pnlMenuRifas);
        pnlMenuRifas.setLayout(pnlMenuRifasLayout);
        pnlMenuRifasLayout.setHorizontalGroup(
            pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                                .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSelectGanadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCantidadRifas)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGenerarRifas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel7)
                        .addGap(107, 107, 107)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuRifasLayout.setVerticalGroup(
            pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuRifasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarRifas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMenuRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectGanadores)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(listRifas);

        javax.swing.GroupLayout pnlRifasLayout = new javax.swing.GroupLayout(pnlRifas);
        pnlRifas.setLayout(pnlRifasLayout);
        pnlRifasLayout.setHorizontalGroup(
            pnlRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        pnlRifasLayout.setVerticalGroup(
            pnlRifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRifasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenuRifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuRifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlRifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarRifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRifasActionPerformed
        List<String> list = new ArrayList<>();

        if (txtCantidadRifas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No has ingresado la cantidad de los participantes");
        } else if (Integer.valueOf(txtCantidadRifas.getText()) < 5) {
            JOptionPane.showMessageDialog(null, "La cantidad de participantes no es suficiente");
        } else {
            final int tomo = Integer.parseInt(txtCantidadRifas.getText());
            for (int i = 0; i < tomo; i++) {
                String generatorRifas = String.valueOf(generateNumberRandom());
                listModel.addElement(addZeroLeft(generatorRifas));
            }

            for (int i = 0; i < listModel.getSize(); i++) {
                list.add(listModel.get(i));
            }

            Collections.sort(list);

            listModel.removeAllElements();

            for (String s : list) {
                listModel.addElement(s);
            }

            listRifas.setModel(listModel);

        }
    }//GEN-LAST:event_btnGenerarRifasActionPerformed

    private void btnSelectGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectGanadoresActionPerformed
        final HashSet<Integer> hashSet = new HashSet<>();
        final DefaultListModel<String> listWinner = new DefaultListModel<>();

        for (int i = 0; i < 5; i++) {
            hashSet.add(random.nextInt(listModel.getSize()));
        }

        while (hashSet.size() >= 5) {
            hashSet.forEach(value -> {
                listWinner.addElement(listModel.get(value));
            });
            lsWinner.setModel(listWinner);
            break;
        }

    }//GEN-LAST:event_btnSelectGanadoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rifas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Rifas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarRifas;
    private javax.swing.JButton btnSelectGanadores;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRifas;
    private javax.swing.JList<String> lsWinner;
    private javax.swing.JPanel pnlMenuRifas;
    private javax.swing.JPanel pnlRifas;
    private javax.swing.JTextField txtCantidadRifas;
    // End of variables declaration//GEN-END:variables
}
