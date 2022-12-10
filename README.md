# Java Coding Interview
## LeetCode

| 번호  | 문제                                                                                                      | 코드                                                                                                                                                     |
|-----|---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1   | [Two Sum](https://leetcode.com/problems/two-sum/)                                                       | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0001-two-sum/0001-two-sum.java)                                                       |
| 20  | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)                                   | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0020-valid-parentheses/0020-valid-parentheses.java)                                   |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                                     | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0125-valid-palindrome/0125-valid-palindrome.java)                                     |
| 5   | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)           | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0005-longest-palindromic-substring/0005-longest-palindromic-substring.java)           |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)                                 | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0217-contains-duplicate/0217-contains-duplicate.java)                                 |
| 387 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0387-first-unique-character-in-a-string/0387-first-unique-character-in-a-string.java) |
| 53  | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)                                     | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0053-maximum-subarray/0053-maximum-subarray.java)                                     |
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/)                                         | [Java](https://github.com/rldnrl/java-coding-interview/blob/main/0344-reverse-string/0344-reverse-string.java)                                         |

## Java Data Structure Tip
### HashMap
- `getOrDefault(Key, DefaultValue)`: `Key`가 존재하면, 해당 `Key`의 `Value`를 반환하고, 없으면 `Default Value`로 설정한 값을 반환하는 메서드
- `computeIfAbsent(key, mappintFunction)`:

  1. `null`이 아닌 값과 관련된 Key<br>
     먼저 키가 맵에 있는지 확인한다. Key가 있고 `null`이 아닌 값이 Key와 관련된 경우 해당 값을 반환.
     
  2. 매핑 함수를 사용하여 Value 계산<br>
     또한 Key가 맵에 없거나 `null` 값이 Key와 관련된 경우 지정된 `mappingFunction`을 사용하여 값을 계산하려고 시도한다. 또한 계산된 값이 `null`이 아니면 계산된 값을 맵에 입력한다.

  3. 매핑 함수가 null을 반환하는 경우<br>
     또한 `mappingFunction`이 `null`을 반환하는 경우 맵은 매핑을 기록하지 않는다.

  4. 매핑 함수에서 예외 발생
     마지막으로 `mappingFunction`이 확인되지 않은 예외를 발생시키면 예외가 다시 발생하고 맵은 매핑을 기록하지 않는다.


### Character
- `isWhiteSpace(char c)`: `c`가 공백이면 `true`, 그렇지 않으면 `false`

### 비교 연산자
- `!=`, `==`를 사용하는 것보다, `Objects.equals()`를 사용하는 것이 좋다.
  - [Valid Anagram](https://leetcode.com/problems/valid-anagram/)을 풀었을 때, 동일한 값인데 다른 경우가 있었음.
  - `String Literal`로 할당한 값과 `String.valueOf`을 이용해서 `String` 객체로 만든 값을 비교할 때도 유용.
    - 같은 값을 담아도 `==` 연산자로 비교하면 `false를` 반환.
    - 같은 값을 `Objects.equals()`를 사용할 경우 `true`를 반환.
- 두 배열이 같은지 확인하기
  - `Arrays.equals()`를 이용하면 된다.