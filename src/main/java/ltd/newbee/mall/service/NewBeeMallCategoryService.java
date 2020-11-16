
package ltd.newbee.mall.service;

import ltd.newbee.mall.api.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.entity.GoodsCategory;

import java.util.List;

public interface NewBeeMallCategoryService {

    String saveCategory(GoodsCategory goodsCategory);

    String updateGoodsCategory(GoodsCategory goodsCategory);

    GoodsCategory getGoodsCategoryById(Long id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回分类数据(首页调用)
     *
     * @return
     */
    List<NewBeeMallIndexCategoryVO> getCategoriesForIndex();
}
