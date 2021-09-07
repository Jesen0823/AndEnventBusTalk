# AndEnventBusTalk
复习EventBus


* 常见事件传递

    Intent意图，跳转＋传参（局限性非常大)
    Handler，通常用来更新主线程U，使用不当容易出现内存泄漏
    Interface接口，仅限于同一线程中数据交互
    BroadCastReceiver，有序广播＋无序广播
    AIDL跨进程通信，代码阅读性不友好，维护成本偏高
    其他方式，比如本地存储……


* EventBus:

  1. 线程状态枚举类：
   ```java
  public enum ThreadMode {
     POSTING,   // 事件的处理在和事件的发送在相同的线程
     MAIN,      // 事件的处理会在UI线程中执行
     BACKGROUND, // 后台进程，处理如保存到数据库等操作
     ASYNC      // 异步执行，另起线程操作。事件处理会在单独的线程中执行，主要用于在后台线程中执行耗时操作
  }
   ```

  2. 