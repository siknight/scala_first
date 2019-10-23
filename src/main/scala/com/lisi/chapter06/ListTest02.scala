package com.lisi.chapter06

class ListTest02 {

}

object LTest{
  def main(args: Array[String]): Unit = {
    val value1=List(1);
    println(value1)
    val value02=9+:List(1);
    println("value2="+value02)
    val value03=value02:+20;
    println(value03)
    println("****")
    var list04=1::2::3::4::value1::Nil
    println("list04="+list04)

  }
}
