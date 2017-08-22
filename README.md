catalog-service
-
### How to launch locally:
```
./gradlew bootRepackage

docker build -t catalog .

docker run --name catalog-postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres:9.6.4

docker run -d --name catalog-service -e "CATALOG_POSTGRES_URL=$(docker inspect -f "{{.NetworkSettings.Networks.bridge.IPAddress}}" catalog-postgres)" -p 9999:8080 catalog
```
will listen on `9999` port
