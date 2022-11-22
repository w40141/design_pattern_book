public class FileDisplayImpl extends DisplayImpl {
  private String fileName;

  public FileDisplayImpl(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void rawOpen() {
    System.out.println("+");
  }

  @Override
  public void rawPrint() {
    // TODO:
  }

  @Override
  public void rawClose() {
    System.out.println("+");
  }
}
