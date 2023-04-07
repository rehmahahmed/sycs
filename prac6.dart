import 'package:flutte/material.dart';

void main(){
  runApp(materialApp(
    home:myApp(),
    debugshowcheckedmodeBanner: false
  ));
}
class myApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return scaffold(
      appBar:AppBar(
        title:Text("Login Page"),
      ),
      body:Center( 
        child:Column( 
          children:[
            sizedBox(height:50),
            Text("Welcome to login page!", style:TextStyle(Fontsize:30;fontweight:fontweight.hold)),
            container 
            margin:EdgeInsets.from LTRB(0, 20, 20),
            width:400,
            child:Column(
              children:[
                textfield( 
                  decoration:InputDecoration(
                    labelText:"Username",
                  ),
                ),
                textfield(
                  decoration:InputDecoration(
                    labeltext:"Password"
                  ),
                ),
              ],
            ),
            ElevatedButton(onPressed:()=>{}, child:Text("Submit"))
          ],
        )
      )
    );
  }
}