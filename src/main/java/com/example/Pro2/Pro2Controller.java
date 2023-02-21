package com.example.Pro2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro2Controller {
       @RequestMapping("/Welcome")
       public String getName()
       {
    	   String studentName="IamNeo";
    	   return "Welcome "+studentName+"!";
       }
}
