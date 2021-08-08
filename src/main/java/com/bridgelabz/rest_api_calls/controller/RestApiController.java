/*
 * UC-1:- Create Rest controller to demonstrate the various HTTP methods
 * and Respond hello messages to the user.
 * To Begin with show hello message form BridgeLabz.
 *  -Use GET Request method.
 *  -Use Curl to demonstrate REST API Calls.
 *  -curl localhost:8080/hello -w "/n".
 *
 * @Author : Chandradip Shivankar
 * @Since : August 08, 2021
 */

package com.bridgelabz.rest_api_calls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * Specifically, @GetMapping is a composed annotation that acts as a shortcut for
     * @RequestMapping (method = RequestMethod.GET).
     * @return hello form the BridgeLabz.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello form BridgeLabz";
    }
}
