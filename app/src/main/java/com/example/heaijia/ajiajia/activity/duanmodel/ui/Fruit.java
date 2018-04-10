package com.example.heaijia.ajiajia.activity.duanmodel.ui;

/**
 * @author heaijia
 * @since 2018/4/4 上午12:07
 * email 549044363@qq.com
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId)
    {
        this.name=name;
        this.imageId=imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId()
    {
        return imageId;
    }
}
