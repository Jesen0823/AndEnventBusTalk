# AndEnventBusTalk
复习EventBus


* 常见事件传递

    Intent意图，跳转＋传参（局限性非常大)
    Handler，通常用来更新主线程U，使用不当容易出现内存泄漏
    Interface接口，仅限于同一线程中数据交互
    BroadCastReceiver，有序广播＋无序广播
    AIDL跨进程通信，代码阅读性不友好，维护成本偏高
    其他方式，比如本地存储……



