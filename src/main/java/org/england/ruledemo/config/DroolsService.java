package org.england.ruledemo.config;

import org.england.ruledemo.model.User;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {
//    @Autowired
//    RuntimeService runtimeService;
//    @Autowired
//    RepositoryService repositoryService;

    public void executeRule(User user) {
        KieServices kieServices = KieServices.Factory.get();
        KieSession session = kieServices.getKieClasspathContainer().newKieSession();
        session.insert(user);
        session.fireAllRules();
        session.dispose();
    }

//    public void deployProcess() {
//        Deployment deployment = repositoryService.createDeployment()
//                .addClasspathResource("processes/myProcess.bpmn20.xml")
//                .deploy();
//    }
//
//    public void startProcess() {
//        runtimeService.startProcessInstanceByKey("myProcess");
//    }
}
