package org.example.domain


case class Impression(id: String, requestId: String, timestamp: String, bidId: String) {
  override def toString: String = s"id = $id | requestId = $requestId | timestamp = $timestamp | bidId = $bidId"
}
