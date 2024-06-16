package com.example.kiosk

fun main(){
    var myHouseWork=0
    val toDayList= mutableListOf<String>()
    val cleaning=Cleaning("청소",30)
    val cooking=Cooking("요리",20)
    val etc=Etc("그 외",10)

    // Lv3. 컬렉션 List(하나의 리스트 객체로 모든 메뉴들을 관리하도록 수정)
    val houseWorkList= mutableListOf(cleaning,cooking,etc)

//Lv0. 요구사항별 기능 등
    println("오늘의 집안일을 선택하세요.")
    println("***************************")
    println("청 소 1 - 거실 / 시간 : "+houseWorkList[0].time+"분")
    println("     2 - 주방 / 시간 : "+houseWorkList[0].time+"분")
    println("     3 - 욕실 / 시간 : "+houseWorkList[0].time+"분")
    println("     4 - 기타 / 시간 : "+houseWorkList[0].time+"분")
    println("요 리 1 - 국 / 시간 : "+houseWorkList[1].time+"분")
    println("     2 - 반찬 / 시간 : "+houseWorkList[1].time+"분")
    println("     3 - 간식 / 시간 : "+houseWorkList[1].time+"분")
    println("그 외 1 - 빨래 / 시간 : "+houseWorkList[2].time+"분")
    println("     2 - 식물 물주기 / 시간 : "+houseWorkList[2].time+"분")
    println("***************************")

//Lv1. 메뉴판 번호, 세부 메뉴, 반복문
    println("대분류 메뉴 중에서 선택하세요.")
    println("[1]청소, [2]요리, [3]그 외, [0]오늘은 쉬자!")

    while(true){
        //Lv4. 예외처리
        while(true){
            try {
                myHouseWork = readln().toInt()
                if (myHouseWork/1 == myHouseWork) {
                    break
                }
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 입력하세요.")
            }
        }
        when(myHouseWork){
            1->{
                cleaning.displayInfo() /*부모 클래스에 있는 내용*/
                cleaning.order() /*자식 클래스에 있는 내용*/
                var addList= readln().toInt()
                while (true){
                    when(addList){
                        1 -> {
                            toDayList.add("거실 청소")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        2 -> {
                            toDayList.add("주방 청소")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        3 -> {
                            toDayList.add("욕실 청소")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        4 -> {
                            toDayList.add("기타 청소")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        9 -> {
                            println(" ")
                            println("대분류 메뉴로 이동되었습니다. 원하는 것을 선택하세요.")
                            println("[1]청소, [2]요리, [3]그 외, [0]이정도만 하자!")
                            break
                        }
                        else -> {
                            println("잘못된 값을 입력하였습니다.")
                            while(true){
                                try {
                                    addList= readln().toInt()
                                    if (addList/1 == addList) {
                                        break
                                    }
                                } catch (e: java.lang.NumberFormatException) {
                                    println("숫자를 입력하세요.")
                                }
                            }
                        }
                    }
                }
            }
            2->{
                cooking.displayInfo()
                cooking.order()
                var addList= readln().toInt()
                while (true){
                    when(addList){
                        1 -> {
                            toDayList.add("국 요리")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        2 -> {
                            toDayList.add("반찬 요리")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        3 -> {
                            toDayList.add("간식 요리")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        9 -> {
                            println(" ")
                            println("대분류 메뉴로 이동되었습니다. 원하는 것을 선택하세요.")
                            println("[1]청소, [2]요리, [3]그 외, [0]이정도만 하자!")
                            break
                        }
                        else -> {
                            println("잘못된 값을 입력하였습니다.")
                            while(true){
                                try {
                                    addList= readln().toInt()
                                    if (addList/1 == addList) {
                                        break
                                    }
                                } catch (e: java.lang.NumberFormatException) {
                                    println("숫자를 입력하세요.")
                                }
                            }
                        }
                    }
                }
            }
            3->{
                etc.displayInfo()
                etc.order()
                var addList= readln().toInt()
                while (true){
                    when(addList){
                        1 -> {
                            toDayList.add("빨래")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        2 -> {
                            toDayList.add("식물 물주기")
                            println("선택 되었습니다.")
                            addList= readln().toInt()
                        }
                        9 -> {
                            println(" ")
                            println("대분류 메뉴로 이동되었습니다. 원하는 것을 선택하세요.")
                            println("[1]청소, [2]요리, [3]그 외, [0]이정도만 하자!")
                            break
                        }
                        else -> {
                            println("잘못된 값을 입력하였습니다.")
                            while(true){
                                try {
                                    addList= readln().toInt()
                                    if (addList/1 == addList) {
                                        break
                                    }
                                } catch (e: java.lang.NumberFormatException) {
                                    println("숫자를 입력하세요.")
                                }
                            }
                        }
                    }
                }
            }
            0->{
                break
            }
            else->{
                println("잘못된 값을 입력하였습니다.")
            }
        }
    }
    println("선택한 일목록:")
    for(item in toDayList) println(message = "$item")
    println("프로그램을 종료합니다.")
}

//    addList= readLine()!!.toInt()
//    println("일이 추가되었습니다.")
//    val toDayList= emptyList<String>()