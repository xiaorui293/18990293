package com.example.homework7.bean;

import com.example.homework7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个商品的名称数组
    private static String[] mNameArray = {
            "Nike Winflo 7 Shield", "Nike Legend React 3 Shield",
            "Nike Air ZM Pegasus 37 Shield", "Nike Air Zoom Alphafly Next% EK",
            " NIKE BLAZER MID '77", "耐克 男子 NIKE AIR MAX 270 REACT","Nike耐克女鞋新款AIR MAX 97 ","CD4366-002 "
    };
    // 声明一个商品的描述数组
    private static String[] mDescArray = new String[]{
            "这是20世纪80年代最流行的NBA鞋之一，也是帕特里克·尤因(Patrick Ewing)穿的。",
            "这双鞋把阿迪达斯品牌带回了市场，德怀特·霍华德和德里克·罗斯都穿这双鞋",
            "这双鞋很轻，可以让运动员反应也很灵敏",
            "这是今天市场上最好的鞋，你穿上它可以跳得更高，在玩的时候反应更快",
            "这双鞋子是80年代最流行的运动鞋之一，魔术师约翰逊和拉里·伯德都喜欢穿这双鞋子",
            "这款鞋于1995 / 96年发行，是最著名的，也是最受欢迎的空气乔丹系列鞋",
            "这是艾弗森在锐步的第一双签名鞋，艾弗森为这双鞋感到骄傲，所以在比赛的时候，你都能看到他穿着这双鞋",
            "这是第一个在市场上销售的签名鞋，在流行文化中被称为“Chucks”，它们是限量的，所以这款鞋并不容易买到。"
    };
    // 声明一个商品的价格数组
    private static float[] mPriceArray = {52, 21, 240, 52, 18, 19,16,49};
    // 声明一个商品的小图数组
    private static int[] mPicArray = {
            R.drawable.cart, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
    };
    //  mPicArray
    private static int[] mThumbArray = {
            R.drawable.cart, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
    };

    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}