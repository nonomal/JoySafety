# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

for app in safety-admin safety-bert safety-fasttext safety-knowledge safety-api safety-keywords safety-vearch safety-mysql safety-redis;
  do docker stop $app
    docker rm $app;
    echo '停止并删除'$app'完成';
  done