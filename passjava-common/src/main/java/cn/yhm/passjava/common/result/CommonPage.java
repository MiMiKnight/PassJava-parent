package cn.yhm.passjava.common.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 自定义通用Page
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 19:58:29
 */
@Data
@Accessors(chain = true)
public class CommonPage<T> {
    /**
     * 当前页码
     */
    private long current;

    /**
     * 每页记录数
     */
    private long pageSize;

    /**
     * 是否第一页
     */
    private boolean isFirstPage;

    /**
     * 是否最后一页
     */
    private boolean isLastPage;

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
     * @param records  当前分页集合
     * @param current  当前页
     * @param pageSize 每页记录数
     * @param pages    总页数
     * @param total    总记录数
     * @return {@link CommonPage}<{@link T}>
     */
    public static <T> CommonPage<T> page(List<T> records, long current, long pageSize, long pages, long total) {
        CommonPage<T> commonPage = new CommonPage<>();
        // 当前页
        commonPage.setCurrent(current);
        // 每页记录数
        commonPage.setPageSize(pageSize);
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
