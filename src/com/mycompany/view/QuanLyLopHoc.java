/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.duan1.dao.LopHocDAO;
import com.mycompany.duan1.dao.SinhVienDao;
import com.mycompany.duan1.model.LopHoc;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Admin
 */
public class QuanLyLopHoc extends javax.swing.JPanel {
    SinhVienDao svDao = new SinhVienDao();
    public static String MaLH = null;
    /**
     * Creates new form quanlilophoc
     */
    public QuanLyLopHoc() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Scrollbar = new javax.swing.JScrollPane();
        tblbang = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jdcNgayDangKy = new com.toedter.calendar.JDateChooser();
        txtmalh = new textfield.MaLopHoc();
        jLabel3 = new javax.swing.JLabel();
        txttenlh = new textfield.TenLopHoc();
        txtmanv = new textfield.MaNhanVien();
        btnnew = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setBackground(new java.awt.Color(255, 255, 255));

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã lớp học", "Tên lớp học", "Số lượng sinh viên", "Mã nhân viên", "Ngày đăng kí"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbang.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblbang.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tblbang.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblbang.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblbang.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblbang.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblbang.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblbang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblbang.setRowHeight(35);
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblbang);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "QUẢN LÝ LỚP HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jdcNgayDangKy.setDateFormatString("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ngày đăng kí");

        btnnew.setBackground(new java.awt.Color(204, 0, 51));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Pencil-icon.png"))); // NOI18N
        btnnew.setText("Tạo mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        rSButtonHover3.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/delete-icon.png"))); // NOI18N
        rSButtonHover3.setText("Xóa lớp học");
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/edit_property_24px.png"))); // NOI18N
        rSButtonHover2.setText("Cập nhật lớp học");
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        rSButtonHover1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/add_user_group_woman_man_24px.png"))); // NOI18N
        rSButtonHover1.setText("Thêm lớp học");
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmalh, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttenlh, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jdcNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmalh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttenlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmanv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrollbar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Scrollbar, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        insert();
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblbang.getSelectedRow();
            MaLH = tblbang.getValueAt(row, 0).toString();
            new SLSV(null, true).setVisible(true);
            if(MaLH != null){
                edit();
            }
        }
    }//GEN-LAST:event_tblbangMouseClicked

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        delete();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnnewActionPerformed
    void init() {
        load();
        fixTable();
    }

    void fixTable() {
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    int row = -1;
    LopHocDAO lopHocDAO = new LopHocDAO();

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
        model.setRowCount(0);
        List<LopHoc> list = lopHocDAO.selectAll();
        for (LopHoc lh : list) {
            int SLSV = svDao.selectSLSV(lh.getMaLopHoc()).size();
            Object[] row = {
                lh.getMaLopHoc(),
                lh.getTenLopHoc(),
                SLSV,
                lh.getMaNhanVien(),
                lh.getNgayDangKy()};
            model.addRow(row);
        }
    }

    void insert() {
        LopHoc lh = getmodel();
        try {
            lopHocDAO.insert(lh);
            load();
            JOptionPane.showMessageDialog(this, "Them Thanh Cong");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Them That bai");
            e.printStackTrace();
        }
    }

    void edit() {
        String MaLopHoc = (String) tblbang.getValueAt(row, 0);
        LopHoc lh = lopHocDAO.selectById(MaLopHoc);
        setForm(lh);
    }

    void setForm(LopHoc lh) {
        txtmalh.setText(lh.getMaLopHoc());
        txttenlh.setText(lh.getTenLopHoc());
        txtmanv.setText(lh.getMaNhanVien());
        jdcNgayDangKy.setDate(lh.getNgayDangKy());
    }

    void update() {
        LopHoc model = getmodel();
        try {
            lopHocDAO.update(model);
            JOptionPane.showMessageDialog(this, "Cap Nhat Thanh Cong");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    LopHoc getmodel() {
        LopHoc model = new LopHoc();
        model.setMaLopHoc(txtmalh.getText());
        model.setTenLopHoc(txttenlh.getText());
        model.setMaNhanVien(txtmanv.getText());
        model.setNgayDangKy(jdcNgayDangKy.getDate());
        return model;
    }

    void delete() {
        String MaLopHoc = txtmalh.getText();
        try {
            lopHocDAO.delete(MaLopHoc);
            load();
            JOptionPane.showMessageDialog(this, "Xoa Thanh Cong");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xoa That Bai");
        }
    }

    void clearForm() {
        txtmalh.setText("");
        jdcNgayDangKy.setDate(null);
        txttenlh.setText("");
        txtmanv.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private rojeru_san.complementos.RSButtonHover btnnew;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcNgayDangKy;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSTableMetro tblbang;
    private textfield.MaLopHoc txtmalh;
    private textfield.MaNhanVien txtmanv;
    private textfield.TenLopHoc txttenlh;
    // End of variables declaration//GEN-END:variables
}
