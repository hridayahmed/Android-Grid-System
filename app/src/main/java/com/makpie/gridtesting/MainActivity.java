package com.makpie.gridtesting;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends Fragment {

    private View rootView;

    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    public MainActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_xyz, container, false);

        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_home);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_communities);

        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"House"));
        gridArray.add(new Item(userIcon,"Friend"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"Personal"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Building"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"xyz"));


        gridView = (GridView) rootView.findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(getActivity(), R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);

        return rootView;
    }
}
