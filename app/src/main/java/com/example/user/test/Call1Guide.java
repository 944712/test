package com.example.user.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

//서울로 주요업무별 전화번호
public class Call1Guide extends Fragment {

    public Call1Guide() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.guide_call, container, false);


        //서울로7017 총괄관리(안전, 관광편의)
        ImageButton num1 = (ImageButton)view.findViewById(R.id.total);
        //서울로7017 시설운영(행사, 프로그램)
        ImageButton num2 = (ImageButton) view.findViewById(R.id.event);
        //서울로7017 시설관리(시설, 식물관리)
        ImageButton num3 = (ImageButton) view.findViewById(R.id.plant);
        //서울로7017 공사
        ImageButton num4 = (ImageButton)view.findViewById(R.id.construction);
        //문화관광해설사와 함께하는 서울로 도보관광
        ImageButton num5 = (ImageButton)view.findViewById(R.id.walk);
        //서울역 일대 도시재생 활성화 계획
        ImageButton num6 = (ImageButton)view.findViewById(R.id.city);


        num1.setOnClickListener((View.OnClickListener) getActivity());
        num2.setOnClickListener((View.OnClickListener) getActivity());
        num3.setOnClickListener((View.OnClickListener) getActivity());
        num4.setOnClickListener((View.OnClickListener) getActivity());
        num5.setOnClickListener((View.OnClickListener) getActivity());
        num6.setOnClickListener((View.OnClickListener) getActivity());

        return view;

    }

    public void onClick(View view){
        String tel = "tel:02-2133-4479"; //서울로7017 총괄관리(안전, 관광편의)
        String tel2 = "tel:02-2133-4475"; //서울로7017 시설운영(행사, 프로그램)
        String tel3 = "tel:02-2133-4492"; //서울로7017 시설관리(시설, 식물관리)
        String tel4 = "tel:02-3708-2544"; //서울로7017 공사
        String tel5 = "tel:02-6925-0777"; //문화관광해설사와 함께하는 서울로 도보관광
        String tel6 = "tel:02-2133-8643"; //서울역 일대 도시재생 활성화 계획

                switch (view.getId()){
                    case R.id.total:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                        break;
                    case R.id.event:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel2)));
                        break;
                    case R.id.plant:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel3)));
                        break;
                    case R.id.construction:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel4)));
                        break;
                    case R.id.walk:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel5)));
                        break;
                    case R.id.city:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel6)));
                        break;

                }
    }



}

