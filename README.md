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






