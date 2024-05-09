<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World...lets convert dollar to rupess!</h1>
       <%
            tycs.WebService1 obj = new tycs.WebService1();
          tycs.WebService1Soap port=obj.getWebService1Soap();
            double num1= Double.parseDouble(request.getParameter("txt1"));
            double result = port.rtoD(num1);
           out.println("conversion from rs to dollar is " +result);
            %>
    </body>
</html>
