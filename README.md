# Group managing informational system
## How to use locally
- ```git clone``` this project
- go to ```src\main\webapp``` and run ```yarn``` and ```yarn build```
- run ```mvn clean install``` at source directory or build war using Intellij Idea maven lifecycle panel
- download [WildFly](https://www.wildfly.org/downloads/) and unpack
- go to ```$WILDFLY_HOME/bin``` and run ```add-user.bat```
- then start server using ```standartalone.bat```
- configure ```hibernate.properties```
- connect to database using ```psql``` or ```postgres``` and run ```migration.sql```
- go to ```localhost:9990``` authorize and deploy war archive from first step
