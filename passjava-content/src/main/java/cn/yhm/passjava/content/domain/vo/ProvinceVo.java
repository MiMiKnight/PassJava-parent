package cn.yhm.passjava.content.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 省签证官
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-04 07:10:33
 */
@Data
@Accessors(chain = true)
public class ProvinceVo {

    /**
     * 省份名称
     */
    private String name;

    /**
     * 省份编号
     */
    private Integer number;

    /**
     * 城市集合
     */
    private List<CityVO> citys;
}
