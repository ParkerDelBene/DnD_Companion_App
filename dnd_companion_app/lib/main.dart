import 'package:dnd_companion_app/dnd_theme.dart';
import 'package:dnd_companion_app/main_page.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: const MainPage(),
      theme: DnDTheme.darktheme,
    );
  }
}
