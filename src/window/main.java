/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;
import java.sql.*;  // !!


/**
 *
 * @author U$ER
 */
public class main 
{
    public static void main(String[] args) throws Exception 
    {
        //創建新增分頁按鈕
        //按下分頁新增鈕新增一個當前分頁按鈕+下移新增鈕+新的TextField(索引+1)
        //點擊該分頁跳至當前索引並更新文字框(讀取資料庫)
        //歷史紀錄可以跳出其他視窗呈現

            Window app = new Window();
            app.run();
    }
}

