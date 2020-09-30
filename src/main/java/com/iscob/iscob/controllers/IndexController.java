package com.iscob.iscob.controllers;

import com.iscob.iscob.model.TestModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class IndexController {

    public ResponseEntity<TestModel> index(){
        TestModel testModel = new TestModel(1, "fine");
        return new ResponseEntity(testModel, HttpStatus.OK);
    }

}
