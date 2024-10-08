package org.england.ruledemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyProcessController {

    @Autowired
    private MyProcessService myProcessService;

    @GetMapping("/start-process")
    public String startProcess() {
        myProcessService.startMyProcess();
        return "Process started!";
    }
}
