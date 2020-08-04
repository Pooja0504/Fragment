package pooja.jadhav.fragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import static pooja.jadhav.fragment.MainActivity.s_username;


public class SimpleFragment extends Fragment {
  public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  }
  View view;
  TextView textView,textView2;
  Button button;
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_simple, container, false);
        button=view.findViewById(R.id.fragment_btn);
        textView=view.findViewById(R.id.tv);
        textView2=view.findViewById(R.id.tv_name_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(s_username);
                Toast.makeText(getActivity(), "Fragment Done!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}