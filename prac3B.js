var ar = require("./arithematic");
var http = require("http");
http.createServer(function(req, res){
    res.writeHead(200, {'content-type': 'text/html'});
    res.write("Addition: 10 + 5: ", ar.add(10, 5));
    res.write("Subtraction: 10 - 5: ", ar.subtract(10, 5));
    res.write("Multiplication: 10 * 5: ", ar.multiply(10, 5));
    res.write("Division: 10 / 5: ", ar.divide(10, 5));
}).listen(8888);