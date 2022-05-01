package cn.yhm.passjava.common.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.Setter;

import java.util.List;

/**
 * 自定义通用Page
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 19:58:29
 */
@Data
public class CommonPage<T> {
    /**
     * 当前页码
     */
    private long current;
    /**
     * 每页记录数
     */
    private long size;
    /**
     * 总页数
     */
    private long pages;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 当前分页集合
     */
    private List<T> records;


    /**
     * 通用Page
     */
    private CommonPage() {
    }

    /**
     * 分页方法
     *
     * @param records 总记录
     * @param current 当前页
     * @param size    每页记录数
     * @param pages   总页数
     * @param total   总记录数
     * @return {@link CommonPage}<{@link T}>
     */
    public static <T> CommonPage<T> page(List<T> records, long current, long size, long pages, long total) {
        CommonPage<T> commonPage = new CommonPage<>();
        // 当前页
        commonPage.setCurrent(current);
        // 每页记录数
        commonPage.setSize(size);
        // 页数
        commonPage.setPages(pages);
        // 总记录数
        commonPage.setTotal(total);
        // 总记录List
        commonPage.setRecords(records);
        return commonPage;
    }


    /**
     * 分页方法
     *
     * @param page 分页
     * @return {@link CommonPage}<{@link T}>
     */
    public static <T> CommonPage<T> page(IPage<T> page) {
        return CommonPage.page(page.getRecords(), page.getCurrent(), page.getSize(), page.getPages(), page.getTotal());
    }

}
