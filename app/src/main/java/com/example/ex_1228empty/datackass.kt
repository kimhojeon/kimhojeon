package com.example.ex_1228empty

data class Ticket(val companyName :String, val name : String, var date: String,var seatNumber : Int)
//tiStrubg(), hashCode().,equals(),copy()가 만들어짐

class TicketNomal(val companyName :String, val name : String, var date: String,var seatNumber : Int)



 fun main(){
     var ticketA = Ticket("koreanAir", "hojeon", "2022-01-07", 14)

     var ticketB = TicketNomal("koreanAir", "hojeon", "2022-01-07", 14)
     println(ticketA)
     //
     println(ticketB)
     //메모리 주소값

 }