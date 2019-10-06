package com.lisi.chapter01
// Scala（强类型语言，完全面向对象的语言，所以没有静态语法操作）
//.scala ==>>.class
//Scala采用object来代替静态操作
//有main方法要用object
//scala 所有调用完成后不用写;
object FirstScala {
  //main 方法
  def main(args: Array[String]): Unit = {
    println("hello Scala");
    FirstScala.siis()
    println("sum=2"+sum2(1,2))  //没有值
    println("sum="+sum(1,2))
    println("sum3="+sum3(1,2))
    siis;
  }

  /**
    * def用于定义方法
    * :Unit=
    */
  def siis():Unit={
    println("nihoa")
  }

  /**
    * 无返回值可以直接写=
    */
  def pintmsg() ={
    println("msg01")
  }

  /**
    * 无返回值可以什么都不带
    */
  def pintmsg02(){
    println("msg02");
  }
    //Int要大写,因为是纯面向对象语言，所有类型都要大写
    //定义变量和方法都是   变量:类型
  def sum(v1 : Int,v2 : Int) : Int={
    return  v1+v2;
  }
  //Int要大写,因为是纯面向对象语言，所有类型都要大写
  //定义变量和方法都是   变量:类型
  def sum2(v1 : Int,v2 : Int) : Unit={
    return  v1+v2;
  }
  //Scala 中函数的返回值可以不用return声明
  //
  def sum3(v1 : Int,v2 : Int) ={
     v1+v2;
  }
  def sum4(v1 : Int,v2 : Int) ={
    println(v1+v2)
  }
  //总结如下：
  // 函数声明关键字为def（definition）
  // 如果函数中无返回值，那么返回值类型无需声明
  // 如果函数中有返回值，且使用return关键字声明，那么返回值类型需要声明（即使有unit，矛盾了，但是也不会报错，但是return不生效，函数的结果就是括号）
  // 如果函数有返回值，但是返回值类型没有声明，那么方法返回值由Scala自行推断（scala中函数的返回值可以不用return声明，函数会使用最后一行的结果作为函数的返回值）
  // Println函数的返回值是unit

}
