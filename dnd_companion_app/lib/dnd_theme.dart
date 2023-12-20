import 'package:flutter/material.dart';

class DnDTheme {
  static final ThemeData darktheme = ThemeData(
    primaryColor: const Color.fromARGB(255, 104, 20, 20),
    textSelectionTheme: const TextSelectionThemeData(
      selectionColor: Colors.grey,
      cursorColor: Colors.white,
      selectionHandleColor: Colors.white,
    ),
    brightness: Brightness.dark,
    highlightColor: Colors.white,
    scaffoldBackgroundColor: const Color.fromARGB(255, 29, 29, 29),
  );
}
