package com.porasl.common.dto;

public record AuthenticationResponse(
        String token,
        Long userId
) {}
