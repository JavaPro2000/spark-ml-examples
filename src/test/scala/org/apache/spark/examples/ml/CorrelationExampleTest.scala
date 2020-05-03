package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class CorrelationExampleTest extends AnyFunSuite with BeforeAndAfter {

  test("CorrelationExampleTest") {
    CorrelationExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
