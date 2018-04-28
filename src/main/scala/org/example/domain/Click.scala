package org.example.domain

case class Click(id: String, requestId: String, bidId: String, timestamp: String) {
  override def toString: String = s"id = $id | bidId = $bidId | timestamp: $timestamp"
}

