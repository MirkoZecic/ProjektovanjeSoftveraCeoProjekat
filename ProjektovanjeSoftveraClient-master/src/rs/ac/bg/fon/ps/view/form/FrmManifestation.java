/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import de.wannawork.jcalendar.JCalendarComboBox;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mirko
 */
public class FrmManifestation extends javax.swing.JDialog {

    /**
     * Creates new form FrmManifestation
     */
    public FrmManifestation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        lblIme = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        lblTip = new javax.swing.JLabel();
        lblDatumDo = new javax.swing.JLabel();
        lblDatumOd = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEnableChanges = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbTipManifestacije = new javax.swing.JComboBox<>();
        dateDatumOd = new de.wannawork.jcalendar.JCalendarComboBox();
        dateDatumDo = new de.wannawork.jcalendar.JCalendarComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Manifestacija"));

        lblIme.setText("Naziv:");

        txtNaziv.setForeground(new java.awt.Color(204, 204, 204));
        txtNaziv.setText("Unesite naziv manifestacije...");

        lblTip.setText("Tip:");

        lblDatumDo.setText("Datum do:");

        lblDatumOd.setText("Datum od:");

        btnSave.setText("Sacuvaj");

        btnEnableChanges.setText("Omoguci izmene");

        btnDelete.setText("Izbrisi");

        btnEdit.setText("Izmeni");

        btnCancel.setText("Odustani");

        cbTipManifestacije.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblIme)
                                .addGap(20, 20, 20))
                            .addComponent(lblDatumOd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(dateDatumOd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTip)
                            .addComponent(lblDatumDo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTipManifestacije, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateDatumDo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnableChanges)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(27, 27, 27)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIme)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipManifestacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTip))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDatumOd)
                            .addComponent(dateDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDatumDo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnableChanges)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnCancel))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEnableChanges;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Object> cbTipManifestacije;
    private de.wannawork.jcalendar.JCalendarComboBox dateDatumDo;
    private de.wannawork.jcalendar.JCalendarComboBox dateDatumOd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDatumDo;
    private javax.swing.JLabel lblDatumOd;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblTip;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }

    public JComboBox getCbTipManifestacije() {
        return cbTipManifestacije;
    }

    public void setCbTipManifestacije(JComboBox cbTipManifestacije) {
        this.cbTipManifestacije = cbTipManifestacije;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getLblDatumDo() {
        return lblDatumDo;
    }

    public JLabel getLblDatumOd() {
        return lblDatumOd;
    }

    public JLabel getLblIme() {
        return lblIme;
    }

    public JLabel getLblTip() {
        return lblTip;
    }

    public JTextField getTxtNaziv() {
        return txtNaziv;
    }

    public void setTxtNaziv(JTextField txtNaziv) {
        this.txtNaziv = txtNaziv;
    }

    public JCalendarComboBox getDatumOd() {
        return dateDatumOd;
    }

    public void setDateOd(Date date) {
        this.dateDatumOd.setDate(date);
    }

    public JCalendarComboBox getDatumDo() {
        return dateDatumDo;
    }

    public void setDateDo(Date date) {
        this.dateDatumDo.setDate(date);
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(JButton btnEdit) {
        this.btnEdit = btnEdit;
    }

    public JButton getBtnEnableChanges() {
        return btnEnableChanges;
    }

    public void setBtnEnableChanges(JButton btnEnableChanges) {
        this.btnEnableChanges = btnEnableChanges;
    }

    public void addSaveBtnActionListener(ActionListener actionListener) {
        btnSave.addActionListener(actionListener);
    }

    public void addEnableChangesBtnActionListener(ActionListener actionListener) {
        btnEnableChanges.addActionListener(actionListener);
    }

    public void addCancelBtnActionListener(ActionListener actionListener) {
        btnCancel.addActionListener(actionListener);
    }

    public void addEditBtnActionListener(ActionListener actionListener) {
        btnEdit.addActionListener(actionListener);
    }

    public void addDeleteBtnActionListener(ActionListener actionListener) {
        btnDelete.addActionListener(actionListener);
    }

}
