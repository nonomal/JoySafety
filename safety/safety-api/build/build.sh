# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

DOCKER_BUILDKIT=1 docker build \
--secret id=mvnsettings,src="${MAVEN_SETTING_FILE:-/home/${UNAME}/maven/settings.xml}" \
--progress=plain -t safety-api:0.0.1 ..