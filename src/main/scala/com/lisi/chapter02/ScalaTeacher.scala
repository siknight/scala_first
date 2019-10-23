package com.lisi.chapter02

 class ScalaTeacher extends  ScalaPlay {
   override def init(): Unit = {
     println("nihoa")
   }

   def  test(){
      init()
   }
 }

object test01{
  def main(args: Array[String]): Unit = {
    new ScalaTeacher().test()
  }
}


