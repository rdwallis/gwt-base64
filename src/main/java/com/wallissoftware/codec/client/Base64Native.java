package com.wallissoftware.codec.client;

import com.google.inject.Singleton;

@Singleton
public class Base64Native implements Base64 {

    @Override
    public native final String decode(final String base64) /*-{
		return $wnd.atob(base64);
	}-*/;

    @Override
    public native final String encode(final String input) /*-{
		return $wnd.btoa(input);
	}-*/;

}
