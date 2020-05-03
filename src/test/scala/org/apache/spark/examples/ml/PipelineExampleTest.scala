package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class PipelineExampleTest extends AnyFunSuite with BeforeAndAfter {

  test("PipelineExampleTest") {
    PipelineExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
