package org.example.service

import net.liftweb.json.{DefaultFormats, JValue, parse}

import scala.io.Source

object JsonExtractor {

  def loadJSON(file: String): JValue = {
    val loadedJson = Source.fromFile(file).getLines().reduceLeft(_ + _)
    val result = parse(loadedJson)
    result
  }

  def jsonListToObj[A](json: JValue)(implicit m: Manifest[A]): List[A] = {
    implicit val formats: DefaultFormats.type = DefaultFormats // Brings in default date formats etc.
    json.extract[List[A]]
  }

}
