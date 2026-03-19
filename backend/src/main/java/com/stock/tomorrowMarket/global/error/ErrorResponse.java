package com.stock.tomorrowMarket.global.error;

public record ErrorResponse(
        String message,
        String code,
        int status
) {
    public static ErrorResponse of(ErrorCode code) {
        return new ErrorResponse(
                code.getMessage(),
                code.getCode(),
                code.getStatus().value()
        );
    }
}