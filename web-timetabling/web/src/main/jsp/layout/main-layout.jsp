<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/taglib-imports.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    <head>
        <title>
            <tiles:insert attribute="title" flush="true"/>
        </title>
        <meta http-equiv="Content-Type" content="text/html; charset:UTF-8" />

	<link rel="icon" type="image/png" href="<html:rewrite page="/layout/time.png"/>"></link>	
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default-application.css"/>"></link>
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default.css"/>"></link>
        
        <script type="text/javascript" language="Javascript1.1" src="<html:rewrite page="/layout/layout-common.js"/>"></script>
        <script type="text/javascript" language="Javascript1.1" src="<html:rewrite page="/layout/key-events.js"/>"></script>
		       
        <tiles:insert attribute="style" flush="true"/>
        <tiles:insert attribute="javascript" flush="true"/>
    </head>

    <body>
        <div id="container">
       	     <div id="header">
                <tiles:insert attribute="header" flush="true"/>
            </div>
            <div id="sidebar">
                <tiles:insert attribute="menu" flush="true"/>
            </div>
            <div id="content">
                <tiles:insert attribute="body" flush="true"/>
                <tiles:insert attribute="messages" flush="true"/>
            </div>             
        </div>
    </body>

</html>
