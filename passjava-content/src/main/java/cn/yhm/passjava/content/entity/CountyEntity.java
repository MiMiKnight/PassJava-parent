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
 * 县城表
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_county")
@ApiModel(value = "CountyEntity对象", description = "县城表")
public class CountyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("城市id")
    @TableField("city_id")
    private Integer cityId;

    @ApiModelProperty("县城表")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("县城编号")
    @TableField("`number`")
    private Integer number;


    public static final String ID = "id";

    public static final String CITY_ID = "city_id";

    public static final String NAME = "name";

    public static final String NUMBER = "number";

}
