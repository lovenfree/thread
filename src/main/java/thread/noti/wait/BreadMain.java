package thread.noti.wait;

public class BreadMain {
  public static void main(String[] args) {
    BreadPlate breadPlate = new BreadPlate();
    BreadMaker maker = new BreadMaker(breadPlate);
    BreadEater eater = new BreadEater(breadPlate);

    maker.setPriority(10);
    maker.start();
    eater.start();
  }
}
