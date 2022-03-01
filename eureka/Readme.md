##### json格式提交实例
```properties
curl -i -H "Content-Type: application/json" -X POST -d@/Users/hexiaogou/Git_House_For_Mine/spring-cloud-code-combat/eureka/eureka_instance.json http://localhost:8761/eureka/apps/demo-client-one
```

### 执行config-server:
```properties
mvn spring-boot:run
```

### 执行eureka-server:
```properties
mvn spring-boot:run -Dspring.profiles.active=peer2
```

### 执行eureka-client:
```properties
mvn spring-boot:run
```
