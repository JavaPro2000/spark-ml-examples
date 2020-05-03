package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class EstimatorTransformerParamExampleTest extends AnyFunSuite with BeforeAndAfter {

  test("EstimatorTransformerParamExampleTest") {
    EstimatorTransformerParamExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
