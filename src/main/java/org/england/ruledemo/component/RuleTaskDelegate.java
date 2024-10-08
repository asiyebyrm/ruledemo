package org.england.ruledemo.component;

import lombok.RequiredArgsConstructor;
import org.england.ruledemo.config.DroolsService;
import org.england.ruledemo.model.User;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
@RequiredArgsConstructor
public class RuleTaskDelegate implements JavaDelegate {

    private final DroolsService droolsService;

    @Override
    public void execute(DelegateExecution execution) {
    User user = new User(3L,"Mehmet",17);
    droolsService.executeRule(user);
    }
}
