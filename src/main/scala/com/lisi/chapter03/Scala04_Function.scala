package com.lisi.chapter03

// 导包时下划线等同于java的星号
// scala中的包不仅仅用于管理类，还可以当成对象使用，所以导包的时候，等同于把包对象引入到当前环境中
// 所以包对象中声明的函数可以直接调用
import scala.math._

object Scala04_Function {
    def  sum(num01:Int=20,num02:Int=30){
        println(num01+num02)
    }

    def sum02(args:Int*){
        var result=0;
        for (arg<-args){
            result+=arg;
        }
        println("result="+result)
    }

    def  sum03(num01:Int=20,num02:Int=30)={
        num01+num02
    }

    def main(args: Array[String]): Unit = {
        println(sqrt(100))
        println("****")
        sum(num02 = 50);
        sum02(1,2,3)
        //BigInt.probablePrime(16, scala.util.Random)
    }
}
