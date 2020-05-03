package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class ALSExampleTest extends AnyFunSuite with BeforeAndAfter {

  test("ALSExampleTest") {
    ALSExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
