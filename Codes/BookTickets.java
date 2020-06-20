
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class BookTickets extends javax.swing.JFrame {
    static String s;
    public BookTickets() {
        initComponents();
        Update_table();
    }

    BookTickets(String s) {
        this.s=s;
        initComponents();
        Update_table();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        day = new javax.swing.JComboBox<>();
        showseats = new javax.swing.JButton();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Book your Tickets here:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("To:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date:");

        from.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        to.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        showseats.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showseats.setText("Show Availability of seats");
        showseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showseatsActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showseats, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(to)
                                    .addComponent(from)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(showseats, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private  void Update_table(){
      LocalDateTime timePoint = LocalDateTime.now();
        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(" Date: "+theDate);
        LocalDate theDate2=theDate.plusDays(1);
        System.out.println("Date incremented: "+theDate2);
        
        
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString1 = theDate2.format(formatter1);
            System.out.println(" "+formattedString1);
            String[]s1=formattedString1.split(" ");
            String[] str=new String[15];
            str[0]=s1[0];
            
            
            
        for(int i=0;i<13;i++){
            theDate2=theDate2.plusDays(1);
            System.out.println("Date incremented: "+theDate2);
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString = theDate2.format(formatter);
            System.out.println(" "+formattedString);
            
            String[]s=formattedString.split(" ");
            str[i+1]=s[0];
           
            
        }
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],str[11],str[12],str[13],str[14] }));
         LocalDateTime timePoint1 = LocalDateTime.now();
        LocalDate theDate1 = timePoint1.toLocalDate();
        System.out.println(" Date: "+theDate1);
        LocalDate theDate21=theDate1.plusDays(1);
        
        System.out.println("Date incremented: "+theDate21);
            DateTimeFormatter formatter11 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString11 = theDate21.format(formatter1);
            System.out.println(" "+formattedString11);
            String[]s11=formattedString11.split(" ");
            String[] str1=new String[15];
            str1[0]=s11[1];
            HashSet<Integer> hash = new HashSet<>();
            hash.add(Integer.parseInt(s11[1]));
            int count=0;
        for(int i=0;i<13;i++){
            theDate21=theDate21.plusDays(1);
            System.out.println("Date incremented: "+theDate21);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString = theDate21.format(formatter);
            System.out.println(" "+formattedString);
            String[]s=formattedString.split(" ");
         
            if(hash.contains(Integer.parseInt(s[1]))){
            continue;
            }
            else
            {
                count++;
                hash.add(Integer.parseInt(s[1]));
                str[count]=s[1];
            } 
            
           
            
            
            
            
            
           
            
        }
        
   
               
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { str1[0],str1[1],str1[2],str1[3],str1[4],str1[5],str1[6],str1[7],str1[8],str1[9],str1[10],str1[11],str1[12],str1[13],str1[14] }));
         LocalDateTime timePoint2 = LocalDateTime.now();
        LocalDate theDate22 = timePoint2.toLocalDate();
        System.out.println(" Date: "+theDate22);
        LocalDate theDate23=theDate22.plusDays(1);
        System.out.println("Date incremented: "+theDate2);
            DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString12 = theDate23.format(formatter12);
            System.out.println(" "+formattedString12);
            String[]s12=formattedString12.split(" ");
            String[] str2=new String[15];
            str2[0]=s1[2];
            HashSet<Integer> hash2 = new HashSet<>();
            hash.add(Integer.parseInt(s12[2]));
            int count1=0;
        for(int i=0;i<13;i++){
            theDate2=theDate2.plusDays(1);
            System.out.println("Date incremented: "+theDate2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString = theDate2.format(formatter);
            System.out.println(" "+formattedString);
            String[]s=formattedString.split(" ");
            
            if(hash.contains(Integer.parseInt(s[2]))){
            continue;
            }
            else
            {
                count1++;
                hash.add(Integer.parseInt(s[2]));
                str[count1]=s[2];
            } 
              
        }       
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { str2[0],str2[1],str2[2],str2[3],str2[4],str2[5],str2[6],str2[7],str2[8],str2[9],str2[10],str2[11],str2[12],str2[13],str2[14] }));  
        
    }
    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
       
      
        day.setSelectedItem(day.getSelectedItem());
            //day.getModel().setSelectedItem();
        
    }//GEN-LAST:event_dayActionPerformed
   
    private void showseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showseatsActionPerformed
      
       ArrayList<String>[] Train_names = new ArrayList[4];
       Scanner s = new Scanner(System.in);
       for(int i=0;i<4;i++)
       {
           Train_names[i] = new ArrayList<>();
       }
       
       String[] str = new String[]{"Delhi","Ludhiana","PatahankotCant","Kathua","JammuTawi"};
       String[] str1 = new String[]{"DelhiCant","Palam","Bijwasan","Gurgaon","GarhiHason","PataudiRoad","Rewari","Alwar","Bandakini","JaipurJunc"};
       String[] st2 = new String[]{"Delhi","Agra","Gwalior","Chindwara","nagpur","Telengana","Anatapur","Bangluru","TamilNadu","Kollam","Kochi","KerelaJunc"};
       String[] st3 = new String[]{"Nizzamuddin","Kota","Vadodara","Surat","Ratangar","Thivim","Karmali","SanvardenTisks","Guddimiol","Dhadi","Bandoi","Parindak","Goa"};
       int flag1=0;
       int flag2=0;
       int flag3=0;
       int flag4=0;
       for(int i=0;i<str.length;i++)
       {
           flag1=1;
           Train_names[0].add(str[i]);
       }
       for(int i=0;i<str1.length;i++)
       {
           flag2=1;
           Train_names[1].add(str1[i]);
       }
       
       for(int i=0;i<st2.length;i++)
       {
           flag3=1;
           Train_names[2].add(st2[i]);
       }
       for(int i=0;i<st3.length;i++)
       {
           flag4=1;
           Train_names[3].add(st3[i]);
       }
       if(from.getText()==null || to.getText()==null){
           JOptionPane.showMessageDialog(null," please enter the source and Destination to continue...");
       }
       String FROM = from.getText();
       String TO = to.getText();
       String match = "";
       int fare =0;
       for(int i=0;i<4;i++)
       {
           if(Train_names[i].contains(FROM) && Train_names[i].contains(TO))
           {
              if(Train_names[i].indexOf(FROM)<Train_names[i].indexOf(TO))
              {
                  fare = Math.abs(Train_names[i].indexOf(FROM)-Train_names[i].indexOf(TO))*500;
                  match = Train_names[i].get(Train_names[i].size()-1);
                  System.out.println("Help");
              }
           }
       }
       
       System.out.println(match);
       String date= day.getSelectedItem()+"/"+month.getSelectedItem()+"/"+year.getSelectedItem();
       this.setVisible(false);
       SeatsForm seat=new SeatsForm(match,fare,this.s,date);
       seat.setVisible(true);
       
     
//       mapTrain.put()
    }//GEN-LAST:event_showseatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       WelcomePage welcome=new WelcomePage(this.s);
       welcome.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
       
       
         month.setSelectedItem(month.getSelectedItem()); 
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        
       
        year.setSelectedItem(year.getSelectedItem());
            
        
    }//GEN-LAST:event_yearActionPerformed

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
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JButton showseats;
    private javax.swing.JTextField to;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
