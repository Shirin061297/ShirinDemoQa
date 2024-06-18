package com.demoqa.pages.Alert.enums;

import lombok.Getter;

public enum Endpoints {

    ALERT("/alerts"),
    FRAMES("/frames");
    @Getter
    String endpoint;

    Endpoints(String endpoint){
        this.endpoint= endpoint;
    }
}
