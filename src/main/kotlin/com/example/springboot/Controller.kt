package com.example.springboot

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping(path = ["/test"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTest(): ResponseEntity<SomeDto> {
        return ResponseEntity.ok()
                .eTag("someEtag")
                .body(SomeDto("foo", 42))
    }
}

data class SomeDto(
        val foo: String,
        val bar: Int
)