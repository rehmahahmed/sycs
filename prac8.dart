import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Home(),
    ));

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('CodoGram'),
      ),
      body: Content(),
    );
  }
}

class Content extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(10.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Container(
            height: 200,
            width: 200,
            color: Colors.green,
            child: Center(
              child: Text('Box 1'),
            ),
          ),
          SizedBox(
            width: 20.0,
          ),
          Container(
            height: 200,
            width: 200,
            color: Colors.red,
            child: Center(
              child: Text('Box 2'),
            ),
          ),
        ],
      ),
    );
  }
}
