package com.lisi.chapter05

class Person(name2:String){
  var name ="zhangsan"
  def printName(): Unit ={
    print("name="+name)
  }

}

class  student(name2: String) extends Person(name2) {
  override def printName(): Unit = {
    print("nihoa")
  }

}

object mainTest{
  def main(args: Array[String]): Unit = {
    new student("jiang").printName()
    var stu= new student("jiang");

    println(stu.isInstanceOf[student]);

  }
}