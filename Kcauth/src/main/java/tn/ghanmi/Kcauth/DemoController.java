package tn.ghanmi.Kcauth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping()
    public String hello(){
        return "Simple User!!!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('DEMO_ROLE')")
    public String helloAdmin(){
        return "Admin User!!!";
    }

}
