学习笔记
=======

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


