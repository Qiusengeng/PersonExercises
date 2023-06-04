package recusion;

import java.io.File;

public class RcursionDemo {
    public static void main(String[] args) {
        //传入目录 和 文件名称
        searchFile(new File("D:/"),"logback_log-data.log");
    }
    public static void searchFile(File dir,String fileName){
        //判断dir是目录
        if(dir != null && dir.isDirectory()){
            //可以找了
            //提取当前目录下的一级文件对象
            File[] files = dir.listFiles();
            //判断是否存在一级文件对象，存在才可以遍历
            if (files != null && files.length > 0){
                for (File file : files) {
                    //判断当前遍历的一级文件对象是文件还是目录
                    if (file.isFile()){
                        if (file.getName().contains(fileName)){
                            System.out.println("找到了:"+file.getAbsolutePath());
                        }
                    }else {
                        searchFile(file,fileName);
                    }
                }
            }
        }else{
            System.out.println("当前搜索的位置不是文件夹");
        }
    }
}
