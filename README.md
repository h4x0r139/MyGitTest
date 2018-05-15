# MyGitTest
用户2增加一条记录   
用户1修改记录，但是没有同步最新记录，会导致冲突

## 提交记录：
A-》B-》C(HEAD)
## git reset测试
- git reset HEAD~2
head回退二个提交记录到A，但是保留该记录后面的提交B、C

增加第一个temp commit  
增加第二个temp commit