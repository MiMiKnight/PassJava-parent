package cn.yhm.passjava.content.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 城市签证官
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-04 07:12:11
 */
@Data
@Accessors(chain = true)
public class CityVO {

    /**
     * 城市名称
     */
    private String name;

    /**
     * 城市编号
     */
    private Integer number;
}
