package com.laibao.spring.scala.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloScalaController {

  @GetMapping(value = Array("/helloScala"))
  def helloGreeting={
    """
      |Welcome to Scala World!
      |This is first scala spring boot application!
      |Scala is easy to learn!
    """.stripMargin
  }

}
