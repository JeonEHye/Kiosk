package com.example.kiosk

//Lv4. 예외처리, 문자 입력한 경우
//        try {
//
//            println("내가 입력한 숫자는 ${myHouseWork}입니다.")
//        } catch (e:java.lang.NumberFormatException){
//            println("숫자를 입력하세요.")
//        }

//Lv2. 필요한 클래스 설계 (집안일> 청소, 요리, 그외), 프로퍼티, 메소드 정의
open class HouseWork(name:String,time:Int) {
    var name: String
    var time: Int

    init {
        this.name=name
        this.time=time
    }
    fun displayInfo(){
        println(" ")
        println("선택한 것은 ${name}입니다.")
        println("걸리는 각각 시간은 ${time}분 입니다.")
    }
}

// 객체: 클래스 타입으로 선언된 것들 , 인스턴스: 객체를 실체화하면 인스턴스 생성 -> 메모리 공간 차지
// class 클래스 이름{
// 프로퍼티(클래스: 정보)
// 메소드(이름이 붙은 로직: 행위)
// - 주 생성자(init: 한가지의 형태로 클래스를 실체화할 때 활용)
// - 보조 생성자(Constructor: 여러 형태로 클래스 실체화할 때)
// }

//class Student(name: String, age: Int) {
//    var name: String
//    var age: Int
//
//    init {
//        this.name = name
//        this.age = age
//    }
//
//    fun displayInfo() {
//        println("이름은 ${name} 입니다")
//        println("나이는 ${age} 입니다")
//    }
//}
