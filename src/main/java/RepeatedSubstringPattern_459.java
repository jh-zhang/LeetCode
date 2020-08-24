
import org.apache.commons.lang.StringUtils;
/**
 * Created by Zhang J.H on 2020/8/24 17:27
 * Description:
 */
public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1){
            return false;
        }

        int len = s.length();
        StringBuilder res = new StringBuilder();
        String frontStr,behindStr;
        for (int i = 1; i < len * 0.5 + 1; i++) {
            res.setLength(0);
            frontStr = s.substring(0,i);
            behindStr = s.substring(i,len);
            res.append(behindStr).append(frontStr);
            if(s.contains(res)){
                return true;
            }
        }

        return false;


    }


}
