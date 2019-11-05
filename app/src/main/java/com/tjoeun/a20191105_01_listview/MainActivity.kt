package com.tjoeun.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191105_01_listview.datas.RoomData

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()
    }
    // Ex. 두 숫자의 함계를 리턴해주는 함수 생성
    fun sumFun(num1:Int, num2:Int):Int {
        val result = num1 + num2
        return  result
    }
    //위와 동일하게 실행된다.
//    fun sumFun(num1:Int, num2:Int) = num1 + num2


    //자바에선 레코드, 코틀린은 함수
    fun addRooms(){
        var room1 = RoomData()
        room1.price = 8000
        room1.address = "마포구 서교동"
        room1.floor = 1
        roomList.add(room1)

        //Alt를 누른상태에서 드래그하면 한번에 수정가능.
        var room2 = RoomData()
        room2.price = 28500
        room2.address = "마포구 서교동"
        room2.floor = 3
        roomList.add(room2)

        var room3 = RoomData()
        room3.price = 12000
        room3.address = "마포구 성산동"
        room3.floor = 5
        roomList.add(room3)
    }




}
