package org.jokar.gankio;

import org.jokar.gankio.utils.JLog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by JokAr on 16/9/18.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest= Config.NONE)
public class GMTTest {

    @Before
    public void before() {
        //输出日志
        ShadowLog.stream = System.out;
    }

    @Test
    public void test(){
        String stringDate = "2016-05-12T12:04:43.857000";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss",Locale.CHINA);
        Date date = null;
        try {
            date = sdf.parse(stringDate);
            JLog.d(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
//     System.out.println(date.toString());
        sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
