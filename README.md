# Standapp - user service

---

## Build

build with  `mvn clean install`
run with `mvn spring-boot:run`

### Postman Link

[[link](http://www.google.com)]

### Method Naming convention

 *Post methods to be prefixed with post
 *Get methods to be prefixed with get
 *Put methods to be prefixed with put
 *Delete methods to be prefixed with delete
 *This terminology to be used throughout the service

### Todos

- [ ] Ping api - App version, App name, App version code, DB check.
- [x] CRUD for User.
- [ ] PATCH, HEAD and OPTION call implemtation.
- [ ] End to end test using REST assured.
- [ ] Deploy locally to MySQL.
- [ ] Add spring security.
- [ ] Do a soft delete while deleting a user.
- [ ] Have a list of contact detail per user where each contact detail has type, value and verified flag.
- [ ] Convert user DTO to login DTO and user response DTO
- [ ] Use slug instead of auto increment user id, while creating user
