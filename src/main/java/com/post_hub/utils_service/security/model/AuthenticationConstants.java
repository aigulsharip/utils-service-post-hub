package com.post_hub.utils_service.security.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AuthenticationConstants {

    public static final String TOKEN_PREFIX = "Bearer";
    public static final String ACCESS_KEY_HEADER_NAME = "key";
    public static final String REFERER_HEADER_NAME = "referer";

    public static final String USER_EMAIL = "email";
    public static final String ROLE = "roles";
    public static final String USER_ID = "userId";


}
