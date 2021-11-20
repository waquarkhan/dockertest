# dockertest

public static void main()
{

---
version: '1'

services:
 mydb:
  image: mysql:5
  environment:
   MYSQL_ROOT_PASSWORD: waquarwaquar
  ports:
   - 8080:80
  
...
}




public static void main()
{
---
version: '3'
services:
 devserver:
  image: jenkins/jenkins
  ports:
   - 7070:8080

 qaserver:
  image: tomee
  ports:
   - 8899:8080
  links:
   - devserver:jenkins


 prodserver:
  image: tomee
  ports:
   - 9090:8080
  links:
   - devserver:jenkins
...


