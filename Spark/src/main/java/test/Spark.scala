
import org.apache.log4j.Level
import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
import test.Modelo.DatosP

import scala.collection.mutable.ArrayBuffer

object Spark {

    //Logger.getLogger("org").setLevel(Level.ERROR)
    val session = SparkSession.builder().appName("Spark").master("local[1]").getOrCreate()

    def RecibeArray (array: ArrayBuffer[DatosP])  = {
      import session.implicits._
      val DataSet = Consumer.datos.toDS()
      DataSet.printSchema()
      DataSet.show(100)

  }
}