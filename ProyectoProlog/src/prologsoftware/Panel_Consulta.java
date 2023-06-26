/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prologsoftware;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jpl7.*;

public class Panel_Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Panel_Consulta
     */
    public Panel_Consulta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        String conexion = "consult('DatosProlog.pl')";
        Query ql = new Query(conexion);
        System.out.println(conexion + "" + (ql.hasMoreSolutions()?"Conexión exitosa":"Conexión fallida"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameTextBox = new javax.swing.JTextField();
        MovieTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ConsultarUsuario = new javax.swing.JButton();
        ConsultarPelicula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CaractArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ValoresArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        MCaractArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        MValoresArea = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Pelicula:");

        MovieTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieTextBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Caracteristicas:");

        jLabel4.setText("Valores:");

        jLabel5.setText("Caracteristicas:");

        jLabel6.setText("Valores:");

        ConsultarUsuario.setText("Consultar");
        ConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuarioActionPerformed(evt);
            }
        });

        ConsultarPelicula.setText("Consultar");
        ConsultarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPeliculaActionPerformed(evt);
            }
        });

        CaractArea.setColumns(20);
        CaractArea.setRows(5);
        jScrollPane1.setViewportView(CaractArea);

        ValoresArea.setColumns(20);
        ValoresArea.setRows(5);
        jScrollPane2.setViewportView(ValoresArea);

        MCaractArea.setColumns(20);
        MCaractArea.setRows(5);
        jScrollPane3.setViewportView(MCaractArea);

        MValoresArea.setColumns(20);
        MValoresArea.setRows(5);
        jScrollPane4.setViewportView(MValoresArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(ConsultarUsuario)
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConsultarPelicula)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MovieTextBox))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MovieTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Interfaz home = new Interfaz();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MovieTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovieTextBoxActionPerformed

    private void ConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuarioActionPerformed
        if(!CaractArea.getText().equals("")){
            this.CaractArea.setText("");
            this.ValoresArea.setText("");
        }
        
        if(!NameTextBox.getText().equals("")){                       
//CARACTERISTICAS DE USUARIO 
            Query caractUsuario = new Query("cPersona(" + this.NameTextBox.getText().toLowerCase() + ",X).");
            String caracteristicas = caractUsuario.oneSolution().get("X").toString();
            String cadena = caracteristicas.replace("[", "");
            String cadena2 = cadena.replace("]", "");
            
            CaractArea.append(cadena2);
            
//VALORES DE USUARIO
            Query valorUsuario = new Query("gPersona(" + this.NameTextBox.getText().toLowerCase() + ",X)."); 
            String valores = valorUsuario.oneSolution().get("X").toString();
            String SubCadena = valores.replace("[", "");
            String SubCadena2 = SubCadena.replace("]", "");
            
            ValoresArea.append(SubCadena2);
                        
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa un nombre de usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_ConsultarUsuarioActionPerformed

    private void ConsultarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPeliculaActionPerformed
        if(!MCaractArea.getText().equals("")){            
            this.MCaractArea.setText("");
            this.MValoresArea.setText("");
        }       
        if(!MovieTextBox.getText().equals("")){                       
            //CARACTERISTICAS DE PELICULA            
            Query caractUsuario = new Query("cMultim(" + this.MovieTextBox.getText().toLowerCase() + ",X).");
            String caracteristicas = caractUsuario.oneSolution().get("X").toString();
            String cadena = caracteristicas.replace("[", "");
            String cadena2 = cadena.replace("]", "");
            
            MCaractArea.append(cadena2);
            
            //VALORES DE PELICULA
            Query valorUsuario = new Query("vMultim(" + this.MovieTextBox.getText().toLowerCase() + ",X)."); 
            String valores = valorUsuario.oneSolution().get("X").toString();
            String SubCadena = valores.replace("[", "");
            String SubCadena2 = SubCadena.replace("]", "");
            
            MValoresArea.append(SubCadena2); 
            
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa un nombre de pelicula", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_ConsultarPeliculaActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CaractArea;
    private javax.swing.JButton ConsultarPelicula;
    private javax.swing.JButton ConsultarUsuario;
    private javax.swing.JTextArea MCaractArea;
    private javax.swing.JTextArea MValoresArea;
    private javax.swing.JTextField MovieTextBox;
    private javax.swing.JTextField NameTextBox;
    private javax.swing.JTextArea ValoresArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
