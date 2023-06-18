package thread.noti.wait;



//wait()는 스레드가 lock을 가지고 있다면 lock권한을 반납하고 대기하게 만들고,
//notify()는 대기 상태인 스레드에게 다시 lock권한을 부여하고 수행하게 만든다.
//wait()와 notify()는 동기화된 블럭(임계 영역)내에서 사용되어야 한다.

//빵집의 빵 접시에는 최대 10개의 빵이 놓일 수 있다.
//빵을 만드는 사람은 10개 이상이 빵 접시에 놓여있을 땐 만드는 것을 멈춰야하고 빵을 먹는 사람은 빵이 없으면 먹을 수 없어야 한다.
public class BreadPlate {
  private int breadCount = 0;

  public BreadPlate(){

  }

  /**
   * 스레드 동기화 중 협력관계 처리작업 : wait() notify()
   * 스레드 간 협력 작업 강화
   */
  public synchronized void makeBread(){
    if (breadCount >= 10){
      try {
        System.out.println("빵 생산 초과");
//        wait(); // Thread를 Not Runnable 상태로 전환
      } catch (Exception e) {

      }
    }
    breadCount++;    // 빵 생산
    System.out.println("빵을 만듦. 총 " + breadCount + "개");
    // 알아보기 쉽게하기 위해 10개가 넘어도 생산되기 함.
//    notify();    // Thread를 Runnable 상태로 전환

  }

  public synchronized void eatBread(){
    if (breadCount < 1){
      try {
        System.out.println("빵이 없어 기다림");
//        wait();
      } catch (Exception e) {

      }
    }
    breadCount--;
    System.out.println("빵을 먹음. 총 " + breadCount + "개");
    // 알아보기 쉽게하기 위해 빵이 없어도 먹을수 있게 함.
//    notify();
  }
}
