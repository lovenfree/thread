package thread.mutex;

public class MutexTest {
  public static void main(String[] args) {
    Bank th1 = new Bank("ATM");
    Bank th2 = new Bank("은행");

    th1.start();
    th2.start();
  }
}

/**
  ATM의 balance : 1000
    ATM의 찾는 금액 : 300
    ATM의 balance : 700
    ATM의 balance : 700
    ATM의 찾는 금액 : 300
    ATM의 balance : 400
    ATM의 balance : 400
    ATM의 찾는 금액 : 300
    ATM의 balance : 100
 */