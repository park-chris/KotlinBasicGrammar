
// Kotlin은 세 가지 주석을 지원한다.

// 한 줄 주석 : //로 시작하며 줄이 끝나면 주석도 끝난다.

/* 
여러 줄 주석 
*/

/** 
KDoc 여러 줄 주석
자바독(Javacdoc)과 비슷한 리치 텍스트 문서를 생성하기 위해 사용
*/



// 사용자에게 정수 두 개를 물어보고 그 두 수의 합을 표시하는 프로그램

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    println(sum)
}