/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.dao.ChuyenNganhDao;
import com.mycompany.duan1.dao.HocKyDao;
import com.mycompany.duan1.dao.MonHocDao;
import com.mycompany.duan1.dao.NhanVienDao;
import com.mycompany.duan1.model.ChuyenNganh;
import com.mycompany.duan1.model.HocKy;
import com.mycompany.duan1.model.MonHoc;
import com.mycompany.duan1.model.NhanVien;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author ADMIN
 */
public class MonHocJPanel extends javax.swing.JPanel {
    ChuyenNganhDao cndao = new ChuyenNganhDao();
    MonHocDao mhDao = new MonHocDao();
    NhanVienDao nvDao = new NhanVienDao();
    HocKyDao hkdao = new HocKyDao();
    int row = -1;

    /**
     * Creates new form MonHocJPanel
     */
    public MonHocJPanel() {
        initComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMonHoc = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        Scrollbar = new javax.swing.JScrollPane();
        tblMonHoc = new rojeru_san.complementos.RSTableMetro();
        jdcNgayBatDau = new com.toedter.calendar.JDateChooser();
        jdcNgayKetThuc = new com.toedter.calendar.JDateChooser();
        txtMaMonHoc = new textfield.MaMonHoc();
        txtTenMonHoc = new textfield.TenMonHoc();
        txtHocPhi = new textfield.HocPhi();
        cbbmachuyennganh = new combobox.CBBMaChuyenNganh();
        cbb_Manhanvien = new combobox.MaNhanVien();
        txtMaHocKy = new combobox.MaHocKy();

        setMaximumSize(new java.awt.Dimension(1100, 625));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1100, 625));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnMonHoc.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "Quản Lý Môn Học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ngày Kết Thúc");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Ngày Bắt Đầu");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 180, -1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/icons8-add-40.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 140, 50));

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/icons8-edit-40.png"))); // NOI18N
        btnupdate.setText("Sửa ");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 140, 50));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/icons8-remove-40.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 140, 50));

        btnmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/icons8-new-40.png"))); // NOI18N
        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 140, 50));

        Scrollbar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblMonHoc.setBackground(new java.awt.Color(204, 204, 204));
        tblMonHoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Môn Học", "Tên Môn Học", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Chuyên Ngành", "Mã Nhân Viên", "Học Phí", "Học Kỳ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMonHoc.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblMonHoc.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tblMonHoc.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblMonHoc.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblMonHoc.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblMonHoc.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblMonHoc.setRowHeight(40);
        tblMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonHocMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblMonHoc);

        jPanel2.add(Scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1060, 400));

        jdcNgayBatDau.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jdcNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 230, -1));

        jdcNgayKetThuc.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jdcNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 230, -1));
        jPanel2.add(txtMaMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, -1));
        jPanel2.add(txtTenMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 180, -1));
        jPanel2.add(txtHocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 230, -1));

        cbbmachuyennganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbmachuyennganhActionPerformed(evt);
            }
        });
        jPanel2.add(cbbmachuyennganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 180, -1));
        jPanel2.add(cbb_Manhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 180, -1));
        jPanel2.add(txtMaHocKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 180, -1));

        javax.swing.GroupLayout jpnMonHocLayout = new javax.swing.GroupLayout(jpnMonHoc);
        jpnMonHoc.setLayout(jpnMonHocLayout);
        jpnMonHocLayout.setHorizontalGroup(
            jpnMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMonHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMonHocLayout.setVerticalGroup(
            jpnMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMonHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void tblMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonHocMouseClicked
        try {
            
            row = tblMonHoc.getSelectedRow();
            if (row >= 0) {
                String id = (String) tblMonHoc.getValueAt(row, 0);
                MonHoc mh = mhDao.selectById(id);
             
                if (mh != null) {
                    cbbmachuyennganh.setSelectedItem(mh.getMaChuyenNganh());
                    txtTenMonHoc.setText(mh.getTenMonHoc());
                    txtMaMonHoc.setText(mh.getMaMonHoc());
                    cbb_Manhanvien.setSelectedItem(mh.getMaNhanVien());
                    txtHocPhi.setText(String.valueOf(mh.getHocPhi()));
                    txtMaHocKy.setSelectedItem(mh.getHocKy());
                    jdcNgayBatDau.setDate(mh.getNgayBatDau());
                    jdcNgayKetThuc.setDate(mh.getNgayKetThuc());
                    txtMaHocKy.setSelectedItem(mh.getHocKy());
                }
             
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            e.printStackTrace();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tblMonHocMouseClicked

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        txtMaMonHoc.setText("");
        txtTenMonHoc.setText("");
        fillComboBoxChuyenNganh();
        fillComboBoxNhanVien();
        txtHocPhi.setText("");
        txtMaHocKy.setToolTipText(null);
        jdcNgayBatDau.setDate(null);
        jdcNgayKetThuc.setDate(null);
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaMonHoc.getText().equals("")) {
            sb.append("Mã MH không được để trống");
            
            txtMaMonHoc.setBackground(Color.red);
        } else {
            txtMaMonHoc.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        
        try {
            
            mhDao.delete(txtMaMonHoc.getText());
            JOptionPane.showMessageDialog(this, "Dữ liệu đã được xóa");
            Filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            e.printStackTrace();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaMonHoc.getText().equals("")) {
            sb.append("Mã MH không được để trống");
            
            txtMaMonHoc.setBackground(Color.red);
        } else {
            txtMaMonHoc.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        
        try {
            MonHoc monHoc = new MonHoc();
            monHoc.setMaMonHoc(txtMaMonHoc.getText());
            
            monHoc.setTenMonHoc(txtTenMonHoc.getText());
            monHoc.setNgayBatDau(jdcNgayBatDau.getDate());
            monHoc.setNgayKetThuc(jdcNgayKetThuc.getDate());
            monHoc.setMaChuyenNganh(cbbmachuyennganh.getSelectedItem().toString());
            monHoc.setMaNhanVien(cbb_Manhanvien.getSelectedItem().toString());
            monHoc.setHocPhi(Float.parseFloat(txtHocPhi.getText()));
            monHoc.setHocKy(txtMaHocKy.getSelectedItem().toString());
            
            MonHocDao dao = new MonHocDao();
            dao.update(monHoc);
            JOptionPane.showMessageDialog(this, "Dữ liệu đã được chỉnh sửa");
            Filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            e.printStackTrace();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaMonHoc.getText().equals("")) {
            sb.append("Mã MH không được để trống");
            
            txtMaMonHoc.setBackground(Color.red);
        } else {
            txtMaMonHoc.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        
        try {
            MonHoc monHoc = new MonHoc();
            monHoc.setMaMonHoc(txtMaMonHoc.getText());
            
            monHoc.setTenMonHoc(txtTenMonHoc.getText());
            monHoc.setNgayBatDau(jdcNgayBatDau.getDate());
            monHoc.setNgayKetThuc(jdcNgayKetThuc.getDate());
            monHoc.setMaChuyenNganh(cbbmachuyennganh.getSelectedItem().toString());
            monHoc.setMaNhanVien(cbb_Manhanvien.getSelectedItem().toString());
            monHoc.setHocPhi(Float.parseFloat(txtHocPhi.getText()));
            monHoc.setHocKy(txtMaHocKy.getSelectedItem().toString());
            
            mhDao.insert(monHoc);
            JOptionPane.showMessageDialog(this, "Đã lưu");
            Filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnThemActionPerformed

    private void cbbmachuyennganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbmachuyennganhActionPerformed
        // TODO add your handling code here:
        fillComboBoxNhanVien();
    }//GEN-LAST:event_cbbmachuyennganhActionPerformed
    void Filltable() {
        DefaultTableModel model = (DefaultTableModel) tblMonHoc.getModel();
        model.setRowCount(0);
        List<MonHoc> list = mhDao.selectAll();
        for (MonHoc mh : list) {
            Object[] row = {mh.getMaMonHoc(), mh.getTenMonHoc(), mh.getNgayBatDau(), mh.getNgayKetThuc(), mh.getMaChuyenNganh(), mh.getMaNhanVien(), mh.getHocPhi(), mh.getHocKy()};
            model.addRow(row);
        }
    }

    void initTable() {
        Filltable();
        fixTable();
        fillComboBoxChuyenNganh();
        fillComboBoxHocKy();
    }

    void fixTable() {
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    void fillComboBoxChuyenNganh() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbmachuyennganh.getModel();
        model.removeAllElements();
        try {
            List<ChuyenNganh> list = cndao.selectAll();
            for (ChuyenNganh cd : list) {
                model.addElement(cd.getMaChuyenNganh());
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }

    }
    void fillComboBoxNhanVien() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbb_Manhanvien.getModel();
            model.removeAllElements();
            try {
                String chuyenNganh = cbbmachuyennganh.getSelectedItem().toString();
                List<NhanVien> list = nvDao.selectByMaCN(chuyenNganh);
                for (NhanVien cd : list) {
                    model.addElement(cd.getMaNhanVien());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }

    }
    void fillComboBoxHocKy() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtMaHocKy.getModel();
        model.removeAllElements();
        try {
            List<HocKy> list = hkdao.selectAll();
            for (HocKy cd : list) {
                model.addElement(cd.getMaHocKy());
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnupdate;
    private combobox.MaNhanVien cbb_Manhanvien;
    private combobox.CBBMaChuyenNganh cbbmachuyennganh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdcNgayBatDau;
    private com.toedter.calendar.JDateChooser jdcNgayKetThuc;
    private javax.swing.JPanel jpnMonHoc;
    private rojeru_san.complementos.RSTableMetro tblMonHoc;
    private textfield.HocPhi txtHocPhi;
    private combobox.MaHocKy txtMaHocKy;
    private textfield.MaMonHoc txtMaMonHoc;
    private textfield.TenMonHoc txtTenMonHoc;
    // End of variables declaration//GEN-END:variables
}
