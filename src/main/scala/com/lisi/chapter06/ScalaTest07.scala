package com.lisi.chapter06

class ScalaTest07 {

}

object ScalaTest08{
  val names = List("Alice", "Bob", "Nick");
  def upper( s : String ) : String = {
    s. toUpperCase
  }

  def find( s : String )  = {
    s.startsWith("A")
  }

  def main(args: Array[String]): Unit = {
      println(names.map(upper))
      println(names.flatMap(upper))
      println(names.filter(find))
  }
}
