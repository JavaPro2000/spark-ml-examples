package org.apache.spark.examples.ml

import org.scalatest.{BeforeAndAfter, FunSuite}

class FPGrowthExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    FPGrowthExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
