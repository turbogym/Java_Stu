# switch和if的比较

```
1. 如果判断的具体数值不多，
而且符合byte, short, int, char, enum, String这6中类型。
虽然两个语句都可以使用，建议使用switch语句。
```

```
2. 其它情况：
对区间判断，对结果为boolean类型判断，使用if，if的使用范围更广。
```