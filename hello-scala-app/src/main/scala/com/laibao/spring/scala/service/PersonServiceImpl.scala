package com.laibao.spring.scala.service
import com.laibao.spring.scala.domain.Person
import org.springframework.stereotype.Service

@Service("personService")
class PersonServiceImpl extends PersonService{

  override def getPersonById(id: Long) = Person(id,"金戈",100,"中国")

  override def getPersonList() = {
    val list = List(Person(1,"金戈1",100,"中国"),
                    Person(2,"金戈2",101,"日本"),
                    Person(3,"金戈3",102,"美国"),
                    Person(4,"金戈4",103,"俄罗斯"))
    list
  }


}
