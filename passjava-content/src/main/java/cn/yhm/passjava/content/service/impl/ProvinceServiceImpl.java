package cn.yhm.passjava.content.service.impl;

import cn.yhm.passjava.content.domain.dto.ProvinceQueryDTO;
import cn.yhm.passjava.content.domain.vo.ProvinceVo;
import cn.yhm.passjava.content.entity.ProvinceEntity;
import cn.yhm.passjava.content.mapper.ProvinceMapper;
import cn.yhm.passjava.content.service.ProvinceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 省份表 服务实现类
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
@Service
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, ProvinceEntity> implements ProvinceService {

    @Autowired
    ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceVo> getProvinceListByPage(ProvinceQueryDTO provinceQueryDTO) {
        return provinceMapper.getProvinceListByPage(provinceQueryDTO);
    }
}
