学习笔记
=======

## 工程实现

1. Queue
2. Dequeue 和 Stack对比

|Stack|Deque|
|-----| -----|
|push(e)|addFirst(e)|
|pop()|removeFirst()|
|peek()| peekFirst()|

改写
```java
Deque<String> deque = new LinkList<String>();

deque.addFirst("a");
deque.addFirst("b");
deque.addFirst("c");
System.out.println(deque);

String str = deque.peekFirst();
System.out.println(str);
System.out.println(deque);

while(deque.size()>0) {
  System.out.println(deque.removeFirst());
}
System.out.println(deque);
```

## Floyd算法

链表环判断

1. 快慢指针
2. 指针相遇确定产生环节点


## 翻转数组

右移数组K个元素

1. 三次翻转

## 动态规划
1. 设置起始边界
2. 边界终止条件
3. 每次移动边界，计算当前边界下值(可直接计算，或引用上次边界状态值)