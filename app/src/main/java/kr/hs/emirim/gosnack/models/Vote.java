package kr.hs.emirim.gosnack.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 내컴퓨터 on 2016-09-27.
 */

public class Vote {
    public double cnt1,cnt2,cnt3,cnt4,cnt5;

    public Vote() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Vote(double cnt1,double cnt2,double cnt3,double cnt4,double cnt5) {
        this.cnt1 = cnt1;
        this.cnt2 = cnt2;
        this.cnt3 = cnt3;
        this.cnt4 = cnt4;
        this.cnt5 = cnt5;
    }
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("votes/cnt1", cnt1);
        result.put("votes/cnt2", cnt2);
        result.put("votes/cnt3", cnt3);
        result.put("votes/cnt4", cnt4);
        result.put("votes/cnt5", cnt5);

        return result;
    }

}
