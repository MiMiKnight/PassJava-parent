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
 * 省份表
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_province")
@ApiModel(value = "ProvinceEntity对象", description = "省份表")
public class ProvinceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("省份名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("编号")
    @TableField("`number`")
    private Integer number;


    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String NUMBER = "number";

}
