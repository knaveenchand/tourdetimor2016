package com.matenek.tourdetimor2016;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PrizesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PrizesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrizesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PrizesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PhoneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PrizesFragment newInstance(String param1, String param2) {
        PrizesFragment fragment = new PrizesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        final View rootView = inflater.inflate(R.layout.fragment_prizes_boxes, container, false);
        final ImageView dailymenelite = (ImageView) rootView.findViewById(R.id.dailymenelite);
        final ImageView dailywomenelite = (ImageView) rootView.findViewById(R.id.dailywomenelite);
        final ImageView menelite = (ImageView) rootView.findViewById(R.id.menelite);
        final ImageView womenelite = (ImageView) rootView.findViewById(R.id.womenelite);
        final ImageView kom = (ImageView) rootView.findViewById(R.id.kom);
        final ImageView sub23 = (ImageView) rootView.findViewById(R.id.sub23);
        final ImageView menmastera = (ImageView) rootView.findViewById(R.id.menmastera);
        final ImageView menmasterb = (ImageView) rootView.findViewById(R.id.menmasterb);
        final ImageView nationalrider = (ImageView) rootView.findViewById(R.id.nationalrider);
        final ImageView mixedteam = (ImageView) rootView.findViewById(R.id.mixedteam);
        final ImageView menteam = (ImageView) rootView.findViewById(R.id.menteam);
        final ImageView womenteam = (ImageView) rootView.findViewById(R.id.womenteam);
        final ImageView jersey1 = (ImageView) rootView.findViewById(R.id.imageView16);
        final ImageView jersey2 = (ImageView) rootView.findViewById(R.id.imageView17);
        final ImageView jersey3 = (ImageView) rootView.findViewById(R.id.imageView18);
        final ImageView jersey4 = (ImageView) rootView.findViewById(R.id.imageView19);
        final ImageView jersey5 = (ImageView) rootView.findViewById(R.id.imageView20);
        final ImageView jersey6 = (ImageView) rootView.findViewById(R.id.imageView21);
        final ImageView jersey7 = (ImageView) rootView.findViewById(R.id.jersey7);


        dailymenelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesdailymenelite);
                dialog.setTitle("Daily Men Elite");

                dialog.show();

            }

        });

        dailywomenelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesdailywomenelite);
                dialog.setTitle("Daily Women Elite");

                dialog.show();

            }

        });

        menelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesmenelite);
                dialog.setTitle("Men Elite");

                dialog.show();

            }

        });

        womenelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizeswomenelite);
                dialog.setTitle("Women Elite");

                dialog.show();

            }

        });

        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizeskom);
                dialog.setTitle("King of Mountain");

                dialog.show();

            }

        });

        sub23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizessub23);
                dialog.setTitle("Sub 23");

                dialog.show();

            }

        });

        nationalrider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesnationalrider);
                dialog.setTitle("National Rider");

                dialog.show();

            }

        });

        menmastera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesmenmastera);
                dialog.setTitle("Men Master A");

                dialog.show();

            }

        });

        menmasterb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesmenmasterb);
                dialog.setTitle("Men Master B");

                dialog.show();

            }

        });

        mixedteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesmixedteam);
                dialog.setTitle("Mixed Team");

                dialog.show();

            }

        });

        menteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizesmenteam);
                dialog.setTitle("Men Team");

                dialog.show();

            }

        });

        womenteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.prizeswomenteam);
                dialog.setTitle("Women Team");

                dialog.show();

            }

        });

        jersey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey1);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey2);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey3);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey4);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey5);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey6);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });

        jersey7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.jersey7);
                dialog.setTitle("Jersey");

                dialog.show();

            }

        });


        return rootView;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
