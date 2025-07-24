package com.post_hub.utils_service.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.mapstruct.Mapper;

import java.util.List;

@Data
@AllArgsConstructor
public class ActionLogReadRequest {
    private Integer userId;
    private List<Integer> ids;

}
