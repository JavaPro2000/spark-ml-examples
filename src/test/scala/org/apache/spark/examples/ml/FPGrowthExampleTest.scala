package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.{BeforeAndAfter, FunSuite}

class FPGrowthExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    FPGrowthExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
