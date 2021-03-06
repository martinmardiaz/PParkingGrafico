/*
Autor: Martín Marín Díaz
Escuela: Monlau
Curso: 1DAM
Fecha: 19/03/2021
Tema: Matrices
 */
package PKMartín;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class JFrameMain extends javax.swing.JFrame 
{
    int[][] matrixParking;
    int nRow, nCol;
    
    public JFrameMain() 
    {
        initComponents();
        initConfig();
    }
    
    private void initConfig() 
    {
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Parking Status");
        getContentPane().setBackground(new Color(157, 17, 17));
    }
    
    private void setPanel(JTextField rowField, JTextField colField, JPanel optionPanel)
    {
        optionPanel.add(new JLabel("Rows: "));
        optionPanel.add(rowField);
        optionPanel.add(Box.createHorizontalStrut(20));
        optionPanel.add(new JLabel("Columns: "));
        optionPanel.add(colField);
    }
    
    private void dimensionMatrix(int nRow, int nCol)
    {
        matrixParking = new int[nRow][nCol];
    }
    
    private void viewMatrix(int nRow, int nCol) 
    {
        jPanelMatrix.setLayout(new GridLayout(nRow, nCol));
        
        for (int i = 1; i < nRow * nCol; i++)
        {
            JLabel labI = new JLabel("0", JLabel.CENTER);
            jPanelMatrix.add(labI);
        }
    }
    
    private void setSpinnerValues(int nRow, int nCol)
    {
        SpinnerModel rows = new SpinnerNumberModel(0, 0, nRow, 1);
        SpinnerModel columns = new SpinnerNumberModel(0, 0, nCol, 1);
        
        jSpinnerSRAvailable.setModel(rows);
        jSpinnerSCAvailable.setModel(columns);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPaneBase = new javax.swing.JTabbedPane();
        jPanelStatus = new javax.swing.JPanel();
        jLabelColStatus = new javax.swing.JLabel();
        jTextFieldColStatus = new javax.swing.JTextField();
        jTextFieldRowStatus = new javax.swing.JTextField();
        jLabelPStatus = new javax.swing.JLabel();
        jLabelRowStatus = new javax.swing.JLabel();
        jButtonChangeTotal = new javax.swing.JButton();
        jLabelColStatus1 = new javax.swing.JLabel();
        jTextFieldCarsIn = new javax.swing.JTextField();
        jLabelColStatus2 = new javax.swing.JLabel();
        jTextFieldPercAvail = new javax.swing.JTextField();
        jPanelAvailable = new javax.swing.JPanel();
        jLabelSAvailable = new javax.swing.JLabel();
        jLabelSRowAvailable = new javax.swing.JLabel();
        jLabelSColAvailable = new javax.swing.JLabel();
        jSpinnerSRAvailable = new javax.swing.JSpinner();
        jSpinnerSCAvailable = new javax.swing.JSpinner();
        jButtonChAvailability = new javax.swing.JButton();
        jPanelTAvailable = new javax.swing.JPanel();
        jLabelTAvailable = new javax.swing.JLabel();
        jLabelTRowAvailable = new javax.swing.JLabel();
        jLabelTColAvailable = new javax.swing.JLabel();
        jSliderTColAvailable = new javax.swing.JSlider();
        jSliderTRowAvailable = new javax.swing.JSlider();
        jLabelMinValC = new javax.swing.JLabel();
        jLabelMinValR = new javax.swing.JLabel();
        jLabelMaxValR = new javax.swing.JLabel();
        jLabelMaxValC = new javax.swing.JLabel();
        jPanelMatrix = new javax.swing.JPanel();
        jLabelMatrix = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelStatus.setPreferredSize(new java.awt.Dimension(500, 350));
        jPanelStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelColStatus.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelColStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelColStatus.setText("TOTAL COLUMNS");
        jPanelStatus.add(jLabelColStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, -1));

        jTextFieldColStatus.setEditable(false);
        jPanelStatus.add(jTextFieldColStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, -1));

        jTextFieldRowStatus.setEditable(false);
        jPanelStatus.add(jTextFieldRowStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, -1));

        jLabelPStatus.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabelPStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPStatus.setText("PARKING STATUS");
        jPanelStatus.add(jLabelPStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 420, -1));

        jLabelRowStatus.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelRowStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRowStatus.setText("TOTAL ROWS");
        jPanelStatus.add(jLabelRowStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, -1));

        jButtonChangeTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonChangeTotal.setText("CHANGE R / C");
        jButtonChangeTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeTotalActionPerformed(evt);
            }
        });
        jPanelStatus.add(jButtonChangeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 360, 50));

        jLabelColStatus1.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelColStatus1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelColStatus1.setText("% AVAILABLE");
        jPanelStatus.add(jLabelColStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, -1));

        jTextFieldCarsIn.setEditable(false);
        jPanelStatus.add(jTextFieldCarsIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, -1));

        jLabelColStatus2.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelColStatus2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelColStatus2.setText("CARS INSIDE");
        jPanelStatus.add(jLabelColStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, -1));

        jTextFieldPercAvail.setEditable(false);
        jPanelStatus.add(jTextFieldPercAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 170, -1));

        jTabbedPaneBase.addTab("Parking Status", jPanelStatus);

        jPanelAvailable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelSAvailable.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabelSAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSAvailable.setText("IS THIS SPOT AVAILABLE?");

        jLabelSRowAvailable.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelSRowAvailable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSRowAvailable.setText("SELECT ROW");

        jLabelSColAvailable.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        jLabelSColAvailable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSColAvailable.setText("SELECT COLUMN");

        jSpinnerSRAvailable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jSpinnerSCAvailable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButtonChAvailability.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonChAvailability.setText("CHECK AVAILABILITY");
        jButtonChAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChAvailabilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAvailableLayout = new javax.swing.GroupLayout(jPanelAvailable);
        jPanelAvailable.setLayout(jPanelAvailableLayout);
        jPanelAvailableLayout.setHorizontalGroup(
            jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAvailableLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAvailableLayout.createSequentialGroup()
                                .addComponent(jLabelSColAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerSCAvailable))
                            .addGroup(jPanelAvailableLayout.createSequentialGroup()
                                .addComponent(jLabelSRowAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerSRAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonChAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAvailableLayout.setVerticalGroup(
            jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSAvailable)
                .addGap(55, 55, 55)
                .addGroup(jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSRowAvailable)
                    .addComponent(jSpinnerSRAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanelAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSColAvailable)
                    .addComponent(jSpinnerSCAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonChAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneBase.addTab("Check available spot", jPanelAvailable);

        jPanelTAvailable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTAvailable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTAvailable.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabelTAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTAvailable.setText("AVAILABLE SPOTS");
        jPanelTAvailable.add(jLabelTAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 400, -1));

        jLabelTRowAvailable.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelTRowAvailable.setText("AVAILABLE ROWS");
        jPanelTAvailable.add(jLabelTRowAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelTColAvailable.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelTColAvailable.setText("AVAILABLE COLUMNS");
        jPanelTAvailable.add(jLabelTColAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanelTAvailable.add(jSliderTColAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, 30));
        jPanelTAvailable.add(jSliderTRowAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 200, 30));

        jLabelMinValC.setText("0");
        jPanelTAvailable.add(jLabelMinValC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 165, -1, -1));

        jLabelMinValR.setText("0");
        jPanelTAvailable.add(jLabelMinValR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 106, -1, -1));

        jLabelMaxValR.setText("0");
        jPanelTAvailable.add(jLabelMaxValR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 106, -1, -1));

        jLabelMaxValC.setText("0");
        jPanelTAvailable.add(jLabelMaxValC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, -1, -1));

        jPanelMatrix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelMatrix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMatrix.setToolTipText("");
        jLabelMatrix.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelMatrixLayout = new javax.swing.GroupLayout(jPanelMatrix);
        jPanelMatrix.setLayout(jPanelMatrixLayout);
        jPanelMatrixLayout.setHorizontalGroup(
            jPanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatrixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMatrix, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMatrixLayout.setVerticalGroup(
            jPanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatrixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMatrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMatrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPaneBase, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jPanelTAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMatrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPaneBase, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelTAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        final String[] uniqueOption = {"Set the values!"};
        String rowText, colText;
        int option, rows, columns;
        JTextField rowField = new JTextField(6), colField = new JTextField(6);
        JPanel jPanel = new JPanel();
        
        setPanel(rowField, colField, jPanel);
        
        option = JOptionPane.showOptionDialog(null, jPanel, "Change the values? Set them here: ", JOptionPane.YES_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, uniqueOption, uniqueOption[0]);
        
        if (option == JOptionPane.YES_OPTION)
        {
            rowText = rowField.getText();
            colText = colField.getText();
        
            rows = Integer.parseInt(rowText);
            columns = Integer.parseInt(colText);
            
            jPanelMatrix.removeAll();
            
            setSpinnerValues(rows, columns);
            dimensionMatrix(rows, columns);
            viewMatrix(rows, columns);
            
            // Status fields
            jTextFieldRowStatus.setText(String.valueOf(rows));
            jTextFieldColStatus.setText(String.valueOf(columns));
            
            // Slider and label values
            jSliderTRowAvailable.setMaximum(rows);
            jSliderTRowAvailable.setMinimum(0);
            jSliderTRowAvailable.setValue(rows);
            
            jLabelMaxValR.setText(String.valueOf(rows));
            
            jSliderTColAvailable.setMaximum(columns);
            jSliderTColAvailable.setMinimum(0);
            jSliderTColAvailable.setValue(columns);
            
            jLabelMaxValC.setText(String.valueOf(columns));
            
            // % available and cars inside
            jTextFieldPercAvail.setText(String.valueOf(100 - (jSliderTRowAvailable.getValue() * jSliderTColAvailable.getValue() / 100)));
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonChangeTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeTotalActionPerformed
        final String[] uniqueOption = {"Set the values!"};
        String rowText, colText;
        int option, rows, columns;
        
        JTextField rowField = new JTextField(5), colField = new JTextField(5);
        JPanel jPanel = new JPanel();
        
        setPanel(rowField, colField, jPanel);
        
        option = JOptionPane.showOptionDialog(null, jPanel, "Change the values? Set them here: ", JOptionPane.YES_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, uniqueOption, uniqueOption[0]);
        
        if (option == JOptionPane.YES_OPTION)
        {
            rowText = rowField.getText();
            colText = colField.getText();
        
            rows = Integer.parseInt(rowText);
            columns = Integer.parseInt(colText);
            
            jPanelMatrix.removeAll();
            
            setSpinnerValues(rows, columns);
            dimensionMatrix(rows, columns);
            viewMatrix(rows, columns);
            
            jTextFieldRowStatus.setText(String.valueOf(rows));
            jTextFieldColStatus.setText(String.valueOf(columns));
            
            jSliderTRowAvailable.setMaximum(rows);
            jSliderTRowAvailable.setMinimum(0);
            jSliderTRowAvailable.setValue(rows);
            
            jLabelMaxValR.setText(String.valueOf(rows));
            
            jSliderTColAvailable.setMaximum(columns);
            jSliderTColAvailable.setMinimum(0);
            jSliderTColAvailable.setValue(columns);
            
            jLabelMaxValC.setText(String.valueOf(columns));
        }
    }//GEN-LAST:event_jButtonChangeTotalActionPerformed

    private void jButtonChAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChAvailabilityActionPerformed
        
    }//GEN-LAST:event_jButtonChAvailabilityActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChAvailability;
    private javax.swing.JButton jButtonChangeTotal;
    private javax.swing.JLabel jLabelColStatus;
    private javax.swing.JLabel jLabelColStatus1;
    private javax.swing.JLabel jLabelColStatus2;
    private javax.swing.JLabel jLabelMatrix;
    private javax.swing.JLabel jLabelMaxValC;
    private javax.swing.JLabel jLabelMaxValR;
    private javax.swing.JLabel jLabelMinValC;
    private javax.swing.JLabel jLabelMinValR;
    private javax.swing.JLabel jLabelPStatus;
    private javax.swing.JLabel jLabelRowStatus;
    private javax.swing.JLabel jLabelSAvailable;
    private javax.swing.JLabel jLabelSColAvailable;
    private javax.swing.JLabel jLabelSRowAvailable;
    private javax.swing.JLabel jLabelTAvailable;
    private javax.swing.JLabel jLabelTColAvailable;
    private javax.swing.JLabel jLabelTRowAvailable;
    private javax.swing.JPanel jPanelAvailable;
    private javax.swing.JPanel jPanelMatrix;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JPanel jPanelTAvailable;
    private javax.swing.JSlider jSliderTColAvailable;
    private javax.swing.JSlider jSliderTRowAvailable;
    private javax.swing.JSpinner jSpinnerSCAvailable;
    private javax.swing.JSpinner jSpinnerSRAvailable;
    private javax.swing.JTabbedPane jTabbedPaneBase;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCarsIn;
    private javax.swing.JTextField jTextFieldColStatus;
    private javax.swing.JTextField jTextFieldPercAvail;
    private javax.swing.JTextField jTextFieldRowStatus;
    // End of variables declaration//GEN-END:variables
}
