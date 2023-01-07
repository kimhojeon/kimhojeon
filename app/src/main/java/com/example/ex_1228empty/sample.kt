package com.example.ex_1228empty

import androidx.annotation.Nullable

fun main(){
    testNulls("")
    ignoreNulls("gg")
    nullcheck()
    forAndWhile()

    //1.
    //helloworld()
    //print(add(4,5))

    //3. String Template
    val name = "hojeon"
    val lastname = "kim"
    //${변수}사용
    println("my name is ${name + lastname} i'm 25")
    println("is this true? ${1==0}")
    //\$ 그냥 $사용할때
    println("this is 2\$a")

    checkNum(1)


}

// 변수명을 타입보다 먼저 적어준다

// 1. 함수
//리턴값이 없을 때 unit 생략 무방
fun helloworld() : Unit{
    println("hello world!")
}

//리턴 타입있을때  지정해줘야 함
fun add(a: Int, b: Int) : Int{
    return a+b
}

//2 val vs var
//val = value 값, 값을 재정의 할 수 없다
//var 재정의, 할당 가능하다
fun hi(){
    val a: Int = 10
    var b : Int = 9
    b = 100

    var e :String

    val c = 100
    var d = 200
    var name = "hojeon"
}
//4 조건식
fun maxBy(a:Int,b:Int): Int{
    if(a>b){
        return a
    }else{
        return b
    }
}
fun maxBy2(a:Int,b:Int) = if(a>b) a else b
// 위아래 모두 같은 식이다

fun checkNum(score:Int){
    when(score){
        0-> println("this is 0")
        1-> println("this is 1")
        2,3-> println("this is 2 or 3")
    }
    var b= when(score){
        1-> 1
        2-> 2
        else -> 3
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement
//코틀린은 Expression이며 리턴값이 없어도 unit 반환(값 반환)
// if, when Statement로 가능 (명령제시)

// 5. Array and List
// Array :
// List 1 List(수정불가능) 2MutableList(수정가능)
fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3,4f)
    val list2 = listOf(1,"d",11L)
    array[0] = 3
    val result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    //주소값 같음, 담아둔 것을 재할당 불가능함
}

// 6. For /While
fun forAndWhile(){
    val students = arrayListOf("chalie","tayeon","sam","sohyang")

    for (name in students ){
        println("${name}")
    }
    //step , downTo,Until(마지막숫자미포함)
    var sum: Int = 0
    for ( i in 1..10) {
        sum = sum+i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("carrnet index: ${index}")
        index++
    }

    for ((index ,name) in students.withIndex()){
        println("${index+1}번째학생 : ${name}")
        }

    }
// 7. Nulable / NonNull
fun  nullcheck(){
    //NPE:Null pointer Exception => 자바에서는 런타이에서만 잡힘
    var name :String = "hojeon"

    // 타입?붙여준다
    var nullName : String? = null
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase  = nullName?.toUpperCase()

    // ?:

    val lastName : String? = null
    val fullName = name+" " + (lastName?: "No lastName")
    println(fullName)

}
//!! null아 아니다 확실하지않은 이상 지양
fun ignoreNulls(str:String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    //let함수 null아니면 옮겨준다
    //null타입일때 이메일 있을때 없을 때 실습해보기
    val email:String = "hojeon@naver.com"
    email?.let {
        println("my email is ${email}")
    }
}
//null일떄도 실행됨
fun testNulls(str:String?){
    val Nullable : String? = null
    val upper = Nullable?.toUpperCase()
    val adress:String = "here"
    adress?.let{
        println("my adress is ${adress}")
    }

}





