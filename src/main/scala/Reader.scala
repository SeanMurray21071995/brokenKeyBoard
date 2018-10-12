import scala.collection.mutable.ArrayBuffer

class Reader {
  def input():Array[String]={
    print("int:")
    try {
      var numberOfLine = readInt();
      val strinfList = ArrayBuffer.empty[String]
      for (i <- 1 to numberOfLine) {
        print(s"enter keyboard $i:")
        strinfList += readLine()
      }
      strinfList.toArray
    }
    catch{
      case e :Exception => println("You have enterd an invalid input"); Array[String]()
    }
  }
}