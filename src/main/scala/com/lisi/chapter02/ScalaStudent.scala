package com.lisi.chapter02
import scala.math._
class ScalaStudent extends ScalaPerson {






}

object  test{
  def main(args: Array[String]): Unit = {
    var student=new ScalaStudent();
    student.name="jiang";
    println("name="+student.name)
    student.hello();


    println(sqrt(100));
  }
}


