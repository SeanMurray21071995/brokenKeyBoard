import scala.io.Source

class Checker(val toBeChecked: Array[String]) {
  val dictionary = Source.fromFile("C:\\Users\\Admin\\IdeaProjects\\brokenKeyBoard\\src\\word.txt").getLines.toArray
  for(i<-0 to toBeChecked.length-1)
  {
    val toBeSet=toBeChecked(i).toSet
    try {
      val anwser = dictionary.filter(element => element.toSet.subsetOf(toBeSet)).reduceLeft((a, b) => if (a.length > b.length) a else b)
      println(toBeChecked(i) + " = " + anwser)
    }
    catch{
      case e: Exception => println("Unfortuantly there are no words you can make with: "+toBeChecked(i))
    }
  }
}
