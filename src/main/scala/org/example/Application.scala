package org.example


import net.liftweb.json.JsonAST.JValue
import org.example.domain.{Click, Impression}
import org.example.service.{JsonExtractor, XmlTransformer}

object Application {

  def main(args: Array[String]): Unit = {

    processClicks()

    println

    processImpressions()
  }

  private def processClicks(): Unit = {

    val loadedClicks: JValue = JsonExtractor.loadJSON("src/main/resources/clicks.json")
    println(loadedClicks)

    val extractedClicks: List[Click] = JsonExtractor.jsonListToObj[Click](loadedClicks)
    extractedClicks.take(1).foreach(println)

    XmlTransformer.storeToXml(loadedClicks, "clicks")
  }

  private def processImpressions(): Unit = {

    val loadedImpressions: JValue = JsonExtractor.loadJSON("src/main/resources/impressions.json")
    println(loadedImpressions)

    val extractedImpressions: List[Impression] = JsonExtractor.jsonListToObj[Impression](loadedImpressions)
    extractedImpressions.take(1).foreach(println)

    XmlTransformer.storeToXml(loadedImpressions, "impressions")
  }


}


