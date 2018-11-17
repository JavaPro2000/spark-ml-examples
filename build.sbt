name := "spark-ml-examples"

version := "1.0.0"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.scalatest" % "scalatest_2.11" % "3.0.4" % "test",
  "org.apache.commons" % "commons-exec" % "1.3" % "test"
)