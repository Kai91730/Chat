/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author U$ER
 */
class IDBox extends JTextArea
{
    Window parent;
    
    IDBox(Window p)
    {
        super();
        parent=p;
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(50,20));
    }
}
