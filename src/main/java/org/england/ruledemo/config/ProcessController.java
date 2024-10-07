package org.england.ruledemo.config;

import org.england.ruledemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/process")
class ProcessController {

    private final DroolsService flowableService;

    public ProcessController(DroolsService flowableService) {
        this.flowableService = flowableService;
    }

    @PostMapping("/start")
    public String startProcess() {
        flowableService.executeRule(new User("Mehmet",20));
        return "Process started";
    }
}

