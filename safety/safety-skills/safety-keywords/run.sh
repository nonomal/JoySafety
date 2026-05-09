#!/bin/sh

# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 JD.com

set -ex

cd /work
echo 'KEYWORD_APP_CONF_FILE:'${KEYWORD_APP_CONF_FILE}
echo 'KEYWORD_LOG_CONF_FILE:'${KEYWORD_LOG_CONF_FILE}
echo '$JAVA_OPTS:'${JAVA_OPTS}

exec "$@"