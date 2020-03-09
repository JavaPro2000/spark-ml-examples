package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.{BeforeAndAfter, FunSuite}

class PipelineExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    PipelineExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
