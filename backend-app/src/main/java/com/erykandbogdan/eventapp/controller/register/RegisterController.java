package com.erykandbogdan.eventapp.controller.register;

import com.erykandbogdan.eventapp.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/registration")
@AllArgsConstructor
public class RegisterController {

    private final RegisterService registrationService;

    @PostMapping
    public String register(@RequestBody RegisterRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
