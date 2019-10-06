package com.lisi.chapter01

object SecScala {

  def main(args: Array[String]): Unit = {

    // var关键字表示声明的值可以改变，而val关键字声明的变量表示值无法改变
    var a:Int = 10;
    a=11;
    println("a="+a)
    val b=20;
    println("b="+20);
  }

}
