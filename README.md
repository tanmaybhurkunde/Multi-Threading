# Multithreading with ReentrantLock (Mutex)

## 🧵 Overview

This Java project demonstrates **multithreading synchronization** using a `ReentrantLock` (a mutex) to safely perform **addition and subtraction** on a shared variable from multiple threads.

## 🔒 Why ReentrantLock?

`ReentrantLock` gives fine-grained control over thread access to critical sections. Unlike `synchronized`, it allows:
- Manual lock/unlock
- Try-lock capabilities
- Interruptible locks

## ⚙️ Features

- Shared integer variable
- Multiple threads:
  - Some **add** to the variable
  - Other **subtract**
- Uses `lock.lock()` and `lock.unlock()` to protect shared access

✅ Output
Consistent and thread-safe final count — no race conditions.

Author: Tanmay Bhurkunde
Topic: Java Concurrency / Mutex / ReentrantLock

result (link) :  https://drive.google.com/file/d/1_1BDDhIxeLbAoDc97oUFdlu6HKJ2Jd-8/view?usp=sharing
