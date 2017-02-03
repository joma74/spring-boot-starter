# spring-boot-starter

This Maven Project was initially created via http://start.spring.io/ with dependencies of
- Web
- DevTools

After importing into yor favorite IDE(Intellij files included) execute a maven install. 

Then run the rest-spring-server via the RestSpringServerApplication Main Class.

The rest-spring-server is swaggerified, so open http://localhost:9095/rest-spring-server/swagger-ui.html in your browser.

The comment-controller on http://localhost:9095/rest-spring-server/swagger-ui.html#/comment-controller validates input. It is blatantly shameless copy of https://www.petrikainulainen.net/programming/spring-framework/spring-from-the-trenches-adding-validation-to-a-rest-api/.

The field "text" is required, so check out the reponse message when sending 
```
{
  "text": ""
}
```
should give
```
{
  "fieldErrors": [
    {
      "field": "text",
      "message": "darf nicht leer sein"
    }
  ]
}
```
