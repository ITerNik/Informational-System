# Group managing informational system
## How to use locally
- ```git clone``` this project
- run ```mvn clean install``` at source directory or build war using Intellij Idea maven lifecycle panel
- download [WildFly 14](https://www.wildfly.org/downloads/#14.0.0.Final) and unpack
- go to ```$WILDFLY_HOME/bin``` and run ```add-user.bat```
- then start server using ```standartalone.bat```
- connect to database using ```psql``` or ```postgres``` and run ```migration.sql```
- go to ```localhost:9990``` authorize and deploy war archive from first step
