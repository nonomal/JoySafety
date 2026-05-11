#!/bin/sh

# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

set -ex

cd /work
echo 'FASTTEXT_GUNICORN_CONF:'${FASTTEXT_GUNICORN_CONF}
echo 'FASTTEXT_CONFIG:'${FASTTEXT_CONFIG}

exec "$@"