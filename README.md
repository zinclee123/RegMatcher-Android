# RegMatcher-Android
总结了一些较常用的正则判断,以后遇到常见的再完善，目前有7种判断

## 示例(Demo)
<p><img src="https://github.com/zinclee123/RegMatcher-Android/blob/master/img/Demo.gif?raw=true?raw=true?raw=true" width="320" alt="Screenshot"/></p>

## 用法(Usage)
### Step 1.
在项目的根build.gradle文件中加入<br/>
```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
   ```
### Step 2.
在你需要使用该控件的module的build.gradle中加入依赖<br/>
```
dependencies {
  compile 'com.github.zinclee123:RegMatcher-Android:v0.1'
}
```
### Step 3.
在Java文件中使用</br>
```Java
RegMatcher.isEmail(string);//判别是否是Email
RegMatcher.isUrl(string);//判别是否是Url
RegMatcher.isMobilePhone(string);//判别是否是移动电话
RegMatcher.isIDCard(string);//判别是否是身份证
RegMatcher.isQQ(string);//判别是否是QQ
RegMatcher.isFixedLineTel(string);//判别是否是固定电话
RegMatcher.isZipCode(string);//判别是否是邮编
```




