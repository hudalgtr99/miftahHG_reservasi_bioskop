package com.example.reservasibioskop.response;

import lombok.*;

@Getter
@Setter
public class ResponseMessage {
    private Integer status;
    private String message;
    private Object data;
}
