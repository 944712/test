package com.example.user.test;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

//서울로 주요업무별 전화번호
public class Call2Guide extends Fragment {


    public Call2Guide() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.guide_call2, container, false);


        //서울로 안내소
        ImageButton num1 = (ImageButton)view.findViewById(R.id.info);
        //서울로 가게
        ImageButton num2 = (ImageButton)view.findViewById(R.id.store);
        //서울로 여행자카페
        ImageButton num3 = (ImageButton)view.findViewById(R.id.tourist);
        //목련다방
        ImageButton num4 = (ImageButton)view.findViewById(R.id.magCafe);
        //수국식빵
        ImageButton num5 = (ImageButton)view.findViewById(R.id.bread);
        //장미빙수
        ImageButton num6 = (ImageButton)view.findViewById(R.id.roseIce);
        //7017 서울화반
        ImageButton num7 = (ImageButton)view.findViewById(R.id.flowerpot);
        //도토리풀빵
        ImageButton num8 = (ImageButton)view.findViewById(R.id.acorn);

        num1.setOnClickListener((View.OnClickListener) getActivity());
        num2.setOnClickListener((View.OnClickListener) getActivity());
        num3.setOnClickListener((View.OnClickListener) getActivity());
        num4.setOnClickListener((View.OnClickListener) getActivity());
        num5.setOnClickListener((View.OnClickListener) getActivity());
        num6.setOnClickListener((View.OnClickListener) getActivity());
        num7.setOnClickListener((View.OnClickListener) getActivity());
        num8.setOnClickListener((View.OnClickListener) getActivity());


        return view;

    }

    public void onClick(View view) {
        String tel = "tel:02-312-9575"; //서울로 안내소
        String tel2 = "tel:02-312-9836"; //서울로 가게
        String tel3 = "tel:02-312-8340"; //서울로 여행자카페
        String tel4 = "tel:02-312-5170"; //목련다방
        String tel5 = "tel:02-312-4714"; //수국식빵
        String tel6 = "tel:02-312-4971"; //장미빙수
        String tel7 = "tel:02-312-1697"; //7017 서울화반
        String tel8 = "tel:02-312-1892"; //도토리풀빵

        switch (view.getId()) {
            case R.id.info:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                break;
            case R.id.store:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel2)));
                break;
            case R.id.tourist:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel3)));
                break;
            case R.id.magCafe:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel4)));
                break;
            case R.id.bread:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel5)));
                break;
            case R.id.roseIce:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel6)));
                break;
            case R.id.flowerpot:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel7)));
                break;
            case R.id.acorn:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel8)));
                break;
        }
    }
}
