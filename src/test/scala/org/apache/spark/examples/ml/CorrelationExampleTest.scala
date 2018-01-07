package org.apache.spark.examples.ml

import org.scalatest.{BeforeAndAfter, FunSuite}

class CorrelationExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    CorrelationExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
