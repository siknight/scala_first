package com.lisi

import scala.beans.BeanProperty


// 如果主构造器无参数，小括号可省略
// 构造器也是方法（函数），传递参数和使用方法和前面的函数部分内容没有区别
class Person() {
  // 执行主构造器时，类体中所有语句都会执行
  var name ="20"
  def wode(): Unit ={
    println("hello wode")
  }
  // 辅助构造器无论是直接或间接，
  // 最终都一定要调用主构造器，执行主构造器的逻辑
  def this(name2:String){
    this(); // 必须有，且必须放在第一行
    name=name2;

  }

}

// 如果主构造器无参数，小括号可省略
// 构造器也是方法（函数），传递参数和使用方法和前面的函数部分内容没有区别
class Person2(p:String) {
  // 执行主构造器时，类体中所有语句都会执行
 println("p="+p)
  var age=20;
  def this(name2:String,age2:Int){
    this(name2); // 必须有，且必须放在第一行
            // 调用之前已经声明过该构造器
    age=age2;

  }
}


object Person2{
  def apply(p: String): Person2 = new Person2(p)
}


class Person3 private () {
  // 执行主构造器时，类体中所有语句都会执行
  var name ="20"
  def wode(): Unit ={
    println("hello wode")
  }
  // 辅助构造器无论是直接或间接，
  // 最终都一定要调用主构造器，执行主构造器的逻辑
  def this(name2:String){
    this(); // 必须有，且必须放在第一行
    name=name2;

  }

}

class  person04(){
  @BeanProperty var age=20
}


object  mainTest{
  def main(args: Array[String]): Unit = {
    // 当使用new构建对象时，等同于调用类的主构造器
    var person =new Person();

    println("*****************")
    new Person2("nihao");
    println("*****************")
    println("name="+new Person3("22").name)
    println("******222222")
    val person2=Person2("66");
    println("person2="+person2.age)
  }
}

object  mainTest02 extends  App {
  println("aaaa")
  var aa=new person04();
  aa.setAge(20);
  println("aa="+aa.getAge)
}