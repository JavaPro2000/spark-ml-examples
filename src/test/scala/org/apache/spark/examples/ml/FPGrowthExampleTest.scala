package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class FPGrowthExampleTest extends AnyFunSuite with BeforeAndAfter {

  test("FPGrowthExampleTest") {
    FPGrowthExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
