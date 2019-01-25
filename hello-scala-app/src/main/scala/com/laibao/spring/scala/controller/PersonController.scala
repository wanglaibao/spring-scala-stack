package com.laibao.spring.scala.controller

import com.laibao.spring.scala.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}

import scala.collection.JavaConverters._

@RestController
@RequestMapping(value = Array("/person"))
class PersonController {

  @Autowired
  private var personService:PersonService = _

  @GetMapping(value = Array("/single/{id}"))
  def getPersonById(@PathVariable id:Long)= personService.getPersonById(id)


  /*
   def accounts() : java.util.List[Device] =  {
    devices.toList.asJava
  }
   */

  @GetMapping(value = Array("/all"))
  def getAllPersons() = {
    val personList = personService.getPersonList
    personList.foreach(person => println(person.age+" "+person.name))
    personList.asJava
  }

}
