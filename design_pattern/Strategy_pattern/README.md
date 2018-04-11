### 设计模式
#### 一、策略模式
* 模式概念：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
* 分别封装行为接口，实现算法族，父类里放行为接口对象，子类里具体设定行为对象。
   原则就是：分离变化部分，封装接口，基于接口编程各种功能，此模式让行为算法的变化独立于算法的使用者。

``` text
抽象类
继承的问题：对类的局部改动，尤其父类的局部改动，
会影响其他部分，影响会有溢出效应。

设计思维
需要新的设计方式，应对项目的扩展性，降低复杂度。
1）分析项目变化与不变部分，提取变化部分，抽象成接口+实现；
2）行为方式的不一样，用接口去实现,（鸭子的叫声，我飞行的不一样）
3) 好处：新增行为简单，行为类更好复用，组合更方便。
既有继承带来的好处，又没有挖坑
代码示例：strategyPattern
```

> 1.模拟鸭子项目  
> 2.项目的新需求  
> 3.用OO（面向对象）原则解决新需求的不足  
> 4.用策略模式来解决新需求  
> 5.重新设计模拟鸭子项目  
> 5.总结策略模式定义  

