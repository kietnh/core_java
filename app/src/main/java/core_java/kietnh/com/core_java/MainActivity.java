package core_java.kietnh.com.core_java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.apache.commons.lang3.time.StopWatch;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCompareInts)
    public void btnCompareInts_clicked(View view) {
        Integer a = 2;
        Integer b = 2;

        Toast.makeText(this, a.equals(b) ? "a equals b" : "a not equals b", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, a == b ? "a == b" : "a != b", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnCompareStrings)
    public void btnCompareStrings_clicked(View view) {
        String a = "value";
        String b = "value";
        String c = new String("value");

        Toast.makeText(this, a.equals(b) ? "a equals b" : "a not equals b", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, a == b ? "a == b" : "a != b", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, a.equals(c) ? "a equals c" : "a not equals c", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, a == c ? "a == c" : "a != c", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnCompareObjects)
    public void btnCompareObjects_clicked(View view) {
        Product a = new Product(1, "Product 1");
        Product b = new Product(2, "Product 2");

        Toast.makeText(this, a.equals(b) ? "a equals b" : "a not equals b", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, a == b ? "a == b" : "a != b", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnReferencesCount)
    public void btnReferencesCount_clicked(View view) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Long sum = 0L;
        for(long i = 0; i <= 10 * 1000 * 1000; i++) {
            sum += i;
        }

        double elapsed = stopWatch.getTime() / 1000.0;
        Toast.makeText(this, String.format("%s", elapsed), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnPrimitiveCount)
    public void btnPrimitiveCount_clicked(View view) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        long sum = 0L;
        for(long i = 0; i <= 10 * 1000 * 1000 ; i++) {
            sum += i;
        }

        double elapsed = stopWatch.getTime() / 1000.0;
        Toast.makeText(this, String.format("%s", elapsed), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnBoxingCount)
    public void btnBoxingCount_clicked(View view) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int primitive = 1;
        for(long i = 0; i <= 100 * 1000 * 1000 ; i++) {
            int box = Integer.valueOf(primitive);
        }

        double elapsed = stopWatch.getTime() / 1000.0;
        Toast.makeText(this, String.format("%s", elapsed), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnUnboxingCount)
    public void btnUnboxingCount_clicked(View view) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Integer wrapper = Integer.valueOf(1);
        for(long i = 0; i <= 100 * 1000 * 1000 ; i++) {
            int unboxing =  wrapper.intValue();
        }

        double elapsed = stopWatch.getTime() / 1000.0;
        Toast.makeText(this, String.format("%s", elapsed), Toast.LENGTH_SHORT).show();
    }
}
