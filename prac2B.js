var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://127.0.0.1:27017";
var dbo = null;
MongoClient.connect(url, function(err, conn){
    if(err) throw err;
    dbo = conn.db("sycspract");
    console.log("Database Created");
    var condition = {"pname":"cellphone"};
    dbo.collection("products").deleteOne(condition, function(err, res){
        if(err) throw err;
        console.log("Deleted One");
        console.log(res);
    });
    var condition = {"pname":"pendrive"};
    var newvalues = {$set:{"price":50000}};
    dbo.collection("products").updateOne(condition, newvalues, function(err, res){
        if(err) throw err;
        console.log("1 document Updated");
    });
    dbo.collection("products").find().toArray(function(err, result){
        if(err) throw err;
        console.log('find all documents');
        console.log(result);
    });
});