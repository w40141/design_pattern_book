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
    binDir.add(new File("vi", 1000));
    binDir.add(new File("latex", 2000));
    rootDir.printList();
    System.out.println();

    System.out.println("Making user entries...");
    Directory taro = new Directory("taro");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");
    usrDir.add(taro);
    usrDir.add(hanako);
    usrDir.add(tomura);
    taro.add(new File("diary", 1000));
    taro.add(new File("memo.tex", 2000));
    hanako.add(new File("game.doc", 1000));
    tomura.add(new File("junk.mail", 1000));
    tomura.add(new File("Composite.java", 2000));
    rootDir.printList();
  }
}
