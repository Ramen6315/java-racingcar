# java-racingcar
자동차 경주 게임 미션 저장소

## 문자열 덧셈 계산기
요구사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
- 문자열을 입력 받는다
    - 예외사항
        - 숫자 또는 슬래쉬로 시작하지 않는 문자열은 RuntimeException 예외를 throw 한다.
        - 숫자로 시작하는 문자열의 구분자는 , 또는 : 만 허용된다.
        - 커스텀 구분자를 // 와 \n 로 감싸지 않으면 RuntimException 예외를 throw 한다.

프로그래밍 요구사항
- indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
- depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
- method가 한 가지 일만 하도록 최대한 작게 만들어라.
- else를 사용하지 마라.

## 자동차 경주
### 기능 요구사항
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - 횟수는 음수이면 안된다.
    - 횟수는 양의 정수이어야 한다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    - 이름에는 쉼표를 제외한 모든 문자가 포함 가능하다.
    - 길이가 5 이하인 문자열이면 자동차 이름으로 할 수 있다.
    - 공백 또는 쉼표로 시작하는 문자열을 입력하면 안된다.(ex:  ,lavine)
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

### 프로그래밍 요구사항
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- indent(인덴트, 들여쓰기) depth를 3을 넘지 않도록 구현한다. 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.

### 기능 목록 및 commit 로그 요구사항
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

### 기능 목록
- Car
    - 자동차 한대를 나타내는 클래스
- InputRacingInformation
    - 자동차 경주에 필요한 정보를 입력받는 클래스
- OutputRacingView
    - 자동차 경주 과정, 결과를 나타내는 클래스
- Race
    - 자동차 경주를 하는 클래스
- RacingGame
    - 자동차 경주게임을 실행하는 클래스
- RacingInformationValidator
    - 입력받은 자동차 경주에 필요한 정보를 검증하는 클래스