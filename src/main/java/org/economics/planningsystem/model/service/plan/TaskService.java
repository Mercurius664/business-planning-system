package org.economics.planningsystem.model.service.plan;

import org.economics.planningsystem.dto.plan.request.CreateNewTaskRequest;

public interface TaskService {

    void complete(Long orgId, Long planId, Long taskId);

    void create(Long orgId, Long planId, CreateNewTaskRequest request);

}
