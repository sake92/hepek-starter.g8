package $package$

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Name of the project" should "be $name$" in {
    "$name$" shouldEqual "$name$"
  }
}