学习笔记
=======

## 递归模板

```java
public void recursion(level) {

     // end condition
    if (level == xxx) {
        return;
    }


    // 处理逻辑 processor(level, ...)
    process(level, ...)


    // 递归调用 recursion
    recursion(level + 1, ...)

    // restore 类似回溯撤销模板
}
```

## 回溯模板

```java
LinkedList result = new LinkedList();
public void backtrack(/**路径，选择列表**/){
    if(/**满足结束条件**/){
        result.add(/*结果*/);
    }
    for(/** 选择条件列表递归 **/){
        //做出选择;
        backtrack(/**路径，选择列表**/);
        //撤销选择;
    }
}
```


