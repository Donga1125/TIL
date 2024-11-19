## Thread Safe
Thread Safe한 자료구조란, 여러 스레드가 동시에 접근하더라도 일관성 있는 상태를 유지하고 동시성 문제없이 안전하게 데이터를 처리할 수 있는 자료 구조를 말한다. 


Java에서는 기본적으로 멀티스레드 환경에서 안전하게 사용할 수 있는 자료구조를 제공한다. </br>
- ConcurrentHashMap 
  - 여러 스레드가 동시에 읽고 쓰더라도 안전하게 동작하는 맵
- CopyOnWriteArrayList
  - 읽기 작업이 많은 환경에서 효율적으로 사용되는 List
- BlockingQueue
  - 생산자-소비자 문제를 해결하는 큐로, 멀티스레드 환경에서 안전하게 사용할 수 있다.
    </br>
  

**Thread Safe하게 만드는 방법** </br> 
- java.util.concurrent 패키지 하위의 클래스를 사용.
- 인스턴스 변수를 두지 않는다.
- Singleton 패턴을 사용.
- 동기화(syncronized) 블럭에서 연산을 수행.