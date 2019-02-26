# SpringBootSSL
This project runs about generation of a Spring Boot 2.X project which will run through SSL connections.

## Relevant information
* [Baeldung CheatSheet](https://www.baeldung.com/spring-boot-https-self-signed-certificate)
* [Thomas Vitale - How to build Spring Boot project with SSL](https://www.thomasvitale.com/https-spring-boot-ssl-certificate/)

#### Generation of key
```
keytool -genkeypair -alias keystore -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650 -storepass key_password -dname "CN=test.com,OU=Test,O=Test,L=Test,S=Test,C=Test"
```
