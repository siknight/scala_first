package com.lisi.chapter01

object MethodScala {
  def main(args: Array[String]): Unit = {
      f1();
    var a=f2 (1,2);
    println("a="+a);
    var b=f3;

    println("b="+b);

    var c=f3  _ //在函数后面加下划线表示将函数当成类型赋值，而不会执行；
                //也相当于把变量c当成了一个f3的函数名，可以直接用c代替f3
    println("cwww="+c);
    c()

    var d=f4  _ //在函数后面加下划线表示将函数当成类型赋值，而不会执行；
    println("dwww="+d);
    d()
    println("-----------")
    d()()

  }

  def  f1(): Unit ={
    println("hello world");
  }

  def  f2(a:Int,b:Int) ={
    a+b;
  }

  def f3(): Unit ={
    f1
  }

  def f4() ={
    f1 _  //这种写法相当于把函数当返回值了
  }

}
