# SPDX-License-Identifier: Apache-2.0
# Copyright (c) 2023-2026 JD.com

from typing import List

from app.base import Request, LabelResult


class BertRequest(Request):
    text_list: List[str]

class BertResponseData(LabelResult):
    pass
