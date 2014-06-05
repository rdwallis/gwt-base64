gwt-base64
==========

Gwt base64 support

run mvn install to install this.

add the folling to your pom.xml

        <dependency>
			<groupId>com.wallissoftware</groupId>
			<artifactId>gwt-base64</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>

To use add the following to your gwt.xml file
    	
    	<inherits name='com.wallissoftware.base64.Base64' />
    	
Then
        
        private final static Base64 base64 = GWT.create(Base64.class);
        
If you're not supporting ie9 and below:

    <set-property name="codec.base64Suported" value="yes"/>
    	
