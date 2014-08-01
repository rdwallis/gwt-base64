package com.wallissoftware.codec.client;

import com.google.gwt.core.shared.GWT;

public interface Base64 {
    public static Base64 INSTANCE = GWT.create(Base64.class);

    String decode(String base64);

    String encode(String input);
}
