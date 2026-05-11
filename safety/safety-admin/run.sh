#!/bin/sh

# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

set -ex

cd /work
echo 'ADMIN_APP_CONF_FILE:'${ADMIN_APP_CONF_FILE}
echo 'ADMIN_LOG_CONF_FILE:'${ADMIN_LOG_CONF_FILE}
echo '$JAVA_OPTS:'${JAVA_OPTS}

exec "$@"