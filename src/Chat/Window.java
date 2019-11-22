/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Window extends JFrame 
{  
    JFrame jframe = new JFrame();
    JPanel mainpanel = new JPanel(); //主要版面
    ToolPanel toolpanel = new ToolPanel(this); //TopPanel for tool 
    BottomPanel btpanel = new BottomPanel(this); //BottomPanel for typing block
    LeftlistPanel llpanel = new LeftlistPanel(this); //LeftlistPanel for select a chatbox
    ChatBox chatbox = new ChatBox(this); //中間聊天室頁面
    TypeBox typebox = new TypeBox(this); //下方輸入框
    IDBox idbox = new IDBox(this);
    Database db = new Database(this); //讀取/寫入資料庫
    
    Vector<ChatBox> pages = new Vector<ChatBox>(); //Chatbox型態的Vector
    Window() throws Exception
    {     
//        pages.add(0, chatbox);
//        pages.elementAt(0).setBackground(Color.red);
//        pages.add(1, chatbox); //新增2個chatbox到vector內
//        pages.elementAt(1).setBackground(Color.cyan);
        
        jframe.setSize(900, 900); //解析度
        jframe.setResizable(false); //鎖定視窗解析度
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //按X終止程式
        jframe.getContentPane().setLayout(new BorderLayout());
        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jframe.setLocation((ScreenSize.width-1024)/2, (ScreenSize.height-1024)/2); //設定初始位置
        
        jframe.setContentPane(mainpanel); //
        //mainpanel.setBackground(Color.WHITE);
        mainpanel.setLayout(new BorderLayout());
        
        toolpanel.setLayout(new FlowLayout(FlowLayout.LEFT));//上方區塊Layout
        btpanel.setLayout(new FlowLayout(FlowLayout.LEFT)); //下方區塊Layout

        btpanel.add(new JScrollPane(typebox),(FlowLayout.LEFT));
        //加入各panel到視窗中
        mainpanel.add(new JScrollPane(chatbox)); // chatbox w/ 滾動條
        mainpanel.add(toolpanel,BorderLayout.NORTH); //上方工具列
        mainpanel.add(btpanel,BorderLayout.SOUTH); //下方輸入列
        mainpanel.add(llpanel,BorderLayout.WEST); //左側分頁列
        toolpanel.add(idbox,(FlowLayout.LEFT)); 
        //mainpanel.revalidate(); //刷新畫面        
        
//        pages.elementAt(1).setVisible(false);
//        pages.elementAt(0).setVisible(true);
    }

    public void run() 
    {
        jframe.setVisible(true);
        jframe.setTitle("Chat");
    }
    
}
