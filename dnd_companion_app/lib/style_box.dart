import 'package:flutter/material.dart';

class StyleBox extends StatelessWidget {
  const StyleBox(this.child, this.width, {super.key});
  final Widget child;
  final double width;
  @override
  Widget build(BuildContext context) {
    return SizedBox(
      width: width,
      child: Container(
        decoration: const ShapeDecoration(
          shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.all(Radius.circular(30))),
          color: Color.fromARGB(255, 104, 20, 20),
        ),
        child: child,
      ),
    );
  }
}
