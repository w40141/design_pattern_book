public class Main {
  public static void main(String[] args) {
    System.out.println("Making root entries...");
    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("bin");
    Directory tmpDir = new Directory("tmp");
    Directory usrDir = new Directory("usr");
    rootDir.add(binDir);
    rootDir.add(tmpDir);
    rootDir.add(usrDir);
    binDir.add(new File("vi", 10000));
    binDir.add(new File("latex", 20000));
    rootDir.accept(new ListVisitor());
    System.out.println();

    System.out.println("Making root entries...");
    Directory hanako = new Directory("hanako");
    Directory taro = new Directory("taro");
    Directory jiro = new Directory("jiro");
    usrDir.add(hanako);
    usrDir.add(taro);
    usrDir.add(jiro);
    hanako.add(new File("diary.html", 100));
    hanako.add(new File("Composit.java", 200));
    taro.add(new File("mamo.txt", 300));
    taro.add(new File("game.doc", 400));
    jiro.add(new File("junk.mail", 500));
    rootDir.accept(new ListVisitor());

    FileFindVisitor ffv = new FileFindVisitor("html");
    rootDir.accept(ffv);
    System.out.println("HTML files are: ");
    for (File file : ffv.getFoundFiles()) {
      System.out.println(file);
    }
  }
}
