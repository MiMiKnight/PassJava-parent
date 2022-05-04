package cn.yhm.passjava.content.controller;


import cn.yhm.passjava.content.domain.dto.ProvinceQueryDTO;
import cn.yhm.passjava.content.domain.vo.ProvinceVo;
import cn.yhm.passjava.content.entity.ProvinceEntity;
import cn.yhm.passjava.content.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 省份表 前端控制器
 * </p>
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-05-04 00:48:06
 */
@RestController
@RequestMapping("/content/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @PostMapping(path = {"/get-province-list"})
    public List<ProvinceVo> getProvinceListByPage(@RequestBody @Validated ProvinceQueryDTO provinceQueryDTO) {
        return provinceService.getProvinceListByPage(provinceQueryDTO);
    }
}

