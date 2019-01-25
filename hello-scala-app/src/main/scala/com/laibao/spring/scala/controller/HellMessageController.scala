package com.laibao.spring.scala.controller

import com.laibao.spring.scala.domain.Message
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}


@RestController
@RequestMapping(value = Array("/message"))
class HellMessageController {

  @Value("${hello.message}")
  var helloMsg:String = _

  @GetMapping(value = Array("/hello"))
  def helloMessage(): Message = {
    val message = new Message
    message.value = helloMsg
    message
  }

}
