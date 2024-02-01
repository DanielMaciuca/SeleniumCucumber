package concepts.All.apache;

import org.apache.commons.lang3.StringUtils;

public class StringWithLang3 {

    public static void main(String[] args) {

        //Apache commons-langs3 provide additional functionality and convenience for handling common operations related to strings, numbers, and other basic data types.

        boolean result = StringUtils.isNumeric("123a");

        System.out.println(result);
    }
}
