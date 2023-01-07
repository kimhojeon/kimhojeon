package com.example.ex_1228empty
//코틀린의 경우 기본생성자  constructor(리턴값:타입)
/*class Human constructor(val name: String)*/
//open을 통해 상속해줄 수 있음
open class Human constructor(val name: String = "abcdef"){
                                            //디폴트값으로
    //부생성자는 주생성사의 위임을 받아야함
    constructor(name:String, age:Int) : this(name){
        println("my name is ${name},${age}years old")
    }


    init {
        println("Nnew human has benn born!!")
    }


    //val name = "hojeon"
   /* 상속을 통해 나타냄 val name = name*/
    fun eatingCake() {
        println("this is Yummyyy~~~")
    }

    open fun singSong(){
        println("lalala")
    }

 //Human 클래스 상속 받기     : 상속받을 클래스
class Korean : Human(){

    override fun singSong(){
        super.singSong()
        println("라라라")
        println("my name is ${name}")

    }

}

}
fun main() {
    //자바와 다르게 객체 생성시 new 안씀
    //val human = Human()
/*    val human = Human("tayeon")
    human.eatingCake()*/
    val mom = Human("mom", 55)
    /*println("this human's name is ${human.name}")*/
    val korean = Human.Korean()
    korean.singSong()

}