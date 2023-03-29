var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://127.0.0.1:27017/";
var dbo = null;
MongoClient.connect(url, function(err, conn){
    if(err) throw err;
    conn.db("sycspract").dropDatabase();
    dbo = conn.db("sycspract");
    console.log("Database Created")
    var myobj = {"pname":"earphone", "price":300};
    dbo.collection("products").insertOne(myobj, function(err, res){
        if(err) throw err;
        console.log("1 Document Inserted");
    });
    var myobj = [{"pname":"cellphone", "price":30000},
{"pname":"pendrive", "price":1200}];
    dbo.collection("products").insertMany(myobj, function(err, res){
        if(err) throw err;
        console.log("Many Documents Inserted");
    })
})