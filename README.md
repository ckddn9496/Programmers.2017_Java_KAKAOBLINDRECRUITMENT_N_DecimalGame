# Programmers.2017_Java_KAKAOBLINDRECRUITMENT_N_DecimalGame

## 프로그래머스 2017 카카오 블라인드 리쿠르트 > N진수게임

### 1. 문제설명

문제: https://programmers.co.kr/learn/courses/30/lessons/17687

input으로 게임을 위한 네개의 int값을 받아온다. 사람들이 둥글에 앉아 숫자를 하나씩 차례로 말하는 게임인데 0부터 시작해서 점점 커지는 숫자들의 n진수 값을 말한다.

예를 들어

10진수 일 경우
  > 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, ...

2진수 일 경우
  > 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, …

이때, 튜브가 말해야 할 숫자 t개를 문자열로 return하는 문제

input으로 받아온 값은 이를 의미한다

#### n

    숫자를 표현할 진법 (n진법)

#### t 

    미리 구할 숫자의 갯수

#### m

    게임에 참가하는 인원

#### p

    튜브의 순서

### 2. 풀이

숫자i를 n진수 값 문자열로 return 해주는 함수를 이용해 

```String java.lang.Integer.toString(int i, int radix)```

mt 의 문자열을 만들어 놓고 (p-1) + im (0 <= i < t)번째 값을 가져와 붙여 return해주었다.
