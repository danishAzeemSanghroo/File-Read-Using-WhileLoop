/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.FileInputStream;

/**
 *
 * @author Danish
 */
public class ReadFileByWhileLoop {
    public static void main(String args[])throws Exception{
    
        FileInputStream file=new FileInputStream("anyFile");
        int code=file.read();
        while(code!=-1){
            System.out.print((char)code+" ");
            code=file.read();
        }
        file.close();
        
    }
}
