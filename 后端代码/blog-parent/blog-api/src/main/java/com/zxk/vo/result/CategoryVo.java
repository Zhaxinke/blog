package com.zxk.vo.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 闫柯含
 * @date 2022年 01月 29日 下午 10:05
 * @功能说明: => 文章类别VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CategoryVo {

    private String id;

    private String avatar;

    private String categoryName;
}
