package com.example.myapplication;

import java.util.List;

/**
 * ============================================================
 * 作 者 :    wgyscsf@163.com
 * 创建日期 ：3/12/21 4:19 PM
 * 描 述 ：
 * ============================================================
 **/
public class WsFutureDepth {

    /**
     * depth : {"asks":[["56566.00","1.348"],["56570.37","0.442"],["56570.95","0.250"],["56571.06","0.284"],["56571.97","0.011"],["56572.79","0.284"],["56573.10","0.384"],["56574.46","0.005"],["56574.49","0.035"],["56574.50","0.384"],["56574.74","0.284"],["56575.93","0.012"],["56576.07","0.176"],["56576.08","0.079"],["56576.43","1.084"],["56576.62","0.177"],["56577.49","0.176"],["56577.51","0.170"],["56578.04","2.002"],["56578.05","0.294"]],"bids":[["56565.58","0.068"],["56565.51","0.008"],["56565.50","0.248"],["56562.51","0.027"],["56562.28","0.003"],["56562.05","1.331"],["56562.04","0.002"],["56561.09","0.177"],["56560.42","0.264"],["56560.40","0.035"],["56560.21","0.024"],["56560.20","0.131"],["56560.19","0.102"],["56560.17","0.023"],["56559.75","0.111"],["56559.46","0.128"],["56559.35","0.135"],["56558.80","0.335"],["56558.13","0.258"],["56557.86","0.186"]]}
     * SERVER : V3
     * mergeType : 100
     * count : 200
     * type : futuresDepth
     * pair : btcusdt
     * TS : 2021-03-12T16:13:38.860
     */

    public DepthBean depth;
    public String SERVER;
    public String mergeType;
    public int count;
    public String type;
    public String pair;
    public String TS;

    public static class DepthBean {
        public List<List<Double>> asks;
        public List<List<Double>> bids;
    }
}