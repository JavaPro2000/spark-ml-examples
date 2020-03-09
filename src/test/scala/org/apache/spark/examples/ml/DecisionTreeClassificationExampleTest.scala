package org.apache.spark.examples.ml

import org.apache.spark.examples.util.SparkTestUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite


class DecisionTreeClassificationExampleTest extends AnyFunSuite with BeforeAndAfter {
  test("testMain") {
    DecisionTreeClassificationExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
