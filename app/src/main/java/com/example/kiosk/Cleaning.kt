package com.example.kiosk

// Lv3. 상속과 컬렉션
// cooking(상속받을 자식 인자) : 아빠 클래스(부모 인자명만)
class Cleaning(name:String,time:Int):HouseWork(name,time){
    fun order(){
        println(" ")
        println("청소의 상세 메뉴")
        println("실행할 일을 선택하세요.")
        println("[1]거실, [2]주방, [3]화장실, [4]기타, [9]청소 말고 다른거")
    }
}