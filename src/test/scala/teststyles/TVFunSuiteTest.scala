package teststyles

import baseclasses.FunSuiteBaseClass
import classestotestagainst.TV

class TVFunSuiteTest extends FunSuiteBaseClass {

  test("A new tv should be powered off") {
    assert(!(new TV).isOn())
  }

  test("After pressing power button on a tv that is off, tv should power on") {
    val tv = new TV
    tv.turnTVOn()
    assert(tv.isOn())
  }


}
