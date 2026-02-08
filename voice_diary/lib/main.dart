import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // 移除右上角的 debug 标签
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        // Scaffold 是页面的基本骨架
        backgroundColor: Colors.white,
        body: Center(
          // Center 组件会将其子元素上下左右居中
          child: Text(
            '声音日记',
            style: const TextStyle(
              fontSize: 32.0, // 字体大小
              fontWeight: FontWeight.bold, // 字体加粗
              color: Colors.black, // 字体颜色
            ),
          ),
        ),
      ),
    );
  }
}
