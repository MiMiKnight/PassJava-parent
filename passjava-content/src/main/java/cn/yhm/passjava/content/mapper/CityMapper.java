package cn.yhm.passjava.content.mapper;

import cn.yhm.passjava.content.domain.vo.CityVO;
import cn.yhm.passjava.content.domain.vo.ProvinceVo;
import cn.yhm.passjava.content.entity.CityEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 城市表 Mapper 接口
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:05
 */
@Mapper
public interface CityMapper extends BaseMapper<CityEntity> {

    /**
     * 得到城市通过provinc id列表
     *
     * @param provinceId 省id
     * @return {@link List}<{@link CityVO}>
     */
    List<CityVO> getCityListByProvinceId(@Param("provinceId") Integer provinceId);
}
