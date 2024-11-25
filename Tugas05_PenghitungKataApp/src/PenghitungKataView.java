
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PenghitungKataView extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataView
     */
    public PenghitungKataView() {
        initComponents();
        
          // Menambahkan DocumentListener ke inputTextArea untuk menghitung kata, karakter, dan kalimat secara real-time
        
        // Menambahkan DocumentListener ke jTextFieldcari untuk pencarian secara real-time
        txtcarikata.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                cariKata(); // Panggil metode cariKata saat teks di jTextFieldcari ditambahkan
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                cariKata(); // Panggil metode cariKata saat teks di jTextFieldcari dihapus
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                cariKata(); // Panggil metode cariKata saat teks di jTextFieldcari berubah
            }
        });
        
        
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
        lblInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblJumlahkata = new javax.swing.JLabel();
        lblJumlahKarakter = new javax.swing.JLabel();
        lblJumlahKalimat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinput = new javax.swing.JTextArea();
        txtcarikata = new javax.swing.JTextField();
        BtnHitung = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        lblHasilCaraKata = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        lblInput.setBackground(new java.awt.Color(0, 255, 204));
        lblInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Input");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cari Kata");

        lblJumlahkata.setBackground(new java.awt.Color(255, 255, 255));
        lblJumlahkata.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahkata.setText("Jumlah Kata : 0");

        lblJumlahKarakter.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKarakter.setText("Jumlah Karakter : 0");

        lblJumlahKalimat.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKalimat.setText("Jumlah kalimat : 0");

        txtinput.setColumns(20);
        txtinput.setRows(5);
        jScrollPane1.setViewportView(txtinput);

        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        lblHasilCaraKata.setForeground(new java.awt.Color(255, 255, 255));
        lblHasilCaraKata.setText("Hasil Cari Kata :");

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnKeluar.setText("Keluar");
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblInputLayout = new javax.swing.GroupLayout(lblInput);
        lblInput.setLayout(lblInputLayout);
        lblInputLayout.setHorizontalGroup(
            lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblInputLayout.createSequentialGroup()
                        .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHasilCaraKata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblInputLayout.createSequentialGroup()
                                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblInputLayout.createSequentialGroup()
                                        .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtcarikata)
                                    .addComponent(jScrollPane1))))
                        .addGap(272, 272, 272))
                    .addGroup(lblInputLayout.createSequentialGroup()
                        .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblJumlahKalimat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJumlahKarakter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(lblJumlahkata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        lblInputLayout.setVerticalGroup(
            lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblInputLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcarikata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnHitung)
                        .addComponent(BtnHapus)
                        .addComponent(BtnSimpan))
                    .addComponent(BtnKeluar))
                .addGap(18, 18, 18)
                .addComponent(lblHasilCaraKata, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJumlahkata)
                .addGap(22, 22, 22)
                .addComponent(lblJumlahKarakter)
                .addGap(18, 18, 18)
                .addComponent(lblJumlahKalimat)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        // TODO add your handling code here:
        String teks = txtinput.getText(); // Mengambil teks dari JTextArea
        lblJumlahkata.setText("Jumlah Kata: " + hitungKata(teks)); // Menampilkan jumlah kata
        lblJumlahKarakter.setText("Jumlah Karakter: " + hitungKarakter(teks)); // Menampilkan jumlah karakter
        lblJumlahKalimat.setText("Jumlah Kalimat: " + hitungKalimat(teks)); // Menampilkan jumlah kalimat
    
        
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        // Mengosongkan inputTextArea, jTextFieldcari, dan mengatur ulang label hasil hitungan
        txtinput.setText("");
        txtcarikata.setText("");
        lblJumlahkata.setText("Jumlah Kata: 0");
        lblJumlahKarakter.setText("Jumlah Karakter: 0");
        lblJumlahKalimat.setText("Jumlah Kalimat: 0");
        lblHasilCaraKata.setText("Hasil Cari Kata :");
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        // TODO add your handling code here:
        // Menutup aplikasi
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        // Menampilkan dialog untuk memilih lokasi dan nama file
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan ke File");
    int userSelection = fileChooser.showSaveDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        // Mendapatkan file yang dipilih
        File fileToSave = fileChooser.getSelectedFile();
        
        // Menulis teks dan hasil perhitungan ke file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileToSave))) {
            String teks = txtinput.getText();
            writer.println("Teks yang dimasukkan:");
            writer.println(teks);
            writer.println("\nHasil Perhitungan:");
            writer.println("Jumlah Kata: " + hitungKata(teks));
            writer.println("Jumlah Karakter: " + hitungKarakter(teks));
            writer.println("Jumlah Kalimat: " + hitungKalimat(teks));
            writer.println("==================================");
            writer.println("Hasil Cari Kata: " + lblHasilCaraKata.getText());
            
            JOptionPane.showMessageDialog(this, "File berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_BtnSimpanActionPerformed

    // Metode untuk menghitung jumlah kata dalam teks
    private int hitungKata(String teks) {
        // Memisahkan teks berdasarkan spasi menggunakan regex "\\s+" dan menghitung panjang array hasil split
        return teks.trim().isEmpty() ? 0 : teks.trim().split("\\s+").length;
    }
    
    // Metode untuk menghitung jumlah karakter dalam teks
    private int hitungKarakter(String teks) {
        return teks.length(); // Mengembalikan jumlah karakter dalam teks
    }

    // Metode untuk menghitung jumlah kalimat dalam teks
    private int hitungKalimat(String teks) {
        // Memisahkan teks berdasarkan tanda titik, tanda seru, atau tanda tanya dan menghitung panjang array hasil split
        return teks.trim().isEmpty() ? 0 : teks.trim().split("[.!?]").length;
    }
    
    // Metode untuk menghitung jumlah kata, karakter, dan kalimat, serta menampilkannya di JLabel
    private void hitung() {
        String teks = txtinput.getText(); // Mengambil teks dari JTextArea
        lblJumlahkata.setText("Jumlah Kata: " + hitungKata(teks)); // Menampilkan jumlah kata
        lblJumlahKarakter.setText("Jumlah Karakter: " + hitungKarakter(teks)); // Menampilkan jumlah karakter
        lblJumlahKalimat.setText("Jumlah Kalimat: " + hitungKalimat(teks)); // Menampilkan jumlah kalimat
    }
    
  
   
 
    
    // Metode untuk mencari kata di inputTextArea berdasarkan input dari jTextFieldcari
    private void cariKata() {
        String teks = txtinput.getText().toLowerCase(); // Mengambil teks dari JTextArea
        String kataDicari = txtcarikata.getText().toLowerCase(); // Mengambil kata dari JTextField

        // Jika kataDicari kosong, berhenti pencarian
        if (kataDicari.isEmpty()) {
            lblJumlahkata.setText("Jumlah Kata: " + hitungKata(teks));
            return;
        }

        int count = 0;
        int index = 0;

        // Loop untuk menghitung kemunculan kata yang dicari
        while ((index = teks.indexOf(kataDicari, index)) != -1) {
            count++;
            index += kataDicari.length();
        }

        // Menampilkan jumlah kemunculan kata yang dicari
        lblHasilCaraKata.setText("Kemunculan '" + kataDicari + "': " + count); 
    }
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
            java.util.logging.Logger.getLogger(PenghitungKataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHasilCaraKata;
    private javax.swing.JPanel lblInput;
    private javax.swing.JLabel lblJumlahKalimat;
    private javax.swing.JLabel lblJumlahKarakter;
    private javax.swing.JLabel lblJumlahkata;
    private javax.swing.JTextField txtcarikata;
    private javax.swing.JTextArea txtinput;
    // End of variables declaration//GEN-END:variables
}
