package cn.yhm.passjava.content.mapper;

import cn.yhm.passjava.content.domain.dto.ProvinceQueryDTO;
import cn.yhm.passjava.content.domain.vo.ProvinceVo;
import cn.yhm.passjava.content.entity.ProvinceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 省份表 Mapper 接口
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
@Mapper
public interface ProvinceMapper extends BaseMapper<ProvinceEntity> {

    /**
     * 得到省列表页面
     *
     * @param provinceQueryDTO 省查询dto
     * @return {@link List}<{@link ProvinceVo}>
     */
    List<ProvinceVo> getProvinceListByPage(ProvinceQueryDTO provinceQueryDTO);
}
