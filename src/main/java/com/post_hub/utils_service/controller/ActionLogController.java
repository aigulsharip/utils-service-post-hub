package com.post_hub.utils_service.controller;


import com.post_hub.utils_service.model.constant.ApiLogMessage;
import com.post_hub.utils_service.model.dto.ActionLogDTO;
import com.post_hub.utils_service.model.request.ActionLogReadRequest;
import com.post_hub.utils_service.model.request.ActionLogUpdateResultDTO;
import com.post_hub.utils_service.model.response.PaginationResponse;
import com.post_hub.utils_service.model.response.UtilsResponse;
import com.post_hub.utils_service.service.ActionLogService;
import com.post_hub.utils_service.utils.ApiUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("${end.points.actionLogs}")
@RequiredArgsConstructor
public class ActionLogController {
    private final ActionLogService service;

    @GetMapping("${end.points.id}")
    public ResponseEntity<UtilsResponse<ActionLogDTO>> getActionLogById(
            @PathVariable("id") Integer logId,
            @RequestParam(name = "userId", required = false) Integer userId
    ) {
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(), ApiUtils.getMethodName());

        return ResponseEntity.ok(service.getActionLogByid(logId, userId));
    }

    @GetMapping("${end.points.all}")
    public ResponseEntity<UtilsResponse<PaginationResponse<ActionLogDTO>>> findAllActionLogs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int limit) {
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(), ApiUtils.getMethodName());

        Pageable pageable = PageRequest.of(page, limit);
        UtilsResponse<PaginationResponse<ActionLogDTO>> response = service.findAllActionLogs(pageable);
        return ResponseEntity.ok(response);
    }

    @PutMapping("${end.points.markAsRead}")
    public ResponseEntity<UtilsResponse<ActionLogUpdateResultDTO>> setIsReadEqualsTrue(
            @RequestBody @Valid ActionLogReadRequest request) {
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(), ApiUtils.getMethodName());

        return ResponseEntity.ok(service.setIsReadEqualsTrue(request));
    }
}

