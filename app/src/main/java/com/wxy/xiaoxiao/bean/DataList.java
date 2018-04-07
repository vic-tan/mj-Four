package com.wxy.xiaoxiao.bean;

import com.wxy.xiaoxiao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/25.
 */

public class DataList {

  public static List<DataResopnse> getList(){
      List<DataResopnse> list=new ArrayList<>();
      DataResopnse dataSSQ=new DataResopnse("双色球","中国福利彩票双色球游戏规则由中华人民共和国财政部制定的规则，是一种联合发行的“乐透型”福利彩票。", R.mipmap.ssq_zs,R.mipmap.ssq_k,R.mipmap.ssq_j);
      DataResopnse data3D=new DataResopnse("3D","中国福利彩票3D游戏（以下简称3D），是以一个3位自然数为投注号码的彩票，投注者从000-999的数字中选择一个3位数进行投注。3D在各省（区、市）保留各自奖池、单独派奖的基础上实行三统一，即统一名称标识、统一游戏规则、统一开奖号码。", R.mipmap.td_zs,R.mipmap.td_k,"根据投注者所持3D 彩票上的投注号码与当期中奖号码相符情况，确定中奖等级。\n" +
              "\"单选\"奖：投注号码与当期公布的中奖号码的3位数按位数全部相同，即中得单选奖。\n" +
              "\"组选3\"奖：当期摇出的中奖号码3位数中有任意两位数字相同，且投注号码与中奖号码的数字相同，顺序不限，即中得\"组选3\"奖。\n" +
              "\"组选6\"奖：当期摇出的中奖号码中3位数各不相同，且投注号码的三个数字与当期中奖号码相同，顺序不限，即中得\"组选6\"奖。\n");
      DataResopnse dataDLT=new DataResopnse("大乐透","大乐透——“35选5加12选2”是国家体育总局体彩中心为适应市场发展需要，丰富体育彩票的市场结构，经过慎重研究和广泛的市场调研，于2007年5月28日向全国推出的一种全新大盘彩票玩法。 自第14052期(2014年5月5日20:10开售)起，变更中国体育彩票超级大乐透游戏规则。超级大乐透“35选5加12选2”玩法的奖组为21425712个，奖级设置为6个奖级，一等奖中奖概率为21425712分之一，总中奖率为6.16%。", R.mipmap.dlt_zs,R.mipmap.dlt_k,"35选5加12选2”玩法属于双区选号大乐透，玩法简单易懂，彩民们在购买“35选5加12选2”时，可以从01-35共35个号码中，选取5个号码为前区号码，并从01-12共12个号码中选取2个号码为后区号码，组合为一注进行单式投注。\n" +
              "超级大乐透“35选5加12选2”投注方式多样，除单式投注外，也可以进行胆拖投注、复式投注，每一基本投注金额为2元人民币。超级大乐透“35选5加12选2”最大的亮点是，购买者在基本投注的基础上，可进行追加投注，每注可追加1元人民币。这样，体彩超级大乐透玩法单张彩票形成了2+1投注模式，即一张彩票可以投注2元一注的基本投注，和1元的追加投注。规则中规定，超级大乐透单张彩票基本投注的最大投注金额不超过20000元，基本投注加追加投注的最大投注金额不超过30000元。");
      DataResopnse dataPLS=new DataResopnse("排列三","“排列三”原为“7星彩”附加玩法，自2004年12月8日起从原有的七星彩玩法中分离出来，单独使用摇奖机、摇奖球进行摇奖，“排列三”、“排列五”共同摇奖，一次摇出5个号码，“排列三”的中奖号码为当期摇出的全部中奖号码的前3位，“排列五”的中奖号码为当期摇出的全部中奖号码，每日进行开奖。", R.mipmap.pls_zs,R.mipmap.pls_k,"第七条 \"体彩排列3\"按\"直选投注\"、\"组选3\"、\"组选6\"等不同投注方式进行设奖，均设一个奖级，为固定奖。\n" +
              "第八条 各奖级奖金分配：\n" +
              "\"直选投注\"，单注固定奖金1040元。\"组选3\"，单注固定奖金346元。\"组选6\"，单注固定奖金173元。\n" +
              "第九条 销售总额的53%为奖金，分为当期奖金和调节基金。其中，52%为当期奖金，1%为调节基金。");
      DataResopnse dataQX=new DataResopnse("七星彩","全国联网电脑体育彩票7星彩(简称“7星彩”)由国家体育总局体育彩票管理中心统一发行，各省、自治区、直辖市体育彩票管理中心在所辖区域内承销。7星彩采用计算机网络系统发行，在各省、自治区、直辖市体育彩票管理中心设置的投注站点销售，定期开奖。 7星彩实行自愿购买，凡购票者均被视为同意并遵守本规则。不得向未成年人销售彩票或兑付奖金。", R.mipmap.qx_zs,R.mipmap.qx_k,"第十七条 7星彩每周二、五、日开奖，摇奖过程在公证人员监督下进行，通过电视台播出。开奖时按顺序摇出7个号码，该7个号码的排列为当期开奖号码。\n" +
              "第十八条 每期开奖后，国家体育总局体育彩票管理中心需将开奖号码、当期销售总额、各奖级中奖情况以及奖池资金余额等信息，通过新闻媒体向社会公布，并将开奖结果通知各销售终端。\n");
      DataResopnse dataPLW=new DataResopnse("排列五","“排列5” 是体彩的一种，从00000-99999的数字中选取1个5位数为投注号码进行投注 “排列5”设1个奖级，为固定奖，所选号码与中奖号码全部相同且顺序一致则为中奖。", R.mipmap.plw_zs,R.mipmap.plw_k,"所购彩票与开奖结果对照，符合以下情况即为中奖。\n" +
              "一等奖，所选号码与中奖号码全部相同且顺序一致。\n" +
              "例如：中奖号码为43751，则排列5的中奖结果为：43751。");
      DataResopnse dataPLC=new DataResopnse("七乐彩","本规则依据《彩票发行与销售管理暂行规定》（财综200213号）等制度制定。 全国联合销售30选7电脑福利彩票（以下称“七乐彩”）由中国福利彩票发行管理七彩乐中心（以下称“中福彩中心”）统一组织发行，由各省、自治区、直辖市福利彩票发行中心（以下称“省中心”）在本行政区域内联合销售。", R.mipmap.qcl_zs,R.mipmap.qcl_k,"七乐彩由中福彩中心统一开奖，每周一、三、五开奖。摇奖过程在公证人员监督下进行，通过公众媒体发布开奖公告。\n" +
              "七彩乐\n" +
              "七彩乐\n" +
              "各省中心将当期投注的全部数据刻入不可改写的光盘，中福彩中心对各省中心的数据进行汇总。开奖后，以光盘记录的当期数据作为开奖检索的依据。\n" +
              "七乐彩通过摇奖器确定开奖号码。摇奖时先摇出7个号码作为基本号码，再摇出1个号码作为特别号码。\n" +
              "开奖公告在各地主要媒体公布，并在各投注站点张贴。\n" +
              "七乐彩的开奖结果以中福彩中心公布的开奖公告为准");
      DataResopnse dataFC=new DataResopnse("福彩","中国福利彩票“3D”由中国福利彩票发行中心统一发行。中国福利彩票“3D”实行自愿购买，凡投注者均被视为同意遵守本规则。中国福利彩票发行管理中心唯一指定网络信息发布媒体为中彩网。也可在网上购买3D。", R.mipmap.fc_zs,R.mipmap.fc_k,"“3D”的奖金占彩票销售总额的50%（其中：当期奖金49%；调节基金1%）。\n" +
              "“3D”设置奖池，奖池基金由调节基金、设奖奖金与实际中出奖金的差额和弃奖奖金等组成。奖池用于补充支付中奖差额，设置特别奖，支付因不可抗力等意外原因造成的奖金损失。当期中出奖金未达设奖金额时，设奖奖金余额进入奖池；当期中出奖金超出设奖金额时，差额由奖池补充，若奖池总额不够时，可暂由发行费垫付。\n" +
              "奖池余额定期向社会公布，不得挪作它用。");
      list.add(dataSSQ);
      list.add(data3D);
      list.add(dataDLT);
      list.add(dataPLS);
      list.add(dataQX);
      list.add(dataPLW);
      list.add(dataPLC);
      list.add(dataFC);
      return list;
  }
}
