package teststyles

import baseclasses.FunSuiteBaseClass
import classestotestagainst.TV
import org.scalatest.BeforeAndAfter

class TVFunSuiteTest extends FunSuiteBaseClass with BeforeAndAfter  {

  var tv: TV = _

  before {
    println("before")
    tv = new TV()
  }

  test("A new tv should be powered off") {
    assert(!tv.isOn())
  }

  test("After pressing power button on a tv that is off, tv should power on") {
    tv.turnTVOn()
    assert(tv.isOn())
  }

  test("After powering off the tv should be off"){
    tv.turnTVOn()
    assert(tv.isOn())
    tv.turnTVOff()
    assert(!tv.isOn())
  }


}
