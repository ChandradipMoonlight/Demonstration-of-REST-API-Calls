/*
 * UC-3 :- Make REST call to show Hello Mark form BridgeLabz.
 *  -Use GET Request method and pass name as path variable.
 *  -Use Curl to Demonstrate REST API call.
 *  -curl localhost:8080/hello/param/name
 *  eg. curl -X GET "http://localhost:8080/hello/param/Chandradip" -w "/"

 *
 * @Author : Chandradip Shivankar
 * @Since : August 08, 2021
 */

package com.bridgelabz.rest_api_calls.controller;

import com.bridgelabz.rest_api_calls.model.User;
import org.springframework.web.bind.annotation.*;

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

    /**
     * This is GET Request method it will display message Hello name
     * when we use curl -X GET "http://localhost:8080/hello/param/Chandradip"
     * @param name;
     * @return hello Chandradip.
     */
    @GetMapping("/param/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + ".";
    }

    /**
     *  Annotation for mapping HTTP POST requests onto specific handler methods.
     *  The Post Request is used to display the message by passing first name and last name.
     *   curl -
     * @param user;
     * @return Hello firstName lastName.
     */
    @PostMapping("/post")
    public String hello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + ".";
    }

    /**
     * Annotation for mapping HTTP PUT requests onto specific handler methods.
     * Purpose : Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter.
     * @param firstName;
     * @param lastName;
     * @return Hello firstName lastName.
     */

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + ".";
    }
}
