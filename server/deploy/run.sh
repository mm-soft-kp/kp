#run.sh 用于将上次构建的结果备份，然后将新的构建结果移动到合适的位置
#!/bin/bash
# 先判断文件是否存在，如果存在，则备份
#file="/data/www/kp/server/kp.server-1.0-SNAPSHOT.jar"
#if [ -f "$file" ]
#then
#   mv /data/www/kp/server/kp.server-1.0-SNAPSHOT.jar /data/www/kp/server/kp.server-1.0-SNAPSHOT.jar.`date +%Y%m%d%H%M%S`
#fi
BUILD_ID=dontKillMe nohup java -jar /data/www/kp/server/server.jar &

