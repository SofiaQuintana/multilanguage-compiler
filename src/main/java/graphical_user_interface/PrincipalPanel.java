/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphical_user_interface;

import drivers.FileDriver;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zofia
 */
public class PrincipalPanel extends javax.swing.JFrame {
    private FileDriver driver;
    private JFileChooser chooser;
    private FileNameExtensionFilter languageFilter = new FileNameExtensionFilter("Codigo Fuente", "mlg");
    /**
     * Creates new form PrincipalPanel
     */
    public PrincipalPanel() {
        initComponents();
        this.driver = new FileDriver();
    }

    private void openFile() {
        this.chooser = new JFileChooser();
        this.chooser.setFileFilter(languageFilter);
        int option = chooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        saveAsItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        generateMenu = new javax.swing.JMenu();
        threeACGenerate = new javax.swing.JMenuItem();
        optGenerate = new javax.swing.JMenuItem();
        assemblerGenerate = new javax.swing.JMenuItem();
        executeMenu = new javax.swing.JMenu();
        threeACExe = new javax.swing.JMenuItem();
        optiExe = new javax.swing.JMenuItem();
        assemblerExe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);

        fileMenu.setForeground(new java.awt.Color(255, 255, 255));
        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N

        newItem.setBackground(new java.awt.Color(51, 51, 51));
        newItem.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N
        newItem.setForeground(new java.awt.Color(255, 255, 255));
        newItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new16.png"))); // NOI18N
        newItem.setText("New");
        fileMenu.add(newItem);

        openItem.setBackground(new java.awt.Color(51, 51, 51));
        openItem.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N
        openItem.setForeground(new java.awt.Color(255, 255, 255));
        openItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open16.png"))); // NOI18N
        openItem.setText("Open");
        fileMenu.add(openItem);

        saveItem.setBackground(new java.awt.Color(51, 51, 51));
        saveItem.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N
        saveItem.setForeground(new java.awt.Color(255, 255, 255));
        saveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save16.png"))); // NOI18N
        saveItem.setText("Save");
        fileMenu.add(saveItem);

        saveAsItem.setBackground(new java.awt.Color(51, 51, 51));
        saveAsItem.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N
        saveAsItem.setForeground(new java.awt.Color(255, 255, 255));
        saveAsItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saveAs.png"))); // NOI18N
        saveAsItem.setText("Save As...");
        fileMenu.add(saveAsItem);

        exitItem.setBackground(new java.awt.Color(51, 51, 51));
        exitItem.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N
        exitItem.setForeground(new java.awt.Color(255, 255, 255));
        exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        exitItem.setText("Exit");
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        generateMenu.setForeground(new java.awt.Color(255, 255, 255));
        generateMenu.setText("Generate");
        generateMenu.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N

        threeACGenerate.setText("3-Address Code");
        generateMenu.add(threeACGenerate);

        optGenerate.setText("Optimization");
        generateMenu.add(optGenerate);

        assemblerGenerate.setText("Assembler Code");
        generateMenu.add(assemblerGenerate);

        jMenuBar1.add(generateMenu);

        executeMenu.setForeground(new java.awt.Color(255, 255, 255));
        executeMenu.setText("Execute");
        executeMenu.setFont(new java.awt.Font("URW Gothic L", 0, 13)); // NOI18N

        threeACExe.setText("3-Address Code");
        executeMenu.add(threeACExe);

        optiExe.setText("jMenuItem5");
        executeMenu.add(optiExe);

        assemblerExe.setText("Assembler Code");
        executeMenu.add(assemblerExe);

        jMenuBar1.add(executeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem assemblerExe;
    private javax.swing.JMenuItem assemblerGenerate;
    private javax.swing.JMenu executeMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu generateMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem newItem;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem optGenerate;
    private javax.swing.JMenuItem optiExe;
    private javax.swing.JMenuItem saveAsItem;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JMenuItem threeACExe;
    private javax.swing.JMenuItem threeACGenerate;
    // End of variables declaration//GEN-END:variables
}
