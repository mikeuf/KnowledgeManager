# Knowledge Manager Client
This is the JavaFX desktop client for Knowledge Manager. It exchanges SOAP (Simple Object Access Protocol) requests with a JAX-WS web application server.

## Table of Contents
**[How to Run this Program](#how-to-run-this-program)**  
**[Overview](#overview)**<br /> 

## How to Run this Program
An executable file called **KnowledgeManagerClient.jar** is available here:<br />
https://github.com/mikeuf/KnowledgeManagerClient/raw/master/dist/KnowledgeManagerClient.jar<br /><br />
You may receive a message from your browser stating that the program is "not commonly downloaded and may be dangerous," or something to this effect. Your browser should give you the option to either discard or keep the file.

## Overview
The Knowledge Manager client allows the user to create, update, save and reload technical articles by exchange SOAP requests with a JAX-WS web application server. In this case, the server is Oracle Glassfish running on CentOS. The database is mySQL.

Here is a link to the WSDL (Web Service Definition Language) file. If you are unable to access this link, it means that the server is probably offline. When the server is offline, the client will be unable to function.
http://178.128.148.167:8080/DbInterface/DbInterface?wsdl

Clicking that link should open an XML file that defines the services available for Knowledge Manager. The client connects to the WSDL to interact with the server. 


<br /><br />
**Figure 1 - Blank Article**
![Blank Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/1-blank-article.png "Blank Article")
<br /><br />
**Figure 2 - After Creating a New Article**
![After Creating New Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/2-first-article-loaded.png "After Creating New Article")
<br /><br />
**Figure 3 - Loading an Existing Article**
![Loading Existing Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/3-second-article-loaded.png "Loading Existing Article")
<br /><br />
**Figure 4 - Article Not Found**
![Article Not Found](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/4-article-not-found.png "Article Not Found")
