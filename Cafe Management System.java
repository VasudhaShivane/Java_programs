
package cafe.management;
import java.awt.Component;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class CafeSystem extends javax.swing.JFrame {
    public CafeSystem() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jreceipt1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxt2 = new javax.swing.JTextField();
        jtxt1 = new javax.swing.JTextField();
        jtxt4 = new javax.swing.JTextField();
        jtxt5 = new javax.swing.JTextField();
        jtxt6 = new javax.swing.JTextField();
        jtxt7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxt3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcake = new javax.swing.JTextField();
        jtotalcost = new javax.swing.JTextField();
        jcoffee = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SubTotal = new javax.swing.JTextField();
        jTax = new javax.swing.JTextField();
        jTotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxt10 = new javax.swing.JTextField();
        jtxt9 = new javax.swing.JTextField();
        jtxt8 = new javax.swing.JTextField();
        jtxt11 = new javax.swing.JTextField();
        jtxt12 = new javax.swing.JTextField();
        jtxt13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxt14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jreceipt = new javax.swing.JButton();
        jtotal = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFE MANAGEMENT SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 8));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 140));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jreceipt1.setColumns(20);
        jreceipt1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jreceipt1.setRows(5);
        jScrollPane1.setViewportView(jreceipt1);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 470, 650));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jPanel4.setPreferredSize(new java.awt.Dimension(455, 350));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Latte");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Espresso");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Iced Latte");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Cappuccino");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Iced Cappuccino");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("American Coffee");
        jtxt2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt2.setText("0");
        jtxt2.setToolTipText("");
        jtxt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt1.setText("0");
        jtxt1.setToolTipText("");
        jtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt1ActionPerformed(evt);
            }        });
        jtxt4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt4.setText("0");
        jtxt4.setToolTipText("");
        jtxt5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt5.setText("0");
        jtxt5.setToolTipText("");
        jtxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt5ActionPerformed(evt);
            }});
        jtxt6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt6.setText("0");
        jtxt6.setToolTipText("");
        jtxt7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt7.setText("0");
        jtxt7.setToolTipText("");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Vale Coffee");
        jtxt3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt3.setText("0");
        jtxt3.setToolTipText("");
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt1)
                                    .addComponent(jtxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 460, 400));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jPanel5.setPreferredSize(new java.awt.Dimension(455, 210));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cost Of Drinks");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cost Of Cakes ");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Total Cost");
        jcake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtotalcost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtotalcost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jcoffee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcoffee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcoffee)
                    .addComponent(jcake)
                    .addComponent(jtotalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtotalcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 460, 150));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jPanel2.setPreferredSize(new java.awt.Dimension(455, 210));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Paid Tax");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sub Total");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Cost");
        SubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxActionPerformed(evt);
            }        });
        jTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(109, 109, 109)                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTax)
                    .addComponent(jTotal))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 450, 150));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Red Velvet Cake");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Pineapple Cake");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Hazelnut Cake");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Cheese Cake");
        jtxt10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt10.setText("0");
        jtxt10.setToolTipText("");
        jtxt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt10ActionPerformed(evt);
            }        });
        jtxt9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt9.setText("0");
        jtxt9.setToolTipText("");
        jtxt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt9ActionPerformed(evt);
            }        });
        jtxt8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt8.setText("0");
        jtxt8.setToolTipText("");
        jtxt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt8ActionPerformed(evt);
            }        });
        jtxt11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt11.setText("0");
        jtxt11.setToolTipText("");
        jtxt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt11ActionPerformed(evt);
            }        });
        jtxt12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt12.setText("0");
        jtxt12.setToolTipText("");
        jtxt13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt13.setText("0");
        jtxt13.setToolTipText("");
        jtxt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt13ActionPerformed(evt);
            }        });
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Black forest Cake");
        jtxt14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt14.setText("0");
        jtxt14.setToolTipText("");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Dutch Chocolate Cake");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Coffee Cake");
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(128, 128, 128)
                                .addComponent(jtxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(110, 110, 110)
                                .addComponent(jtxt10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(136, 136, 136)
                                .addComponent(jtxt11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(158, 158, 158)
                                .addComponent(jtxt14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(151, 151, 151)
                                .addComponent(jtxt13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(67, 67, 67)
                                .addComponent(jtxt12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jtxt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jtxt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)               .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtxt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 450, 400));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jreceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jreceipt.setText("Receipt");
        jreceipt.setPreferredSize(new java.awt.Dimension(150, 30));
        jreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreceiptActionPerformed(evt);
            }        });
        jtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtotal.setText("Total");
        jtotal.setPreferredSize(new java.awt.Dimension(150, 30));
        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }        });
        jreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jreset.setText("Reset");
        jreset.setPreferredSize(new java.awt.Dimension(150, 30));
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }        });
        jexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jexit.setText("Exit");
        jexit.setPreferredSize(new java.awt.Dimension(150, 30));
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }        });
        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jreceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jreceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 716, 920, 80));
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    private void jreceiptActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int refs=1325+ (int)(Math.random()*4238);        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
        tDate.format(timer.getTime());
        jreceipt1.append("\t Cafe Management System:\n"+
                " Reference:\t\t\t"+refs+
                "\n==================================\n"+
                " Coffee:\t\t\t"+jcoffee.getText()+"\n\n"+
                " Cake:\t\t\t"+jcake.getText()+"\n\n"+
                " Cost Of Items:\t\t"+jtotalcost.getText()+"\n\n"+
                 "\n==================================\n"+"\n\n"+
                " Tax:\t\t\t"+jTax.getText()+"\n\n"+
                " SubTotal:\t\t"+SubTotal.getText() +"\n\n"+
                " Total:\t\t\t"+jTotal.getText() +"\n\n"+
                "\n==================================\n"+"\n\n"+
                "\nDate:"+tDate.format(timer.getTime())+
                "\tTime:"+tTime.format(timer.getTime())+
                "\n\n\t\tThank You");
    }                                        
    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {                                      
        SubClass iExit= new SubClass();
        iExit.iExitSystem();        
    }                                     
    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {                                       
        JTextField cleartext = null;
        for(Component c:jPanel6.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }        }
        for(Component c:jPanel2.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }        }
        for(Component c:jPanel4.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }        }
        for(Component c:jPanel5.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }        }
        for(Component c:jPanel5.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }        }
        jreceipt1.setText(null);        
    }                                      
    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {                                       
        SubClass ItemCost = new SubClass();        
        double itax,isubtotal,itotal;        
        ItemCost.latte= ItemCost.platte* Double.parseDouble(jtxt1.getText());
        ItemCost.Espresso= ItemCost.pEspresso* Double.parseDouble(jtxt2.getText());
        ItemCost.valecoffee= ItemCost.pvalecoffee* Double.parseDouble(jtxt3.getText());
        ItemCost.icedlatte= ItemCost.picedlatte* Double.parseDouble(jtxt4.getText());
        ItemCost.cappuccino= ItemCost.pcappuccino* Double.parseDouble(jtxt5.getText());
        ItemCost.americancoffee= ItemCost.pamericancoffee* Double.parseDouble(jtxt6.getText());
        ItemCost.icedcappuccino= ItemCost.picedcappuccino* Double.parseDouble(jtxt7.getText());        
        ItemCost.redvelvetcake= ItemCost.predvelvetcake* Double.parseDouble(jtxt8.getText());
        ItemCost.pineapplecake= ItemCost.ppineapplecake* Double.parseDouble(jtxt9.getText());
        ItemCost.blackforestcake= ItemCost.pblackforestcake* Double.parseDouble(jtxt10.getText());
        ItemCost.hazelnutcake= ItemCost.phazelnutcake* Double.parseDouble(jtxt11.getText());   
        ItemCost.dutchcake= ItemCost.pdutchcake* Double.parseDouble(jtxt12.getText());
        ItemCost.cheesecake= ItemCost.pcheesecake* Double.parseDouble(jtxt13.getText());
        ItemCost.coffeecake= ItemCost.pcoffeecake* Double.parseDouble(jtxt14.getText());
        isubtotal = ItemCost.GetAmount();
        itax= ItemCost.cfindtax(isubtotal);
        itotal =isubtotal + itax;
        String sTotal = String.format("Rs.%f", isubtotal);
        SubTotal.setText(sTotal);        
        String Tax = String.format("Rs.%f", itax);
        jTax.setText(Tax);
         String Total = String.format("Rs.%f", itotal);
        jTotal.setText(Total);        
         String coffee = String.format("Rs.%f", ItemCost.coffee);
        jcoffee.setText(coffee);        
        String cake = String.format("Rs.%f", ItemCost.cake);
        jcake.setText(cake);
        String TotalC = String.format("Rs.%f", ItemCost.totalc);
        jtotalcost.setText(TotalC);
    }                                      
public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;                }            }
        } catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(CafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {            java.util.logging.Logger.getLogger(CafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(CafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {            java.util.logging.Logger.getLogger(CafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CafeSystem().setVisible(true);
            }        });    }
    private javax.swing.JTextField SubTotal;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTax;
    private javax.swing.JTextField jTotal;
    private javax.swing.JTextField jcake;
    private javax.swing.JTextField jcoffee;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jreceipt;
    private javax.swing.JTextArea jreceipt1;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jtotal;
    private javax.swing.JTextField jtotalcost;
    private javax.swing.JTextField jtxt1;
    private javax.swing.JTextField jtxt10;
    private javax.swing.JTextField jtxt11;
    private javax.swing.JTextField jtxt12;
    private javax.swing.JTextField jtxt13;
    private javax.swing.JTextField jtxt14;
    private javax.swing.JTextField jtxt2;
    private javax.swing.JTextField jtxt3;
    private javax.swing.JTextField jtxt4;
    private javax.swing.JTextField jtxt5;
    private javax.swing.JTextField jtxt6;
    private javax.swing.JTextField jtxt7;
    private javax.swing.JTextField jtxt8;
    private javax.swing.JTextField jtxt9;
}