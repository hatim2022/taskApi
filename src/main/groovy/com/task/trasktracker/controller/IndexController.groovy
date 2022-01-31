package com.task.trasktracker.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {
    @RequestMapping('/')
    String index(){
        'We in the house...'
    }
}
