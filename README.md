# Knowledge Manager JavaFX Application with JAX-WS and SOAP
This is a JavaFX application that allows the user to create, update, save, and reload technical articles by exchanging SOAP (Simple Object Access Protocol) requests with a JAX-WS (Java API for XML Web Services) web application server.

The server portion can be found in this repository:<br />
https://github.com/mikeuf/KnowledgeManagerServer

## Table of Contents
**[How to Run this Program](#how-to-run-this-program)**  
**[Overview](#overview)**<br /> 
**[Instructions](#instructions)**<br /> 

## How to Run this Program
An executable file called **KnowledgeManagerClient.jar** is available here:<br />
https://github.com/mikeuf/KnowledgeManagerClient/raw/master/dist/KnowledgeManagerClient.jar<br /><br />
You may receive a message from your browser stating that the program is "not commonly downloaded and may be dangerous," or something to this effect. Your browser should give you the option to either discard or keep the file.

Here is a link to the WSDL (Web Service Definition Language) file.<br /> 
http://178.128.148.167:8080/DbInterface/DbInterface?wsdl

If you are unable to access the WSDL link, it means that the server is currently offline or the port is blocked in your environment and the client will be unable to function. Clicking that link should open an XML file that defines the services available from the Knowledge Manager server. You don't have to do anything with it, but the client uses the information in the WSDL to understand how to interface with the server. 

## Overview
The Knowledge Manager client allows the user to create, update, save and reload technical articles by exchanging SOAP requests with a JAX-WS web application server. The save task is executed in a separate thread. In this case, the server is Oracle Glassfish running on CentOS. The database is mySQL.

**Note:** This application is intended to be a simple "proof-of-concept" rather than an example of robust engineering. There is only minimal form validation and exception handling. 

## Instructions
When the client is started, the Article ID field will automatically increment to the next available article ID. If there are 6 existing articles, it will start at number 7 (Figure 1).

<br /><br />
**Figure 1 - Blank Article**
![Blank Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/1-blank-article.png "Blank Article")

After adding the text, click the "Save Article" button to store the article on the server (Figure 2).
<br /><br />
**Figure 2 - After Creating a New Article**
![After Creating New Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/2-first-article-loaded.png "After Creating New Article")

The application does not have a search engine, but you can load an existing article by typing the number into the "Loading existing article by ID" field and clicking the "Load" button (Figure 3).
<br /><br />
**Figure 3 - Loading an Existing Article**
![Loading Existing Article](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/3-second-article-loaded.png "Loading Existing Article")

Attempting to load a non-existent article will return an "Article not found" error (Figure 4).
<br /><br />
**Figure 4 - Article Not Found**
![Article Not Found](https://github.com/mikeuf/KnowledgeManagerClient/raw/master/screenshots/4-article-not-found.png "Article Not Found")
