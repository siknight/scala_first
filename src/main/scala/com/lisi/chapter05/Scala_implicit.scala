package com.lisi.chapter05

object Scala_implicit {

  implicit def a(d:Double) ={
    d.toInt
  }

  var a:Int =20.6;



  implicit var name="aa"
  def  person(implicit  name:String):String ={
    return name;
  }

  def main(args: Array[String]): Unit = {
    print("a="+a)
    println(person)
  }

}


