# Chapter01. 소프트웨어 개발방법론 활용

## 1. 소프트웨어 개발방법론 선정

### 1) 소프트웨어 생명주기 모델

- **소프트웨어 생명주기 모델 종류**
    - **폭포수 모델 (Waterfall Model)**
        - 소프트웨어 개발 시 각 단계를 확실히 마무리 지은 후에 다음 단계로 넘어가는 모델
        - Boehm이 제시한 고전적 생명주기 모형으로서 선형 순차적 모델이라고 함
        - 가장 오래된 모델로 적용 경험과 성공 사례가 많음
        - 단계별 정의와 산출물이 명확
        - 요구사항 변경이 어려움
        - 절차:
          타당성 검토 → 계획 → 요구사항 분석 → 설계 → 구현 → 테스트 → 유지보수
    - **프로토타이핑 모델 (Prototyping Model)**
        - 고객이 요구한 주요 기능을 프로토타입으로 구현하여, 고객의 피드백을 반영하여 소프트웨어를 만들어가는 모델
        - 프로토타입은 발주자나 개발자 모두에게 공동의 참조 모델을 제공
        - 프로토타입은 구현 단계의 구현 골격
    - **나선형 모델 (Spiral Model)**
        - 시스템 개발 시 위험을 최소화하기 위해 점진적으로 완벽한 시스템으로 개발해 나가는 모델
        - 비교적 대규모 시스템에 적합
        - 절차 :
          계획 및 정의 → 위험 분석 → 공학적 개발 → 고객 평가
    - **반복적 모델 (Iteration Model)**
        - 구축대상을 나누어 병렬적으로 개발 후 통합하거나, 반복적으로 개발하여 점증 완성시키는 SDLC 모델
        - 사용자의 요구사항 일부분 혹은 제품 일부분을 반복적으로 개발하여 최종 시스템으로 완성하는 모델

- **소프트웨어 생명주기 모델 간 비교**

  ![image (2).png](https://prod-files-secure.s3.us-west-2.amazonaws.com/c52d3ba8-5d60-4225-b490-d52786f48aed/43baa206-1675-4ecb-8319-ecb1fe3fcb30/image_(2).png)

  ** (장단점 꼭 확인)


### 2) 소프트웨어 개발방법론

- **소프트웨어 개발방법론 종류**
    - **구조적 방법론 Structured Development**
        - 전체 시스템을 기능에 따라 나누어 개발하고, 이를 통합하는 분할과 정복 접근 방식의 방법론
        - 프로세스 중심의 하향식 방법론
        - 구조적 프로그래밍 표현을 위해 나씨-슈나이더만 차트 사용
        - 정형화된 분석 절차에 따라 사용자 요구사항을 파악, 문서화하는 체계적 분석 방법으로 자료흐름도, 자료 사전, 소단위 명세서의 특징을 갖는 방법론
    - **정보공학 방법론 Information Engineering Development**
        - 정보 시스템 개발에 필요한 관리 절차와 작업 기법을 체계화한 방법론
        - 개발주기를 이용해 대형 프로젝트를 수행하는 체계적인 방법론
        - 정보 시스템의 개발을 위해 개발, 분석, 설계, 구축에 정형화된 기법들을 상호 연관성 있게 통합 및 적용하는 Data 중심의 방법론
    - 객체 지향 방법론 Object - Oriented Development
        - 객체라는 기본 단위로 시스템을 분석 및 설계하는 방법론
        - 복잡한 현실 세계를 사람이 이해하는 방식으로 시스템에 적용하는 방법론
        - 객체, 클래스, 메시지를 사용
        - 현실 세계의 개체를 하나의 객체로 만들어서 소프트웨어를 개발할 때 조립하듯이 객체들을 조립해서 소프트웨어를 구현하는 방법론
    - 컴포넌트 기반 방법론 CBD; Component Based Development
        - 소프트웨어를 구성하는 컴포넌트를 조립해서 하나의 새로운 응용 프로그램을 작성하는 방법론
        - 생산성과 품질을 높이고, 유지보수 비용을 최소화할 수 있음
        - 컴포넌트 제작 기법을 통해 재사용성을 향상
        - 독립적인 컴포넌트 단위의 관리로 복잡성 최소화
        - 소프트웨어 재사용이 가능
    - 애자일 방법론 Agile Development
        - 절차보다는 사람이 중심이 되어 변화에 유연하고 신속하게 적용하면서 효율적으로 시스템을 개발할 수 있는 신속 적응적 경량 개발 방법론
        - 애자일은 개발 과정의 어려움을 극복하기 위해 적극적으로 모색한 방법론
        - 소프트웨어 개발에 참여하는 구성원들 간의 의사소통 중시, 프로젝트 상황에 따른 주기적 조정이 가능한 개발방법론
    - 제품 계열 방법론 Product Line Development
        - 특정 제품에 적용하고 싶은 공통된 기능을 정의하여 개발하는 방법론
        - 임베디드 소프트웨어를 작성하는 데 유용한 방법론
        - 영역 공학과 응용 공학으로 구분
            - 영역 공학 - 영역 분석, 영역 설계, 핵심 자산을 구현하는 영역
            - 응용 공학 - 제품 요구분석, 제품 설계, 제품을 구현하는 영역


### 2) 프로젝트 관리

- 프로젝트 관리의 개념
    - 프로젝트 관리는 주어진 기간 내에 최소의 비용으로 사용자를 만족시키는 시스템을 개발하기 위한 전반적인 활동이다.
    - 프로젝트 관리는 소프트웨어 개발 계획을 세우고 분석, 설계, 구현 등의 작업을 통제하는 것으로 소프트웨어 생명 주기의 전 과정에 걸쳐서 진행된다.
    - 소프트웨어 프로젝트를 성공적으로 수행하기 위해서는 수행할 작업의 범위, 필요한 자원, 수행 업무, 비용, 추진 일정들을 관리해야 한다.

### **3) 비용 산정 모델**

- 비용 산정 모델
    - 하향식 비용 산정 모델
        - 전문가 감정 기법 : 조직 내에 있는 경험이 많은 2명 이상의 전문가에게 비용 산정을 의뢰하는 기법. 편리하고 신속하게 비용을 산정할 수 있지만, 개인적이고 주관적임
        - 델파이 기법 : 전무가 감정 기법의 주관적인 판단을 보완하기 위해 많은 전문가의 의견을 종합하여 비용을 산정하는 기법. 1명의 조정자와 여러 전문가로 구성됨.
    - 상향식 비용 산정 모델
        - LoC (Lines of Code) : 소프트웨어 각 기능의 원시 코드 라인 수의 낙관치, 중간치, 비관치를 측정하여 예측치를 구하고 이를 이용하여 비용을 산정

### 4) 일정관리 모델

- **일정관리 모델 종류**
    - 주 공정법 (CPM; Critical Path Method) : 여러 작업의 수행 순서가 얽혀 있는 프로젝트의 일정을 계산하는 기법. 모든 자원 제약사항을 배제한 상태로 프로젝트의 시작과 끝을 나타내는 노드와 노드 간을 연결을 통해 공정을 계산하기 위한 액티비티 표기법
    - PERT (Program Evaluation and Review Technique) : 일의 순서를 계획적으로 정리하기 위한 수렴 기법으로 비관치, 중간치, 낙관치의 3점 추정방식을 통해 일정을 관리하는 기법. 과거에 경험이 없어 소요 기간 예측이 어려운 소프트웨어에서 사용
    - 중요 연쇄 프로젝트 관리 (CCPM; Critical Chain Project Management) : 주 공정 연쇄법으로 자원제약사항을 고려하여 일정을 작성하는 기법
    - 간트 차트 (Gantt Chart) : 업무별로 일정의 시작과 끝을 그래픽으로 표시하여 전체 일정을 한눈에 볼 수 있는 프로젝트 일정 관리를 위한 Bar 형태의 차트

### 5) 위험 관리

- 위험 관리의 개념
    - 위험 관리는 프로젝트에 내재된 위험 요소를 인식하고 그 영향을 분석하여 이를 관리하는 활동이다.
    - 위험 관리는 프로젝트를 성공시키기 위하여 위험 요소를 사전에 예측, 대비하는 모든 기술과 동을 포함한다.




## 2. 소프트웨어 개발방법론 테일러링

### 1) 소프트웨어 개발 표준

- ISO/IEC 12207 표준
    - 소프트웨어 생명주기 프로세스이며, 소프트웨어와 관련된 조직과 사람, 소프트웨어 획득자, 공급자, 개발자 등의 이해관계자들이 각자의 입장에서 수행해야 할 일을 정의하고 지속적으로 개선시키기 위한 활동이다.
    - 구성
        - **기본 공정 프로세스** : 획득 프로세스, 공급 프로세스, 개발 프로세스, 운영 프로세스, 유지보수 프로세스
        - **조직 공정 프로세스** : 기반 구조 프로세스, 관리 프로세스, 개선 프로세스, 훈련 프로세스
        - **지원 공정 프로세스** : 문서화 프로세스, 품질 보증 프로세스, 형상 관리 프로세스, 검증 프로세스, 확인 프로세스, 문제 해결 프로세스, 활동 검토 프로세스, 감사 프로세스
- CMMI 단계적 표현 모형의 성숙도 레벨
    1. 초기화 단계

       정의된 프로세스가 없고 작업자 능력에 따라 성과가 좌우되는 단계. 프로세스 미비/비공식적, 예측 불가

    2. 관리 단계

       특정한 프로젝트 내의 프로세스가 정의되고 수행되는 단계. 프로젝트 관리 시스템 정착, 프로젝트 결과의 반복성

    3. 정의 단계

       조직의 표준 프로세스를 활용하여 업무를 수행하는 상태 표준화, 일관된 프로세스가 존재하는 단계. 엔지니어링 및 관리 프로세스의 통합

    4. 정량적 관리 단계

       정량적 기법을 활용하여 핵심 프로세스를 통제하는 단계. 제품 및 프로세스의 정량적 통계

    5. 최적화 단계

       프로세스 역량 향상을 위해 신기술 도입, 프로세스 혁신 활동 수행하는 단계. 프로세스 개선이 내재화된 조직

- SPICE
    - SPICE 모델 개념
        - SPICE 는 소프트웨어 프로세스에 대한 개선 및 능력측정 기준에 대한 국제 표준이다.
        - 소프트웨어 프로세스 평가를 위한 국제 표준이다.
        - 미 국방성의 CMM과 비슷한 프로세스 평가를 위한 모델을 제시한다.
        - ISO 12207 소프트웨어 생명주기 프로세스를 참고로 하여 ISO/IEC 15504 라는 규격을 완성하였다.
    - SPICE 프로세스 수행 능력 수준
        1. 불안정 단계 - 프로세스가 구현되지 않았거나, 프로세스가 그 목적을 달성하지 못한 단계
        2. 수행 단계 - 프로세스의 목적이 전반적으로 이루어진 단계
        3. 관리 단계 - 정의된 자원의 한도 내에서 그 프로세스가 작업 산출물을 인도
        4. 확립 단계 - 소프트웨어 공학 원칙에 기반하여 정의된 프로세스가 수행
        5. 예측 단계 - 프로세스가 목적 달성을 위해 통제되고, 양적인 측정을 통해서 일관되게 수행
        6. 최적화 단계 - 프로세스 수행을 최적화하고, 지속적으로 업무 목적을 만족

### 2) 테일러링 기준

- 테일러링 개발 방법론의 기준
    - 내부적 기준
        - 목표환경 - 시스템의 개발 유형 및 기술 환경의 상이한 부분 조정
        - 요구사항 - 프로젝트의 생명주기 활동 측면에서 개발/운영/유지보수 등 프로젝트에서 우선적으로 고려할 요구사항이 상이하므로 최적화 필요
        - 프로젝트 특성 - 사업비, 참여 인력, 남품 기간 등 프로젝트 특성이 서로 다르기 때문에 조정 필요
        - 구성원 능력 - 프로세스, 산출물, 방법론 등에 대한 참여 인력의 숙련도, 능력 등이 서로 다르기 때문에 조정 필요
    - 외부적 기준
        - 국제 표준 품질 기준 - 프로젝트의 대산 도메인에 따라 산출물의 국제적 품질 기준이 서로 다르기 때문에 조정 필요
        - 법적 규제 - 프로젝트의 대상 도메인에 따라 적용되는 컴플라이언스가 서로 다르기 때문에 조정 필요

### 3) 소프트웨어 개발 프레임워크

- 소프트웨어 개발 프레임워크 개념
    - 소프트웨어 개발 프레임워크는 반제품 상태인 제품을 토대로 도메인별로 필요한 서비스 컴포넌트를 사용하여 재사용성 확대와 성능을 보장받을 수 있게 하는 개발 소프트웨어이다.
    - 정보시스템을 요구 분석, 설계, 개발, 테스트하는 과정에 대한 기본 골격 또는 틀이다.
- 소프트웨어 개발 프레임워크 적용 시 기대효과
    - 테일러링 개발방법론의 기준
        - 품질 보증 - 테스트 및 검증 도구, 디자인 패턴, 보안 매커니즘 등과 같은 품질 보증을 위한 기능을 제공
        - 개발/유지보수 용이성 - 모듈화된 구조를 통해 소프트웨어 개발 및 변경에 대한 대응이 용이
        - 시스템 복잡도 감소 - 잘 정의된 구조를 통해 소프트웨어의 복잡성 감소
        - 상호 운용성 향상 - 표준화된 인터페이스와 연계 모듈을 제공하여 다른 시스템 또는 서비스와의 상호 운용성을 향상
        - 중복 예산 절감 - 공통 컴포넌트를 재사용하여 중복적인 작업을 피하고 이미 검증된 컴포넌트를 활용으로 인한 개발 속도 증가로 예산 절감

### 4) 소프트웨어 재사용

- 소프트웨어 재사용 방법
    - 합성 중심 (Composition - Based) : 전자 칩과 같은 소프트웨어 부품, 즉 블록 (모듈)을 만들어서 끼워 맞추어 소프트웨어를 완성시키는 방법으로, 블록 구성 방법이라고 함
    - 생성 중심 (Generation - Based) : 추상화 형태로 쓰여진 명세를 구체화하여 프로그램을 만드는 방법으로, 패턴 구성 방법이라 함.