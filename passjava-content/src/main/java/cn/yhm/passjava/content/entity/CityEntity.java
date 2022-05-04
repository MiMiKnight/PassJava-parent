package cn.yhm.passjava.content.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 城市表
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_city")
@ApiModel(value = "CityEntity对象", description = "城市表")
public class CityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("省份id")
    @TableField("province_id")
    private Integer provinceId;

    @ApiModelProperty("城市名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("城市编号")
    @TableField("`number`")
    private Integer number;


    public static final String ID = "id";

    public static final String PROVINCE_ID = "province_id";

    public static final String NAME = "name";

    public static final String NUMBER = "number";

}
