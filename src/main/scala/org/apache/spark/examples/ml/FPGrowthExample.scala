package org.apache.spark.examples.ml

import org.apache.spark.ml.fpm.FPGrowth
import org.apache.spark.sql.SparkSession

object FPGrowthExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName(s"${this.getClass.getSimpleName}")
      .getOrCreate()
    import spark.implicits._

    // Prepare training data.
    val training = spark.createDataset(Seq(
      "1 2 5",
      "1 2 3 5",
      "1 2")
    ).map(t => t.split(" ")).toDF("items")

    val fpgrowth = new FPGrowth().setItemsCol("items").setMinSupport(0.5).setMinConfidence(0.6)
    val model = fpgrowth.fit(training)

    // Display frequent itemsets.
    model.freqItemsets.show()

    // Display generated association rules.
    model.associationRules.show()

    // Prepare test data.
    val test = spark.createDataset(Seq(
      "1 2 5",
      "1 2 3 5",
      "1 2",
      "2 5",
      "2 3")
    ).map(t => t.split(" ")).toDF("items")

    // transform examines the input items against all the association rules and summarize the
    // consequents as prediction
    model.transform(test).show()

    spark.stop()
  }
}