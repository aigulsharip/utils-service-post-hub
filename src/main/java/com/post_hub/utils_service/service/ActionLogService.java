package com.post_hub.utils_service.service;

import com.post_hub.utils_service.model.dto.ActionLogDTO;
import com.post_hub.utils_service.model.response.UtilsResponse;

public interface ActionLogService {

    UtilsResponse<ActionLogDTO> getActionLogByid(Integer logId, Integer userId);
}
