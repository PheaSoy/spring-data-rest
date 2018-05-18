# Spring Data Rest

### This tutorial we will explore spring rest data that can provide spring data that can  exposes hypermedia-driven.
Adding maven dependencies for spring rest data.

```
<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-data-rest</artifactId>
</dependency>
```
##
Create entity for User 
```
@Entity
@Table(name = "users")
public class User {
	static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false, updatable = false)
	private Long id;
	private String username;
	private String password;
	private boolean enabled;
	private String role;
}
```


#### Create Spring Rest Repository by extend PagingAndSortingRepository.
```
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
```
- Running your application by run -> mvn spring-boot:run 
- Calling url http://localhost:9000/cfd-service/users/ in your browser.
- Response: 
```
{
    "_embedded": {
        "users": [
            {
                "_links": {
                    "self": {
                        "href": "http://localhost:9000/cfd-service/users/2"
                    },
                    "user": {
                        "href": "http://localhost:9000/cfd-service/users/2"
                    }
                }
            },
            {
                "_links": {
                    "self": {
                        "href": "http://localhost:9000/cfd-service/users/1"
                    },
                    "user": {
                        "href": "http://localhost:9000/cfd-service/users/1"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:9000/cfd-service/users{?page,size,sort}",
            "templated": true
        },
        "profile": {
            "href": "http://localhost:9000/cfd-service/profile/users"
        }
    },
    "page": {
        "size": 20,
        "totalElements": 2,
        "totalPages": 1,
        "number": 0
    }
}
```
