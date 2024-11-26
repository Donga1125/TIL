## Java 의 Exception

Exception은 프로그램 실행 중에 발생하는 오류를 처리하기 위한 예외 처리 매커니즘이다. 

**예외의 종류** 
- Checked Exception 
  - 컴파일 시점에 반드시 처리해야하는 예외. ex) IOException, SQLException
  - 주로 파일 읽기/쓰기, 데이터베이스 연결 등과 같이 외부 자원과 연관된 작업에서 발생.
  - try-catch로 처리하거나 메서드에 throws 선언
- Unchecked Exception
  - 런타임 시점에 발생하며, 반드시 처리할 필요는 없다. ex) NullPointerException, ArrayIndexOutOfBoundsException
  - 주로 프로그래밍 실수(논리 오류)로 인해 발생.

예외 처리 시 이점
- 프로그램이 비정상 종료되지 않는다. -> 안정성 높아짐 
- 발생한 문제를 보다 구체적으로 진단하고 처리할 수 있다. 
- 사용자에게 더 나은 피드백을 제공할 수 있다. 