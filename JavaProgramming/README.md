# Do it! Java Programming introduction
<br>

## **chapter 1**
<br>

>###  [자바 프로그래밍 시작](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter1/HelloJava.java)
Hello Java이라는 문장을 화면에 출력함
한줄 주석 연습
<br>
<br>

## **chapter 2**
<br>

>### [변수 선언 사용하기](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/Variable1.java)
- 변수를 선언하고 값을 대입하고 출력하는 프로그램

>### [변수 초기화](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/Variable2.java)
- level 변수를 선언함과 동시에 값 10을 변수에 넣어는 프로그램

>### [문자형 연습](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/CharacterEx1.java)
- 변수 ch1에 저장된 문자를 int형으로 변환하여 출력하여 그 문자에 대한 정수 값을 출력
- ch2의 문자형 변수에 정수 값을 대입하면 그 정수 값에 해당하는 문자가 출력
- ch3의 정수형 변수를 문자형으로 변환하여 출력하면 그 정수 값에 해당하는 문자가 출력

>### [문자형 연습 2](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/CharacterEx2.java)
- ch1에 있는 한을 출력해줌
- '\uD55c'는 '한'이라는 글자의 유니코드 값임

>### [문자형 연습 3](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/CharacterEx3.java)
- char형으로 선언한 변수에 음수 값을 대입하면 오류가 발생함
- 음수 값을 대입한 정수형 변수 b를 char로 출력하면 물음표(?)가 출력되는데 알 수 없는 문자라는 의미임

>### [부동 소수점 방식의 오류](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/DoubleEx2.java)
- 지수와 가수로 나타내는 부동 소수점 방식은 지수로 표현되는 값이 0을 나타낼수없음 따라서 부동 소수점 값을 연산하면 약간의
오차가 발생함
- 약간의 오차를 감수하고라도 더 넓은 범위의 실수 값을 표현하기 위해 부동 소수점 방식을 사용함

>### [실수형 연습](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/DoubleEx1.java)
- double으로 컴퓨터 내부에 저장되어 dnum값에 대입 됨
- fnum의 F는 식별자 역할을 함

>### [논리형 연습](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/BooleanEx.java)
- boolean형 변수 하나를 선언하고 출력
- boolean형 변수는 true 나 false만 대입할 수 있고 그 결과 값도 true,false로 출력됨

>### [자료형 추론](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/TypeInference.java)
>지역 변수 자료형 추론 - 자료형을 쓰지 않고도 변수를 사용
주의 사항
- 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없음
- var로 자료형 없이 변수를 선언하는 방법은 '지역 변수'만 가능함

>### [상수 사용하기](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/Constant.java)
상수를 사용하면 편리한 이유
- 프로그램 내부에서 반복적으로 사용하고, 변하지않아야 하는 값을 상수로 선언하여 사용
- 상수로 선언하여 사용했다면 상수를 선언한 부분의 값만 변경하여 주면 됨

>### [형 변환 - 묵시적 형 변환](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/ImplicitConversion.java)
형 변환의 기본 원칙
- 바이트의 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어짐
- 덜 정밀한 자료에서 더 정말한 자료형으로 형 변환은 자동으로 이루어짐
주의 사항
-바이트가 큰 자료형에서 작은 자료형으로 형 변환이 이루어질 경우 자료 손실이 발생할수있음

>### [형 변환 - 명시적 형 변환](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter2/ExplicitConversion.java)
9행과 10행의 계산 값이 다른 이유
- 9행  : 1과 0으로 변형된 값을 합하여 결과 값이 1이됨
- 10행 : dnum과 fnum의 값인 1.2와 0.9을 합하여 2.1이 된 값을 변환하여 2가 됨

<br>
<br>

## **chapter 3**
<br>

>### [산술 연산자](https://github.com/jong-seoung/javaProgramming/blob/main/JavaProgramming/src/chapter3/OperationEx1.java)
```
산술 연산자를 사용하여 총점과 평균 구하기
+ : 두 항을 더함
- : 앞에 있는 항에서 뒤에 있는 항을 뺌
* : 두 항을 곱함
/ : 앞에 있는 항에서 뒤에 있는 항을 나누어 몫을 구함
% : 앞에 있는 항에서 뒤에 있는 항을 나누어 나머지를 구함
```