package jp.androidgroup.nyartoolkit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LearningRecommendationSystem3Activity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
        
      //buttonを取得
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }
    
        //インターフェイスを実装 implements OnClickListener
        public void onClick(View v) {
        	Intent intent = new Intent(jp.androidgroup.nyartoolkit.LearningRecommendationSystem3Activity.this, jp.androidgroup.nyartoolkit.NyARToolkitAndroidActivity.class);
        	startActivity(intent);
        }
    
}