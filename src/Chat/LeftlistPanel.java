/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author U$ER
 */
class LeftlistPanel extends JPanel //左側分頁列
{
    Window parent;
    
    LeftlistPanel(Window p)
    {
        super();
        parent=p;
        this.setBackground(Color.LIGHT_GRAY);
       // this.setPreferredSize(new Dimension(50, 0)); //左Panel初始寬度
        //this.setLayout(null); //null才能改變按鈕大小但還是算了 
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//Box Layout的Y_AXIS為縱向
        
        JButton pageButton = new JButton("1");
        JButton pageButton2 = new JButton("2");
        this.add(pageButton);
        this.add(pageButton2); 
        
        
        pageButton.addActionListener (new ActionListener()  
        { 
            public void actionPerformed (ActionEvent e) 
            {             
//                int i = p.pages.size();
//                System.out.print(i);  //檢查pages元素
//                p.pages.elementAt(0).setVisible(true);
//                p.pages.elementAt(1).setVisible(false);
                p.pages.elementAt(0).Status=PageStatus.activated;
                p.pages.elementAt(1).Status=PageStatus.inactivated;
            }
        });
        
        pageButton2.addActionListener (new ActionListener()  
        { 
            public void actionPerformed (ActionEvent e) 
            {             
//                p.pages.elementAt(0).setVisible(false);
//                p.pages.elementAt(1).setVisible(true);
                p.pages.elementAt(0).Status=PageStatus.inactivated;
                p.pages.elementAt(1).Status=PageStatus.activated;
            }
        });
    }
}
