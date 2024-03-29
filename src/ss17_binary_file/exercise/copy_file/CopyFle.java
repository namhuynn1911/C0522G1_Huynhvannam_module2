package ss17_binary_file.exercise.copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class CopyFle {
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                count += length;
            }
            System.out.println("so byte trong tep: " + count);
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/ss17_binary_file/exercise/copy_file/source.csv";
        String targetPath = "src/ss17_binary_file/exercise/copy_file/target.csv";
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                throw new FileExistsException("file dich da ton tai, kiem tra lai!");
            }
            copyFileUsingStream(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
