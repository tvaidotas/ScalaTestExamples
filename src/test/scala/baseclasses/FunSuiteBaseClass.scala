package baseclasses

import org.scalatest._
import org.scalatestplus.mockito.MockitoSugar

abstract class FunSuiteBaseClass extends FunSuite with Matchers
  with OptionValues with Inside with Inspectors with MockitoSugar with BeforeAndAfter
