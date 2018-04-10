package com.example.heaijia.ajiajia.activity.duanmodel.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.Fruit;

import java.util.List;

/**
 * @author heaijia
 * @since 2018/4/4 上午11:06
 * email 549044363@qq.com
 */

public class FruitAdapter extends ArrayAdapter<Fruit>{
    public FruitAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }


    private int resourceId;//等会要把R.layout.fruit_item的值赋给resourceId

    class ViewHolder//用来暂存“水果名称”的TextView控件与“水果图片”的ImageView控件，避免每次都重新加载布局，优化程序的流畅度
    {
        ImageView fruitImage;
        TextView fruitName;
    }

    public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;//把R.layout.fruit_item的值赋给resourceId
    }

    public View getView(int position, View convertView, ViewGroup parent)//这个函数不是太清楚，大概是用来createView的，对于每一个添加进ArrayList<Fruit>的Fruit对象，都会执行一边
    {
        Fruit fruit=getItem(position);//实例化在ArrayList<Fruit>中第“position”个当前Fruit对象

        View view;
        ViewHolder viewHolder;
        if (convertView==null)//如果布局从来没有被加载过
        {
            view= LayoutInflater.from(getContext()).inflate(resourceId,null);//使用布局填充器来把fruit_item布局文件转为View
            viewHolder=new ViewHolder();//新建一个ViewHolder
            viewHolder.fruitImage=(ImageView)view.findViewById(R.id.img_fruit);//从View中获取ImageView，并暂存新建的ViewHolder中
            viewHolder.fruitName=(TextView)view.findViewById(R.id.txt_fruit);//从View中获取TextView，并暂存新建的ViewHolder中
            view.setTag(viewHolder);//使用setTag把查找的view缓存起来方便多次重用
        }
        else//布局被加载过
        {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();//把之前暂存的ViewHolder赋给viewHolder
        }

        viewHolder.fruitImage.setImageResource(fruit.getImageId());//设定水果图片
        viewHolder.fruitName.setText(fruit.getName());//设定水果名称

        return view;
    }
}