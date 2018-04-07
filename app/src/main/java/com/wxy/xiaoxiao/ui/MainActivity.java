package com.wxy.xiaoxiao.ui;

import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.adapter.AreaAdapter;
import com.wxy.xiaoxiao.adapter.CountryAdapter;
import com.wxy.xiaoxiao.base.BaseActivity;
import com.wxy.xiaoxiao.bean.AreaBean;
import com.wxy.xiaoxiao.bean.CountryBean;
import com.wxy.xiaoxiao.utils.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements TabLayout.OnTabSelectedListener{
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.id_recyclerview)
    RecyclerView recyclerView;
    String[] title = new String[]{"全国走势图", "地方走势图"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title();
        dataCountry();
    }
    private void title(){
        tabLayout=findViewById(R.id.tabLayout);
        recyclerView=findViewById(R.id.id_recyclerview);
        for (String s : title) {
            tabLayout.addTab(tabLayout.newTab().setText(s));
        }

        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (tab.getPosition()==0){
            dataCountry();
        }else if (tab.getPosition()==1){
            dataArea();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    private void dataCountry(){
        List<CountryBean> countyBeanList=new ArrayList<>();
        countyBeanList.add(new CountryBean(R.mipmap.ssq_ico,"双色球","福利彩票","http://www.zhcw.com/ssq/"));
        countyBeanList.add(new CountryBean(R.mipmap.sd_ico,"3D","走势图","http://www.55128.cn/zs/1_4.htm"));
        countyBeanList.add(new CountryBean(R.mipmap.dlt_ico,"大乐透","二区走势","http://tubiao.17mcp.com/Dlt/"));
        countyBeanList.add(new CountryBean(R.mipmap.p3_ico,"排列三","号码分布","http://zst.cjcp.com.cn/cjwpl3/view/pl3_danxuan.html"));
        countyBeanList.add(new CountryBean(R.mipmap.qxc_ico,"七星彩","开奖分布","http://zst.cjcp.com.cn/cjw7xc/view/7xc_haoma.html"));
        countyBeanList.add(new CountryBean(R.mipmap.p5_ico,"排列五","开奖号码","http://zst.cjcp.com.cn/cjwpl5/view/pl5_zst.html"));
        countyBeanList.add(new CountryBean(R.mipmap.qlc_ico,"七乐彩","特别号分析","http://zst.cjcp.com.cn/cjwqlc/view/qlctbh.html"));
        countyBeanList.add(new CountryBean(R.mipmap.phb_ico,"福彩","3D独胆","http://www.cjcp.com.cn/showsortinfo.php?id=202020307"));
        CountryAdapter countryAdapter=new CountryAdapter(this,countyBeanList);
        recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,        StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
    private void dataArea(){
        List<AreaBean> areaBeanList=new ArrayList<>();
        areaBeanList.add(new AreaBean("江苏快3","福彩","http://k3.icaile.com/"));
        areaBeanList.add(new AreaBean("山东11选5","体彩","http://chart.icaile.com/?op=rxjb"));
        areaBeanList.add(new AreaBean("安徽25选5","福彩","https://fx.cp2y.com/xah25x5/"));
        areaBeanList.add(new AreaBean("福建22选5","体彩","http://tubiao.17mcp.com/Tc22x5/Jxg_xiemaZs-500.html"));
        areaBeanList.add(new AreaBean("福建31选7","体彩","http://www.55128.cn/zs/60_351.htm?record=100"));
        areaBeanList.add(new AreaBean("福建36选7","体彩","http://www.lottery.gov.cn/historykj/history.jspx?_ltype=fj367"));
        areaBeanList.add(new AreaBean("广东26选5","福彩","http://www.zhcw.com/czpd/dfcc/ad26s5/dzjq/2621563.shtml"));
        areaBeanList.add(new AreaBean("广东36选7","福彩","http://www.fjtc.com.cn/Line-3107/"));
        areaBeanList.add(new AreaBean("广东好彩","福彩","https://www.cz89.com/kaijiang/fcgdhc1/"));
        areaBeanList.add(new AreaBean("深圳风采35选7","福彩","http://sz35x7.50018.com/zou-shi-tu/default.aspx"));
        areaBeanList.add(new AreaBean("广西快乐双彩","福彩","http://www.gxcaipiao.com.cn/klscnt.html/"));
        areaBeanList.add(new AreaBean("海南4+1","体彩","http://www.lottery.gov.cn/historykj/history.jspx?_ltype=hn41"));
        areaBeanList.add(new AreaBean("河北燕赵风采排列五","福彩","http://www.zhcw.com/czpd/dfcc/ydfcbl5/"));
        areaBeanList.add(new AreaBean("河北燕赵风采排列七","福彩","https://www.cp121.com/2/hebeifcpl7dxfx.asp"));
        areaBeanList.add(new AreaBean("河北20选5","福彩","https://www.cp121.com/2/hebeifc20x5.asp"));
        areaBeanList.add(new AreaBean("河南中原风采22选5","福彩","https://www.cp121.com/2/henanfc22x5.asp"));
        areaBeanList.add(new AreaBean("黑龙江6+1","体彩","http://www.lottery.gov.cn/historykj/history.jspx?_ltype=hlj61"));
        areaBeanList.add(new AreaBean("黑龙江快乐十分","福彩","http://hljkl10.icaile.com/"));
        areaBeanList.add(new AreaBean("黑龙江36选7","福彩","http://www.fczst.com/down/hlj367/"));
        areaBeanList.add(new AreaBean("黑龙江福彩P62","福彩","http://www.cpzst.com/hlj62p7.asp"));
        areaBeanList.add(new AreaBean("湖北30选5","福彩","http://chart.icaile.com/hb11x5.php?op=rxjb&num=100"));
        areaBeanList.add(new AreaBean("江苏体彩七位数","体彩","https://www.cp121.com/2/jiangsutcqws3.asp"));
        areaBeanList.add(new AreaBean("辽宁35选7","福彩","https://www.cp121.com/2/liaoningfc35x7.asp"));
        areaBeanList.add(new AreaBean("新疆18选7","福彩","http://chart.icaile.com/xj11x5.php?op=hzzs"));
        areaBeanList.add(new AreaBean("新疆35选7","福彩","https://tb.fcp.cn/new/txjfc357.asp"));
        areaBeanList.add(new AreaBean("新疆25选7","福彩","https://m.aicai.com/page/help/bet/area/xinjiang_25x7.jsp?agentId=2335339&vt=5"));
        areaBeanList.add(new AreaBean("浙江6+1","体彩","http://www.lottery.gov.cn/historykj/history.jspx?_ltype=zj61"));
        areaBeanList.add(new AreaBean("浙江20选5","体彩","https://www.cp121.com/2/zhejiangtc20x5.asp"));
        AreaAdapter adapter=new AreaAdapter(this,areaBeanList);
        recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,        StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
