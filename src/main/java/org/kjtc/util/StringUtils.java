package org.kjtc.util;

import java.util.LinkedList;
import java.util.UUID;

/**
 * Created By Donghua.Chen on  2018/1/9
 */
public class StringUtils {

    public static String UUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static boolean isEmpty(String str){
        return org.springframework.util.StringUtils.isEmpty(str);
    }

    public static String trimAllWhitespace(String str){
        return org.springframework.util.StringUtils.trimAllWhitespace(str);
    }
    public static String removeStart(String tstr,String rstr){
        return org.apache.commons.lang.StringUtils.removeStart(tstr,rstr);
    }

    public static LinkedList<String> stringArray2LinkedList(String[] split){

        LinkedList<String> stringLinkedList = new LinkedList<>();

        for (int i = 0; i <split.length ; i++) {

            if (!StringUtils.isEmpty(split[i])){

                stringLinkedList.add(split[i]);

            }

        }
        return stringLinkedList;

    };

    public static boolean contains(String dir,String src){

        return org.apache.commons.lang.StringUtils.contains(dir, src);

    }

    public static String replace(String str,String reql,String with){

         return org.springframework.util.StringUtils.replace(str, reql, with);
    }

}
