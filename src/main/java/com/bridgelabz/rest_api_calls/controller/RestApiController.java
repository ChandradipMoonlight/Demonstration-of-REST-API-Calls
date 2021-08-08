/*
 * UC-2 :- Make REST call to show Hello Mark form BridgeLabz.
 *  -Use GET Request method and pass and pass name as query parameter.
 *  -Use Curl to Demonstrate REST API call.
 *  -curl localhost:8080/hello/query?name=Mark -w "/n"
 *  eg.  curl -X GET "http://localhost:8080/hello/query/?name=Chandradip" -w "/"

 *
 * @Author : Chandradip Shivankar
 * @Since : August 08, 2021
 */

package com.bridgelabz.rest_api_calls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestApiController {

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * Specifically, @GetMapping is a composed annotation that acts as a shortcut for
     * @RequestMapping (method = RequestMethod.GET).
     * @return hello form the BridgeLabz.
     */

    @RequestMapping(value = {"", "/", "/home"} )
    public String hello() {
        return "Hello form BridgeLabz.";
    }

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * @param fName;
     * @param lName;
     * @return Hello fName lName.
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
        return "Hello " + fName + " " + lName + ".";
    }
}
