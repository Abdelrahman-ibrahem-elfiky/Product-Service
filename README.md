# Product-API
The Product API is a powerful tool that allows developers to interact with product-related data in a system. It provides a set of endpoints and functionalities to retrieve, create, update, and delete products.

# Features
1- **Spring Boot**: Leverage the power of Spring Boot for building robust and scalable applications.

2- **JPA (Java Persistence API)**: Utilize JPA for easy and efficient management of relational data in the database.

3- **Swagger Documentation**: Explore and interact with the APIs effortlessly using Swagger UI. Access the API documentation at /swagger-ui.html.

4- **MapStruct**: Simplify the mapping between DTOs (Data Transfer Objects) and entities using MapStruct for cleaner and more maintainable code.

5- **Lombok**: Reduce boilerplate code and enhance readability with Lombok annotations.

6- **Auditing**: Enable auditing features to automatically track and record important events such as entity creation and modification.
___

## ERD
[![](https://mermaid.ink/img/pako:eNqVkkFrxCAQhf-KzHn3D-S8FMJSKPRWAmWiU1eaOKnRQkjy36sxmyawPfTo8_P5ns4IkhVBAeQuBrXDtrKVFaJzrIL0YkwLIRq2oryIl2te9t4Zq-_Qe7I4bFhsV0FxqBuKpJFH5Sug9cYPh3OKeulM5w3brNfMDaEV-G2wwXjugJsWNW0BdZTZUal2ikRPmt1QKvF03em1Q6tioSzOufNG71rrXFv8Ue9x7nnZXO5YrX6d_m-0pZqm83kat68pRAU1JedeeK4gsfnOB-AN-0TACVpyLRoVv3yJVoG_UUwBiVLoPhM2Rw6D59fBSii8C3SC0KkYZB0SKD6w6aNKysRHf84ztIzSCTq0b8x3Zv4B-DnMiw?type=png)](https://mermaid.live/edit#pako:eNqVkkFrxCAQhf-KzHn3D-S8FMJSKPRWAmWiU1eaOKnRQkjy36sxmyawPfTo8_P5ns4IkhVBAeQuBrXDtrKVFaJzrIL0YkwLIRq2oryIl2te9t4Zq-_Qe7I4bFhsV0FxqBuKpJFH5Sug9cYPh3OKeulM5w3brNfMDaEV-G2wwXjugJsWNW0BdZTZUal2ikRPmt1QKvF03em1Q6tioSzOufNG71rrXFv8Ue9x7nnZXO5YrX6d_m-0pZqm83kat68pRAU1JedeeK4gsfnOB-AN-0TACVpyLRoVv3yJVoG_UUwBiVLoPhM2Rw6D59fBSii8C3SC0KkYZB0SKD6w6aNKysRHf84ztIzSCTq0b8x3Zv4B-DnMiw)
___

## Products Table
|id|productCode|name|price|quantity|availability|description|image|stroId|categoryId|brandId|
|---|---|---|---|---|---|---|---|---|---|---|
|1|S100|Nile Brew Coffee|150.0|10|1|Nile Brew Coffee is good|BZ|1|1|1|
___

## Category Table
|id|name|description|
|---|---|---|
|1|Coffee|good Coffee|
___

## Brand Table
|id|name|description|
|---|---|---|
|1|Cairo Coffee Co|good Cairo Coffee Co|




