/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.File;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.DAO;
import controller.fileAccess;
import model.Dt;
import model.Gd;
import model.Ht;
import model.Tk;
import model.Ty;
import model.khoanChi;
import model.khoanThu;
import model.soDu;
import model.khoanThu;

/**
 *
 * @author TRung
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
	private ArrayList<khoanThu> list;
	private ArrayList<khoanChi> list2;
	private ArrayList<Ty> listTy;
	private ArrayList<Gd> listGd;
	private ArrayList<Ht> listHt;
	private ArrayList<Tk> listTk;
	private ArrayList<Dt> listDt;
	private ArrayList<soDu> listSd;
    DefaultTableModel model;
    DefaultTableModel model2;
    private Stack<String> soDuKhaDung = new Stack<String>();
    private File f = new File("C:\\Users\\TRung\\eclipse-workspace\\first\\btl_java\\soDuKhaDung.txt");
    
    public UI() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        Date d= new Date(System.currentTimeMillis());
        jLabelSetDay2.setText(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        list = new DAO().getListKhoanThu();
        model = (DefaultTableModel) jTable2.getModel();

        model.setColumnIdentifiers(new Object[]{
           "TT", "Ngày", "Mô tả", "Số tiền"
        });
        list2 = new DAO().getListKhoanChi();
        model2 = (DefaultTableModel) jTable1.getModel();

        model2.setColumnIdentifiers(new Object[]{
           "TT", "Ngày", "Mô tả","Mục đích", "Số tiền"
        });
        showTableChi();
        showTableThu();// hien thi thong tin trong danh sach
        
        //jLabel1_SoDu2.setText(new fileAccess().read(f));
        listSd = new DAO().getListSd();
        showSd();
        listTy = new DAO().getListTy();
        showTy();
        listGd = new DAO().getListGd();
        showGd();
        listHt = new DAO().getListHt();
        showHt();
        listTk = new DAO().getListTk();
        showTk();
        listDt = new DAO().getListDt();
        showDt();
//        jLabel1_SoDu2.setText(new fileAccess().read(fTY));
//        jLabel1_SoDu2.setText(new fileAccess().read(fGD));
//        jLabel1_SoDu2.setText(new fileAccess().read(fHT));
//        jLabel1_SoDu2.setText(new fileAccess().read(fTK));
//        jLabel1_SoDu2.setText(new fileAccess().read(fDT));
    }
    

    /**
     * Creates new form khoanThuView
     * @return 
     */
//    public void khoanThuView() {
//        
//       
//    }

    public void showTableThu() {
        for (khoanThu kt : list) {
            model.addRow(new Object[]{
                i++, kt.getDay(), kt.getMoTa(), kt.getSoTien()
            });//kt.getStt(),
        }
    }
    public void showTableChi() {
        for (khoanChi kc : list2) {
            model2.addRow(new Object[]{
                i++, kc.getDay(), kc.getMoTa2(), kc.getMucDich(), kc.getSoTien2()
            });
        }
    }
    public void showSd() {
        for (soDu s : listSd) {
            
               jLabel1_SoDu2.setText(s.getSt()+"");
            
        }
    }
    public void showGd() {
        for (Gd s : listGd) {
            
               jLabelGD.setText(s.getSt()+"");
            
        }
    }
    public void showHt() {
        for (Ht s : listHt) {
            
               jLabelHT.setText(s.getSt()+"");
            
        }
    }
    public void showTk() {
        for (Tk s : listTk) {
            
               jLabelTK.setText(s.getSt()+"");
            
        }
    }
    public void showDt() {
        for (Dt s : listDt) {
            
               jLabelDT.setText(s.getSt()+"");
            
        }
    }
    public void showTy() {
        for (Ty s : listTy) {
            
               jLabelTY.setText(s.getSt()+"");
            
        }
    }
    
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        // TODO add your handling code here:
//        khoanThu s = new khoanThu();
//        s.setAddress(txtaddress.getText());
//        s.setEmail(txtemail.getText());
//        s.setID(txtid.getText());
//        s.setMark(Float.parseFloat(txtmark.getText()));
//        s.setName(txtname.getText());
//        s.setPhone(txtphonenumber.getText());
//        try {
//            s.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(txtdob.getText()));
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//        
//        if(new DAO().addkhoanThu(s)){
//            JOptionPane.showMessageDialog(rootPane, "Add Success!");
//            list.add(s); // them vao danh sach SV
//        } else{
//            JOptionPane.showMessageDialog(rootPane, "khoanThu's ID cannot be duplicated!");
//        }
//        showResult();
//    }//GEN-LAST:event_jButton1ActionPerformed

    int i = 1;

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialogAddThu = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jTextFieldAddThu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelSetDay = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonCloseDialog2 = new javax.swing.JButton();
        jDialogAddChi = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jTextFieldAddChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldScript2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelSetDay2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButtonCloseDialogChi = new javax.swing.JButton();
        jDialogEnror = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jButtonAddChi = new javax.swing.JButton();
        jButtonAddThu = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel1_SoDu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1_SoDu2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1_dialog = new javax.swing.JLabel();
        jLabel2_dialog = new javax.swing.JLabel();
        jLabel3_dialog = new javax.swing.JLabel();
        jLabel4_dialog = new javax.swing.JLabel();
        jLabel5_dialog = new javax.swing.JLabel();
        jLabelSetTY = new javax.swing.JLabel();
        jLabelSetGD = new javax.swing.JLabel();
        jLabelSetHT = new javax.swing.JLabel();
        jLabelSetTK = new javax.swing.JLabel();
        jLabelSetDT = new javax.swing.JLabel();
        jButtonTYt = new javax.swing.JButton();
        jButtonGDt = new javax.swing.JButton();
        jButtonHTt = new javax.swing.JButton();
        jButtonTKt = new javax.swing.JButton();
        jButtonTYg = new javax.swing.JButton();
        jButtonGDg = new javax.swing.JButton();
        jButtonHTg = new javax.swing.JButton();
        jButtonTkg = new javax.swing.JButton();
        jButtonDTt = new javax.swing.JButton();
        jButtonDTg = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonCloseDialog = new javax.swing.JButton();
        Label7 = new javax.swing.JLabel();
        jLabelSum = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTY = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelGD = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelHT = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTK = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabelDT = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        jDialogAddThu.setTitle("Thêm khoản thu/chi");
        jDialogAddThu.setMinimumSize(new java.awt.Dimension(800, 600));
        jDialogAddThu.setModal(true);

        jTextFieldAddThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddThuActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập số tiền");

        jTextFieldScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScriptActionPerformed(evt);
            }
        });

        jLabel2.setText("Mô tả");

        jLabelSetDay.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabelSetDay.setText("jLabel14");
        jLabelSetDay.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelSetDayAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setText("Ngày :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAddThu, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldScript, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetDay, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldScript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetDay)
                    .addComponent(jLabel15))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jButtonCloseDialog2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCloseDialog2.setText("OK");
        jButtonCloseDialog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseDialog2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonCloseDialog2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCloseDialog2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogAddThuLayout = new javax.swing.GroupLayout(jDialogAddThu.getContentPane());
        jDialogAddThu.getContentPane().setLayout(jDialogAddThuLayout);
        jDialogAddThuLayout.setHorizontalGroup(
            jDialogAddThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAddThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialogAddThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialogAddThuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jDialogAddThuLayout.setVerticalGroup(
            jDialogAddThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAddThuLayout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDialogAddThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialogAddThuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        jDialogAddChi.setTitle("Thêm khoản chi");
        jDialogAddChi.setMinimumSize(new java.awt.Dimension(800, 600));
        jDialogAddChi.setModal(true);

        jTextFieldAddChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddChiActionPerformed(evt);
            }
        });

        jLabel7.setText("Nhập số tiền");

        jTextFieldScript2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScript2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Mô tả");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thiết yếu", "Giáo dục", "Hưởng thụ", "Tiết kiệm", "Đầu tư" }));

        jLabel3.setText("Mục đích");

        jLabel14.setText("Ngày ;");

        jLabelSetDay2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabelSetDay2.setText("jLabel16");
        jLabelSetDay2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelSetDay2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAddChi, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldScript2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldScript2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelSetDay2))
                .addGap(42, 42, 42))
        );

        jButtonCloseDialogChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCloseDialogChi.setText("OK");
        jButtonCloseDialogChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseDialogChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jButtonCloseDialogChi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButtonCloseDialogChi)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jDialogAddChiLayout = new javax.swing.GroupLayout(jDialogAddChi.getContentPane());
        jDialogAddChi.getContentPane().setLayout(jDialogAddChiLayout);
        jDialogAddChiLayout.setHorizontalGroup(
            jDialogAddChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAddChiLayout.createSequentialGroup()
                .addGroup(jDialogAddChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogAddChiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDialogAddChiLayout.setVerticalGroup(
            jDialogAddChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAddChiLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDialogEnror.setTitle("Lỗi");
        jDialogEnror.setMinimumSize(new java.awt.Dimension(300, 200));
        jDialogEnror.setModal(true);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tổng phải bằng 100. Vui lòng thiết lập lại");

        javax.swing.GroupLayout jDialogEnrorLayout = new javax.swing.GroupLayout(jDialogEnror.getContentPane());
        jDialogEnror.getContentPane().setLayout(jDialogEnrorLayout);
        jDialogEnrorLayout.setHorizontalGroup(
            jDialogEnrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEnrorLayout.createSequentialGroup()
                .addGroup(jDialogEnrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogEnrorLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton1))
                    .addGroup(jDialogEnrorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jDialogEnrorLayout.setVerticalGroup(
            jDialogEnrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogEnrorLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí tài chính cá nhân");
        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(214748364, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(468, 1000));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButtonAddChi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonAddChi.setText("Thêm khoản chi");
        jButtonAddChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDialogAddChiActionPerformed(evt);
            }
        });

        jButtonAddThu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonAddThu.setText("Thêm khoản thu");
        jButtonAddThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDialogAddThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddThu, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(jButtonAddChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButtonAddThu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddChi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel22, java.awt.BorderLayout.PAGE_END);

        jLabel1_SoDu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_SoDu.setText("Số dư khả dụng:");
        jLabel1_SoDu.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("đ");

        jLabel1_SoDu2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1_SoDu2.setText("0");
        jLabel1_SoDu2.setToolTipText("");
        jLabel1_SoDu2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1_SoDu2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel1_SoDu2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_SoDu2)
                    .addComponent(jLabel6))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));
        jPanel20.setMaximumSize(new java.awt.Dimension(214, 214));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel6.setMaximumSize(new java.awt.Dimension(3276, 3276));

        jLabel1_dialog.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1_dialog.setText("Thiết yếu");

        jLabel2_dialog.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2_dialog.setText("Giáo dục");

        jLabel3_dialog.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3_dialog.setText("Hưởng thụ");

        jLabel4_dialog.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4_dialog.setText("Tiết kiệm");

        jLabel5_dialog.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5_dialog.setText("Đầu tư");

        jLabelSetTY.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelSetTY.setText("55");

        jLabelSetGD.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelSetGD.setText("10");

        jLabelSetHT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelSetHT.setText("10");

        jLabelSetTK.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelSetTK.setText("15");

        jLabelSetDT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelSetDT.setText("10");

        jButtonTYt.setText("+");
        jButtonTYt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTYtActionPerformed(evt);
            }
        });

        jButtonGDt.setText("+");
        jButtonGDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGDtActionPerformed(evt);
            }
        });

        jButtonHTt.setText("+");
        jButtonHTt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHTtActionPerformed(evt);
            }
        });

        jButtonTKt.setText("+");
        jButtonTKt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTKtActionPerformed(evt);
            }
        });

        jButtonTYg.setText("-");
        jButtonTYg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTYgActionPerformed(evt);
            }
        });

        jButtonGDg.setText("-");
        jButtonGDg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGDgActionPerformed(evt);
            }
        });

        jButtonHTg.setText("-");
        jButtonHTg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHTgActionPerformed(evt);
            }
        });

        jButtonTkg.setText("-");
        jButtonTkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTkgActionPerformed(evt);
            }
        });

        jButtonDTt.setText("+");
        jButtonDTt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDTtActionPerformed(evt);
            }
        });

        jButtonDTg.setText("-");
        jButtonDTg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDTgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_dialog))
                .addGap(119, 119, 119)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDTt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonTKt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonHTt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTYt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonGDt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSetHT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSetTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSetTY, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSetGD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jLabelSetDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTYg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGDg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHTg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTkg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDTg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonTYt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGDt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHTt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTKt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDTt))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSetTY)
                                    .addComponent(jButtonTYg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSetGD)
                                    .addComponent(jButtonGDg)
                                    .addComponent(jLabel1_dialog)))
                            .addComponent(jLabel2_dialog))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHTg)
                            .addComponent(jLabel3_dialog)
                            .addComponent(jLabelSetHT))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSetTK)
                            .addComponent(jButtonTkg)
                            .addComponent(jLabel4_dialog))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSetDT)
                            .addComponent(jButtonDTg)
                            .addComponent(jLabel5_dialog))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 173, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel5, java.awt.BorderLayout.CENTER);

        jButtonCloseDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCloseDialog.setText("OK");
        jButtonCloseDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseDialogActionPerformed(evt);
            }
        });

        Label7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label7.setText("Tổng:  ");

        jLabelSum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSum.setText("100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jButtonCloseDialog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSum, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonCloseDialog)
                .addGap(35, 35, 35))
        );

        jPanel20.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Thiết lập giới hạn chi tiêu");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel18)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel20, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 2));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Thiết yếu:");

        jLabelTY.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelTY.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setText("đ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelTY, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTY)
                    .addComponent(jLabel19))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Giáo dục:");

        jLabelGD.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelGD.setText("0");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel23.setText("đ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabelGD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGD)
                    .addComponent(jLabel23))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Hưởng thụ:");

        jLabelHT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelHT.setText("0");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("đ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabelHT, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHT)
                    .addComponent(jLabel22))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Tiết kiệm:");

        jLabelTK.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelTK.setText("0");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setText("đ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabelTK, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTK)
                    .addComponent(jLabel21))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.gray));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Đầu tư:");

        jLabelDT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelDT.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setText("đ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabelDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDT)
                    .addComponent(jLabel20))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15);

        getContentPane().add(jPanel2);

        jPanel3.setForeground(new java.awt.Color(204, 102, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Khoản chi");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
               
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jPanel7.add(jPanel18);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Khoản thu");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel19);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("Thống kê chi tiêu");
        jPanel10.add(jLabel13);

        jPanel3.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>                        
                      
    private void showDialogAddThuActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        jDialogAddThu.setVisible(true);
//        Date d= new Date(System.currentTimeMillis());
//        jLabelSetDay.setText(d.getDate()+" / "+(d.getMonth()+1)+" / "+(d.getYear()+1900));
    }                                                

    private void jButtonCloseDialogActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        if(Integer.parseInt(jLabelSum.getText())!=100) JOptionPane.showMessageDialog(rootPane, "Tổng phải bằng 100");
//        else {
//            int a= Integer.parseInt(jLabelSetTY.getText());
//            int b= Integer.parseInt(jLabelSetGD.getText());
//            int c= Integer.parseInt(jLabelSetHT.getText());
//            int d= Integer.parseInt(jLabelSetTK.getText());
//            int e= Integer.parseInt(jLabelSetDT.getText());
//            int f=Integer.parseInt(jLabel1_SoDu2.getText());
//            jLabelTY.setText(f*a/100+"");
//            jLabelGD.setText(f*b/100+"");
//            jLabelHT.setText(f*c/100+"");
//            jLabelTK.setText(f*d/100+"");
//            jLabelDT.setText(f*e/100+"");
//           
//        }
    }                                                  

    private void jButtonGDtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetGD.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetGD.setText(x+5+"");
        jLabelSum.setText(y+5+"");
    }                                          

    private void jButtonHTtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetHT.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetHT.setText(x+5+"");
        jLabelSum.setText(y+5+"");
    }                                          

    private void jButtonTKtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetTK.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetTK.setText(x+5+"");
        jLabelSum.setText(y+5+"");
    }                                          

    private void jButtonDTgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetDT.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetDT.setText(x-5+"");
        jLabelSum.setText(y-5+"");
    }                                          

    private void jButtonTYgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetTY.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetTY.setText(x-5+"");
        jLabelSum.setText(y-5+"");
    }                                          

    private void jButtonDTtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetDT.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetDT.setText(x+5+"");
        jLabelSum.setText(y+5+"");
    }                                          

    private void jButtonHTgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetHT.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetHT.setText(x-5+"");
        jLabelSum.setText(y-5+"");
    }                                          

    private void jButtonTYtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetTY.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetTY.setText(x+5+"");
        jLabelSum.setText(y+5+"");
    }                                          

    private void jButtonGDgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         int x= Integer.parseInt(jLabelSetGD.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetGD.setText(x-5+"");
        jLabelSum.setText(y-5+"");
    }                                          

    private void jButtonTkgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x= Integer.parseInt(jLabelSetTK.getText());
        int y= Integer.parseInt(jLabelSum.getText());
        jLabelSetTK.setText(x-5+"");
        jLabelSum.setText(y-5+"");
    }                                          

    private void jButtonCloseDialog2ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        jDialogAddThu.setVisible(false);
        int x=Integer.parseInt(jTextFieldAddThu.getText());
        int y=Integer.parseInt(jLabel1_SoDu2.getText());
        jLabel1_SoDu2.setText(x+y+""); 
        //new fileAccess().write( jLabel1_SoDu2.getText(), f);
        int a= Integer.parseInt(jLabelSetTY.getText());
        int b= Integer.parseInt(jLabelSetGD.getText());
        int c= Integer.parseInt(jLabelSetHT.getText());
        int d= Integer.parseInt(jLabelSetTK.getText());
        int e= Integer.parseInt(jLabelSetDT.getText());
        int f=Integer.parseInt(jLabel1_SoDu2.getText());
        if(a==0) {
        	jLabelTY.setText(jLabelTY.getText());
        } else jLabelTY.setText(f*a/100+"");
        
        if(b==0) {
        	jLabelGD.setText(jLabelGD.getText());
        } else jLabelGD.setText(f*b/100+"");
        if(c==0) {
        	jLabelHT.setText(jLabelHT.getText());
        } else jLabelHT.setText(f*c/100+"");
        if(d==0) {
        	jLabelTK.setText(jLabelTK.getText());
        } else jLabelTK.setText(f*d/100+"");
        if(e==0) {
        	jLabelDT.setText(jLabelDT.getText());
        } else jLabelDT.setText(f*e/100+"");
        
        soDu Sd=new soDu();
        Ty ty= new Ty();
        Ht ht= new Ht();
        Tk tk= new Tk();
        Gd gd= new Gd();
        Dt dt= new Dt();
        ty.setSt(Integer.parseInt(jLabelTY.getText()));
        new DAO().addTy(ty);
        gd.setSt(Integer.parseInt(jLabelGD.getText()));
        new DAO().addGd(gd);
        ht.setSt(Integer.parseInt(jLabelHT.getText()));
        new DAO().addHt(ht);
        tk.setSt(Integer.parseInt(jLabelTK.getText()));
        new DAO().addTk(tk);

        dt.setSt(Integer.parseInt(jLabelDT.getText()));
        new DAO().addDt(dt);
        Sd.setSt(Integer.parseInt(jLabel1_SoDu2.getText()));
        new DAO().addSd(Sd);
        khoanThu kt = new khoanThu();
        kt.setMoTa(jTextFieldScript.getText());
        kt.setSoTien(Integer.parseInt(jTextFieldAddThu.getText()));
        try {
            kt.setDay(new SimpleDateFormat("dd/MM/yyyy").parse(jLabelSetDay.getText()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
       // kt.setID(txtid.getText());
//        s.setMark(Float.parseFloat(txtmark.getText()));
//        s.setName(txtname.getText());
//        s.setPhone(txtphonenumber.getText());
//        try {
//            s.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(txtdob.getText()));
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//        
        if(new DAO().addKhoanThu(kt)){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            list.add(kt); // them vao danh sach SV
        } else{
            JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
        }
      //  new DAO().addKhoanThu(kt);
        showResultThu();
    }         
    public void showResultThu() {
        khoanThu kt = list.get(list.size() - 1);
        model.addRow(new Object[]{
            i++, kt.getDay(), kt.getMoTa(), kt.getSoTien()
            
        });//kt.getStt(),
        
    }
    public void showResultChi() {
        khoanChi kc = list2.get(list2.size() - 1);
        model2.addRow(new Object[]{
            i++,  kc.getDay(), kc.getMoTa2(), kc.getMucDich(), kc.getSoTien2()
            
        });//kt.getStt(),
        
    }

    private void showDialogAddChiActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        jDialogAddChi.setVisible(true);
    }                                                
    private void jLabel1_SoDu2AncestorAdded(javax.swing.event.AncestorEvent evt) {                                            
        // TODO add your handling code here:
//    	jLabel1_SoDu2.setText(soDuKhaDung.size()+"");
    	
    	//jLabel1_SoDu2.setText(new fileAccess().read(f));
    }    
    private void jTextFieldScriptActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jTextFieldAddThuActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        //jLabel1_SoDu2.setText(Integer.parseInt(jTextFieldAddThu.getText())+"");
    }                                                

    private void jTextFieldAddChiActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jTextFieldScript2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jButtonCloseDialogChiActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        jDialogAddChi.setVisible(false);
        int z=Integer.parseInt(jLabel1_SoDu2.getText());
        int k=Integer.parseInt(jTextFieldAddChi.getText());
        jLabel1_SoDu2.setText(z-k+"");
        soDu Sd= new soDu();
        Sd.setSt(Integer.parseInt(jLabel1_SoDu2.getText()));
        new DAO().addSd(Sd);
        
       // new fileAccess().write( jLabel1_SoDu2.getText(), f);
        
        String s= String.valueOf(jComboBox1.getSelectedItem());
        int a= Integer.parseInt(jLabelTY.getText());
        int b= Integer.parseInt(jLabelGD.getText());
        int c= Integer.parseInt(jLabelHT.getText());
        int d= Integer.parseInt(jLabelTK.getText());
        int e= Integer.parseInt(jLabelDT.getText());
        Ty ty= new Ty();
        Ht ht= new Ht();
        Tk tk= new Tk();
        Gd gd= new Gd();
        Dt dt= new Dt();
        if(s=="Thiết yếu") {
        	jLabelTY.setText(a-k+"");
        	
            ty.setSt(Integer.parseInt(jLabelTY.getText()));
            new DAO().addTy(ty);
        }
        if(s=="Giáo dục") {
        	jLabelGD.setText(b-k+"");
        	
            gd.setSt(Integer.parseInt(jLabelGD.getText()));
            new DAO().addGd(gd);
        }
        if(s=="Hưởng thụ") {
        	jLabelHT.setText(c-k+"");
        	
            ht.setSt(Integer.parseInt(jLabelHT.getText()));
            new DAO().addHt(ht);
        }
        if(s=="Tiết kiệm") {
        	jLabelTK.setText(d-k+"");
        	
            tk.setSt(Integer.parseInt(jLabelTK.getText()));
            new DAO().addTk(tk);
        }
        if(s=="Đầu tư") {
        	jLabelDT.setText(e-k+"");
        	
            dt.setSt(Integer.parseInt(jLabelDT.getText()));
            new DAO().addDt(dt);
        }
        
        khoanChi kc = new khoanChi();
        kc.setMoTa2(jTextFieldScript2.getText());
        kc.setSoTien2(Integer.parseInt(jTextFieldAddChi.getText()));
        kc.setMucDich(String.valueOf(jComboBox1.getSelectedItem()));
        try {
            kc.setDay(new SimpleDateFormat("dd/MM/yyyy").parse(jLabelSetDay2.getText()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        if(new DAO().addKhoanChi(kc)){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            list2.add(kc); // them vao danh sach SV
        } else{
            JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
        }
        showResultChi();
    }                                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jDialogEnror.setVisible(false);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jLabelSetDayAncestorAdded(javax.swing.event.AncestorEvent evt) {                                           
        // TODO add your handling code here:
         Date d= new Date(System.currentTimeMillis());
        jLabelSetDay.setText(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
    }                                          

    private void jLabelSetDay2AncestorAdded(javax.swing.event.AncestorEvent evt) {                                            
        // TODO add your handling code here:
//        Date d= new Date(System.currentTimeMillis());
//        jLabelSetDay2.setText(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
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
//    	String x= new fileAccess().read(f);
//    	System.out.println(x);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Label7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAddChi;
    private javax.swing.JButton jButtonAddThu;
    private javax.swing.JButton jButtonCloseDialog;
    private javax.swing.JButton jButtonCloseDialog2;
    private javax.swing.JButton jButtonCloseDialogChi;
    private javax.swing.JButton jButtonDTg;
    private javax.swing.JButton jButtonDTt;
    private javax.swing.JButton jButtonGDg;
    private javax.swing.JButton jButtonGDt;
    private javax.swing.JButton jButtonHTg;
    private javax.swing.JButton jButtonHTt;
    private javax.swing.JButton jButtonTKt;
    private javax.swing.JButton jButtonTYg;
    private javax.swing.JButton jButtonTYt;
    private javax.swing.JButton jButtonTkg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialogAddChi;
    private javax.swing.JDialog jDialogAddThu;
    private javax.swing.JDialog jDialogEnror;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_SoDu;
    private javax.swing.JLabel jLabel1_SoDu2;
    private javax.swing.JLabel jLabel1_dialog;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel2_dialog;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_dialog;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_dialog;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5_dialog;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDT;
    private javax.swing.JLabel jLabelGD;
    private javax.swing.JLabel jLabelHT;
    private javax.swing.JLabel jLabelSetDT;
    private javax.swing.JLabel jLabelSetDay;
    private javax.swing.JLabel jLabelSetDay2;
    private javax.swing.JLabel jLabelSetGD;
    private javax.swing.JLabel jLabelSetHT;
    private javax.swing.JLabel jLabelSetTK;
    private javax.swing.JLabel jLabelSetTY;
    private javax.swing.JLabel jLabelSum;
    private javax.swing.JLabel jLabelTK;
    private javax.swing.JLabel jLabelTY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelNgay;
   
   
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneThongKe;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldAddChi;
    private javax.swing.JTextField jTextFieldAddThu;
    private javax.swing.JTextField jTextFieldScript;
    private javax.swing.JTextField jTextFieldScript2;
    // End of variables declaration                   
}
