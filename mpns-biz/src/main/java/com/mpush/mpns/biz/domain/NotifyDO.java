/*
 * (C) Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     ohun@live.cn (夜色)
 */

package com.mpush.mpns.biz.domain;

import java.util.Map;

/**
 * Created by ohun on 16/9/20.
 *
 * @author ohun@live.cn (夜色)
 */
public class NotifyDO {
    public String msgId; // 推送消息id
    public String title; // 标题 必填
    public String content; // 内容 必填
    public Integer nid; //主要用于聚合通知，非必填
    public Byte flags; //特性字段。 0x01:声音   0x02:震动 0x03:闪灯
    public String largeIcon; // 大图标
    public String ticker; //和title一样
    public Integer number;
    public Map<String, String> extras; // 扩展

    public NotifyDO() {
    }

    public NotifyDO(String content) {
        this.content = content;
    }
}
