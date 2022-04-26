package reto;

public class Calculadora extends javax.swing.JFrame {

    public float primernumero;
    public float segundonumero;
    public String operador;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        jPanel7 = new javax.swing.JPanel();
        casilla = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tbn_resultado = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel7.add(casilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 60));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbn_resultado.setText("=");
        tbn_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_resultadoActionPerformed(evt);
            }
        });
        jPanel1.add(tbn_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 50));

        btn_exp.setText("^");
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        btn_porcentaje.setText("%");
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 50));

        btn_menos.setText("-");
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        btn_c.setText("C");
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel1.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 50));

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, 50));

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 340, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_resultadoActionPerformed
        this.segundonumero = Float.parseFloat(this.casilla.getText());

        switch (this.operador) {
            case "+":
                this.casilla.setText(Float.toString(this.primernumero + this.segundonumero));
                break;
            case "-":
                this.casilla.setText(Float.toString(this.primernumero - this.segundonumero));
                break;
            case "%":
                this.casilla.setText(Float.toString(this.primernumero % this.segundonumero));
                break;
            case "/":
                this.casilla.setText(Float.toString(this.primernumero / this.segundonumero));
                break;
            case "*":
                this.casilla.setText(Float.toString(this.primernumero * this.segundonumero));
                break;

        }
    }//GEN-LAST:event_tbn_resultadoActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "^";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "%";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "/";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "*";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "-";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        this.primernumero = Float.parseFloat(this.casilla.getText());
        this.operador = "+";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        this.casilla.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        this.casilla.setText(this.casilla.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        this.casilla.setText(this.casilla.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        this.casilla.setText(this.casilla.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        this.casilla.setText(this.casilla.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        this.casilla.setText(this.casilla.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        this.casilla.setText(this.casilla.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        this.casilla.setText(this.casilla.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        this.casilla.setText(this.casilla.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        this.casilla.setText(this.casilla.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        this.casilla.setText(this.casilla.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if (!this.casilla.getText().contains(".")) {
            this.casilla.setText(this.casilla.getText() + ".");
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    public void addNumber(String digito) {
        casilla.setText(casilla.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel casilla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton tbn_resultado;
    // End of variables declaration//GEN-END:variables
}
