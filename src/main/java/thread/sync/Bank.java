package thread.sync;

public class Bank {
  private int money = 10000;    // 공유될 자원

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  //synchronized : 스레드의 동기화. 공유 자원에 lock
  public synchronized void saveMoney(int save){    // 입금
    int m = money;
    try{
      Thread.sleep(2000);    // 지연시간 2초
    } catch (Exception e){

    }
    money = m + save;
    System.out.println("입금 처리");

  }

  //synchronized : 스레드의 동기화. 공유 자원에 lock
  public synchronized void minusMoney(int minus){    // 출금
    int m = money;
    try{
      Thread.sleep(3000);    // 지연시간 3초
    } catch (Exception e){

    }
    money = m - minus;
    System.out.println("출금 완료");
  }
}
