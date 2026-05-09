# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 JD.com

#docker build --progress=plain -t safety-keywords:0.0.1 ..
DOCKER_BUILDKIT=1 docker build \
--secret id=mvnsettings,src="${MAVEN_SETTING_FILE:-~/maven/settings.xml}" \
--progress=plain -t safety-keywords:0.0.1 ..