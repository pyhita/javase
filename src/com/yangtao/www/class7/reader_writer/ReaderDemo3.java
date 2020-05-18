package com.yangtao.www.class7.reader_writer;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符流可以直接读取中文汉字，而字节流在处理的时候会出现中文乱码
 */
public class ReaderDemo3 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("abc.txt");
            int length = 0;
            char[] chars = new char[1024];
            //添加缓冲区
            while((length = reader.read(chars))!=-1){
                System.out.println(new String(chars,0,length));
            }
//            int read = reader.read();
//            System.out.println((char)read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}