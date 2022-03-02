### create server keystore
password:Spring Cloud
```properties
keytool -genkeypair -alias server -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore server.p12 -validity 3650
```

### create client keystore
password:Client
```properties
keytool -genkeypair -alias client -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore client.p12 -validity 3650
```

### export server certificate
```properties
keytool -exportcert -alias server -file server.crt -keystore server.p12 
```

### export client certificate
```properties
keytool -exportcert -alias client -file client.crt -keystore client.p12
```

### import server certificate by keystore client
password:Client
```properties
keytool -importcert -alias server -file server.crt -keystore client.p12
```

### import client certificate by keystore server
password:Spring Cloud
```properties
keytool -importcert -alias client -file client.crt -keystore server.p12
```