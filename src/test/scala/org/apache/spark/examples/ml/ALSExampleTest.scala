package org.apache.spark.examples.ml

import org.scalatest.{BeforeAndAfter, FunSuite}

class ALSExampleTest extends FunSuite with BeforeAndAfter {

  test("testMain") {
    ALSExample.main(null)
  }

  before {
    SparkTestUtils.initTestEnv()
  }

}
