package thread.mutex;

// Thread로 사용할 클래스
public class Bank extends Thread{
  // 여러 개의 객체가 공유해서 사용할 수 있는 변수
  static Account account = new Account();

  // 문자열을 매개변수로 받아서 스레드의 이름으로
  // 사용할 생성자
  public Bank(String name) {
    super(name);
  }

  // 스레드로 수행할 메소드
  public void run() {
    while(true) {
      synchronized(account) {
        // 100 ~ 300을 랜덤하게 추출
        int money = (int)(Math.random() * 1 + 3) * 100;
        if(account.balance >= money) {
          System.out.println(getName() + "의 balance : " + account.balance);
          System.out.println(getName() + "의 찾는 금액 : " + money);
          account.withdraw(money);
          System.out.println(getName() + "의 balance : " + account.balance);
        } else {
          break;
        }
      }
    }
  }
}
