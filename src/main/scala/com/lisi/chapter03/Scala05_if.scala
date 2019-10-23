package com.lisi.chapter03
//注：Scala中任意表达式都是有返回值的，也就意味着if else表达式其实是有返回结果的，
//具体返回结果的值取决于满足条件的代码体的最后一行内容
import util.control.Breaks._
object Scala05_if {
  def main(args: Array[String]): Unit = {

    var a=1;
    var result=if (a==0){
      println("true"); // 此处为满足条件逻辑的最后一行内容，打印语句是没有返回值的
    }else{
      "false"; //此处为不满足条件逻辑的最后一行内容，此处返回值为字符串String
    }

    println("result="+result);


    var sum=0;
    var i=0;
    while (i<10){
      sum=sum+i;
      if(i==9){
//        break();
      }
      i+=1;
    }
    println("sum="+sum)

    println("***********")
    var n = 1;
    var n2=1;
    breakable{ //有break()方法，而没有breakable，程序会抛异常
      while (n2<10){
        if (n2==2){
          break();
        }
        println("n2="+n2);
        n2+=1;
      }

    }
    val while1 = while(n <= 10){
      n += 1
    }
    println(while1)
    println(n)
  }
}
