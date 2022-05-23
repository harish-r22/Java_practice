package StreamsDemo;

import java.io.File;

public class FileClass {
    public static void main(String[] args) throws Exception {
        File f = new File("D:/Abhilash/java-new-programs/streamData");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isHidden());
        System.out.println(f.getName());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.createNewFile());
        System.out.println(f.getTotalSpace());

        String fileList[] = f.list();

        for(String file : fileList){
            System.out.println(file);
        }

        File files[] = f.listFiles();

        for(File file : files){
            System.out.println(file.getName() );
            System.out.println(file.lastModified());
        }
    }
}
