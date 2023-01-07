package com.example.ex_1228empty



//다른곳에서 사용못하게 private 사용
class Book private constructor(val id : Int, val name: String){
    // 자바의 staic대신 사용 정적인 메소드, 정적인 변수 선언할때 사용한다
    companion object BookFactory: Idprovider{
        override fun getId(): Int {
            return 44
        }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

//인터페이스 상속
interface Idprovider{
    fun getId(): Int
}


fun main(){
    //company  생략가능함
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}