package pers.zinclee123.regmatchertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pers.zinclee123.regmatcher.RegMatcher;

public class MainActivity extends AppCompatActivity {


    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et_test);

        findViewById(R.id.btn_email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isEmail(et.getText().toString())) {
                    showToast("测试字符串是邮箱");
                } else {
                    showToast("测试字符串不是邮箱");
                }
            }
        });

        findViewById(R.id.btn_url).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isUrl(et.getText().toString())) {
                    showToast("测试字符串是url");
                } else {
                    showToast("测试字符串不是url");
                }
            }
        });

        findViewById(R.id.btn_mobile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isMobilePhone(et.getText().toString())) {
                    showToast("测试字符串是手机号");
                } else {
                    showToast("测试字符串不是手机号");
                }
            }
        });

        findViewById(R.id.btn_idcard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isIDCard(et.getText().toString())) {
                    showToast("测试字符串是身份证");
                } else {
                    showToast("测试字符串不是身份证");
                }
            }
        });

        findViewById(R.id.btn_qq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isQQ(et.getText().toString())) {
                    showToast("测试字符串是QQ");
                } else {
                    showToast("测试字符串不是QQ");
                }
            }
        });

        findViewById(R.id.btn_fix_phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isFixedLineTel(et.getText().toString())) {
                    showToast("测试字符串是固话");
                } else {
                    showToast("测试字符串不是固话");
                }
            }
        });

        findViewById(R.id.btn_zip_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RegMatcher.isZipCode(et.getText().toString())) {
                    showToast("测试字符串是邮编");
                } else {
                    showToast("测试字符串不是邮编");
                }
            }
        });
    }


    void showToast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }
}

