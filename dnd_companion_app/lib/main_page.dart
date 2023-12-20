import 'dart:io';

import 'package:dnd_companion_app/style_box.dart';
import 'package:dnd_companion_app/style_text.dart';
import 'package:dnd_companion_app/variables.dart';
import 'package:flutter/material.dart';

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /*
      Initializing the screensize the first time the app
      is opened. In release mode the application is faster
      that the MediaQuery returns so we must wait until the
      os has returned the size of the phone screen.
    */
    while (!screenInitialized) {
      MediaQueryData? query = MediaQuery.maybeOf(context);
      if (query != null) {
        screenWidth = query.size.width;
        screenHeight = query.size.height;
        notificationBarHeight = query.viewPadding.top;
        screenInitialized = true;
      } else {
        sleep(const Duration(milliseconds: 100));
      }
    }
    return Scaffold(
        body: Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Padding(
            padding: const EdgeInsets.only(bottom: 20),
            child: StyleBox(
                TextButton(
                  onPressed: () => {},
                  child: Text(
                    "CREATE CHARACTER",
                    style: buttonText(),
                  ),
                ),
                screenWidth * .75),
          ),
          Padding(
            padding: const EdgeInsets.only(top: 20),
            child: StyleBox(
                TextButton(
                  onPressed: () => {},
                  child: Text(
                    "LOAD CHARACTER",
                    style: buttonText(),
                  ),
                ),
                screenWidth * .75),
          ),
        ],
      ),
    ));
  }
}
