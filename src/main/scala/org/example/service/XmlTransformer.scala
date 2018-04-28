package org.example.service

import java.io.{BufferedWriter, File, FileWriter}

import net.liftweb.json.JsonAST.JValue
import net.liftweb.json.Xml.toXml

object XmlTransformer {

  def storeToXml(loadedJson: JValue, fileName: String): Unit = {
    val jsonAsXml = toXml(loadedJson).toString()

    val file = new File(s"src/main/resources/$fileName.xml")
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(jsonAsXml)
    bw.close()
  }
}
