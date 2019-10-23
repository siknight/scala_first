package com.lisi.chapter03

object Scala06_for {
  def main(args: Array[String]): Unit = {
    //范围数据循环1：to左右两边为前闭后闭的访问
    for(i <- 1 to 3){
      print(i + " ")
    }
    //范围数据循环2：until左右两边为前闭后开的访问
    println("bbbbbbbbb")
    for(i <- 1 until 3) {
      println(i + " ")
    }


    println("*********")
    for (i<-1 to 3){
      println("i="+i)
    }

    println("2222222222")
    for (i<-1 until  3){
      println("i="+i)
    }

    //循环守卫：引入循环保护式（也称条件判断式，守卫）
    println("3333333333")
    for (i<-1 to 3;if i!=2){
      println("i="+i)
    }
    //引入变量
    println("4444444444")
    for (i<-1 to 3;j=i+1){
      println("j="+j)
    }

    //嵌套循环
    for (i <-1 to 3;j<-1 to 3){
      println(i+"*"+j+"="+i*j)
    }

    //使用花括号{}代替小括号()：
    for{
      i <- 1 to 3
      j = 4 - i}
      print(i * j + " ")

  }

  print("555555555555555")


}
