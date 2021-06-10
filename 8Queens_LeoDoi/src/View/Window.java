package View;

import Control.Control;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Window extends javax.swing.JFrame implements ChangeListener {

    private Dimension dimension;
    private Toolkit toolkit;
    private int widthScreen, heightScreen, width, height;
    private Evm evm;
    private Control control;

    public Window() {
        initComponents();

        evm = new Evm(this);
        jpEvm.setLayout(new BorderLayout());
        jpEvm.add(evm, BorderLayout.CENTER);

        jsSpeed.setMaximum(2100);
        jsSpeed.setValue(1000);
        jsSpeed.addChangeListener(this);

        control = new Control(this);

        jcChooseEvmSize.addActionListener(control);
        jbIcon.addActionListener(control);
        jbIcon.setIcon(new ImageIcon(getClass().getResource("/Image/Icon.jpg")));
        jbIcon.setContentAreaFilled(false);

        jbStart.addActionListener(control);

        toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        widthScreen = dimension.width;
        heightScreen = dimension.height;
        width = getWidth();
        height = getHeight();
        setMinimumSize(new Dimension(width, height));
        setLocation((widthScreen - width) / 2, (heightScreen - height) / 2);
        setDefaultCloseOperation(3);
        setTitle("8 Queens");
    }

    public void setEvmSize(int r, int h) {
        jlEvmSize.setText(r + " x " + h + " = " + (r * h));
        evm.createMatrix(r, h);
    }

    public void setNumberPairOfQueen_Antagonistic(int numberPairOfQueen_Antagonistic) {
        jLabel6.setText("Số cặp hậu đối kháng: " + numberPairOfQueen_Antagonistic);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEvm = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcChooseEvmSize = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsSpeed = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jbStart = new javax.swing.JButton();
        jbIcon = new javax.swing.JButton();
        jlEvmSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpEvm.setBackground(new java.awt.Color(164, 194, 242));
        jpEvm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true), "Bàn cờ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N

        javax.swing.GroupLayout jpEvmLayout = new javax.swing.GroupLayout(jpEvm);
        jpEvm.setLayout(jpEvmLayout);
        jpEvmLayout.setHorizontalGroup(
            jpEvmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jpEvmLayout.setVerticalGroup(
            jpEvmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel.setBackground(new java.awt.Color(255, 204, 204));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)), "Khởi tạo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Chiều dài bàn cờ:");

        jcChooseEvmSize.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcChooseEvmSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Kích thước bàn cờ:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Click Queen để chọn ngẫu nhiên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("trạng thái ban đầu cho bàn cờ:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Tốc độ di chuyển của Queen:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số nước hậu ăn nhau: 00");

        jbStart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbStart.setText("Bắt đầu");
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });

        jlEvmSize.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlEvmSize.setForeground(new java.awt.Color(102, 102, 102));
        jlEvmSize.setText("8 x 8 = 64");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcChooseEvmSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jlEvmSize, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbStart, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcChooseEvmSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEvmSize)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addComponent(jbStart)
                .addContainerGap())
        );

        jLabel6.getAccessibleContext().setAccessibleName("Số nước hậu ăn nhau:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpEvm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEvm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed
}//GEN-LAST:event_jbStartActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel;
    public javax.swing.JButton jbIcon;
    public javax.swing.JButton jbStart;
    public javax.swing.JComboBox jcChooseEvmSize;
    private javax.swing.JLabel jlEvmSize;
    private javax.swing.JPanel jpEvm;
    private javax.swing.JSlider jsSpeed;
    // End of variables declaration//GEN-END:variables

    public JButton getJbStart() {
        return jbStart;
    }

    public JComboBox getJcChooseEvmSize() {
        return jcChooseEvmSize;
    }

    public JButton getJbIcon() {
        return jbIcon;
    }

    public JSlider getJsSpeed() {
        return jsSpeed;
    }

    public void stateChanged(ChangeEvent e) {
        Evm.setSpeed(jsSpeed.getMaximum() - jsSpeed.getValue());
    }
}
