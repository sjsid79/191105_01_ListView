package com.tjoeun.a20191105_01_listview.datas

import android.util.Log

class RoomData(roomPrice:Int, roomAddress:String, roomFloor:Int) {

    var price:Int = 0
    var address:String = ""
    var floor:Int = 1   // 음수 : 지하. -1층 : 지하 1층. 0층 : 반지하

    //기본 생성자를 호출할때 하는 행동 : init
    init {
        // this : RoomData객체가 가진.
        // 일반 변수 : 파라미터로 들어오는 변수
        this.price = roomPrice
        this.address = roomAddress
        this.floor = roomFloor
    }

    //보조 생성자. 할일이 없으면 중괄호는 없어도된다.
    constructor() : this(0,"미입력",0){
        Log.d("룸데이터", "보조생성자(빈칸) 호출")
    }

    constructor(address:String) : this(-1, address, -1){
        Log.d("룸데이터", "보조생성자(주소만) 호출")
    }

}