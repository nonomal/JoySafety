# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 JD.com

DOCKER_BUILDKIT=1 docker buildx build \
--platform linux/amd64,linux/arm64 \
--progress=plain -t ccr.ccs.tencentyun.com/joysafety/joysafety:safety-knowledge-0.0.1 \
--push ..