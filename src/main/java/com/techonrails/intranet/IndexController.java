package com.techonrails.intranet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok("Test SSL");
    }
}
