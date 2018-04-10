package com.example.heaijia.ajiajia.activity.duanmodel.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.heaijia.ajiajia.R;
import com.example.heaijia.ajiajia.activity.MainActivity;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.Fruit;
import com.example.heaijia.ajiajia.activity.duanmodel.ui.adapter.FruitAdapter;
import com.example.heaijia.ajiajia.base.Activity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author heaijia
 * @since 2018/3/27 下午3:00
 * email 549044363@qq.com
 */

public class PMFragment extends BaseFragment {

    @BindView(R.id.pm_listview)
    ListView listView;
    Unbinder unbinder;

    //用一个Sting[]储存每行数据
//    private String[] mPMList={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Apple","Banana","Orange","Apple","Banana","Orange","Watermelon","Watermelon","Cherry","Apple","Banana","Orange","Watermelon","Mango"};

    private List<Fruit> fruitList=new ArrayList<Fruit>();//①new一个ArrayList<Fruit>

    @Override
    protected void initView() {

//        //把每一行内容的XML文件与数据给ArrayAdapter
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>
//                (getActivity().getApplicationContext(),
//                R.layout.simple_list_item,mPMList);
//
//        //把ArrayAdapter给ListView
//        mlistView.setAdapter(adapter);
//
//        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Fruit fruit= (Fruit) mlistView.getItemAtPosition(position);
//                Fruit fruit= (Fruit) mlistView.getItemAtPosition(position);
//                Toast.makeText(getActivity().getApplicationContext(),mPMList.getClass().getName().toString(),Toast.LENGTH_SHORT).show();
//
//            }
//        });


        init();

        FruitAdapter adapter=new FruitAdapter(getActivity().getApplicationContext(),R.layout.listview_fruit,fruitList);//把R.layout.fruit_item和初始化完毕的ArrayList<Fruit>给FruitAdapter
//        ListView listView=(ListView)findViewById(R.id.pm_listview);
        listView.setAdapter(adapter);//把FruitAdapter给ListView







    }

    @Override
    protected void loadData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_pm_model;
    }

    @Override
    protected void initVariable() {
    }




























    private void init()
    {
        Fruit apple=new Fruit("Apple",R.drawable.apple);fruitList.add(apple);//将数据add到ArrayList<Fruit>中
        Fruit banana=new Fruit("Banana",R.drawable.banana);fruitList.add(banana);
        Fruit orange=new Fruit("Orange",R.drawable.orange);fruitList.add(orange);
        Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon);fruitList.add(watermelon);
        Fruit pear=new Fruit("Pear",R.drawable.pear);fruitList.add(pear);
        Fruit grape=new Fruit("Grape",R.drawable.grape);fruitList.add(grape);
        Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple);fruitList.add(pineapple);
        Fruit strawberry=new Fruit("Strawberry",R.drawable.strawberry);fruitList.add(strawberry);
        Fruit cherry=new Fruit("Cherry",R.drawable.cherry);fruitList.add(cherry);
        Fruit mango=new Fruit("Mango",R.drawable.mango);fruitList.add(mango);
    }













    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
