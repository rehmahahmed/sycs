import 'package:flutter/material.dart';

void main() => runApp(
      MaterialApp(
        debugShowCheckedModeBanner: false,
        home: First(),
        routes: {
          '/second': (context) => Second(),
        },
      ),
    );

class First extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('First Navigation Bar'),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: () => {Navigator.pushNamed(context, '/second')},
          child: Text('2nd Page -->'),
        ),
      ),
    );
  }
}

class Second extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Second Navigation Bar'),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: () => {Navigator.pop(context, '/second')},
          child: Text('2nd Page -->'),
        ),
      ),
    );
  }
}
