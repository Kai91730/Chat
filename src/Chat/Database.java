/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import java.sql.*;  // !!
/**
 *
 * @author U$ER
 */
public class Database {
    Window parent;
    final String url = "jdbc:mysql://localhost:3306/chat?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC"; //url&編碼&時區
    final String uname = "root";
    final String pass = "0000"; //SQL settings
    String query = "";  //SQL語法
    
    public void SendData(String Date,String ID,String content) throws Exception 
    { 
        query = "insert into chathistory values (?,?,?)"; //輸入值不確定
        Class.forName("com.mysql.cj.jdbc.Driver"); // load "com.mysql.cj.jdbc.Driver" Class
        Connection conn = DriverManager.getConnection(url,uname,pass); //check DriverManager.getConnection
        PreparedStatement state = conn.prepareStatement(query); //不確定值時可用PreparedStatement
        state.setString(1, Date);
        state.setString(2, ID);
        state.setString(3, content);
        int count = state.executeUpdate();
        System.out.println(count + "row/s added.");  
        state.close();
        conn.close();  
        
    }
    
    public String GetData() throws Exception  {
        query = "select * from chathistory"; 
        Class.forName("com.mysql.cj.jdbc.Driver"); // load "com.mysql.cj.jdbc.Driver" Class
        Connection conn = DriverManager.getConnection(url,uname,pass); //check DriverManager.getConnection
        
        Statement state = conn.createStatement(); //查詢可用Statement
        ResultSet rs = state.executeQuery(query);//查詢用executeQuery rs接收資料
        
        String content = "\n";
        while (rs.next())
        {
            content += rs.getString(2) + " (" + rs.getString(1) + ")\n      " + rs.getString(3) + "\n"; //對話資料 (日期/ID/內容)
            //System.out.println(content); //console test
        }
        state.close();
        conn.close();  
        return content;
    }
    
    Database(Window p) 
    {
        super();
        parent=p;
       // String query = "select * from namelist ";  //SQL command
        
        //state.executeUpdate();  //也可以代替下面
        
//        Statement state = conn.createStatement();  
//        ResultSet rs = state.executeQuery(query);

       // PreparedStatement state = conn.prepareStatement(query); //不確定值時 -> PreparedStatement
//        state.setString(1, strDate);
//        state.setString(2, p.idbox.getText());
//        state.setString(3, p.typebox.getText());
        //int count = state.executeUpdate();
       // System.out.println(count + "row/s added.");
      //  String Data ="";
         
//        while(rs.next())
//        {
//            
//            Data = rs.getInt(1) + ":" + rs.getString(2) + "(" + rs.getInt(3) + ")"; //get data on MySQL
//            System.out.println(Data);
//        }
//        
        
//        state.close();
//        conn.close();  
    }

    
    
}
