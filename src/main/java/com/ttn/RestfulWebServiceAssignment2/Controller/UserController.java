package com.ttn.RestfulWebServiceAssignment2.Controller;

import com.ttn.RestfulWebServiceAssignment2.Service.UserService;
import com.ttn.RestfulWebServiceAssignment2.Entity.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class UserController {
    private MessageSource messageSource;

    @Autowired
    UserService userService;

    public UserController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello/{username}")
    @Operation(summary = "Display hello message")
    public String helloInternationalized(@PathVariable String username) {
        Locale locale = LocaleContextHolder.getLocale();
        String msg = messageSource
                .getMessage("hello.message", null, "default message", locale);
        return msg + " " + username;
    }


    @GetMapping("/users")
    @Operation(summary = "Get List of all users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    @Operation(summary = "Get a User by providing an id")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    @Operation(summary = "Add a new User")
    public User addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    @Operation(summary = "Delete a User by  providing an id")
    public void deleteUser(@PathVariable long id) {
         userService.deleteUser(id);
    }

}
