package com.example.ex_1228empty


// 1 lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 (자바)익명함수이다
//1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int)
//2) return 값으로 사용할 수 있다


//람다의 기본정의
//val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name: String, age : Int ->
    "my name is ${name} i'm ${age}"
}
fun main(){
    println(square(12))
    println(nameAge("hojeon",25))
    val a = "hojeon said"
    val b = "lenovo said"
    println(a.pizzaGreat())
    println(b.pizzaGreat())
    println(extendString("yuna", 33))
    println(calcuateGrade(98))



    val lamda ={number : Double ->
        number == 4.323
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))
    //위에 식과 같은 거 마지막파라미터가 람다식이고 ()파라미터가 없을때 사용가능함
    invokeLamda {it >  3.22 }

}
// 확장함수
val pizzaGreat : String.() -> String = {
    this +"pizza is the best"
}
fun extendString(name : String,age :Int): String{
    // this가 가르 키는 것은 확장함수오브젝트,it은 여기서 String.(Int)에  Int로 하나들어가는 파라미터는 생략가능하다
    val introduceMyself :  String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}
//람다의 Return
val calcuateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 ->"perfect"
        else -> "error"
    }
}
// 람다룰 표현하는 여러가지 방법

fun invokeLamda(lamda :  (Double) -> Boolean) : Boolean{
    return lamda(5.2343)
}
