/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexample;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author bruno_akira
 */
public class SelectFile 
{
    public static Scanner selectTextFile()
    {
        do
        {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Java files", "java");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            try
            {
                if (returnVal == JFileChooser.APPROVE_OPTION)
                {
                    return new Scanner(chooser.getSelectedFile());
                }
                else
                {
                    return null;
                }
            }catch(FileNotFoundException error)
            {
                JOptionPane.showMessageDialog(null, "Invalid File", "error",JOptionPane.ERROR_MESSAGE);
            }
        }while (true);
    }
}
