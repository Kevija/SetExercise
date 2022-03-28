object SetExercise extends App {

  // write a pangram tester
  //https://en.wikipedia.org/wiki/Pangram
  //check if text contains every letter of an alphabet at least once
  //for this task consider upuper and lower case the same
  def isPangram(text:String, alpha:String="abcdefghijklmnopqrstuvwxyz"):Boolean = {

    val myTextSet = text.toLowerCase().toSet
   println(myTextSet)

    //val alphaSet = alpha.toSet
  //  println(alphaSet)

   // val check = myTextSet & alphaSet
   // check.subsetOf(alphaSet)

    alpha.toSet.subsetOf(myTextSet)

  }

  val myTestText = "The five boxing wizards jump quickly."
  println(isPangram(myTestText)) //should be true

}


