package com.post_hub.utils_service.utils.enum_converter;

import com.post_hub.utils_service.model.enums.PostHubService;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class PostHubServiceConverter implements AttributeConverter<PostHubService, String> {

    @Override
    public String convertToDatabaseColumn(PostHubService postHubService) {
        return postHubService.getValue();
    }

    @Override
    public PostHubService convertToEntityAttribute(String s) {
        return PostHubService.fromValue(s);
    }
}
