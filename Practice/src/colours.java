
import java.awt.Color;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * colours.java
 *
 * Created on Feb 17, 2016, 11:30:52 PM
 */

/**
 *
 * @author Vivek K
 */
public class colours extends javax.swing.JFrame {


    /** Creates new form colours */
    public colours() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        lbl = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        a = new javax.swing.JCheckBox();
        b = new javax.swing.JCheckBox();
        c = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Red", "Green", "Blue" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl.setText("I am Label");

        btn.setText(" I am Button");

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt.setText("I am TextField");

        a.setText("Apply on Label");

        b.setText("Apply on Button");

        c.setText("Apply on Textfield");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt)
                            .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b)
                            .addComponent(a)
                            .addComponent(c))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl)
                        .addGap(18, 18, 18)
                        .addComponent(btn)
                        .addGap(18, 18, 18)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
switch(list.getSelectedIndex()){
    case 0 :{
        if (a.isSelected())
        {
lbl.setForeground(Color.RED);
    }
    if (b.isSelected())
    {
    btn.setForeground(Color.RED);
    }
        if (c.isSelected())
        {
        txt.setForeground(Color.RED);
        }
    }
            break;
    case 1 :{
    if (a.isSelected())
    {
    lbl.setForeground(Color.GREEN);
    }
    if (b.isSelected())
    {
    btn.setForeground(Color.GREEN);
    }
    if (c.isSelected())
    {
    txt.setForeground(Color.GREEN);
    }
    }
    break;

    case 2 : {
    if (a.isSelected())
    {
    lbl.setForeground(Color.BLUE);
    }
    if (b.isSelected())
    {
    btn.setForeground(Color.BLUE);
    }
    if (c.isSelected())
    {
    txt.setForeground(Color.BLUE);
    }
    }
    break;
}

// TODO add your handling code here:
    }//GEN-LAST:event_listValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox a;
    private javax.swing.JCheckBox b;
    private javax.swing.JButton btn;
    private javax.swing.JCheckBox c;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JList list;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables

}