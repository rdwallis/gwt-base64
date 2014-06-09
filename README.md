gwt-codec
==========

This project contains various codec utils I use in my own gwt projects.

###Features

base64 support (For browsers that don't have it, and browsers that already do)
md5 hashing
binaryString to UTF-8

run mvn install to install this.

add the folling to your pom.xml

    <dependency>
        <groupId>com.wallissoftware</groupId>
        <artifactId>gwt-codec</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

To use add the following to your gwt.xml file
    	
    <inherits name='com.wallissoftware.codec.Codec' />
    	
Then
        
    private final static Base64 base64 = GWT.create(Base64.class);
        
If you're not supporting ie9 and below:

    <set-property name="codec.base64Suported" value="yes"/>
    	
