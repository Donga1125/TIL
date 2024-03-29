## 1. 애플리케이션 테스트 케이스 설계

### 1) 테스트 케이스

- 테스트 케이스 작성 절차
    1. 테스트 계획 검토 및 자료 확보
    2. 위험 평가 및 우선순위 결정
    3. 테스트 요구사항 정의
    4. 테스트 구조 설계 및 테스트 방법 결정
    5. 테스트 케이스 정의 및 작성
    6. 테스트 케이스 타당성 확인 및 유지보수

- 테스트 오라클
    - 개념: 테스트의 결과가 참인지 거짓인지를 판단하기 위해서 사전에 정의된 참값을 입력하여 비교하는 기법
    - 종류
        - 참 오라클: 모든 입력값에 대하여 기대하는 결과를 생성함으로써 발생된 오류를 모두 검증할 수 있는 오라클
        - 샘플링 오라클: 특정한 몇 개의 입력값에 대해서만 기대하는 결과를 제공해주는 오라클
        - 휴리스틱 오라클: 샘플링 오라클을 개선한 오라클로, 특정 입력값에 대해 올바른 결과를 제공하고, 나머지 값들에 대해서는 휴리스틱(추정)으로 처리하는 오라클
        - 일관성 검사: 애플리케이션 변경이 있을 때, 수행 전과 후의 결괏값이 동일한지 확인하는 오라클

### 2) 테스트 레벨

- 테스트 레벨 종류
    - 애플리케이션 테스트는 소프트웨어의 개발 단계에 따라 분류할 수 있고, 이렇게 분류된 것을 테스트 레벨이라고 한다.
    - **종류**
        - 단위 테스트
            - 사용자의 요구사항에 대한 단위 모듈, 서브 루틴 등을 테스트하는 단계.
            - 소프트웨어 설계의 최소 단위인 모듈이나 컴포넌트에 초점을 맞춘 테스트이다.
            - 기법
                - 인터페이스 테스트
                - 자료 구조 테스트
                - 실행 경로 테스트
                - 오류 처리 테스트
        - 통합 테스트
            - 단위 테스트를 통과한 컴포넌트 간의 인터페이스를 테스트하는 단계
            - 소프트웨어 각 모듈 간의 인터페이스 관련 오류 및 결함을 찾아내기 위한 체계적인 테스트 기법이다.
            - 기법
                - 빅뱅 테스트
                - 상향식/하향식 테스트
        - 시스템 테스트
            - 개발 프로젝트 차원에서 정의된 전체 시스템 또는 제품의 동작에 대해 테스트하는 단계
            - 통합된 단위 시스템의 기능이 시스템에서 정상적으로 수행되는지를 검증하는 테스트이다.
            - 기법
                - 기능/비기능적 요구사항 테스트
        - **인수 테스트**
            - 계약상의 요구사항이 만족되었는지 확인하기 위한 테스트 단계
            - 최종 사용자와 업무의 이해관계자 등이 테스트를 수행함으로써 개발된 제품에 대해 운영 여부를 결정하는 테스트이다.
            - 기법
                - 알파 테스트: 선택된 사용자(회사 내의 다른 사용자 또는 실제 사용자)가 개발자 환경에서 통제된 상태로 개발자와 함께 수행하는 인수 테스트
                - 베타 테스트: 실제 환경에서 일정 수의 사용자에게 대상 소프트웨어를 사용하게 하고 피드백을 받는 인수 테스트. 필드 테스팅이라고도 불리며, 개발자 없이 고객의 사용 환경에 소프트웨어를 설치하여 검사를 수행하는 인수 테스트


### 3) 테스트 지식 체계

- 테스트 기법에 따른 분류
    - 블랙박스 테스트 (= 명세 테스트)
        - 프로그램 외부 사용자의 요구사항 명세를 보면서 수행하는 기능 테스트이다.
        - 소프트웨어의 특징, 요구사항, 설계 명세서 등에 초점을 맞춰 테스트가 이루어진다.
        - 기능 및 동작 위주의 테스트를 진행하기 때문에 내부 구조나 작동 원리를 알지 못해도 가능하다.
        - 블랙박스 테스트 유형
            - 동등 분할 테스트
            - 경곗값 분석 테스트
            - 결정 테이블 테스트
            - 상태전이 테스트
            - 유스케이스 테스트
            - 분류 트리 테스트
            - 페어와이즈 테스트
            - 원인 - 결과 그래프 테스트
            - 비교 테스트
            - 오류 추정 테스트
    - 화이트박스 테스트
        - 각 응용 프로그램 내부 구조와 동작을 검사하는 소프트웨어 테스트이다.
        - 코드 분석과 프로그램 구조에 대한 지식을 바탕으로 문제가 발생할 가능성이 있는 모듈 내부를 직접 관찰하고, 테스트하는 방법이다.
        - 소스 코드의 모든 문장을 한 번 이상 수행함으로써 진행된다.
        - 산출물의 기능별로 적절한 프로그램의 제어 구조에 따라 선택, 반복 등의 부분들을 수행함으로써 논리적 경로를 점검한다.
        - 구조 기반 테스트, 코드 기반 테스트, 로직 기반 테스트, 글래스 박스 테스트라고 부른다.
        - 화이트박스 테스트 유형
            - 구문 커버리지 = 문장 커버리지
            - 결정 커버리지 = 선택 커버리지
            - 조건 커버리지
            - 조건 - 결정 커버리지
            - 변경 조건 - 결정 커버리지
            - 다중 조건 커버리지
            - 기본 경로 커버리지 = 경로 커버리지
            - 제어 흐름 테스트
            - 데이터 흐름 테스트
            - 루프 테스트

- 테스트 시각에 따른 분류
    - **검증 (Verification)**
        - 소프트웨어 개발 과정을 테스트
        - 올바른 제품을 생산하고 있는지 검증
        - 이전 단계에서 설정된 개발 규격과 요구를 충족시키는지 판단
        - 개발자 혹은 시험자의 시각으로 소프트웨어가 명세화된 기능을 올바로 수행하는지 알아보는 과정
    - **확인 (Validation)**
        - 소프트웨어 결과를 테스트
        - 만들어진 제품이 제대로 동작하는지 확인
        - 최종 사용자 요구 또는 소프트웨어 요구에 적합한지 판단
        - 사용자 시각으로 올바른 소프트웨어가 개발되었는지 입증하는 과정

- 테스트 목적에 따른 분류
    - 회복 테스트(Recovery Test): 시스템에 고의로 실패를 유도하고, 시스템의 정상적 복귀 여부를 테스트하는 기법
    - 안전 테스트(Security Test): 불법적인 소프트웨어가 접근하여 시스템을 파괴하지 못하도록 소스 코드 내의 보안적인 결함을 미리 점검하는 테스트 기법
    - 성능 테스트(Performance Test): 사용자의 이벤트에 시스템이 응답하는 시간, 특정 시간 내에 처리하는 업무량, 사용자 요구에 시스템이 반응하는 속도 등을 측정하는 테스트 기법
    - 강도 테스트(Stress Test): 시스템 처리 능력 이상의 부하, 임계점 이상의 부하를 가하여 비정상적인 상황에서의 처리를 테스트
    - 구조 테스트(Structure Test): 시스템의 내부 논리 경로, 소스 코드의 복잡도를 평가하는 테스트 기법
    - 회귀 테스트(Regression Test): 오류를 제거하거나 수정한 시스템에서 오류 제거와 수정에 의해 새로이 유입된 오류가 없는지 확인하는 일종의 반복 테스트 기법
    - 병행 테스트(Parallel Test): 변경된 시스템과 기존 시스템에 동일한 데이터를 입력 후 결과를 비교하는 테스트 기법

- 소프트웨어 테스트의 원리
    - 결함 존재 증명 - 테스트는 결함이 존재함을 밝히는 활동. 결함이 없다는 것을 증명할 수는 없음.
    - 완벽 테스팅은 불가능 - 무한 경로, 무한 입력 값으로 인한 완벽한 테스트가 어렵다는 원칙
    - 초기 집중 - 개발 초기에 체계적인 분석 및 설계가 수행되면 테스팅 기간 단축. 재작업을 줄여 개발 기간을 단축 및 결함을 예방할 수 있다는 원리
    - **결합 집중** - 적은 수의 모듈에서 대다수의 결함이 발견된다는 원리 → **파레토 법칙 적용**
    - 살충제 패러독스 - 동일한 테스트 케이스에 의한 반복적 테스트는 새로운 버그를 찾지 못한다는 원리
    - 정황 의존성 - 소프트웨어의 성격에 맞게 테스트를 수행해야 한다는 원리
    - 오류-부재의 궤변: 요구사항을 충족시켜주지 못한다면, 결함이 없다고 해도 품질이 높다고 볼 수 없다는 원리


## 2. 애플리케이션 통합 테스트

### 1) 결함 관리 도구

- 소프트웨어의 결함(Defect)을 말할 때 오류, 결점, 버그, 고장, 문제 와 같은 용어가 사용된다.
    - 오류(Error): 결함의 원인이 되는 것으로, 일반적으로 사람에 의해 생성된 실수
    - 결점(Fault): 소프트웨어 개발 활동을 수행함에 있어서 시스템이 고장을 일으키게 하며, 오류가 있는 경우 발생하는 현상

### 2) 테스트 자동화 도구

- 정적 분석 도구(Static Analysis Tools)
    - 정적 분석 도구는 만들어진 애플리케이션을 실행하지 않고 분석하는 방법이다.
    - 대부분의 경우 소스 코드에 대한 코딩 표준, 코딩 스타일, 코드 복잡도 및 남은 결함을 발견하기 위하여 사용한다.
    - 테스트를 수행하는 사람이 작성된 소스 코드에 대한 이해를 바탕으로 도구를 이용해서 분석하는 것을 말한다.
    - 자료 흐름이나 논리 흐름을 분석하여 비정상적인 패턴을 찾을 수 있다.
    - 자동화 도구는 PMD, Checkstyle,Splint 등이 있다.
- 테스트 장치 구성 요소
    - 테스트 드라이버: **상향식 통합시험**을 위해 모듈 테스트 수행 후의 결과를 도출하는 시험용 모듈. 테스트가 필요한 모듈에 인지를 넘겨주고 테스트를 완료한 후 그 결괏값을 받는 역할을 하는 가상의 모듈. 하위 모듈을 호출하는 상위 모듈의 역할
    - 테스트 스텁: **하향식 통합시험**을 위해 일시적으로 필요한 조건만을 가지고 임시로 제공되는 시험용 모듈. 상위 모듈에 의해 호출되는 하위 모듈의 역할
    - 테스트 슈트: 테스트 케이스를 실행환경에 따라 구분해 놓은 테스트 케이스의 집합. 시나리오가 포함되지 않은 단순한 테스트 케이스들의 모음.
    - 테스트 케이스: 입력값, 실행 조건, 기대 결과 등의 집합

### 3) 통합 테스트

- 통합 테스트 수행 방법의 분류
    - **하향식 통합 테스트**
        - 메인 제어 모듈(프로그램)로부터 아래 방향으로 제어의 경로를 따라 이동하면서 하향식으로 통합하는 테스트이다.
        - 메인 제어 모듈에 통합되는 하위 모듈과 최하위 모듈은 ‘깊이 우선’ 또는 ‘너비 우선’방식으로 통합된다.
        - 수행 3단계에서 모듈 및 모든 하위 컴포넌트를 대신하여 더미 모듈인 **스텁** 개발
    - **상향식 통합 테스트**
        - 애플리케이션 구조에서 최하위 레벨의 모듈 또는 컴포넌트로부터 점진적으로 상위 모듈과 함께 테스트하는 기법이다.
        - 수행 2단계에서 상위의 모듈에서 데이터의 입력과 출력을 확인하기 위한 더미 모듈인 **드라이버** 작성


## 3. 애플리케이션 성능 개선

### 1) 알고리즘

- 알고리즘 기법:
    - 분할과 정복(Divide and Conquer): 문제를 나눌 수 없을 때까지 나누고, 각각을 풀면서 다시 병합하여 문제의 답을 얻는 알고리즘
    - 동적계획법(Dynamic Programming): 어떤 문제를 풀기 위해 그 문제를 더 작은 문제의 연장선으로 생각하고, 과거에 구한 해를 활용하는 방식의 알고리즘
    - 탐욕법(Greedy): 결정을 해야할 때마다 그 순간에 가장 좋다고 생각되는 것을 해답으로 선택함으로써 최종적인 해답에 도달하는 방식의 알고리즘
    - 백트래킹(Backtracking): 어떤 노드의 유망성 점검 후, 유망하지 않으면 그 노드의 부모 노드로 되돌아간 후 다른 자손 노드를 검색하는 알고리즘
- 시간 복잡도에 따른 알고리즘 분류
    - **O(1)**
        - 상수형 복잡도.
        - 자료 크기 무관하게 항상 같은 속도록 작동.
        - 알고리즘 수행 시간이 입력 데이터 수와 관계없이 일정.
        - **대표 알고리즘 = 해시 함수**
    - **O(log2 n)**
        - 로그형 복잡도
        - 문제를 해결하기 위한 단계의 수가 log2 n번 만큼의 수행 시간을 가짐.
        - **대표 알고리즘 = 이진 탐색**
    - **O(n)**
        - 선형 복작도.
        - 입력 자료를 차례로 하나씩 모두 처리.
        - 수행 시간이 자료 크기와 직접적 관계로 변함(정비례).
        - **대표 알고리즘 = 순차 탐색**
    - **O(nlog2 n)**
        - 선형 로그형 복잡도
        - 문제를 해결하기 위한 단계의 수가 nlog2 n번 만큼의 수행 시간을 가짐.
        - **대표 알고리즘 = 퀵 정렬, 병합 정렬, 힙 정렬**
    - **O(n^2)**
        - 제곱형 복잡도.
        - 주요 처리 루프 구조가 2중인 경우의 복잡도.
        - n의 크기가 작을 때에는 n^2이 nlog2 n 보다 빠를 수 있음.
        - **대표 알고리즘 = 거품 정렬, 삽입 정렬, 선택 정렬**

- 알고리즘 설명
    - 해싱 함수
        - 데이터를 키로 변환하는 함수. 예를 들어 길고 복잡한 문자열을 짧고 단순한 문자열(또는 수열)로 변경하는 함수이다.
        - 종류
            - 제산법(Division): 나머지 연산자(%)를 사용하여 테이블 주소를 계산하는 방식
            - 제곱법(Mid Square): 레코드 키값을 제곱한 후에 결괏값의 중간 부분에 있는 몇 비트를 선택하여 해시 테이블의 홈 주소로 사용하는 방식
            - 숫자 분석법(Digit Analysis): 레코드 키를 구성하는 수들이 모든 키들 내에서 자리별로 어떤 분포인지를 조사하여 비교적 고른 분포를 나타내는 자릿수를 필요한 만큼 선택하여, 레코드의 홈 주소로 사용하는 방법
            - 폴딩법(Folding): 레코드 키를 여러 부분으로 나누고, 나눈 부분의 각 숫자를 더하거나 XOR 한 값을 홈 주소로 사용하는 방식
            - 기수 변환법(Radix Conversion): 어떤 진법으로 표현된 주어진 레코드 키를 다른 진법으로 간주하고 키를 변환하여 홈 주소를 얻는 방식.
            - 무작위 방법(Random): 난수를 발생시켜 각 레코드 키의 홈 주소를 결정하는 방식
    - 이진 검색(Binary Search)
        - 정렬되어 있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 알고리즘이다.
        - 탐색 효율이 좋고 탐색 시간이 적게 소요된다.
        - 가운데 레코드 번호를 찾기 위해서는 다음 식을 사용한다. (소수점은 버림 처리)
          F: 남은 범위 내에서 첫 번째 레코드 번호
          L: 남은 범위 내에서 마지막 레코드 번호
          M: 남은 범위 내에서 가운데 레코드 번호

      $$
      M = [F + L/ 2]

      $$

    - 정렬 알고리즘
        - **퀵 정렬**
            - 피벗을 두고 피벗의 왼쪽에는 피벗보다 작은 값을 오른쪽에는 큰 값을 두는 과정을 반복하는 알고리즘이다.
            - 레코드의 많은 자료 이동을 없애고 하나의 파일을 부분적으로 나누어 가면서 정렬한다.
            - 수행 시간
                - 최적 수행 시간 - O(nlog2 n)
                - 평균 수행 시간 - O(nlog2 n)
                - 최악 수행 시간 - O(n^2)
        - 합법 정렬
        - **힙 정렬**
            - 정렬할 입력 레코드들로 힙을 구성하고 가장 큰 키값을 갖는 루트 노드를 제거하는 과정을 반복하여 정렬하는 알고리즘이다.
            - 완전 이진 트리로 입력 자료의 레코드를 구성한다.
            - 수행 시간
                - 최적 수행 시간 - O(nlog2 n)
                - 평균 수행 시간 - O(nlog2 n)
                - 최악 수행 시간 - O(nlog2 n)
        - **버블 정렬**
            - 인접한 2개의 레코드 키값을 비교하여 그 크기에 따라 레코드 위치를 서로 교환하는 알고리즘이다.
            - 두 인접한 원소를 교환하는 과정이 거품 모양과 같다고 하여 거품 정렬이고한다.
            - 한 PASS를 수행할 때마다 가장 큰 값이 맨 뒤로 이동하기 때문에, PASS를 ‘요소의 개수 -1번’ 수행하게 되면 모든 숫자가 정렬된다.
        - 삽입 정렬
            - 2번째 키와 1번째 키를 비교하여 순서대로 나열하고, 이어서 3번째 키를 1,2번째와 비교해 순서대로 나열하고, 계속 N번째 키를 앞의 n-1개 키와 비교하여 알맞은 순서에 삽입하는 알고리즘이다.
        - **선택 정렬**
            - 정렬되지 않은 데이터들에 대해 가장 작은 데이터를 찾아 정렬 되지 않은 부분의 가장 앞의 데이터와 교환해나가는 알고리즘이다.


### 2) 소스 코드 품질 분석

- 소스 코드 품질 분석 도구
    - 정적 분석 도구
        - pmd
        - cppcheck
        - SonarQube
        - checkstyle
        - ccm
        - cobertura
    - 동적 분석 도구
        - Avalanche
        - Valgrind

### 3) 코드 최적화

- Bad Code 유형
    - 오염 - 비즈니스 기능을 수행하지 못하는 많은 컴포넌트들이 존재
    - 문서 부족 - 현재 코드와 문서가 일치하지 않고 수정과 변경을 위한 도메인 지식은 크게 증가하지만 개발자의 지식 부족
    - 의미 없는 이름 - 함수, 클래스, 컴포넌트 이름들이 명확한 의미를 갖지 못하거나 실제 작동과 불일치
    - 높은 결합도 - 클래스와 컴포넌트 간에 데이터와 컨트롤 흐름이 네트워크로 복잡하게 연결
    - 아키텍처 침식 - 아키텍처가 더 이상 구별되지 않고 여러 솔루션으로 이루어져 아키텍처 상 변형들로 인해 시스템 품질이 떨어짐
    - Alien Code - 매우 오래되거나 참고문서 또는 개발자가 없어 유지보수 작업이 몹시 어려운 코드
- 클린코드 작성 원칙
    - 가독성
    - 단순성
    - 의존성 최소
    - 중복성 제거
    - 추상eh