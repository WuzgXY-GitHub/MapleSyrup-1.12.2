package vonzeeple.maplesyrup.utils;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {


    public static String[] splitBlockstateStr(String input_str){
        String prop_regex = "(\\w+)(=)(\\w+)";
        String state_regex = "((\\{)("+prop_regex+")((,("+prop_regex+"))*)(\\}))?";
        String blockstate_regex = "([^\\{\\}:]+)(:)([^\\{\\}:]+)"+state_regex;

        String[] splitted = new String[0];
        if(input_str.replaceAll("\\s","").matches(blockstate_regex)){
            splitted = input_str.replaceAll("\\s","").split("[\\{\\},]");
        }
        return splitted;

    }
    public static  String[] splitPropertyStr(String input_str){
        return input_str.split("[=]");
    }

    public static String removeFileExtension(String input_str){
        return input_str.replaceAll("\\.[^.]*$", "");
    }
}
