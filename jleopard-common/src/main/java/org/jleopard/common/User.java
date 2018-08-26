package org.jleopard.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午8:57
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder=true)
public class User {

    private Long id;

    private String name;

    private String phone;
}

