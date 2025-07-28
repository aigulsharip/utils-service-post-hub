package com.post_hub.utils_service.kafka.model;

import com.post_hub.utils_service.model.enums.ActionType;
import com.post_hub.utils_service.model.enums.PostHubService;
import com.post_hub.utils_service.model.enums.PriorityType;
import lombok.Data;

import java.io.Serializable;

@Data
public class UtilMessage implements Serializable {
    private Integer userId;
    private ActionType actionType;
    private PriorityType priorityType;
    private PostHubService service;
    private String message;
}
