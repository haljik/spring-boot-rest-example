# spring-boot-rest-example
REST API and Mybatis example on Spring Boot

# 起動
```
./gradlew bootRun
```

# APIへのアクセス

```
curl -d fiscalYear=2015 -d quarter=2 http://localhost:8080/quarters
```

# APIのレスポンス

```json
{"status":"ok"}
```