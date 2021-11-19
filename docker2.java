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

}