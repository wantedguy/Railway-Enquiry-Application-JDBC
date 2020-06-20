
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CancelTickets extends javax.swing.JFrame {
static int seat;
static int tno;
static int book;
    public CancelTickets() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ticket = new javax.swing.JTextField();
        validate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cancellation of a Ticket");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter you Details here:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter you Ticket ID:");

        ticket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });

        validate.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        validate.setText("Confirm Cancel");
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(validate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(validate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     this.setVisible(false);
     WelcomePage welcome=new WelcomePage();
     welcome.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
    try{
        
            String sql1="Select Train_No,seat_booked from paymentdetails where TicketID='"+ticket.getText()+"'";
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement stmt=con1.createStatement();
            PreparedStatement st=con1.prepareStatement(sql1);
            ResultSet rs= st.executeQuery();
            
            if(rs.next())
            {
                    tno=rs.getInt(1);
                    book=rs.getInt(2);
                    JOptionPane.showMessageDialog(null,"Selected Train_No Successfully...");
            }
            System.out.println("train number"+tno+" bookedtickets "+book);
            System.out.println("h1");        
                    
                    
                    
            String sql3="Select seats_Avail from train where Train_No='"+tno+"'";
            Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement stmt3=con3.createStatement();
            PreparedStatement st3=con3.prepareStatement(sql3);
            ResultSet rs3= st3.executeQuery();
            if(rs3.next())
            {
                    seat=rs3.getInt(1);
                    JOptionPane.showMessageDialog(null,"Selected Train_No Successfully...");
            }
            System.out.println(" seatavail "+seat);
            int seat_cancelled = book+seat;
           System.out.println("h2");
            
            
            String sql2="Update train set seats_Avail ='"+seat_cancelled+"' where Train_No='"+tno+"'";
            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement stmt1=con2.createStatement();
            PreparedStatement st1=con2.prepareStatement(sql2);
            int a1= st1.executeUpdate();
            if(a1>0)
            {
                JOptionPane.showMessageDialog(null,"Updated seat Successfully...");
            }
            System.out.println("updated seatsavail "+seat+" "+book);
            System.out.println("h3");
            
            String mysql = "Select UserName,Amount from paymentdetails where TicketID='"+ticket.getText()+"'";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement statement = connection.createStatement();
            PreparedStatement prepare_statement = connection.prepareStatement(mysql);
            ResultSet result_user_amount = prepare_statement.executeQuery();
            String user = "";
            int amount =0;
            if(result_user_amount.next())
            {
                user = result_user_amount.getString(1);
                amount = result_user_amount.getInt(2);
            }
            
            System.out.println("h4");
            
            String mysql3 = "Select Wallet from user where UserName='"+login.name+"'";
            Connection c22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement state = c22.createStatement();
            PreparedStatement pp = c22.prepareStatement(mysql3);
            ResultSet res = pp.executeQuery();
            int wallet_balance_of_user=0;
            if(res.next())
            {
                wallet_balance_of_user = res.getInt(1);
            }
            System.out.println(wallet_balance_of_user);
            System.out.println("h5");
            
            
            String mysql2 = "Update user set Wallet='"+(amount+wallet_balance_of_user)+"' where UserName='"+user+"'";
            Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement statement2 = connection2.createStatement();
            PreparedStatement prepare = connection2.prepareStatement(mysql2);
            int check = prepare.executeUpdate();
            System.out.println("h6");
            
            
            String mysql4 = "Select PayID,Train_No,seat_booked from paymentdetails where TicketID='"+ticket.getText()+"'";
            Connection connection3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement statement3 = connection3.createStatement();
            PreparedStatement prepare2 = connection3.prepareStatement(mysql4);
            int payid = 0;
            int tno = 0;
            int seat_booked =0;
            ResultSet res4 = prepare2.executeQuery();
            if(res4.next())
            {
                payid = res4.getInt(1);
                tno = res4.getInt(2);
                seat_booked = res4.getInt(3);
            }
            System.out.println("h7");
            
            Connection c5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement st5 = c5.createStatement();
            PreparedStatement prepare5 = c5.prepareStatement("Insert into cancelled_records(PayID,TicketID,Train_No,Amount,UserName,seats_cancelled)values(?,?,?,?,?,?)");
            prepare5.setInt(1,payid);
            prepare5.setInt(2,Integer.parseInt(ticket.getText()));
            prepare5.setInt(3,tno);
            prepare5.setInt(4,amount);
            prepare5.setString(5,user);
            prepare5.setInt(6, seat_booked);
            int a5 = prepare5.executeUpdate();
            if(a5>0)
            {
                
                System.out.println(payid+" "+ticket.getText()+" "+tno+" "+amount+" "+user+" "+seat_booked);
            }
            System.out.println("h8");
            
            
            
            
            
            String sql4="Delete from paymentdetails where TicketID='"+ticket.getText()+"'";
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_enquiry","root","Nikhil@1388");
            Statement stmt4=con4.createStatement();
            PreparedStatement st4=con4.prepareStatement(sql4);
            int a4= st4.executeUpdate();
            if(a4>0)
            {
                JOptionPane.showMessageDialog(null,"Delete from Payments History Successfully...");
            }
            System.out.println("h9");
        
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_validateActionPerformed

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketActionPerformed

 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField ticket;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
