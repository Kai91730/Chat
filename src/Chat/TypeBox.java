/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author U$ER
 */
class TypeBox extends JTextArea 
{
    Window parent;
 
    TypeBox(Window p)
    {
        super();
        parent=p;
        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension((ScreenSize.width-150)/3,40)); //初始化輸入框長度
        this.setText("Type here!");
        this.setLineWrap(true);
    }
}
