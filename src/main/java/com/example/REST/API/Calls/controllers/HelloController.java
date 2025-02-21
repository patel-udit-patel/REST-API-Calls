package com.example.REST.API.Calls.controllers;

import com.example.REST.API.Calls.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Handle GET Request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Handle POST Request
    @PostMapping
    public String sayHelloPost() {
        return "Hello from BridgeLabz - POST";
    }

    // Handle PUT Request
    @PutMapping
    public String sayHelloPut() {
        return "Hello from BridgeLabz - PUT";
    }

    // Handle DELETE Request
    @DeleteMapping
    public String sayHelloDelete() {
        return "Hello from BridgeLabz - DELETE";
    }

    //------------------------------------------------------------------------------------

    // Handle GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //------------------------------------------------------------------------------------

    // Handle GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloWithParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //------------------------------------------------------------------------------------

    // Handle POST Request with Request Body
    @PostMapping("/post")
    public String sayHelloWithUser(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    //--------------------------------------------------------------------------------------

    // Handle PUT Request with Path Variable & Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPathAndQuery(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
