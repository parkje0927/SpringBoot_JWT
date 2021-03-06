## JWT
### JWT 란?
- Header : Signature 를 해싱하기 위한 알고리즘 정보들이 담겨있다.
- Payload : 서버와 클라이언트가 주고받는 시스템에서 실제로 사용될 정보
- Signature : 토큰의 유효성 검증

<br>

- 장점 : 수평 확장 용이 데이터 스토어에 대한 의존성 없음, 범용성이 크다.
- 단점 : Payload 에 저장하는 정보가 많으면 트래픽이 커지고, 토큰이 클라이언트에 저장되어 서버에서 조작할 수 없다.

### 설명
- HS512 알고리즘을 사용하기 때문에 Secret Key 는 64Byte 이상이 되어야 한다. 
- 토큰의 만료시간은 86400초로 설정
- 참고로 이 값은 Secret Key 를 Base64 로 인코딩한 값을 사용했다.