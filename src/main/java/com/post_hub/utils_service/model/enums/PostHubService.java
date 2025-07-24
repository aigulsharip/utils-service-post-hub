package com.post_hub.utils_service.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@AllArgsConstructor
public enum PostHubService {
    IAM_SERVICE("iam-service"),
    UNDEFINED_SERVICE("undefined-service");

    private final String value;

    public static PostHubService fromValue(String searchValue) {
        return Arrays.stream(PostHubService.values())
                .filter(v -> Objects.equals(v.value, searchValue))
                .findFirst()
                .orElse(PostHubService.UNDEFINED_SERVICE);
    }


}
