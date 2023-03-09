package view;

import dao.DAO;
import java.awt.Graphics;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.sql.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Chitiet_truc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class add_Frm extends javax.swing.JFrame {

    JFrame f;

    List<Chitiet_truc> lsChiTiet_Truc = new ArrayList<>();

    DefaultComboBoxModel modelp = new DefaultComboBoxModel();

    Connection conn = DAO.getConnect();
    DAO dao = new DAO();

    PreparedStatement stm;

    ArrayList<String> arrHocKy;
    ArrayList<String> arrThu;
    ArrayList<String> arrCa;
    ArrayList<String> arrKTV;

    public add_Frm() {
        initComponents();
        f = new JFrame();
        f.setSize(300, 300);
        f.setLocationRelativeTo(this);

        loadDataToComBoBoxKTV();
        loadDataToComBoBoxThu();
        loadDataToComBoBoxCa();
        loadDataToComBoBoxHocKy();
        hienthiJtableLichTruc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableThem = new javax.swing.JTable();
        jComboBoxThu = new javax.swing.JComboBox<>();
        jComboBoxCa = new javax.swing.JComboBox<>();
        jComboBoxHocKy = new javax.swing.JComboBox<>();
        jComboBoxTen = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm Lịch Trực");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Tên Kỹ Thuật Viên:");

        jLabel5.setText("Thứ:");

        jLabel6.setText("Ca Trực:");

        jLabel8.setText("Học Kỳ:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setText("THÊM LỊCH TRỰC CHO NHÂN VIÊN");

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jTableThem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Kỹ Thuật Viên", "Email", "Thứ", "Ca Trực", "Học Kỳ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableThem);

        jComboBoxHocKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHocKyActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(76, 76, 76)
                                .addComponent(jComboBoxHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxThu, 0, 170, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCa, 0, 170, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThemMouseClicked
        showDataToComBoBox();
    }//GEN-LAST:event_jTableThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        arrHocKy = getAllHocKy();
        arrThu = getAllThu();
        arrCa = getAllCa();
        arrKTV = getAllKTV();

        //Lấy dữ liệu từ combobox
        String ten = jComboBoxTen.getSelectedItem() + "";
        String thu = jComboBoxThu.getSelectedItem() + "";
        String ca = jComboBoxCa.getSelectedItem() + "";
        String hocky = jComboBoxHocKy.getSelectedItem() + "";

//        String result = kiemTraTrung(ten, thu, ca, hocky);
//        System.err.println("222    " + kiemTraTrung(ten, thu, ca, hocky));
        //Lấy dữ liệu từ database bỏ vào mảng Array xong kiểm tra
        int id_hocKy = 0;
        for (int i = 0; i < arrHocKy.size(); i++) {
            if (arrHocKy.get(i).equals(hocky)) {
                // VD: Array[1,'Hoàng Tài']
                //dữ liệu được lấy từ combobox == với arrHocKy
                //Thì get(i - 1) để lấy ID 
                id_hocKy = Integer.parseInt(arrHocKy.get(i - 1));
            }
        }
        int id_thu = 0;
        for (int i = 0; i < arrThu.size(); i++) {
            if (arrThu.get(i).equals(thu)) {
                id_thu = Integer.parseInt(arrThu.get(i - 1));
            }
        }
        int id_ca = 0;
        for (int i = 0; i < arrCa.size(); i++) {
            if (arrCa.get(i).equals(ca)) {
                id_ca = Integer.parseInt(arrCa.get(i - 1));
            }
        }
        int id_ktv = 0;
        for (int i = 0; i < arrKTV.size(); i++) {
            if (arrKTV.get(i).equals(ten)) {
                id_ktv = Integer.parseInt(arrKTV.get(i - 1));
            }
        }

        String sql = "INSERT INTO chitiet_truc (hocky_id, thu_id, buoi_id, kythuatvien_id) VALUES (?,?,?,?)";
        String sql2 = "SELECT * FROM chitiet_truc WHERE hocky_id =? and thu_id=? and buoi_id=? and kythuatvien_id=?;";
        try {
            stm = conn.prepareStatement(sql2);
            stm.setInt(1, id_hocKy);
            stm.setInt(2, id_thu);
            stm.setInt(3, id_ca);
            stm.setInt(4, id_ktv);
            if (stm.executeQuery().next()) {
                JOptionPane.showMessageDialog(this, "Dữ liệu trùng!");
            } else {
                stm = conn.prepareStatement(sql);
                stm.setInt(1, id_hocKy);
                stm.setInt(2, id_thu);
                stm.setInt(3, id_ca);
                stm.setInt(4, id_ktv);
                stm.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                hienthiJtableLichTruc();
            }
        } catch (SQLException err) {
            System.err.println(err);
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void jComboBoxHocKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHocKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHocKyActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        arrHocKy = getAllHocKy();
        arrThu = getAllThu();
        arrCa = getAllCa();
        arrKTV = getAllKTV();

        //Lấy dữ liệu từ combobox
        String ten = jComboBoxTen.getSelectedItem() + "";
        String thu = jComboBoxThu.getSelectedItem() + "";
        String ca = jComboBoxCa.getSelectedItem() + "";
        String hocky = jComboBoxHocKy.getSelectedItem() + "";

        //Lấy dữ liệu từ database bỏ vào mảng Array xong kiểm tra
        int removeIndex = jTableThem.getSelectedRow();
        if (removeIndex == -1) {
            JOptionPane.showMessageDialog(this, "Table rỗng hoặc chọn 1 dòng để xóa!!!");
        } else {

            int id_hocKy = 0;
            for (int i = 0; i < arrHocKy.size(); i++) {
                if (arrHocKy.get(i).equals(hocky)) {
                    // VD: Array[1,'Hoàng Tài']
                    //dữ liệu được lấy từ combobox == với arrHocKy
                    //Thì get(i - 1) để lấy ID 
                    id_hocKy = Integer.parseInt(arrHocKy.get(i - 1));
                }
            }
            int id_thu = 0;
            for (int i = 0; i < arrThu.size(); i++) {
                if (arrThu.get(i).equals(thu)) {
                    id_thu = Integer.parseInt(arrThu.get(i - 1));
                }
            }
            int id_ca = 0;
            for (int i = 0; i < arrCa.size(); i++) {
                if (arrCa.get(i).equals(ca)) {
                    id_ca = Integer.parseInt(arrCa.get(i - 1));
                }
            }
            int id_ktv = 0;
            for (int i = 0; i < arrKTV.size(); i++) {
                if (arrKTV.get(i).equals(ten)) {
                    id_ktv = Integer.parseInt(arrKTV.get(i - 1));
                }
            }
            String sql = "DELETE FROM chitiet_truc WHERE hocky_id =? AND  thu_id =? AND  buoi_id =? AND kythuatvien_id =?";
            try {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_hocKy);
                statement.setInt(2, id_thu);
                statement.setInt(3, id_ca);
                statement.setInt(4, id_ktv);

                int a = JOptionPane.showConfirmDialog(f, "Bạn Có Chắc Chắn Muốn Xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.YES_OPTION) {
                    if (statement.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        hienthiJtableLichTruc();
                    }
                } else if (a == JOptionPane.NO_OPTION) {
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            } catch (SQLException err) {
                System.err.println(err);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(f, "Bạn Có Chắc Chắn Muốn Thoát?", "Exit", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.NO_OPTION) {
            new add_Frm().setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(add_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> jComboBoxCa;
    private javax.swing.JComboBox<String> jComboBoxHocKy;
    private javax.swing.JComboBox<String> jComboBoxTen;
    private javax.swing.JComboBox<String> jComboBoxThu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableThem;
    // End of variables declaration//GEN-END:variables

    private void hienthiJtableLichTruc() {
        DefaultTableModel model = (DefaultTableModel) jTableThem.getModel();
        //Clear all rows before adding data
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String cauLenhSQL = "SELECT * FROM chitiet_truc INNER JOIN hocky ON chitiet_truc.hocky_id = hocky.id"
                + " INNER JOIN ca ON chitiet_truc.buoi_id = ca.id"
                + " INNER JOIN thu ON chitiet_truc.thu_id = thu.id"
                + " INNER JOIN kythuatvien ON chitiet_truc.kythuatvien_id = kythuatvien.id";
        ResultSet rs = dao.ThucThiLenhSelect(cauLenhSQL);
        try {
            while (rs.next()) {
                Object[] o = new Object[]{
                    rs.getString("ten_ktv"), rs.getString("email"),
                    rs.getString("tenthu"),
                    rs.getString("tenca"), rs.getString("tenhocky")
                };
                model.addRow(o);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void loadDataToComBoBoxKTV() {
        try {
            String sql_ktv = "SELECT * FROM kythuatvien";
            stm = conn.prepareStatement(sql_ktv);
            ResultSet rs_ktv = stm.executeQuery();
            while (rs_ktv.next()) {
                String name = rs_ktv.getString(2);
                jComboBoxTen.addItem(name);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadDataToComBoBoxThu() {
        try {
            String sql_thu = "SELECT * FROM thu";
            stm = conn.prepareStatement(sql_thu);
            ResultSet rs_thu = stm.executeQuery();
            while (rs_thu.next()) {
                String thu = rs_thu.getString(2);
                jComboBoxThu.addItem(thu);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadDataToComBoBoxCa() {
        try {
            String sql_ca = "SELECT * FROM ca";
            stm = conn.prepareStatement(sql_ca);
            ResultSet rs_ca = stm.executeQuery();
            while (rs_ca.next()) {
                String ca = rs_ca.getString(2);
                jComboBoxCa.addItem(ca);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadDataToComBoBoxHocKy() {
        try {
            String sql_hocKy = "SELECT * FROM hocky";
            stm = conn.prepareStatement(sql_hocKy);
            ResultSet rs_hocKy = stm.executeQuery();
            while (rs_hocKy.next()) {
                String hocKy = rs_hocKy.getString(2);
                jComboBoxHocKy.addItem(hocKy);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> getAllHocKy() {
        ArrayList<String> arr = new ArrayList<String>();
        try {
            String sql_ktv = "SELECT id, tenhocky FROM hocky";
            ResultSet rs_ktv = dao.ThucThiLenhSelect(sql_ktv);
            while (rs_ktv.next()) {
                arr.add(rs_ktv.getInt("id") + "");
                arr.add(rs_ktv.getString("tenhocky"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arr;
    }

    public ArrayList<String> getAllThu() {
        ArrayList<String> arr = new ArrayList<String>();
        try {
            String sql_ktv = "SELECT id, tenthu FROM thu";
            ResultSet rs_ktv = dao.ThucThiLenhSelect(sql_ktv);
            while (rs_ktv.next()) {
                arr.add(rs_ktv.getInt("id") + "");
                arr.add(rs_ktv.getString("tenthu"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arr;
    }

    public ArrayList<String> getAllCa() {
        ArrayList<String> arr = new ArrayList<String>();
        try {
            String sql_ktv = "SELECT id, tenca FROM ca";
            ResultSet rs_ktv = dao.ThucThiLenhSelect(sql_ktv);
            while (rs_ktv.next()) {
                arr.add(rs_ktv.getInt("id") + "");
                arr.add(rs_ktv.getString("tenca"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return arr;
    }

    public ArrayList<String> getAllKTV() {
        ArrayList<String> arr = new ArrayList<String>();
        try {
            String sql_ktv = "SELECT id, ten_ktv FROM kythuatvien";
            ResultSet rs_ktv = dao.ThucThiLenhSelect(sql_ktv);
            while (rs_ktv.next()) {
                arr.add(rs_ktv.getInt("id") + "");
                arr.add(rs_ktv.getString("ten_ktv"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arr;
    }

    public void showDataToComBoBox() {
        int viTriDongDuocChon = jTableThem.getSelectedRow();

        String ten = jTableThem.getValueAt(viTriDongDuocChon, 0).toString();
        jComboBoxTen.setSelectedItem(ten);

        String thu = jTableThem.getValueAt(viTriDongDuocChon, 2).toString();
        jComboBoxThu.setSelectedItem(thu);

        String ca = jTableThem.getValueAt(viTriDongDuocChon, 3).toString();
        jComboBoxCa.setSelectedItem(ca);

        String hocky = jTableThem.getValueAt(viTriDongDuocChon, 4).toString();
        jComboBoxHocKy.setSelectedItem(hocky);
    }
    
    
}
