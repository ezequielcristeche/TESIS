/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.sistema.de.control;

import Controladora.LocalidadControladora;
import Modelo.Localidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ezequiel
 */
public class ABMLocalidades extends javax.swing.JInternalFrame {

    Localidad oLocalidad = null;
    LocalidadControladora dloc = new LocalidadControladora();
    int nroFilas = 0;
    List<Localidad> listalocalidades = null;

    /**
     * Creates new form ABMLocalidades
     */
    public ABMLocalidades() {
        initComponents();
        listalocalidades = dloc.obtenListaLocalidades();
        txt_localidad.setText("");
        tabla.getColumnModel().getColumn(1).setMaxWidth(0);
        tabla.getColumnModel().getColumn(1).setMinWidth(0);
        tabla.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tabla.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        if (!listalocalidades.isEmpty()) {
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tabla.getModel();
            for (Localidad l : listalocalidades) {
                modeloDeMiTabla.addRow(new Object[nroFilas]);
                tabla.setValueAt(l.getLocalidad(), nroFilas, 0);
                tabla.setValueAt(l.getIdlocalidades(), nroFilas, 1);
                nroFilas++;
            }
            nroFilas = 0;

        }

    }

    public void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
            listalocalidades = dloc.obtenListaLocalidades();
            txt_localidad.setText("");
            if (!listalocalidades.isEmpty()) {
                DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tabla.getModel();
                for (Localidad l : listalocalidades) {
                    modeloDeMiTabla.addRow(new Object[nroFilas]);
                    tabla.setValueAt(l.getLocalidad(), nroFilas, 0);
                    tabla.setValueAt(l.getIdlocalidades(), nroFilas, 1);
                    nroFilas++;
                }
                nroFilas = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
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

        EMPLEADOS = new java.awt.Label();
        btn_agregar = new java.awt.Button();
        txt_localidad = new java.awt.TextField();
        btn_modif = new java.awt.Button();
        label2 = new java.awt.Label();
        btn_borrar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_nuevo = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Localidades");
        setMaximumSize(new java.awt.Dimension(701, 477));
        setMinimumSize(new java.awt.Dimension(701, 477));
        setPreferredSize(new java.awt.Dimension(701, 477));

        EMPLEADOS.setAlignment(java.awt.Label.CENTER);
        EMPLEADOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EMPLEADOS.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        EMPLEADOS.setText("Localidades");

        btn_agregar.setLabel("GUARDAR");
        btn_agregar.setName(""); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_localidad.setEnabled(false);
        txt_localidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btn_modif.setLabel("MODIFICAR");
        btn_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifActionPerformed(evt);
            }
        });

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("LOCALIDAD");

        btn_borrar.setLabel("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Localidad", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_nuevo.setLabel("NUEVO");
        btn_nuevo.setName(""); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Para seleccionar una Localidad hacer Doble Click sobre la fila deseada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_localidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(EMPLEADOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(EMPLEADOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_modif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        if (!"".equals(txt_localidad.getText())) {
            if (oLocalidad == null) {
                String n = txt_localidad.getText();
                oLocalidad = new Localidad(n);
                dloc.guardaLocalidad(oLocalidad);
                JOptionPane.showMessageDialog(null, "Localidad Registrada");
                this.txt_localidad.setText("");
                this.txt_localidad.enable(false);
                oLocalidad = null;
                limpiarTabla(tabla);
            } else {
                oLocalidad.setLocalidad(txt_localidad.getText());
                dloc.actualizaLocalidad(oLocalidad);
                JOptionPane.showMessageDialog(null, "Localidad Modificada");
                this.txt_localidad.setText("");
                this.txt_localidad.enable(false);
                oLocalidad = null;
                limpiarTabla(tabla);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tabla.getModel();
            int fila = tabla.rowAtPoint(evt.getPoint());
            int columna = tabla.columnAtPoint(evt.getPoint());
            if ((fila > -1) && (columna > -1)) {
                //JOptionPane.showMessageDialog(null, modeloDeMiTabla.getValueAt(fila, columna).toString());
                oLocalidad = new Localidad(Long.parseLong(modeloDeMiTabla.getValueAt(fila, 1).toString()), modeloDeMiTabla.getValueAt(fila, 0).toString());
                txt_localidad.setText(oLocalidad.getLocalidad());
                txt_localidad.enable(false);
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        txt_localidad.enable(true);
        txt_localidad.setText("");
        txt_localidad.requestFocus();
        oLocalidad = null;
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txt_localidad.getText())) {
            txt_localidad.enable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Localidad para Modificar");
        }
    }//GEN-LAST:event_btn_modifActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        if (!"".equals(txt_localidad.getText()) && oLocalidad != null) {
            dloc.eliminaLocalidad(oLocalidad);
            limpiarTabla(tabla);
            JOptionPane.showMessageDialog(null, "Localidad Eliminada Correctamente");
            oLocalidad = null;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Localidad para Eliminarla");
        }
    }//GEN-LAST:event_btn_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label EMPLEADOS;
    private java.awt.Button btn_agregar;
    private java.awt.Button btn_borrar;
    private java.awt.Button btn_modif;
    private java.awt.Button btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label2;
    private javax.swing.JTable tabla;
    private java.awt.TextField txt_localidad;
    // End of variables declaration//GEN-END:variables
}
