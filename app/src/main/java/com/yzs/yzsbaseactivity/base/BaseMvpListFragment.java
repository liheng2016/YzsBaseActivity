package com.yzs.yzsbaseactivity.base;

import com.gyf.barlibrary.ImmersionBar;
import com.yzs.yzsbaseactivity.R;
import com.yzs.yzsbaseactivitylib.basemvp.BaseModel;
import com.yzs.yzsbaseactivitylib.basemvp.BasePresenter;
import com.yzs.yzsbaseactivitylib.yzsbase.YzsBaseMvpListFragment;

/**
 * Author: 姚智胜
 * Version: V1.0版本
 * Description: 不使用MVP架构的baselistfragment
 * Date: 2017/7/4
 * Email: 541567595@qq.com
 */

public abstract class BaseMvpListFragment<T extends BasePresenter, E extends BaseModel, D>
        extends YzsBaseMvpListFragment<T, E, D> {
    @Override
    protected void immersionInit() {
        ImmersionBar.with(this).statusBarView(R.id.yzs_view)
                .statusBarDarkFont(false)
                .navigationBarColor(R.color.md_red_50)
                .init();

    }

}
