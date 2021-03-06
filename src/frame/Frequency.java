package frame;

/**
 * Created by fuyun on 18/11/14.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author fuyun
 */
public class Frequency extends javax.swing.JFrame {

    GregorianCalendar gc=new GregorianCalendar();
    int totdays;
    sql.CreateDB db = new sql.CreateDB();
    sql.SearchStudent searchFrequency = new sql.SearchStudent();

    /**
     * Creates new form FaceRecognizationUI
     */


    public Frequency() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Fu Yun
    private void initComponents() {
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        year1 = new javax.swing.JComboBox();
        month1 = new JComboBox();
        month2 = new JComboBox();
        day1 = new JComboBox();
        day2 = new JComboBox();
        year2 = new JComboBox();
        jLabel1 = new JLabel();
        Category = new JPanel();
        CategoryLabel = new JLabel();
        jScrollPane2 = new JScrollPane();
        CategoryList = new JList();
        Gender = new JPanel();
        GenderLabel = new JLabel();
        jScrollPane5 = new JScrollPane();
        GenderList = new JList();
        Result = new JPanel();
        ResultLabel = new JLabel();
        jScrollPane3 = new JScrollPane();
        ResultText = new JTextPane();
        buttons = new JPanel();
        search = new JButton();
        clear = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //======== jMenuBar1 ========
        {

            //======== jMenu1 ========
            {
                jMenu1.setText("File");
            }
            jMenuBar1.add(jMenu1);

            //======== jMenu2 ========
            {
                jMenu2.setText("Edit");
            }
            jMenuBar1.add(jMenu2);
        }
        setJMenuBar(jMenuBar1);

        //======== jPanel1 ========
        {

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- jLabel2 ----
            jLabel2.setText("From");

            //---- year1 ----
            year1.setModel(new DefaultComboBoxModel(new String[] {
                    "2000",
                    "2001",
                    "2002",
                    "2003",
                    "2004",
                    "2005",
                    "2006",
                    "2007",
                    "2008",
                    "2009",
                    "2010",
                    "2011",
                    "2012",
                    "2013",
                    "2014"
            }));
            year1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    year1ActionPerformed(e);
                }
            });


            //---- month1 ----
            month1.setModel(new DefaultComboBoxModel(new String[] {
                    "January",
                    "Feburary",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
            }));
            month1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    month1ActionPerformed(e);
                }
            });

            //---- month2 ----
            month2.setModel(new DefaultComboBoxModel(new String[] {
                    "January",
                    "Feburary",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
            }));
            month2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    month2ActionPerformed(e);
                }
            });

            //---- day1 ----
            day1.setModel(new DefaultComboBoxModel(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
            }));
            day1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    day1ActionPerformed(e);
                }
            });

            //---- day2 ----
            day2.setModel(new DefaultComboBoxModel(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
            }));
            day2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    day2ActionPerformed(e);
                }
            });

            //---- year2 ----
            year2.setModel(new DefaultComboBoxModel(new String[] {
                    "2000",
                    "2001",
                    "2002",
                    "2003",
                    "2004",
                    "2005",
                    "2006",
                    "2007",
                    "2008",
                    "2009",
                    "2010",
                    "2011",
                    "2012",
                    "2013",
                    "2014"
            }));
            year2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    year2ActionPerformed(e);
                }
            });

            //---- jLabel1 ----
            jLabel1.setText("To");

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(year2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(year1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup()
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(month1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(day1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(month2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(day2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(291, 291, 291))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup()
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(year1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(month1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(day1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(year2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(month2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(day2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14))
            );
        }
        contentPane.add(jPanel1, new GridBagConstraints(0, 0, 3, 2, 0.0, 0.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(40, 30, 0, 0), -266, 0));

        //======== Category ========
        {

            //---- CategoryLabel ----
            CategoryLabel.setText("Category");

            //======== jScrollPane2 ========
            {

                //---- CategoryList ----
                CategoryList.setModel(new AbstractListModel() {
                    String[] values = {
                            "stapler",
                            "tuition fees",
                            "complaints",
                            "collect assignments",
                            "meet people"
                    };
                    @Override
                    public int getSize() { return values.length; }
                    @Override
                    public Object getElementAt(int i) { return values[i]; }
                });
                jScrollPane2.setViewportView(CategoryList);
            }

            GroupLayout CategoryLayout = new GroupLayout(Category);
            Category.setLayout(CategoryLayout);
            CategoryLayout.setHorizontalGroup(
                    CategoryLayout.createParallelGroup()
                            .addGroup(CategoryLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(CategoryLayout.createParallelGroup()
                                            .addGroup(CategoryLayout.createSequentialGroup()
                                                    .addComponent(CategoryLabel)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                                    .addContainerGap())
            );
            CategoryLayout.setVerticalGroup(
                    CategoryLayout.createParallelGroup()
                            .addGroup(CategoryLayout.createSequentialGroup()
                                    .addComponent(CategoryLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        contentPane.add(Category, new GridBagConstraints(0, 2, 1, 2, 0.0, 0.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(22, 27, 0, 0), 82, -5));

        //======== Gender ========
        {

            //---- GenderLabel ----
            GenderLabel.setText("Gender");

            //======== jScrollPane5 ========
            {

                //---- GenderList ----
                GenderList.setModel(new AbstractListModel() {
                    String[] values = {
                            "Male",
                            "Female"
                    };
                    @Override
                    public int getSize() { return values.length; }
                    @Override
                    public Object getElementAt(int i) { return values[i]; }
                });
                jScrollPane5.setViewportView(GenderList);
            }

            GroupLayout GenderLayout = new GroupLayout(Gender);
            Gender.setLayout(GenderLayout);
            GenderLayout.setHorizontalGroup(
                    GenderLayout.createParallelGroup()
                            .addGroup(GenderLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(GenderLayout.createParallelGroup()
                                            .addComponent(GenderLabel)
                                            .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            GenderLayout.setVerticalGroup(
                    GenderLayout.createParallelGroup()
                            .addGroup(GenderLayout.createSequentialGroup()
                                    .addComponent(GenderLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        contentPane.add(Gender, new GridBagConstraints(1, 2, 1, 3, 0.0, 0.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(24, 13, 227, 0), 0, 0));

        //======== Result ========
        {

            //---- ResultLabel ----
            ResultLabel.setText("Result");

            //======== jScrollPane3 ========
            {
                jScrollPane3.setViewportView(ResultText);
            }

            GroupLayout ResultLayout = new GroupLayout(Result);
            Result.setLayout(ResultLayout);
            ResultLayout.setHorizontalGroup(
                    ResultLayout.createParallelGroup()
                            .addGroup(ResultLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(ResultLabel)
                                    .addContainerGap(204, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, GroupLayout.Alignment.TRAILING)
            );
            ResultLayout.setVerticalGroup(
                    ResultLayout.createParallelGroup()
                            .addGroup(ResultLayout.createSequentialGroup()
                                    .addComponent(ResultLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3))
            );
        }
        contentPane.add(Result, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(22, 10, 0, 0), 198, 144));

        //======== buttons ========
        {
            buttons.setLayout(new GridBagLayout());

            //---- search ----
            search.setText("Search");
            search.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    searchActionPerformed(e);
                }
            });
            buttons.add(search, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                    new Insets(12, 40, 0, 35), 0, 0));

            //---- clear ----
            clear.setText("Clear");
            clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clearActionPerformed(e);
                }
            });
            buttons.add(clear, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                    new Insets(6, 40, 14, 35), 9, 0));
        }
        contentPane.add(buttons, new GridBagConstraints(3, 0, 2, 1, 0.0, 0.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(30, 36, 0, 15), 80, 0));
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
        setDayValue(year1.getSelectedIndex(), month1.getSelectedIndex(), day1);
    }//GEN-LAST:event_year1ActionPerformed

    private void month1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        setDayValue(year1.getSelectedIndex(), month1.getSelectedIndex(), day1);
    }

    private void year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2ActionPerformed
        // TODO add your handling code here:
        setDayValue(year2.getSelectedIndex(), month2.getSelectedIndex(), day2);
    }//GEN-LAST:event_year2ActionPerformed

    private void month2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        setDayValue(year2.getSelectedIndex(), month2.getSelectedIndex(), day2);
    }

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        // TODO add your handling code here:
        setDayValue(year1.getSelectedIndex(), month1.getSelectedIndex(), day1);

    }//GEN-LAST:event_day1ActionPerformed

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        // TODO add your handling code here:
        setDayValue(year2.getSelectedIndex(), month2.getSelectedIndex(), day2);
    }//GEN-LAST:event_day2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        Calendar calender = Calendar.getInstance();
        calender.set(year1.getSelectedIndex()+2000, month1.getSelectedIndex()+1, day1.getSelectedIndex()+1);
        Date date1 = calender.getTime();
        calender.set(year2.getSelectedIndex()+2000, month2.getSelectedIndex()+1, day2.getSelectedIndex()+1);
        Date date2 = calender.getTime();

        ResultText.setText("The frequency is " + searchFrequency.getFrequency(date1, date2, (String) CategoryList.getSelectedValue(), (String) GenderList.getSelectedValue()));
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        ResultText.setText("");
    }//GEN-LAST:event_clearActionPerformed



    private void setDayValue(int iselYearIndex, int iselMonthIndex, JComboBox NoDay) {

        int iselMonth = iselMonthIndex +1;
        int iselYear = iselYearIndex + 2000;

        if(iselMonth==1 || iselMonth==3 || iselMonth==5 || iselMonth==7 || iselMonth== 8 ||iselMonth==10 || iselMonth==12) {
            totdays=31;
            NoDay.setModel(setModel(totdays));
        }
        if(iselMonth==4 || iselMonth==6 || iselMonth==9 || iselMonth==11) {
            totdays=30;
            NoDay.setModel(setModel(totdays));
        }
        if(gc.isLeapYear(iselYear) && iselMonth==2) {
            totdays=29;
            NoDay.setModel(setModel(totdays));
        }
        if( !gc.isLeapYear(iselYear) && iselMonth==2) {
            totdays=28;
            NoDay.setModel(setModel(totdays));
        }
    }

    private DefaultComboBoxModel setModel(int totdays){
        String[] NoDays = new String[totdays];
        for(int i=1; i<totdays+1; i++) {
            NoDays[i-1] = "" + i;
        }

        DefaultComboBoxModel monthdays = new DefaultComboBoxModel(NoDays);
        return monthdays;
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
            java.util.logging.Logger.getLogger(Frequency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frequency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frequency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frequency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frequency().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fu Yun
    private JMenuBar jMenuBar1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JPanel jPanel1;
    private JLabel jLabel2;
    private JComboBox year1;
    private JComboBox month1;
    private JComboBox month2;
    private JComboBox day1;
    private JComboBox day2;
    private JComboBox year2;
    private JLabel jLabel1;
    private JPanel Category;
    private JLabel CategoryLabel;
    private JScrollPane jScrollPane2;
    private JList CategoryList;
    private JPanel Gender;
    private JLabel GenderLabel;
    private JScrollPane jScrollPane5;
    private JList GenderList;
    private JPanel Result;
    private JLabel ResultLabel;
    private JScrollPane jScrollPane3;
    private JTextPane ResultText;
    private JPanel buttons;
    private JButton search;
    private JButton clear;
    // End of variables declaration//GEN-END:variables
}

