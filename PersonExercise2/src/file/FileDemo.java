package file;

import java.io.File;

/*
    目标：学会创建File对象定位操作系统的文件
 */
public class FileDemo {
    public static void main(String[] args) {
        //1、常见File对象
        File f = new File("D://java");
        long size = f.length();//文件的字节大小
        System.out.println(size);
    }
}
