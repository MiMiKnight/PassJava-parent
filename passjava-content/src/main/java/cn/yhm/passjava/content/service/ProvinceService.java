package cn.yhm.passjava.content.service;

import cn.yhm.passjava.content.domain.dto.ProvinceQueryDTO;
import cn.yhm.passjava.content.domain.vo.ProvinceVo;
import cn.yhm.passjava.content.entity.ProvinceEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 省份表 服务类
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
public interface ProvinceService extends IService<ProvinceEntity> {

    /**
     * 得到省列表页面
     *
     * @param provinceQueryDTO 省查询dto
     * @return {@link List}<{@link ProvinceEntity}>
     */
    List<ProvinceVo> getProvinceListByPage(ProvinceQueryDTO provinceQueryDTO);
}
