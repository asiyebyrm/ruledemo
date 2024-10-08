package org.england.ruledemo.config;

import org.england.ruledemo.model.User;
import org.flowable.engine.RuntimeService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyProcessService {
    @Autowired
    private RuntimeService runtimeService;

    public void startMyProcess() {
        // İş Sürecini Başlat
        runtimeService.startProcessInstanceByKey("myProcess");

        // Kural Çalıştırma
        KieServices kieServices = KieServices.Factory.get();
        KieSession kieSession = kieServices.getKieClasspathContainer().newKieSession("ksession-rules");

        User user = new User(1L,"John",22);

        kieSession.insert(user);
        kieSession.fireAllRules();  // Tüm kuralları çalıştır

        kieSession.dispose();
    }
}
