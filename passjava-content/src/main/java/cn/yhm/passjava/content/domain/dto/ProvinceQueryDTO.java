package cn.yhm.passjava.content.domain.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 省查询dto
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-04 06:58:34
 */
@Data
@Accessors(chain = true)
public class ProvinceQueryDTO {

    /**
     * 当前页
     */
    @Min(value = 1, message = "最小页码")
    @Max(value = 65535, message = "最大页码")
    private Integer current;

    /**
     * 页大小
     */
    @Min(value = 2, message = "最小页大小")
    @Max(value = 4, message = "最大页大小")
    private Integer pageSize;
}
