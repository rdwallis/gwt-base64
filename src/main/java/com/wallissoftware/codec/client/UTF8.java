package com.wallissoftware.codec.client;

public class UTF8 {
    public final static native String readUTF8String(final String bytes)/*-{
		var ix = 0;

		if (bytes.slice(0, 3) == "\xEF\xBB\xBF") {
			ix = 3;
		}

		var string = "";
		for (; ix < bytes.length; ix++) {
			var byte1 = bytes[ix].charCodeAt(0);
			if (byte1 < 0x80) {
				string += String.fromCharCode(byte1);
			} else if (byte1 >= 0xC2 && byte1 < 0xE0) {
				var byte2 = bytes[++ix].charCodeAt(0);
				string += String.fromCharCode(((byte1 & 0x1F) << 6) + (byte2 & 0x3F));
			} else if (byte1 >= 0xE0 && byte1 < 0xF0) {
				var byte2 = bytes[++ix].charCodeAt(0);
				var byte3 = bytes[++ix].charCodeAt(0);
				string += String.fromCharCode(((byte1 & 0xFF) << 12) + ((byte2 & 0x3F) << 6) + (byte3 & 0x3F));
			} else if (byte1 >= 0xF0 && byte1 < 0xF5) {
				var byte2 = bytes[++ix].charCodeAt(0);
				var byte3 = bytes[++ix].charCodeAt(0);
				var byte4 = bytes[++ix].charCodeAt(0);
				var codepoint = ((byte1 & 0x07) << 18) + ((byte2 & 0x3F) << 12) + ((byte3 & 0x3F) << 6) + (byte4 & 0x3F);
				codepoint -= 0x10000;
				string += String.fromCharCode((codepoint >> 10) + 0xD800, (codepoint & 0x3FF) + 0xDC00);
			}
		}

		return string;
    }-*/;

}
