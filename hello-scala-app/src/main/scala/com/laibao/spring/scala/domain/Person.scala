package com.laibao.spring.scala.domain

import scala.beans.BeanProperty

case class Person (@BeanProperty var id:Long, @BeanProperty var name: String, @BeanProperty var age:Int, @BeanProperty var country:String)
