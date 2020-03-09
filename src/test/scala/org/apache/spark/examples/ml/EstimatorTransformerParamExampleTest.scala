package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.{BeforeAndAfter, FunSuite}

class EstimatorTransformerParamExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    EstimatorTransformerParamExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
