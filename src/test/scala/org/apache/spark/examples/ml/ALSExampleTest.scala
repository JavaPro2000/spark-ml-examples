package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.{BeforeAndAfter, FunSuite}

class ALSExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    ALSExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
