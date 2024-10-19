package com.comp313sec401.group4.shovelhero;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;
public class ViewRequestedWorkOrderActivity extends AppCompatActivity {

    private Button acceptButton, declineButton;
    private EditText commentsEditText;
    private TextView dateOfRequestTextView, nameOfRequesterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_requested_work_order);

        acceptButton = findViewById(R.id.acceptButton);
        declineButton = findViewById(R.id.declineButton);
        commentsEditText = findViewById(R.id.etComments);
        dateOfRequestTextView = findViewById(R.id.dateOfRequest);
        nameOfRequesterTextView = findViewById(R.id.nameOfRequester);

        String dateOfRequest = "15/10/2024";
        String nameOfRequester = "Alice Johnson";

        dateOfRequestTextView.setText("Date Of Request: " + dateOfRequest);
        nameOfRequesterTextView.setText("Name of Requester: " + nameOfRequester);

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comments = commentsEditText.getText().toString().trim();
                Toast.makeText(ViewRequestedWorkOrderActivity.this, "Work Order Accepted", Toast.LENGTH_SHORT).show();
            }
        });

        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewRequestedWorkOrderActivity.this, "Work Order Declined", Toast.LENGTH_SHORT).show();
            }
        });
    }
}