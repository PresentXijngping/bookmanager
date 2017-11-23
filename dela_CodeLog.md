## **11月23日**
DAO层封装第二天~~~

**1** 我对每张表都暂时实现了一些基本的数据库操作, 并且给每个dbServiceImpl类都实现了RowMapper内部类(目前有的impl类使用到了, 有的impl类还没有使用到), 以供后面查询操作存放DO对象使用, 恒毅和小孟愿放心用哦~

**2** db-config这个resource文件还是老套路咯, 你们将代码拉下来之后将里面的username和password改成你们自己数据库的就好了

**3** 我们的数据库的数据源采用的是dbcp数据库连接池, 需要下载两个jar包:commons-dbcp2和common-pool2, 在这里直接贴上它们的dependency:
  
  ```
    <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-dbcp2 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.1.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-pool2 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-pool2</artifactId>
            <version>2.4.2</version>
        </dependency>
  ```
