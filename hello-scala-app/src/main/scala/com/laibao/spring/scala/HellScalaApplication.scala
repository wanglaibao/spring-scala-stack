package com.laibao.spring.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class HellScalaApplication

object HellScalaApplication {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[HellScalaApplication], args:_*)
  }
}
