/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watet3953
 */
public class ReportCardProUI extends javax.swing.JFrame {

    /**
     * Creates new form ReportCardProUI
     */
    public ReportCardProUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jFrameInput = new javax.swing.JPanel();
        jTFNameFirst = new javax.swing.JTextField();
        jTFNameLast = new javax.swing.JTextField();
        jTFSemester = new javax.swing.JTextField();
        jTFAverage = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();
        jFrameClass0 = new javax.swing.JPanel();
        jTFClass0 = new javax.swing.JTextField();
        jTFMark0 = new javax.swing.JTextField();
        jTFCredit0 = new javax.swing.JTextField();
        jTFAverage0 = new javax.swing.JTextField();
        jTFAttendance0 = new javax.swing.JTextField();
        jTFComments0 = new javax.swing.JTextField();
        jBttnRemove0 = new javax.swing.JButton();
        jBttnAddClass = new javax.swing.JButton();
        jFrameProcess = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTFSNSV = new javax.swing.JTextField();
        jBttnRunSN = new javax.swing.JButton();
        jBttnAddScript = new javax.swing.JButton();
        jFramePrint = new javax.swing.JPanel();
        jBttnPrintSave = new javax.swing.JButton();
        jLblFormatType = new javax.swing.JLabel();
        jCBFormats = new javax.swing.JComboBox<>();
        jFramePreview = new javax.swing.JPanel();
        jBttnSaveFormat = new javax.swing.JButton();
        jFrameTop = new javax.swing.JPanel();
        jLblTitle = new javax.swing.JLabel();
        jBttnSave = new javax.swing.JButton();
        jBttnLoad = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jTFNameFirst.setText("First Name");

        jTFNameLast.setText("Last Name");

        jTFSemester.setText("Semester");

        jTFAverage.setEditable(false);
        jTFAverage.setText("Average");

        jTFID.setText("Student ID");

        jFrameClass0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTFClass0.setText("Class 0");

        jTFMark0.setText("Mark 0");

        jTFCredit0.setText("Credit 0");

        jTFAverage0.setEditable(false);
        jTFAverage0.setText("Average 0");

        jTFAttendance0.setText("Attendance 0");

        jTFComments0.setText("Comments 0");

        jBttnRemove0.setText("Remove Class");

        javax.swing.GroupLayout jFrameClass0Layout = new javax.swing.GroupLayout(jFrameClass0);
        jFrameClass0.setLayout(jFrameClass0Layout);
        jFrameClass0Layout.setHorizontalGroup(
            jFrameClass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameClass0Layout.createSequentialGroup()
                .addComponent(jTFClass0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFMark0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCredit0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFAverage0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFAttendance0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFComments0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBttnRemove0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrameClass0Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFAttendance0, jTFAverage0, jTFClass0, jTFComments0, jTFCredit0, jTFMark0});

        jFrameClass0Layout.setVerticalGroup(
            jFrameClass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameClass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTFClass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTFMark0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTFCredit0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTFAverage0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTFAttendance0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTFComments0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBttnRemove0))
        );

        jBttnAddClass.setText("Add Class");

        javax.swing.GroupLayout jFrameInputLayout = new javax.swing.GroupLayout(jFrameInput);
        jFrameInput.setLayout(jFrameInputLayout);
        jFrameInputLayout.setHorizontalGroup(
            jFrameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFrameClass0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrameInputLayout.createSequentialGroup()
                        .addGroup(jFrameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameInputLayout.createSequentialGroup()
                                .addComponent(jTFNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNameLast, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBttnAddClass))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jFrameInputLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFAverage, jTFID, jTFNameFirst, jTFNameLast, jTFSemester});

        jFrameInputLayout.setVerticalGroup(
            jFrameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNameLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFrameClass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBttnAddClass)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jFrameInputLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFAverage, jTFID, jTFNameFirst, jTFNameLast, jTFSemester});

        jTabbedPane.addTab("Input", jFrameInput);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("[SN]"));

        jBttnRunSN.setText("\"Run Script\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFSNSV, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jBttnRunSN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFSNSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBttnRunSN)
                .addContainerGap())
        );

        jBttnAddScript.setText("\"Add Script\"");

        javax.swing.GroupLayout jFrameProcessLayout = new javax.swing.GroupLayout(jFrameProcess);
        jFrameProcess.setLayout(jFrameProcessLayout);
        jFrameProcessLayout.setHorizontalGroup(
            jFrameProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrameProcessLayout.createSequentialGroup()
                        .addComponent(jBttnAddScript, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jFrameProcessLayout.setVerticalGroup(
            jFrameProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBttnAddScript)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Process", jFrameProcess);

        jBttnPrintSave.setText("Print / Save");

        jLblFormatType.setText("Format Type :");

        jCBFormats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jFramePreview.setBorder(javax.swing.BorderFactory.createTitledBorder("Window"));

        javax.swing.GroupLayout jFramePreviewLayout = new javax.swing.GroupLayout(jFramePreview);
        jFramePreview.setLayout(jFramePreviewLayout);
        jFramePreviewLayout.setHorizontalGroup(
            jFramePreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jFramePreviewLayout.setVerticalGroup(
            jFramePreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jBttnSaveFormat.setText("\"Save Format\"");

        javax.swing.GroupLayout jFramePrintLayout = new javax.swing.GroupLayout(jFramePrint);
        jFramePrint.setLayout(jFramePrintLayout);
        jFramePrintLayout.setHorizontalGroup(
            jFramePrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramePrintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFramePrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFramePrintLayout.createSequentialGroup()
                        .addComponent(jLblFormatType, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBFormats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBttnSaveFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnPrintSave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jFramePreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFramePrintLayout.setVerticalGroup(
            jFramePrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramePrintLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBttnPrintSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFramePrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblFormatType)
                    .addComponent(jCBFormats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBttnSaveFormat)
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(jFramePrintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFramePreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Print", jFramePrint);

        jLblTitle.setText("Report Card Pro");

        jBttnSave.setLabel("Save");
        jBttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnSaveActionPerformed(evt);
            }
        });

        jBttnLoad.setText("Load");

        javax.swing.GroupLayout jFrameTopLayout = new javax.swing.GroupLayout(jFrameTop);
        jFrameTop.setLayout(jFrameTopLayout);
        jFrameTopLayout.setHorizontalGroup(
            jFrameTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameTopLayout.createSequentialGroup()
                .addComponent(jLblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBttnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBttnSave))
        );

        jFrameTopLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBttnLoad, jBttnSave});

        jFrameTopLayout.setVerticalGroup(
            jFrameTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameTopLayout.createSequentialGroup()
                .addGroup(jFrameTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrameTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBttnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBttnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );

        jBttnSave.getAccessibleContext().setAccessibleName("jBttnSave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addComponent(jFrameTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jFrameTop, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane))
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("jTabbedPane");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String dataPath = "";
    
    private String queryDataPath() {
        javax.swing.JOptionPane.showMessageDialog(null,"Test");
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.showOpenDialog(null);
        return "";
    }
    
    private void jBttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnSaveActionPerformed
        String studentID = jTFID.getText();
        if (dataPath.isEmpty()) {
            dataPath = queryDataPath();
        }
    }//GEN-LAST:event_jBttnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ReportCardProUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportCardProUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportCardProUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportCardProUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportCardProUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnAddClass;
    private javax.swing.JButton jBttnAddScript;
    private javax.swing.JButton jBttnLoad;
    private javax.swing.JButton jBttnPrintSave;
    private javax.swing.JButton jBttnRemove0;
    private javax.swing.JButton jBttnRunSN;
    private javax.swing.JButton jBttnSave;
    private javax.swing.JButton jBttnSaveFormat;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBFormats;
    private javax.swing.JPanel jFrameClass0;
    private javax.swing.JPanel jFrameInput;
    private javax.swing.JPanel jFramePreview;
    private javax.swing.JPanel jFramePrint;
    private javax.swing.JPanel jFrameProcess;
    private javax.swing.JPanel jFrameTop;
    private javax.swing.JLabel jLblFormatType;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFAttendance0;
    private javax.swing.JTextField jTFAverage;
    private javax.swing.JTextField jTFAverage0;
    private javax.swing.JTextField jTFClass0;
    private javax.swing.JTextField jTFComments0;
    private javax.swing.JTextField jTFCredit0;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFMark0;
    private javax.swing.JTextField jTFNameFirst;
    private javax.swing.JTextField jTFNameLast;
    private javax.swing.JTextField jTFSNSV;
    private javax.swing.JTextField jTFSemester;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
