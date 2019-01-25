package com.laibao.spring.scala.service

import com.laibao.spring.scala.domain.Person

trait PersonService {

  def getPersonById(id:Long):Person

  def getPersonList():List[Person]

}
