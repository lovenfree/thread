package thread.mutex;

//https://drcode-devblog.tistory.com/297
//1. 교착 상태
//
//    두 가지 이상의 작업이 서로 상대방의 작업이 끝나기를 하염없이 기다리는 상태를 말한다.
//    서로 사용할 수 있는 공유된 리소스(종이, 연필) 등을 공유 자원 혹은 임계 영역이라 한다.


//. 교착상태가 발생할 수 있는 4가지 조건
//
//    상호 배제(Mutual exclusion)
//    점유 대기
//    비선점
//    순환 대기


//mutex
//여러 스레드를 실행하는 환경에서 자원에 대한 접근 제한을 강제하기 위한 동기화 매커니즘
//Mutex는 대기큐를 생성해두고, 임계 영역에 스레드가 있을 경우 다른 스레드가 공유 자원을 사용하려고 한다면 스레드를 Blocking하고 대기큐에 Sleep 시킨다.
public class Account {
  int balance = 1000;
  // 정수를 매개변수로 받아서
  // balance의 값보다 작거나 같으면
  // balance에서 빼주는 메소드
  // 돈을 찾는 메소드
  public void withdraw(int money) {
    if(balance >= money) {
      try {
        Thread.sleep(1000);
      } catch (Exception e) {}

      balance -= money;
    }
  }
}
