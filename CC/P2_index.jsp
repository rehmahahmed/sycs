<8@page contentType="text/html"pageEncoding="UTF-8"&>
<! DOCTYPE html>
Chtml>
(head>
<meta http-equiv="Content-Type"
content="text/html; charset=UTF-8">
‹title›SP Page</title›
</head›
(body>
<8
//Create object of our
webservice
tycs. TempConvert Service obj= new tycs. TempConvert Service () ;
//Create port for service
tycs.TempConvert port = obi.getTempConvertPort0;
T
String val
= request.getParameter ("txt") :
//convert string to float
float temp = Float.parseFloat (val);
float ftoc
= port. fToC (temp) ;
float ctof = port.cToF (temo) :
out.println("F to C: "+ ftoc):
E
8>
<br/>
<8
out.println("C to F: "+ ctof):
8>
</body>
</html>
