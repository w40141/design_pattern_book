package java.sec_02;

import javax.imageio.stream.FileImageOutputStream;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Print2 p2 = new PrintBanner2("World");
        p2.printWeak();
        p2.printStrong();

        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
