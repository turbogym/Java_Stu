# Q&A
## JDK, JRE, JVM 的关系
```
JDK = JRE + Java开发工具
JRE = JVM + 核心类库
```

```
关系：JDK包含JRE，而JRE包含JVM。
JDK用于java程序的开发，JRE只能运行class而没有编译的功能。
JVM，即java虚拟机，是java运行时的环境。
```

```
JVM不能单独搞定class的执行，解释class的时候JVM需要调用JRE的类库lib。
在JRE目录里有两个文件夹bin和lib，可以认为bin里的就是jvm，lib里的则是jvm工作所需要的类库，而jvm和 lib和起来就称为JRE。
```

```
JDK和JRE区别：JDK的bin目录里有javac.exe而JRE里面没有，javac指令是用来将java文件编译成class文件的，这是开发者需要的，而用户是不需要的。JDK还有jar.exe, javadoc.exe等用于开发的可执行指令文件。证实了一个jdk是开发环境，而jre是运行环境。
注意： JVM并不代表可以执行class，因为JVM执行.class还需要JRE下的lib类库的支持，尤其是rt.jar。
```

## Java编写步骤
```
1. 编写Java的源代码
2. javac编译，得到对应的.class字节码文件
3. java运行，本质就是把.class加载到jvm运行
```