package com.example.kiosk

// Lv3. 상속과 컬렉션
// cooking(상속받을 자식 인자) : 아빠 클래스(부모 인자명만)
class Etc(name:String,time:Int):HouseWork(name,time){
    fun order(){
        println(" ")
        println("그 외의 상세 메뉴")
        println("실행할 일을 선택하세요.")
        println("[1]빨래, [2]식물 물주기, [9]이거 말고 다른거")
    }
}