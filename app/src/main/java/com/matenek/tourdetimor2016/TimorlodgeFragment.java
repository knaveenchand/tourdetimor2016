package com.matenek.tourdetimor2016;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TimorlodgeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TimorlodgeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TimorlodgeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TimorlodgeFragment() {
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
    public static TimorlodgeFragment newInstance(String param1, String param2) {
        TimorlodgeFragment fragment = new TimorlodgeFragment();
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


        View rootView = inflater.inflate(R.layout.fourboxes, container, false);

        final ImageView dinner = (ImageView) rootView.findViewById(R.id.imageView11);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_dinner_icon);
                dialog.setContentView(R.layout.dinnermenu);
                dialog.setTitle("Timor Lodge Dinner Menu");

                dialog.show();

            }

            });
        final ImageView breakfast = (ImageView) rootView.findViewById(R.id.imageView12);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_breakfast_edited);
                dialog.setContentView(R.layout.breakfastmenu);
                dialog.setTitle("Timor Lodge Breakfast Menu");

                dialog.show();

            }

        });

        final ImageView poolparty = (ImageView) rootView.findViewById(R.id.imageView13);
        poolparty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_breakfast_edited);
                dialog.setContentView(R.layout.poolparty);
                dialog.setTitle("Timor Lodge Pool Party");

                dialog.show();

            }

        });

        final ImageView tourdetown = (ImageView) rootView.findViewById(R.id.tourdetown);
        tourdetown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(getContext());

                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_breakfast_edited);
                dialog.setContentView(R.layout.tourdetown);
                dialog.setTitle("Timor Lodge Tour de Town");

                dialog.show();
                Button btnsubmit = (Button) dialog.findViewById(R.id.button);
                btnsubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.containerView, new PartyFormFragment(), "fragment_screen");
                        ft.commit();

                    }
                });


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

    public void openform (View view){
        Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

}
