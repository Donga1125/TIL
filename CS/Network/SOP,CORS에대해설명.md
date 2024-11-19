## SOP
(SOP는 Same-Origin Policy)

SOP는 서로 다른 출처(orgin)의 리소스 접근을 제한하여 악의적인 공격으로부터 사요아 데이터를 보호하는 역할을 한다. 
origin 은 프로토콜, 도메인, 포트 번호로 정의되고 이 세가지가 모두 같아야 동일한 출처로 간주된다. 

<예시> </br>
https://example.com:443에서 로드된 웹 페이지는 https://api.example.com 또는 http://example.com의 데이터에 직접 접근할 수 없다.

| URL                      | 동일 출처 여부 |
|--------------------------|----------------|
| https://example.com:443  | 동일           |
| https://example.com:80   | 다름           |
| http://example.com:443   | 다름           |
| https://api.example.com  | 다름           |



SOP를 통해 다른 출처의 쿠키나 로컬 스토리지에 저장된 데이터를 임의로 읽는 것을 막아 브라우저를 통해 민감한 데이터를 탈취하지 못하게 한다. 
SOP의 예외 상황으로 CORS, JSONP, PostMessaageAPI 가 있다. 


## CORS 
(CORS 는 Cross Origin Resource Sharing, 교차 출처 자원 공유를 말한다.) </br>

CORS란 웹 브라우저에서 다른 출처의 리소스를 요청할 때 발생하는 보안 문제를 해결하기 위한 매커니즘이다. 
기본적으로 브라우저는 보안을 위해 출처 정책(Same-Origin Policy)을 적용해 다른 출처의 리소스 요청을 차단하는데, 
cors를 사용하면 서버가 특정 출처의 요청을 허용하도록 설정할 수 있다. 

CORS 동작 방식은 다음과 같다. 
- 클라이언트가 다른 출처의 리소스를 요청 
- 서버가 Access-Control-Allow-Origin과 같은 헤더를 확인해서 허용 여부를 응답 
- 브라우저가 서버의 응답을 확인하고 요청을 허용하거나 차단

cors 헤더의 종류는 다음과 같다.
- Access-Control-Allow-Origin: 요청을 허용할 출처를 지정.
- Access-Control-Allow-Methods: 허용할 HTTP 메서드 지정.
- Access-Control-Allow-Headers: 허용할 요청 헤더 지정.
- Access-Control-Allow-Credentials: 인증 정보를 포함한 요청 허용 여부 지정.