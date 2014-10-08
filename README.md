MODAClouds SPACE4CLOUD Metamodel
==========================

#Description

This project contains the [Ecore](http://www.eclipse.org/modeling/emf/?project=emf) meta model used to build the MODACloud resource model. 

It also contains classes generated automatically by EMF and used in the SPACE4CLOUD project to access the resource model database.


#Database
A dump of the resource model database contaning information about the characteristics of cloud resources is available in the models/dump.sql file. 
In order to import the database with the information about the supported cloud providers first install a DBMS, we suggest to use MySQL from: www.mysql.com. When the installation has been compleated open the MySQL Workbench tool, connect to the local database and select the Data Import/Restore feature. Load the dump.sql file, select the schema named "cloud" and click on Start Import. 

If this database is used with SPACE4Cloud a new user with reading permissions to the cloud schema has to be created. The user should have name: "moda" and password: "modaclouds".
