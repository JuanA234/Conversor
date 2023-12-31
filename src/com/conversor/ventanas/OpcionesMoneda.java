/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.conversor.ventanas;

import java.util.HashMap;
import java.util.Map;
import com.conversor.logica.ConversorMoneda;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanAndres
 */
public class OpcionesMoneda extends javax.swing.JPanel {

    /**
     * Creates new form OpcionesMoneda
     */
    private final EntradaValor entradaValor;
   NumberFormat formato = NumberFormat.getCurrencyInstance();
   ConversorMoneda conversorMoneda = new ConversorMoneda();
    private Map<String, Runnable> acciones;

    public OpcionesMoneda(EntradaValor entradaValor) {
        this.entradaValor = entradaValor;
        initComponents();
        initAcciones();
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
        opcionesMonedas = new javax.swing.JComboBox<>();
        opcionesMonedas2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        valorConversion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        opcionesMonedas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        opcionesMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos", "Dolar", "Euro", "Libras", "Yen", "Won Coreano" }));
        opcionesMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesMonedasActionPerformed(evt);
            }
        });

        opcionesMonedas2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        opcionesMonedas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos", "Dolar", "Euro", "Libras", "Yen", "Won Coreano" }));
        opcionesMonedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesMonedas2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setText("Elija la moneda a la que deseas convertir tu dinero: ");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        valorConversion.setEditable(false);
        valorConversion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        valorConversion.setText(String.valueOf(formato.format(entradaValor.getValorConvertido())));
        valorConversion.setBorder(null);
        valorConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorConversionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setText("El valor de tu conversión es: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorConversion, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(opcionesMonedas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcionesMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcionesMonedas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valorConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnVolver))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private String conversion(double entradaValor, double tasaDeCambio) {
     
       
        return formato.format(entradaValor * tasaDeCambio);
           

    }

    private void initAcciones() {
        acciones = new HashMap<>();
        //Asociar combinaciones con sus acciones
        acciones.put("Pesos|Dolar", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[0])));
        acciones.put("Pesos|Euro", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[1])));
        acciones.put("Pesos|Libras", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[2])));
        acciones.put("Pesos|Yen", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[3])));
        acciones.put("Pesos|Won Coreano", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[4])));
        acciones.put("Dolar|Pesos", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[5])));
        acciones.put("Euro|Pesos", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[6])));
        acciones.put("Libras|Pesos", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[7])));
        acciones.put("Yen|Pesos", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[8])));
        acciones.put("Won Coreano|Pesos", () -> valorConversion.setText(conversion(entradaValor.getValorConvertido(), conversorMoneda.getTasasDeCambio()[9])));

    }

    private void realizarAccion() {
        String opcionMoneda1 = (String) opcionesMonedas.getSelectedItem();
        String opcionMoneda2 = (String) opcionesMonedas2.getSelectedItem();
        String clave = opcionMoneda1 + "|" + opcionMoneda2;

        Runnable accion = acciones.get(clave);

        if (accion != null) {
            accion.run();
        } else {
            //String valorConvertido = (String) entradaValor.getValorConvertido();
            valorConversion.setText(String.valueOf(entradaValor.getValorConvertido()));
        }
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        entradaValor.mostrarPanelAnterior();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void opcionesMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesMonedasActionPerformed
        realizarAccion();
    }//GEN-LAST:event_opcionesMonedasActionPerformed

    private void opcionesMonedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesMonedas2ActionPerformed
        realizarAccion();
    }//GEN-LAST:event_opcionesMonedas2ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Desea Finalizar?", "Select an Option", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void valorConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorConversionActionPerformed

    }//GEN-LAST:event_valorConversionActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
                                 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> opcionesMonedas;
    private javax.swing.JComboBox<String> opcionesMonedas2;
    private javax.swing.JTextField valorConversion;
    // End of variables declaration//GEN-END:variables
}
